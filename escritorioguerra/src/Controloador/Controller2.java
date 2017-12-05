
package Controloador;


import classes.Customer;
import classes.Service;
import dao.CustomerDao;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import vistas.prueba;

public class Controller2 implements KeyListener {
    
    prueba vista = new prueba();
    
    public Controller2(prueba miformulario) {
        vista = miformulario;
        
        this.vista.prueba2.addKeyListener(this);
        
    } 
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        if (e.getSource()==vista.prueba2) {                  
            
            CustomerDao customerdao = new CustomerDao();
            Customer customer = new Customer();
            Service service = new Service();
            
            String texto;
            String query;
            texto = vista.prueba2.getText();
            
            if (isNumeric(texto) == true) {
            
            query = "select * from generalView where id_customer like '%" + texto + "%'";
        } else {
            query = "select * from generalView where customer_name like '%" + texto + "%'";
        }
            
            DefaultTableModel muestrameclientes = (DefaultTableModel) vista.tblTown.getModel();
            
            if (muestrameclientes.getRowCount() > 0) {
                muestrameclientes.setRowCount(0);
            }

            for (Customer cuto : customerdao.getCustomers(query)) {

                int customerID = cuto.getIdCustomer();
                String name = cuto.getCustomerName();

                customer.setCustomerService(service);

                double fee = customer.getCustomerService().getFee();
                String address = customer.getCustomerService().getStreetAvenue();
//                        + customer.getCustomerService().getHouseNumber()
//                        + customer.getCustomerService().getZone();

                Object[] tablaDeClientes = new Object[4];
                tablaDeClientes[0] = customerID;
                tablaDeClientes[1] = name;
                tablaDeClientes[2] = fee;
                tablaDeClientes[3] = address;

                muestrameclientes.addRow(tablaDeClientes);
            }
        }
    }
    
    
    public static boolean isNumeric(String s) {

        try {
            int n = (int) Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    
}
