
package accesoAdatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String usuario = "root";
    private static String password = "";
    private static final String bd = "resto";
    private static final String drive = "org.mariadb.jdbc.Driver";
    private static Connection conexion = null;

    private Conexion() {
    }

    public static Connection conectarse() {
        try {
            Class.forName(drive);
            conexion = DriverManager.getConnection(url + bd, usuario, password);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, " Error al cargar el driver " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexión " + ex.getMessage());

        }

        return conexion;
    }
}
