package dao;

import classes.Township;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TownshipDao extends Conexion {

    public ArrayList<Township> getAllTownships() {
        ArrayList<Township> allTownships = new ArrayList<>();
        
        try {
            super.conectar();
            String tsQuery = "SELECT * FROM townships";
            PreparedStatement psTownships = super.getConexion().prepareStatement(tsQuery);
            ResultSet rsTownships = psTownships.executeQuery();
            
            while (rsTownships.next()) {
                Township township = new Township(rsTownships.getInt(1), rsTownships.getString(2), rsTownships.getInt(3));
                allTownships.add(township);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            super.cerrar();
        }
        
        return allTownships;
    }
        
    /*
    public static void main(String[] args) {
        TownshipDao dao = new TownshipDao();
        for (Township t: dao.getAllTownships()) {
            System.out.println(t.getIdTownship());
            System.out.println(t.getTownshipName());
            System.out.println(t.getIdDepto());
        }
    }
*/
    
}
