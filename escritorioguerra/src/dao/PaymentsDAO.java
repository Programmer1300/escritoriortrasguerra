package dao;

import classes.Customer;
import classes.Month;
import classes.Payment;
import classes.PaymentStatus;
import classes.Service;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class PaymentsDAO extends Conexion {
   
    public ArrayList<Payment> getPayments(int idTown, int month, int year) {
        ArrayList<Payment> payments = new ArrayList<>();
        ResultSet result = null;
        
        try {
            this.conectar();
            String query = "CALL getPaymentsByTown(?, ?, ?)";
            PreparedStatement st = this.getConexion().prepareCall(query);
            st.setInt(1, idTown);
            st.setInt(2, month);
            st.setInt(3, year);
            result = st.executeQuery();
            
            while (result.next()) {
                Payment pay = new Payment();
                Customer cs = new Customer();
                Service sc = new Service();
                Month mh = new Month();
                
                cs.setIdCustomer(result.getInt("id_customer"));
                cs.setCustomerName(result.getString("customer_name"));
                cs.setCustomerLastName(result.getString("customer_last_name"));
                cs.setPhone(result.getInt("phone"));
                cs.setCustomerService(sc);
                
                sc.setIdService(result.getInt("id_service"));
                sc.setStreetAvenue(result.getString("street_avenue"));
                sc.setHouseNumber(result.getString("house_number"));
                sc.setZone(result.getInt("zone"));
                sc.setTownName(result.getString("town_name"));  
                
                mh.setMonthName(result.getString("month_name"));
                                
                pay.setAmount(result.getDouble("amount"));
                pay.setIdPayment(result.getInt("id_payment"));
                pay.setPaymentDate(result.getString("payment_date"));
                pay.setCustomer(cs);
                pay.setMonth(mh);
                
                payments.add(pay);
            }
  
        } catch (SQLException e) {
            System.out.println("ERROR"+e);
        }finally{
            this.cerrar();
        }
        return payments;
    }
    
    public ArrayList<Payment> getDueBills(String query) {
        ArrayList<Payment> payments = new ArrayList<>();
        ResultSet result = null;
        
        try {
            this.conectar();
            PreparedStatement st = this.getConexion().prepareCall(query);
            result = st.executeQuery();
            
            while (result.next()) {
                Payment pay = new Payment();
                Customer cs = new Customer();
                Service sc = new Service();
                Month mh = new Month();
                PaymentStatus pyms = new PaymentStatus();

                cs.setIdCustomer(result.getInt("id_customer"));
                cs.setCustomerName(result.getString("customer_name"));
                cs.setCustomerLastName(result.getString("customer_last_name"));
                cs.setPhone(result.getInt("phone"));
                cs.setCustomerService(sc);
                
                sc.setIdService(result.getInt("id_service"));
                sc.setFee(result.getDouble("fee"));
                sc.setStreetAvenue(result.getString("street_avenue"));
                sc.setHouseNumber(result.getString("house_number"));
                sc.setZone(result.getInt("zone"));
                sc.setTownName(result.getString("town_name"));
                
                mh.setMonthName(result.getString("month_name"));

                pyms.setIdPayStatus(result.getInt("id_pay_status"));
                pyms.setPayStatus(result.getString("pay_status"));                
                
                pay.setIdPayment(result.getInt("id_payment"));
                pay.setCustomer(cs);
                pay.setMonth(mh);
                pay.setPayStatus(pyms);

                payments.add(pay);
            }
            
            
        } catch (SQLException e) {
            System.out.println("ERROR"+e);
        }finally{
            this.cerrar();
        }
        return payments;
    }
    
    public boolean payBill(int idPayment) {
        try {
            this.conectar();
            String query = "CALL payBill(?)";
            
            PreparedStatement st = this.getConexion().prepareCall(query);
            st.setInt(1, idPayment);
            
            if (st.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR"+e);
        }finally{
            this.cerrar();
        }
        return false;
    }

    public boolean leaveReceipt(int idPayment) {
        try {
            this.conectar();
            String query = "CALL leaveReceipt(?)";
            
            PreparedStatement st = this.getConexion().prepareCall(query);
            st.setInt(1, idPayment);
            
            if (st.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR"+e);
        }finally{
            this.cerrar();
        }
        return false;
    }
    
}
