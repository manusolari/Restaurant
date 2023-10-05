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

    public PedidoData() {
        con = Conexion.conectarse();
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
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla Pedido");
        }
    }

    public double calcularImporte(int idPedido) {
        String sql = "SELECT producto.precio, producto.nombre , pedido_producto.cantidad, pedido_producto.idProducto FROM pedido_producto, producto WHERE IdPedido= ? "
                + "AND producto.idProducto= pedido_producto.idProducto ";
        double total = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                String nombreProducto = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double subtotal = cantidad * precio;
                total = +subtotal;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla PedidoProducto o Pedido");
        }
        return total;
    }
}
