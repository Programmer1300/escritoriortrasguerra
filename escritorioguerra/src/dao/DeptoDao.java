package dao;

import classes.Department;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptoDao extends Conexion {

    public ArrayList<Department> getAllDepts() {
        ArrayList<Department> allDepts = new ArrayList<>();
        
        try {
            super.conectar();
            String deptsQuery = "SELECT * FROM departments";
            PreparedStatement psDepts = super.getConexion().prepareStatement(deptsQuery);
            ResultSet rsDepts = psDepts.executeQuery();
            
            while (rsDepts.next()) {
                Department dept = new Department(rsDepts.getInt(1), rsDepts.getString(2));
                allDepts.add(dept);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            super.cerrar();
        }
        
        return allDepts;
    }
    
    
}
