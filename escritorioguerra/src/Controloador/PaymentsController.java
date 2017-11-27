package Controloador;

import classes.Department;
import classes.Payment;
import classes.Town;
import classes.Township;
import dao.PaymentsDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import vistas.IfrmPayments;

public class PaymentsController implements ActionListener {
  
  private IfrmPayments vista;
  private ListasController listasController;
  private PaymentsDAO paymentsDao;
  
  public PaymentsController(IfrmPayments vista) {
    this.vista = vista;
    listasController = new ListasController();
    vista.cmbDeptoHistory.setModel(listasController.getDepartmentsComboBoxModel());
    vista.cmbDeptoDueBills.setModel(listasController.getDepartmentsComboBoxModel());
    initListeners();
  }
  
  @Override
  public void actionPerformed(ActionEvent ae) {
    paymentsDao = new PaymentsDAO();
    Department selectedDepto;
    Township selectedTownship;
    Town selectedTown;
    int selectedMonth;
    int year;
    
    switch (ae.getActionCommand()) {
      
      case "cmbDeptoHistory": 
        selectedDepto = (Department) vista.cmbDeptoHistory.getSelectedItem();
        vista.cmbMunicipioHistory.setModel(
          listasController.getTownshipsComboBoxModel(selectedDepto.getIdDepto())
        );
        break;
        
      case "cmbMunicipioHistory": 
        selectedTownship = (Township) vista.cmbMunicipioHistory.getSelectedItem();    
        vista.cmbColoniaHistory.setModel(
          listasController.getTownsComboBoxModel(selectedTownship.getIdTownship())
        );
        break;
      
      case "btnCheckPaymentsHistory": 
        selectedTown = (Town) vista.cmbColoniaHistory.getSelectedItem();
        selectedMonth = vista.cmbMesHistory.getSelectedIndex() + 1;
        year = Integer.parseInt(vista.txtAnioHistory.getText());
        
        DefaultTableModel tblPaymentsHistoryModel = (DefaultTableModel) vista.tblPaymentsHistory.getModel();
        
        if (tblPaymentsHistoryModel.getRowCount() > 0) {
          tblPaymentsHistoryModel.setRowCount(0);
        }
        
        for (Payment pay: paymentsDao.getPayments(selectedTown.getIdTown(), selectedMonth, year)) {
          int csId = pay.getCustomer().getIdCustomer();
          String customer = pay.getCustomer().getCustomerName() + " " + pay.getCustomer().getCustomerLastName();
          int nit = pay.getCustomer().getNit();
          int phone = pay.getCustomer().getPhone();
          String address = pay.getCustomer().getCustomerService().getStreetAvenue() + " "
                         + pay.getCustomer().getCustomerService().getHouseNumber() + " "
                         + pay.getCustomer().getCustomerService().getTownName();
          double amount = pay.getAmount();
          String month = pay.getMonth().getMonthName();
          String payDate = pay.getPaymentDate();
          
          Object[] tblPaymentsHistoryRow = new Object[8];
          tblPaymentsHistoryRow[0] = csId;
          tblPaymentsHistoryRow[1] = customer;
          tblPaymentsHistoryRow[2] = nit;
          tblPaymentsHistoryRow[3] = phone;
          tblPaymentsHistoryRow[4] = address;
          tblPaymentsHistoryRow[5] = amount;
          tblPaymentsHistoryRow[6] = month;
          tblPaymentsHistoryRow[7] = payDate;
          
          tblPaymentsHistoryModel.addRow(tblPaymentsHistoryRow);
          System.out.println(pay.toString());
        }
        vista.tblPaymentsHistory.setModel(tblPaymentsHistoryModel);
        break;
      
      case "cmbDeptoDueBills": 
        selectedDepto = (Department) vista.cmbDeptoDueBills.getSelectedItem();
        vista.cmbMunicipioDueBills.setModel(
          listasController.getTownshipsComboBoxModel(selectedDepto.getIdDepto())
        );
        break;
      
      case "cmbMunicipioDueBills": 
        selectedTownship = (Township) vista.cmbMunicipioDueBills.getSelectedItem();    
        vista.cmbColoniaDueBills.setModel(
          listasController.getTownsComboBoxModel(selectedTownship.getIdTownship())
        );
        break;
      
      case "btnCheckDueBills": 
        selectedTown = (Town) vista.cmbColoniaDueBills.getSelectedItem();
        selectedMonth = vista.cmbMesDueBills.getSelectedIndex() + 1;
        year = Integer.parseInt(vista.txtAnioDueBills.getText());
       
        DefaultTableModel tblDueBillsModel = (DefaultTableModel) vista.tblDueBills.getModel();
        
        if (tblDueBillsModel.getRowCount() > 0) {
          tblDueBillsModel.setRowCount(0);
        }
        
        for (Payment pay: paymentsDao.getDueBills(selectedTown.getIdTown(), selectedMonth, year)) {
          int csId = pay.getCustomer().getIdCustomer();
          String customer = pay.getCustomer().getCustomerName() + " " + pay.getCustomer().getCustomerLastName();
          int nit = pay.getCustomer().getNit();
          int phone = pay.getCustomer().getPhone();
          String address = pay.getCustomer().getCustomerService().getStreetAvenue() + " "
                         + pay.getCustomer().getCustomerService().getHouseNumber() + " "
                         + pay.getCustomer().getCustomerService().getTownName();
          double fee = pay.getCustomer().getCustomerService().getFee();
          String month = pay.getMonth().getMonthName();
          String payStatus = pay.getPayStatus().getPayStatus();
          
          Object[] tblDueBillsRow = new Object[8];
          tblDueBillsRow[0] = csId;
          tblDueBillsRow[1] = customer;
          tblDueBillsRow[2] = nit;
          tblDueBillsRow[3] = phone;
          tblDueBillsRow[4] = address;
          tblDueBillsRow[5] = fee;
          tblDueBillsRow[6] = month;
          tblDueBillsRow[7] = payStatus;
          
          tblDueBillsModel.addRow(tblDueBillsRow);
        }        
        vista.tblDueBills.setModel(tblDueBillsModel);
        break;
    
    }
  
  }
  
  private void initListeners() {    
    vista.cmbDeptoHistory.setActionCommand("cmbDeptoHistory");
    vista.cmbDeptoHistory.addActionListener(this);
    
    vista.cmbDeptoDueBills.setActionCommand("cmbDeptoDueBills");
    vista.cmbDeptoDueBills.addActionListener(this);
    
    vista.cmbMunicipioHistory.setActionCommand("cmbMunicipioHistory");
    vista.cmbMunicipioHistory.addActionListener(this);
    
    vista.cmbMunicipioDueBills.setActionCommand("cmbMunicipioDueBills");
    vista.cmbMunicipioDueBills.addActionListener(this);
    
    vista.btnCheckPaymentsHistory.setActionCommand("btnCheckPaymentsHistory");
    vista.btnCheckPaymentsHistory.addActionListener(this);
    
    vista.btnCheckDueBills.setActionCommand("btnCheckDueBills");
    vista.btnCheckDueBills.addActionListener(this);
  }
  
}
