package dao;

import classes.Township;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TownshipDao extends Conexion {

    public ArrayList<Township> getAllTownships(int idDepto) {
        ArrayList<Township> allTownships = new ArrayList<>();
        
        try {
            super.conectar();
            String tsQuery = "SELECT * FROM townships WHERE id_dep = ?";
            PreparedStatement psTownships = super.getConexion().prepareStatement(tsQuery);
            psTownships.setInt(1, idDepto);
            
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
    
}
