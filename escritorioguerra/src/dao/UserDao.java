package dao;

import classes.User;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UserDao extends Conexion {
    
    public User userAuth(String username, String pass) {
        User user = new User();
        try {
            super.conectar();
          
            String query =  "SELECT users.username, users.pass, users.id_user_type, user_types.user_type_name " +
                            "FROM users INNER JOIN user_types " +
                            "ON users.id_user_type = user_types.id_user_type " +
                            "WHERE username=? AND pass=?";
            
            PreparedStatement psAuth = super.getConexion().prepareStatement(query);
            psAuth.setString(1, username);
            psAuth.setString(2, pass);
            
            ResultSet rs = psAuth.executeQuery();
            
            if (rs.next()) {
                user.setUsername(rs.getString("username"));
                user.setIdUserType(rs.getInt("id_user_type"));
                user.setUserType(rs.getString("user_type_name"));
                // "this.logIn(user) inserta en la base de datos la fecha y hora del
                // inicio de sesión y retorna el ID de la sesión
                user.setIdSession(this.logIn(user));
            } else {
                user = null;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally { super.cerrar(); }
        return user;
    }
    
    public int logIn(User user) {
        int sessionId = 0;
        try {
            //Se inserta hora y fecha en la que el usuario entra al sistema
            String logInProcedure = "CALL sessionLogIn(?)";
            PreparedStatement psLogIn = super.getConexion().prepareCall(logInProcedure);
            psLogIn.setString(1, user.getUsername());
            psLogIn.executeUpdate();
            
            // Se obtiene el id de la sesión desde la base de datos, 
            // que fue auto creado con el procedure anterior.    
            String getSessionIdProcedure = "CALL getLastInsertIdSession();";
            PreparedStatement psSessionId;
            psSessionId = super.getConexion().prepareCall(getSessionIdProcedure);
            ResultSet rsSessionId = psSessionId.executeQuery();

            if (rsSessionId.next()) {
                sessionId = rsSessionId.getInt(1);
            }
        
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally { super.cerrar(); }
        return sessionId;
    }
    
    public void logOut(User user) {
        try {
            super.conectar();
            String logOutProcedure = "CALL sessionLogOut(?)";
            PreparedStatement psLogOut = super.getConexion().prepareCall(logOutProcedure);
            psLogOut.setInt(1, user.getIdSession());
            psLogOut.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally { super.cerrar(); }
    }
    
    public void updateUserHistory(User user, String visitedUrl) {
        try {
            super.conectar();
            String setVisitedUrlProcedure = "CALL addUrlVisited(?, ?)";
            PreparedStatement psUrl = super.getConexion().prepareCall(setVisitedUrlProcedure);
            psUrl.setString(1, user.getUsername());
            psUrl.setString(2, visitedUrl);
            psUrl.executeUpdate();
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally { super.cerrar(); }

    }
    
    public ArrayList<User> displayUser(){
        User us;
        ArrayList<User> usuario = new ArrayList();
        ResultSet datos=null;
        //int indice = 0;
        try {
            super.conectar();
            String displayUS = "CALL displayUser()";
            PreparedStatement dplUs = super.getConexion().prepareCall(displayUS);
            datos = dplUs.executeQuery();
            
            while (datos.next()) {                
                us = new User();
                
                us.setUsername(datos.getString("username"));
                us.setUserType(datos.getString("type_user"));
                us.setUsstatus(datos.getInt("estado"));
                
                usuario.add(us);
             
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally { super.cerrar();}
        
        return usuario;
    }
    
    public void addUser(String usaername1, String pass1, int ustype1) {
        try {
            super.conectar();
            String addUs = "CALL addNewUser(?,?,?)";
            PreparedStatement psUs = super.getConexion().prepareCall(addUs);
            psUs.setString(1, usaername1);
            psUs.setString(2, pass1);
            psUs.setInt(3, ustype1);
            psUs.executeQuery();
            
        } catch (Exception ec) {
            System.err.println(ec);
        } finally{ super.cerrar(); }
    }
}
