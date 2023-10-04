package accesoAdatos;

import entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MesaData {

    private Connection con = null;

    public MesaData() {
        con = Conexion.conectarse();
    }

    public ArrayList<Mesa> mesasLibres() {

        ArrayList<Mesa> listaMesas = new ArrayList<>();

        String sql = "SELECT idMesa, capacidad, estado FROM mesa WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesas = new Mesa();

                mesas.setCapacidad(rs.getInt("capacidad"));
                mesas.setEstadoMesa(true);
                mesas.setIdMesa(rs.getInt("idMesa"));

                listaMesas.add(mesas);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla mesa");
        }

        return listaMesas;
    }

    public void liberarMesa(int id) {

        try {
            String sql = "UPDATE mesa SET estado = 1 WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se liberó la mesa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra ese ID");

        }
    }

    public void ocuparMesa(int id) {
        try {
            String sql = "UPDATE mesa SET estado = 0 WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ocupó la mesa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra ese ID");

        }
    }

    public void agregarMesa(Mesa mesa) {

        String sql = "INSERT INTO mesa( idMesa, capacidad, estado) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstadoMesa());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se agregó una mesa");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla mesa");
        }
    }
    
    public void quitarMesa(int id){
        
        String sql = "DELETE FROM mesa WHERE idMesa=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
             int exito = ps.executeUpdate();
             if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Se eliminó una mesa");
             }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla mesa");
        }
        
    }
    
    public void cambiarCapacidad(int id, int cap){
        
        String sql = "UPDATE mesa SET capacidad = ? WHERE idMesa = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cap);
            ps.setInt(2, id);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Se cambió la capacidad de la mesa");
            }
        } catch (SQLException ex) {
            
        }
    }
}
