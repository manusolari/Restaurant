package accesoAdatos;

import entidades.Mesa;
import entidades.Pedido;
import entidades.PedidoProducto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PedidoData {

    private Connection con = null;
    private MesaData md;

    public PedidoData() {
        con = Conexion.conectarse();
        md = new MesaData();
    }

    public void iniciarPedido(Pedido p) {
        Mesa m= new Mesa();
        String sql = "INSERT INTO pedido( idMesa, fecha_hora , nombreMesero, importe , cobrada) VALUES (?, ?, ? , 0 , 0)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            m=md.buscarMesaPorNumero(p.getMesa().getNumeroMesa());
            ps.setInt(1, m.getIdMesa());
            ps.setDate(2, Date.valueOf(p.getFechaHora()));
            ps.setString(3, p.getNombreMesero());           
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Pedido iniciado con exito");
               p.setIdPedido(rs.getInt(1));
                md.ocuparMesa(m.getIdMesa());
            }
        
                
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
    }

    public double calcularImporte(int idPedido) {
        String sql = "SELECT p.precio, p.nombre , pp.cantidad, pp.idProducto FROM pedido_producto AS pp, producto AS p "
                + "WHERE pp.IdPedido= ? AND p.idProducto= pp.idProducto";
        double total = 0;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String nombreProducto = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                total += cantidad * precio;

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla PedidoProducto o Pedido");
        }
        insertarImporte(total, idPedido);
        return total;

    }

    public void insertarImporte(double importe, int idPedido) {
        String sql = "UPDATE pedido SET importe= ? WHERE idPedido= ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, importe);
            ps.setInt(2, idPedido);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Importe agregado a tabla");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }

    }

    public void cobrarPedido(Pedido p) {
        String sql = "UPDATE pedido SET cobrada= 1 WHERE idPedido = ? ";
        Mesa m= new Mesa();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            m=md.buscarMesaPorNumero(p.getMesa().getNumeroMesa());
            ps.setInt(1, p.getIdPedido());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa cobrada con exito");
                md.liberarMesa(m.getIdMesa());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
    }
    
    public ArrayList <Pedido> listaXMesero(String nombre){
        ArrayList <Pedido> listaxMesero = new ArrayList <>();
       
        String sql = " SELECT idPedido, idMesa, importe, cobrada, fecha_hora, nombreMesero  FROM pedido WHERE 1 " ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                 Mesa m = new Mesa();
                Pedido p = new Pedido();
            p.setIdPedido(rs.getInt("idPedido"));
            int idmesa = (rs.getInt("idMesa"));
            m.setIdMesa(idmesa);
            p.setMesa(m);
            p.setImporte(rs.getDouble("importe"));
            p.setCobrada(rs.getBoolean("cobrada"));
            p.setFechaHora(rs.getDate("fecha_hora").toLocalDate());
            p.setNombreMesero(rs.getString("nombreMesero"));
            
            listaxMesero.add(p);
                    }
    
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
        return listaxMesero;
    } 
    
    public ArrayList <Pedido> listarPedidosXFecha (LocalDate fecha1, LocalDate fecha2){
         ArrayList <Pedido> listaFecha = new ArrayList <>();
        String sql = "SELECT * FROM `pedido` WHERE fecha_hora BETWEEN ? and ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha1));
            ps.setDate(1, Date.valueOf(fecha2));
            ResultSet rs =  ps.executeQuery();
            
            while(rs.next()){
             Mesa m = new Mesa();
                Pedido p = new Pedido();
            p.setIdPedido(rs.getInt("idPedido"));
            int idmesa = (rs.getInt("idMesa"));
            m.setIdMesa(idmesa);
            p.setMesa(m);
            p.setImporte(rs.getDouble("importe"));
            p.setCobrada(rs.getBoolean("cobrada"));
            p.setFechaHora(rs.getDate("fecha_hora").toLocalDate());
            p.setNombreMesero(rs.getString("nombreMesero"));
            
            listaFecha.add(p);
            }
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
        return listaFecha; 
    }
    
     //Listar ingresos sumando totales de pedidos para una fecha en particular.
//        public double listarImporteXfecha(LocalDate fecha1){
//        
//        
//        }
    
    public int pedidoXIdMesa(Mesa m){
    int id = 0;
    String sql = " SELECT pedido.* FROM pedido JOIN mesa ON(pedido.idMesa = mesa.idMesa) "
            + " WHERE pedido.idMesa = ? AND mesa.estado = 0 " ;
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            
            m = md.buscarMesaPorNumero(m.getNumeroMesa());
            
            ps.setInt(1, m.getIdMesa());
            ResultSet rs = ps.executeQuery();
            //System.out.println(rs.isFirst());
           
           
             if  (rs.next()){
                
                 id = rs.getInt(1);
                 
             }
        }catch (NullPointerException nfe){
                    JOptionPane.showMessageDialog(null, "Hubo un error al Ingresar la informacion de Mesa, Por favor compruebe la informacion");
                    } 
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
           
    return id;
    }



    


}
