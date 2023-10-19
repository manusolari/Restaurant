package accesoAdatos;

import entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        String sql = "INSERT INTO mesa( numeroMesa, capacidad, estado) VALUES (  ? , ?, ? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);

            
            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, true);
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()){
               mesa.setIdMesa(rs.getInt(1 ));
               JOptionPane.showMessageDialog(null, "Se Agrego una Mesa ");
           }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla mesa");
        }
    }
    
    public void quitarMesa(int id){
        
        String sql = "UPDATE mesa SET estado = 0 WHERE idMesa = ?";
        
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
    
    public void cambiarCapacidad(int num, int cap){
        
        String sql = "UPDATE mesa SET capacidad = ? WHERE numeroMesa = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cap);
            ps.setInt(2, buscarMesaPorNumero(num).getNumeroMesa());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Se cambió la capacidad de la mesa");
            }
        } catch (SQLException ex) {
            
        }
    }
    
      public ArrayList<Mesa> listarMesas(){
        ArrayList <Mesa> lista= new ArrayList<>();
        String sql="SELECT * FROM mesa ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Mesa m= new Mesa();
                m.setIdMesa(rs.getInt("idMesa"));
                m.setNumeroMesa(rs.getInt("numeroMesa"));
                m.setCapacidad(rs.getInt("capacidad"));
                m.setEstadoMesa(rs.getBoolean("estado"));
                lista.add(m);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    public Mesa buscarMesaPorNumero(int numero){
        Mesa m= new Mesa();
        ArrayList<Mesa> mesas= listarMesas();
        for (Mesa i : mesas){
            if (i.getNumeroMesa()==numero){
                m=i;
            }
        }
        return m;
    }
    //----------AgrgadoUltimo-------------------------------------------------
    public Mesa buscarMesaPorId(int idMesa){
        Mesa m= new Mesa();
        String sql= "SELECT * FROM mesa WHERE idMesa = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                m.setIdMesa(idMesa);
                m.setNumeroMesa(rs.getInt("numeroMesa"));
                m.setCapacidad(rs.getInt("capacidad"));
                m.setEstadoMesa(rs.getBoolean("estado"));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar con la tabla mesa");
        }
        return m;
    }
    
    
    
}
