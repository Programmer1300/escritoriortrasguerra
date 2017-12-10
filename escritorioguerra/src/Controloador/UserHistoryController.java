package Controloador;

import classes.User;
import classes.UserHistory;
import dao.UserDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas.IfrmSystem;
import vistas.dlgDeleteUserHistory;

public class UserHistoryController implements ActionListener {

  private IfrmSystem view;
  private dlgDeleteUserHistory dialog;

  public UserHistoryController(IfrmSystem view) {
    this.view = view;
    ListasController listas = new ListasController();
    User defaultCmbValue = new User("TODOS LOS USUARIOS", null, 0);
    dialog = new dlgDeleteUserHistory(null, true);
    
    DefaultComboBoxModel<User> usersList = listas.getUsersComboBoxModel();
    usersList.insertElementAt(defaultCmbValue, 0);
    usersList.setSelectedItem(defaultCmbValue);
    
    view.cmbUsersHistory.setModel(usersList);
    
    view.btnFetchHistory.addActionListener(this);
    view.btnFetchHistory.setActionCommand("btnFetchHistory");

    view.btnOpenDeleteUserHistory.addActionListener(this);
    view.btnOpenDeleteUserHistory.setActionCommand("btnOpenDeleteUserHistory");

    dialog.btnDeleteUserHistory.addActionListener(this);
    dialog.btnDeleteUserHistory.setActionCommand("btnDeleteUserHistory");
  }
  
  @Override
  public void actionPerformed(ActionEvent ae) {
    UserDao userDao = new UserDao();
    switch (ae.getActionCommand()) {
      case "btnFetchHistory":
        try {
            int day = Integer.parseInt(view.txtDayHistory.getText());
            int month = Integer.parseInt(view.txtMonthHistory.getText());
            int year = Integer.parseInt(view.txtYearHistory.getText());
            User user = (User) view.cmbUsersHistory.getSelectedItem();
            
            List<UserHistory> history;
            
            if (view.cmbUsersHistory.getSelectedIndex() == 0) {
              history = userDao.getUsersHistory(null, day, month, year);
            } else {
              history = userDao.getUsersHistory(user.getUsername(), day, month, year);
            }
            
            DefaultTableModel tblUserHistoryModel = (DefaultTableModel) view.tblUserHistory.getModel();

            if (tblUserHistoryModel.getRowCount() > 0) {
              tblUserHistoryModel.setRowCount(0);
            }

            for (UserHistory uh: history) {
              Object[] tblUsersHistoryRow = new Object[4];
              tblUsersHistoryRow[0] = uh.getUser().getUsername();
              tblUsersHistoryRow[1] = uh.getDate();
              tblUsersHistoryRow[2] = uh.getTime();
              tblUsersHistoryRow[3] = uh.getUrl();
              
              tblUserHistoryModel.addRow(tblUsersHistoryRow);
            }
              
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, 
                    "Ingrese una fecha correcta, por favor.", 
                    "Fecha Incorrecta", JOptionPane.ERROR_MESSAGE
            );
        }

        break;
      
      case "btnOpenDeleteUserHistory":
        dialog.setVisible(true);
        break;

      case "btnDeleteUserHistory":
        // Arreglar bug mysql users history trigger
        userDao.deleteUsersHistory(dialog.cmbDeleteOptions.getSelectedIndex());
        break;
    }
    
  }


  
}
