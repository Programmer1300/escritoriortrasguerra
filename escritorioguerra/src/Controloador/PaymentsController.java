package Controloador;

import classes.Department;
import classes.Payment;
import classes.Town;
import classes.Township;
import dao.PaymentsDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
        refreshDueBillsTable();
        break;
        
      case "mniCobrar":
          if (vista.tblDueBills.getSelectedRow() >= 0) {
            int idPayment = (int) vista.tblDueBills.getModel().getValueAt(vista.tblDueBills.getSelectedRow(), 0);
            if (paymentsDao.payBill(idPayment)) {
              JOptionPane.showMessageDialog(vista, "El pago se registró correctamente.", "Pago Realizado", JOptionPane.OK_OPTION);
            } else {
              JOptionPane.showMessageDialog(vista, "Por favor, intente nuevamente.", "Error al Registrar Pago", JOptionPane.ERROR_MESSAGE);
            }
            refreshDueBillsTable();
          } else {
              JOptionPane.showMessageDialog(vista, "Seleccione un servicio, por favor.", "Sin Selección", JOptionPane.WARNING_MESSAGE);
          }
          break;        
        
      case "mniRecibo":
          if (vista.tblDueBills.getSelectedRow() >= 0) {
            int idPayment = (int) vista.tblDueBills.getModel().getValueAt(vista.tblDueBills.getSelectedRow(), 0);
            if (paymentsDao.leaveReceipt(idPayment)) {
              JOptionPane.showMessageDialog(vista, "Se ha registrado que dejó recibo/factura al cliente", "Dejó Recibo/Factura", JOptionPane.OK_OPTION);
            } else {
              JOptionPane.showMessageDialog(vista, "Por favor, intente nuevamente.", "Error al Registrar que Dejó Recibo/Factura", JOptionPane.ERROR_MESSAGE);
            }
            refreshDueBillsTable();
          } else {
              JOptionPane.showMessageDialog(vista, "Seleccione un servicio, por favor.", "Sin Selección", JOptionPane.WARNING_MESSAGE);
          }
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

    vista.mniRecibo.setActionCommand("mniRecibo");
    vista.mniRecibo.addActionListener(this);

    vista.mniCobrar.setActionCommand("mniCobrar");
    vista.mniCobrar.addActionListener(this);
  }
  
  private void refreshDueBillsTable() {
    Town selectedTown = (Town) vista.cmbColoniaDueBills.getSelectedItem();
    int selectedMonth = vista.cmbMesDueBills.getSelectedIndex() + 1;
    int year = Integer.parseInt(vista.txtAnioDueBills.getText());

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
      int payId = pay.getIdPayment();

      Object[] tblDueBillsRow = new Object[9];
      tblDueBillsRow[0] = payId;
      tblDueBillsRow[1] = csId;
      tblDueBillsRow[2] = customer;
      tblDueBillsRow[3] = nit;
      tblDueBillsRow[4] = phone;
      tblDueBillsRow[5] = address;
      tblDueBillsRow[6] = fee;
      tblDueBillsRow[7] = month;
      tblDueBillsRow[8] = payStatus;

      tblDueBillsModel.addRow(tblDueBillsRow);
    }        
    vista.tblDueBills.setModel(tblDueBillsModel);
  }
  
}
