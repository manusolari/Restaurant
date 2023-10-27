/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoAdatos;

import entidades.Pedido;
import entidades.PedidoProducto;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mariana
 */
public class PedidoProductoData {

    private Connection con = null;
    private Pedido pedido;
    private Producto producto;
    

    public PedidoProductoData() {
        con = Conexion.conectarse();
        pedido = new Pedido();
        producto = new Producto();
   

    }

    public void iniciarPedidoProducto(PedidoProducto pp) {
        PedidoData pd = new PedidoData();
        String sql = "INSERT INTO pedido_producto ( idPedido , idProducto , cantidad ) "
                + " VALUES ( ? , ? , ? )";
        ProductoData prd = new ProductoData();
        Producto p = pp.getProducto();
        p.setIdProducto(prd.buscarProductoXnombre(pp.getProducto().getNombre()));
//        System.out.println(habilitarPedido(pp.getProducto(), pp.getCantidad()));
//        System.out.println(pp.getProducto());
        if (habilitarPedido(pp.getProducto(), pp.getCantidad())) {

            try {

                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//                System.out.println(pd.pedidoXIdMesa(pp.getPedido().getMesa()));
//                System.out.println((pp.getProducto().getIdProducto()));
//                int id = pd.pedidoXIdMesa(pedido.getMesa());

                ps.setInt(1, pd.pedidoXIdMesa(pp.getPedido().getMesa()));
                ps.setInt(2, pp.getProducto().getIdProducto());
                ps.setInt(3, pp.getCantidad());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    pp.setIdPedidoProducto(rs.getInt(1));
                    restarStock(pp.getProducto(), pp.getCantidad());
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Error al conectar con la tabla Pedido Producto ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay stock suficiente para realizar el pedido");
        }
        JOptionPane.showMessageDialog(null, "Producto agregado al pedido");
    }

    public boolean habilitarPedido(Producto p, int cantidad) {
        ProductoData pd = new ProductoData();
        int stock = pd.consultarStock(p);
        if (stock >= cantidad) {
            return true;
        } else {
            return false;
        }
    }

    public void restarStock(Producto p, int cantidad) {
        ProductoData pd = new ProductoData();
        int stock = pd.consultarStock(p);
        if (habilitarPedido(p, cantidad)) {
            String sql = "UPDATE producto SET cantidad=? WHERE idProducto=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, stock - cantidad);
                ps.setInt(2, p.getIdProducto());
                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Se modifico el sotck quedan: " + (stock - cantidad));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Error al conectar con la tabla  Producto ");
            }

        }
    }
//--------------Agregado Ultimo-----------------------------------------
    public ArrayList<PedidoProducto> listarPedidoProductoXPedido(int idPedido) {
        ArrayList<PedidoProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM pedido_producto WHERE idPedido = ?";
        PedidoData pd= new PedidoData();
        ProductoData pdd= new ProductoData();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                PedidoProducto pp= new PedidoProducto();
            
                pp.setCantidad(rs.getInt("cantidad"));
                pp.setPedido(pd.buscarPedidoXid(idPedido));
                pp.setProducto(pdd.buscarProductoPorId(rs.getInt("idProducto")));
                pp.setIdPedidoProducto(rs.getInt("idPedidoProducto"));
                lista.add(pp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar con la tabla  Pedido Producto ");
        }
        return lista;
    }
//
//         public PedidoProducto buscarPP(String nombre){
//         String sql = "SELECT pedido_producto.* , producto.nombre 
//FROM pedido_producto JOIN producto ON (producto.idProducto = pedido_producto.idProducto) JOIN pedido ON (pedido.idPedido = pedido_producto.IdPedido)
//WHERE
//producto.nombre = "Coca Cola" "
//         }

//         public int  modificarPedidoProducto(int idproducto){
//         String sql = "UPDATE `pedido_producto` SET IdPedido = ? , idProducto = ? "
//                 + " cantidad = ?  WHERE 1";
//         PreparedStatement ps;
//         try {
//             ps = con.prepareStatement(sql);
/*         } catch (SQLException ex) {
                ps.
                 ps.setInt(1, id);
            ps.setInt(2, pp.getProducto().getIdProducto());
            ps.setInt(3, pp.getCantidad());
    
//JOptionPane.showMessageDialog(null, " Error al conectar con la tabla Pedido Producto ");//         }
     */

}
