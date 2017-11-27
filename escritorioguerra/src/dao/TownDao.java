package dao;

import classes.Town;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TownDao extends Conexion {

    public ArrayList<Town> getAllTowns(int idTownship) {
        ArrayList<Town> allTowns = new ArrayList<>();
        
        try {
            super.conectar();
            String tsQuery = "SELECT * FROM towns WHERE id_township = ?";
            PreparedStatement psTownships = super.getConexion().prepareStatement(tsQuery);
            psTownships.setInt(1, idTownship);
            
            ResultSet rsTownships = psTownships.executeQuery();
            
            while (rsTownships.next()) {
                Town dept = new Town(rsTownships.getInt(1), rsTownships.getString(3), rsTownships.getInt(2));
                allTowns.add(dept);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            super.cerrar();
        }
        
        return allTowns;
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
