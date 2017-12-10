package dao;

import classes.User;
import classes.UserHistory;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDao extends Conexion {
    
    public User userAuth(String username, String pass) {
        User user = new User();
        try {
            super.conectar();
          
            String query =  "CALL userInfo(?, ?)";
            
            PreparedStatement psAuth = super.getConexion().prepareStatement(query);
            psAuth.setString(1, username);
            psAuth.setString(2, pass);
            
            ResultSet rs = psAuth.executeQuery();
            
            if (rs.next()) {
                user.setUsername(rs.getString("username"));
                user.setIdUserType(rs.getInt("id_user_type"));
                user.setUserType(rs.getString("user_type_name"));
                user.setUsstatus(rs.getInt("user_status"));                
            } else {
                user = null;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally { super.cerrar(); }
        return user;
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
            
        } catch (SQLException ec) {
            System.err.println(ec);
        } finally{ super.cerrar(); }
    }
    
    public List<UserHistory> getUsersHistory(String username, int day, int month, int year) {
      List<UserHistory> history = new ArrayList<>();;
      try {
          super.conectar();
          String addUs = "CALL getUsersHistory(?, ?, ?, ?)";
          PreparedStatement psUs = super.getConexion().prepareCall(addUs);
          psUs.setString(1, username);
          psUs.setInt(2, day);
          psUs.setInt(3, month);
          psUs.setInt(4, year);
          ResultSet rs = psUs.executeQuery();
          
          while (rs.next()) {
            UserHistory log = new UserHistory();
            User user = new User(rs.getString("username"), null, 0);
            
            log.setIdUserHistory(rs.getInt("id"));
            log.setDate(rs.getString("log_date"));
            log.setTime(rs.getString("log_time"));
            log.setUrl(rs.getString("url"));
            log.setUser(user);
            
            history.add(log);
          }

      } catch (SQLException ex) {
          System.err.println(ex);
      } finally{ super.cerrar(); }
      return history;
    }
    
    public boolean deleteUsersHistory(int deleteOption) {
        try {
            super.conectar();
            String addUs = "CALL deleteUsersHistory(?)";
            PreparedStatement psUs = super.getConexion().prepareCall(addUs);
            psUs.setInt(1, deleteOption);
            
            if (psUs.executeUpdate() > 0) {
              return true;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally{ super.cerrar(); }
      return false;
    }
    
}
