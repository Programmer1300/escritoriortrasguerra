package Controloador;

import classes.Customer;
import classes.Department;
import classes.Town;
import classes.Township;
import dao.CustomerDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;

import vistas.IfrmFindCustomers;

public class FindCustomers implements KeyListener{
    private CustomerDao customerdao;
    private IfrmFindCustomers vista;
    
    
    public FindCustomers(IfrmFindCustomers formulario) {
        vista = formulario;
        this.vista.txtNameCode.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getSource() == vista.txtNameCode) {

            String texto;
            String query;   
            texto = vista.txtNameCode.getText();

            if (isNumeric(texto) == true) {

                query = "select * from generalView where id_customer like '%"
                        + texto + "%'";

            } else {

                query = "select * from generalView where customer_name like '%"
                        + texto + "%'";

            }

            DefaultTableModel muestrameclientes = (DefaultTableModel)
                    vista.tblTown.getModel();

            if (muestrameclientes.getRowCount() > 0) {
                muestrameclientes.setRowCount(0);
            }

            for (Customer cuto : customerdao.getCustomers(query)) {

                int customerID = cuto.getIdCustomer();
                String name = cuto.getCustomerName();
 
                cuto.getCustomerService();
                double fee = cuto.getCustomerService().getFee();
                String address = cuto.getCustomerService().getStreetAvenue()
                        + " " + cuto.getCustomerService().getHouseNumber()
                        + " " + "Zona" + " " + cuto.getCustomerService(
                        ).getZone();

                Object[] tabladeclientes = new Object[4];
                tabladeclientes[0] = customerID;
                tabladeclientes[1] = name;
                tabladeclientes[2] = fee;
                tabladeclientes[3] = address;

                muestrameclientes.addRow(tabladeclientes);

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
