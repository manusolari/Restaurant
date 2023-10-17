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
         PreparedStatement ps;

        try {
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println(pd.pedidoXIdMesa(pp.getPedido().getMesa()));
            System.out.println((pp.getProducto().getIdProducto()));
            //int id = pd.pedidoXIdMesa(pedido.getMesa());
           
            ps.setInt(1, pd.pedidoXIdMesa(pp.getPedido().getMesa()));
            ps.setInt(2, pp.getProducto().getIdProducto());
            ps.setInt(3, pp.getCantidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pp.setIdPedidoProducto(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar con la tabla Pedido Producto ");
        }

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
*/         }
         
         
         
     

