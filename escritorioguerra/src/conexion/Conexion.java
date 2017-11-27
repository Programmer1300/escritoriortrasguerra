package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private Connection conexion;
    private final String DIRECCION = "jdbc:mysql://localhost:3306/dbextraguerra";
    private final String USUARIO ="root";
    private final String CONTRA = "Leo525096";

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void conectar(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(DIRECCION, USUARIO, CONTRA);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrar (){
        
        if (conexion != null) {
            try {
                if (conexion.isClosed() == false) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
