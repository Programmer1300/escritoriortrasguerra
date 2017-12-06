
package dao;

import classes.UserType;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsTypeDao extends Conexion {
    
//    public ArrayList<UserType> getAllusType() {
//        ArrayList<UserType> getAllusType = new ArrayList<>();
//        
//        try {
//            super.conectar();
//            String ustype = "SELECT * FROM user_types";
//            PreparedStatement psUstype = super.getConexion().prepareStatement(ustype);
//            ResultSet rsUstype = psUstype.executeQuery();
//            
//            while (rsUstype.next()){
//                UserType ustype = new UserType(rsUstype.getInt(1), rsUstype.getString(2));
//            }
//        } catch (Exception e) {
//        }
//    }
}
