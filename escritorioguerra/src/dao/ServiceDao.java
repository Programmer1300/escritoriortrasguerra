package dao;

import classes.Customer;
import classes.Service;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceDao extends Conexion {
    
    public boolean addCustomer(Customer customer, Service service) {
        boolean indicator = false;
        try {
            super.conectar();
            String query = "CALL addNewCustomer(?, ?, ?, ?)";
            PreparedStatement psNewCustomer = super.getConexion().prepareCall(query);
            psNewCustomer.setString(1, customer.getCustomerName());
            psNewCustomer.setString(2, customer.getCustomerLastName());
            psNewCustomer.setInt(3, customer.getNit());
            psNewCustomer.setInt(4, customer.getPhone());
            
            if (psNewCustomer.executeUpdate() > 0) {
                indicator = true;
                System.out.println("Se ha ingresado el nuevo cliente.");
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            super.cerrar();
        }
        return indicator;
    }
        
}
