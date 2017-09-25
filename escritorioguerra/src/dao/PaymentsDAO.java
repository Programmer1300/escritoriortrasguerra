package dao;

import classes.Payments;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class PaymentsDAO extends Conexion {
   
    public ArrayList<Payments> searchPaid( int idcol, String status){
        Payments pay = new Payments();
        ArrayList<Payments> py = new ArrayList<>();
        ResultSet result = null;
        
        try {
            this.conectar();
            PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM `payment_process` WHERE `payment_status_name`= ? AND Colomia=?");
            st.setString(1, status);
            st.setInt(2, idcol);
            
            while (result.next()) {
                pay.setID_custumer(result.getInt("id_customer"));
                pay.setID_service(result.getInt("id_service"));
                pay.setName(result.getString("Nombre"));
                pay.setPhone(result.getInt("phone"));
                pay.setFee(result.getDouble("fee"));
                pay.setDireccion(result.getString("Direccíon"));
                pay.setVoucher_name(result.getString("Factura/Recivo"));
                pay.setType_custumer(result.getString("tipo_cliente"));
                pay.setEstado(result.getString("Estado"));
                pay.setID_status(result.getInt("id_status"));
                pay.setID_town(result.getInt("Colomia"));
                pay.setId_payment_status(result.getInt("id_payment_status"));
                
                py.add(pay);
            }
            
            
        } catch (Exception e) {
            
            System.out.println("ERROR"+e);
        }finally{
            this.cerrar();
        }
    return py;
    }   
}
