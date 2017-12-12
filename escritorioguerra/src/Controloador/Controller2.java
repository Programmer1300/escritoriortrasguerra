
package Controloador;


import classes.Customer;
import classes.Department;
import classes.Town;
import classes.Township;
import dao.CustomerDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import vistas.IfrmFindCustomers;

public class Controller2 implements ActionListener {
     private ListasController listas;
     private CustomerDao customerdao;
     private IfrmFindCustomers vista;
     String query;

    
    
    public Controller2(IfrmFindCustomers formulario) {
            this.vista = formulario;
            listas = new ListasController();
            vista.cmbDepartment.setModel(listas.getDepartmentsComboBoxModel());
                                Customer cuto = new Customer();

            initListeners();
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            Department selectedDepto;
            Township selectedTownship;
            Town selectedTown;

            switch(e.getActionCommand()){
                
                case "cmbDepartment":
                    selectedDepto = (Department) vista.cmbDepartment.getSelectedItem();
                    vista.cmbTownships.setModel(listas.getTownshipsComboBoxModel(selectedDepto.getIdDepto()));
                break;
                
                case "cmbTownships":
                    selectedTownship  = (Township) vista.cmbTownships.getSelectedItem();
                    vista.cmbTown.setModel(listas.getTownsComboBoxModel(selectedTownship.getIdTownship()));
                break;
                
                case "cmbTown":
                    selectedTown = (Town) vista.cmbTown.getSelectedItem();
                    customerdao = new CustomerDao();
                    query = "select * from generalView where id_town = " + selectedTown.getIdTown() +"";
                    
                    System.out.println("holiis" + query);
                    
                    DefaultTableModel tablita  = (DefaultTableModel) vista.tblTown.getModel();
                    
                    if (tablita.getRowCount() > 0) {
                        tablita.setRowCount(0);
                    
                    }

                    for (Customer cuto : customerdao.getCustomers(query)) {
                        System.out.println("hellouu" + query);
                        int customerID = cuto.getIdCustomer();
                        String name = cuto.getCustomerName();

                        cuto.getCustomerService();
                        double fee = cuto.getCustomerService().getFee();
                        String address = cuto.getCustomerService().getStreetAvenue()
                                + " " + cuto.getCustomerService().getHouseNumber()
                                + " " + "Zona" + " " + cuto.getCustomerService().getZone();

                        Object[] tabladeclientes = new Object[4];
                        tabladeclientes[0] = customerID;
                        tabladeclientes[1] = name;
                        tabladeclientes[2] = fee;
                        tabladeclientes[3] = address;
                        
                        tablita.addRow(tabladeclientes);
                break;
                    }   
            }
        }
        
        private void initListeners(){
            vista.cmbDepartment.setActionCommand("cmbDepartment");
            vista.cmbDepartment.addActionListener(this);
            vista.cmbTownships.setActionCommand("cmbTownships");
            vista.cmbTownships.addActionListener(this);
            vista.cmbTown.setActionCommand("cmbTown");
            vista.cmbTown.addActionListener(this);
        }
    }  