

package dao;

import classes.Customer;
import classes.Service;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDao extends Conexion {
    
    public boolean addCustomer(Customer customer) {
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

    
    
    public Customer updateCustomer(Customer customer){
       Customer cuto = new Customer();
       ArrayList<Service> sc = new ArrayList<>();
       ResultSet result = null;
        try {
            super.conectar();
            String query = "UPDATE generalView SET customer_name = ?, customer_last_name = ?, nit = ?, phone = ?, id_service = ?, fee = ?, id_customer_ty = ?, id_voucher = ?, id_status = ?, street_avenue = ?, house_number = ?, zone = ?, id_town = ?, observations = ?, town_name = ? " ;
            PreparedStatement psUpdateCustomer = super.getConexion().prepareStatement(query);
            
            psUpdateCustomer.setString(1, customer.getCustomerName());
            psUpdateCustomer.setString(2, customer.getCustomerLastName());
            psUpdateCustomer.setInt(3, customer.getNit());
            psUpdateCustomer.setInt(4, customer.getPhone());
            //psUpdateCustomer.setInt(5, customer);

            psUpdateCustomer.setString(1, cuto.getCustomerLastName());
            psUpdateCustomer.setString(2, cuto.getCustomerLastName());
            psUpdateCustomer.setInt(3, cuto.getNit());
            psUpdateCustomer.setInt(4, cuto.getPhone());
            
            
            Service service = new Service();
            psUpdateCustomer.setInt(5, service.getIdService());
            psUpdateCustomer.setDouble(6, service.getFee());
            psUpdateCustomer.setInt(7, service.getIdCustomerType());
            psUpdateCustomer.setInt(8, service.getIdVoucher());
            psUpdateCustomer.setInt(9, service.getIdStatus());
            psUpdateCustomer.setString(10, service.getStreetAvenue());
            psUpdateCustomer.setString(11, service.getHouseNumber());
            psUpdateCustomer.setInt(12, service.getZone());
            psUpdateCustomer.setInt(13, service.getIdTown());
            psUpdateCustomer.setString(14, service.getObservations());
            psUpdateCustomer.setString(15, service.getTownName());
                        
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cuto;
        }
    
    
    
   public Customer searchCustomer(int idService) {
       Customer cuto = new Customer();
       ArrayList<Service> sc = new ArrayList<>();
       ResultSet result = null;
       
       try{
        this.conectar();
        PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM generalView WHERE id_customer=?");
        st.setInt(1, idService);
        result = st.executeQuery();

        while(result.next()) {  
        cuto.setIdCustomer(result.getInt("id_customer"));
        cuto.setCustomerName(result.getString("customer_name"));
        cuto.setCustomerLastName(result.getString("customer_last_name"));
        cuto.setNit(result.getInt("nit"));
        cuto.setPhone(result.getInt("phone"));
      
            Service s = new Service();
            s.setIdService(result.getInt("id_service"));
            s.setFee(result.getInt("fee"));
            s.setIdCustomerType(result.getInt("id_customer_ty"));
            s.setIdVoucher(result.getInt("id_voucher"));
            s.setIdStatus(result.getInt("id_status"));
            s.setStreetAvenue(result.getString("street_avenue"));
            s.setHouseNumber(result.getString("house_number"));
            s.setZone(result.getInt("zone"));
            s.setIdTown(result.getInt("id_town"));
            s.setObservations(result.getString("observations"));
            
            sc.add(s);
        }
        cuto.setCsServices(sc);
           
       }catch(Exception e){
           
          System.out.println("ERROR:"+e);
          
       }finally{
           this.cerrar();
       }
    return cuto;
}
   
   public ArrayList<Customer> getCustomers(String query) {
       ArrayList<Customer> customers = new ArrayList<>();
       
       try {
           super.conectar();
           Statement psCustomers = super.getConexion().createStatement();
           ResultSet rsCustomers = psCustomers.executeQuery(query);
           
           while (rsCustomers.next()) {
                Customer cs = new Customer();
                cs.setIdCustomer(rsCustomers.getInt("id_customer"));
                cs.setCustomerName(rsCustomers.getString("customer_name"));
                cs.setCustomerLastName(rsCustomers.getString("customer_last_name"));
                cs.setNit(rsCustomers.getInt("nit"));
                cs.setPhone(rsCustomers.getInt("phone"));
               
                Service s = new Service();
                s.setIdCustomer(rsCustomers.getInt("id_customer"));
                s.setIdService(rsCustomers.getInt("id_service"));
                s.setFee(rsCustomers.getInt("fee"));
                s.setIdCustomerType(rsCustomers.getInt("id_customer_ty"));
                s.setIdVoucher(rsCustomers.getInt("id_voucher"));
                s.setIdStatus(rsCustomers.getInt("id_status"));
                s.setStreetAvenue(rsCustomers.getString("street_avenue"));
                s.setHouseNumber(rsCustomers.getString("house_number"));
                s.setZone(rsCustomers.getInt("zone"));
                s.setIdTown(rsCustomers.getInt("id_town"));
                s.setTownName(rsCustomers.getString("town_name"));
                s.setObservations(rsCustomers.getString("observations"));
               
                cs.setCustomerService(s);
                customers.add(cs);
           }
           
       } catch (SQLException ex) {
           System.err.println("Misteik" + ex);
       } finally {
           super.cerrar();
       }
       return customers;
   }
   
   public Customer searchService(int idService) {
       Customer cuto = null;
       
       try {
        this.conectar();
        PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM generalView WHERE id_service=?");
        st.setInt(1, idService);
        
        ResultSet result;
        result = st.executeQuery();

        if (result.next()) {
            cuto = new Customer();
            cuto.setIdCustomer(result.getInt("id_customer"));
            cuto.setCustomerName(result.getString("customer_name"));
            cuto.setCustomerLastName(result.getString("customer_last_name"));
            cuto.setNit(result.getInt("nit"));
            cuto.setPhone(result.getInt("phone"));
      
            Service s = new Service();
            s.setIdService(result.getInt("id_service"));
            s.setFee(result.getInt("fee"));
            s.setIdCustomerType(result.getInt("id_customer_ty"));
            s.setIdVoucher(result.getInt("id_voucher"));
            s.setIdStatus(result.getInt("id_status"));
            s.setStreetAvenue(result.getString("street_avenue"));
            s.setHouseNumber(result.getString("house_number"));
            s.setZone(result.getInt("zone"));
            s.setIdTown(result.getInt("id_town"));
            s.setObservations(result.getString("observations"));
            s.setTownName(result.getString("town_name"));
            
            cuto.setCustomerService(s);
            
        }
        
       }catch(SQLException e){
          System.out.println("ERROR:"+e);
       }finally{
           this.cerrar();
       }
    return cuto;
}   
    public ArrayList<Customer>GetDeterminatedCustomer(String query){
        ArrayList<Customer>customers = new ArrayList();

        try {       
            super.conectar();
            Statement execute = super.getConexion().createStatement();
            ResultSet result = execute.executeQuery(query);
            
            while (result.next()) {
                Customer cs = new Customer(); 
                cs.setCustomerName(result.getString("customer_name"));
                
                Service s = new Service();
                s.setIdService(result.getInt("id_service"));
                s.setFee(result.getDouble("fee"));
                s.setStreetAvenue(result.getString("street_avenue"));
                s.setHouseNumber(result.getString("house_number"));
                s.setZone(result.getInt("zone"));
                
                cs.setCustomerService(s);
                customers.add(cs);
                
            }  
                
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            super.cerrar();
        }
        return customers;
    }
    
}
