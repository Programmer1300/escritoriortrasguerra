
package dao;

import classes.UserType;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsTypeDao extends Conexion {
    
    public ArrayList<UserType> getAllusType() {
        ArrayList<UserType> AllusType = new ArrayList<>();
        
        try {
            super.conectar();
            String ustypedao = "SELECT * FROM user_types";
            PreparedStatement psUstype = super.getConexion().prepareStatement(
                    ustypedao);
            ResultSet rsUstype = psUstype.executeQuery();
            
            while (rsUstype.next()){
                UserType ustype = new UserType(
                        rsUstype.getInt(1), rsUstype.getString(2));
                AllusType.add(ustype);
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        } finally{
            super.cerrar();
        }
        
        return AllusType;
    }
    
}
