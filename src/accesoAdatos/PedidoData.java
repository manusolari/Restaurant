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

        String sql = "INSERT INTO pedido( idMesa, fecha_hora , nombreMesero, importe , cobrada) VALUES (?, ?, ? , 0 , 0)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p.getMesa().getIdMesa());
            ps.setDate(2, Date.valueOf(p.getFechaHora()));
            ps.setString(3, p.getNombreMesero());           
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido iniciado con exito");
                md.ocuparMesa(p.getMesa().getIdMesa());
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
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdPedido());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa cobrada con exito");
                md.liberarMesa(p.getMesa().getIdMesa());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
    }
}
