package accesoAdatos;

import entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.conectarse();
    }

    public void agregarProducto(Producto p) {
        String sql = " INSERT INTO producto ( nombre , cantidad , precio, estado ) "
                + "VALUES ( ? , ? , ?, ? ) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getCantidad());
            ps.setDouble(3, p.getPrecio());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
               p.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " Se Agreago un Producto ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar con la tabla producto ");
        }
    }

    public void modificarProducto(Producto p) {
        String sql = "UPDATE `producto` SET "
                + " idProducto = ? , nombre = ? , cantidad = ? , precio = ? , estado = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getCantidad());
            ps.setDouble(4, p.getPrecio());
            ps.setBoolean(5, p.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se Modifico un Producto ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar con la tabla producto ");
        }
    }

    public void eliminarProducto(String nombre) {
        String sql = " UPDATE producto SET estado = 0 WHERE nombre = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se Elimino un Producto ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar con la tabla producto ");
        }
    }

    public ArrayList<Producto> listarProducto() {
        ArrayList<Producto> listaP = new ArrayList<>();

        String sql = "SELECT idProducto, nombre, cantidad, precio, estado FROM producto WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();

                p.setIdProducto(rs.getInt("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setPrecio(rs.getDouble("precio"));
                p.setEstado(true);

                listaP.add(p);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla producto");
        }

        return listaP;
    }

    public int consultarStock(Producto p) {
        String sql = "SELECT cantidad FROM producto WHERE idProducto = ? AND estado = 1 ";
       
        int stock = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdProducto());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                stock = rs.getInt("cantidad");
               
                    }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla producto");
        }

        return stock;
    }
    
     public int buscarProductoXnombre(String nombre){
      int id=0;
      String sql="SELECT * FROM producto WHERE nombre = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                id= rs.getInt(1);
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla producto");
     }
    return id;
     }
}
