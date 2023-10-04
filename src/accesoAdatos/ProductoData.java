
package accesoAdatos;

import entidades.Producto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {
     private Connection con = null;

    public ProductoData() {
    con = Conexion.conectarse();
    }
     
     
    public void agregarProducto(Producto p){
    String sql = " INSERT INTO producto ( idProducto , nombre , cantidad , precio ) "
            + "VALUES ( ? , ? , ? , ? ) "; 
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1,p.getIdProducto());
             ps.setString(2, p.getNombre() );
             ps.setInt(3, p.getCantidad());
             ps.setDouble(4, p.getPrecio());
             int exito = ps.executeUpdate();
             
             if (exito  == 1){
             JOptionPane.showMessageDialog(null, " Se Agreago un Producto ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Error al conectar con la tabla producto ");
         }
    }
    
    public void modificarProducto (Producto p){
        String sql = "UPDATE `producto` SET "
                + " idProducto = ? , nombre = ? , cantidad = ? , precio = ? ";
    
         try {
             PreparedStatement ps = con.prepareStatement(sql);
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Error al conectar con la tabla producto ");
         }
    } 

}
