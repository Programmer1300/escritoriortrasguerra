package Controloador;

import classes.Department;
import classes.Town;
import classes.Township;
import classes.UserType;
import dao.DeptoDao;
import dao.TownDao;
import dao.TownshipDao;
import javax.swing.DefaultComboBoxModel;

public class ListasController {

  public DefaultComboBoxModel<Department> getDepartmentsComboBoxModel() {
      DeptoDao deptoDao = new DeptoDao();
      DefaultComboBoxModel<Department> defaultCmb = new DefaultComboBoxModel<>();
        
      for (Department depto : deptoDao.getAllDepts()) {
          defaultCmb.addElement(depto);
      }
      return defaultCmb;
  }
  
  public DefaultComboBoxModel<Township> getTownshipsComboBoxModel(int idDepto) {
      TownshipDao townshipDao = new TownshipDao();
      DefaultComboBoxModel<Township> defaultCmb = new DefaultComboBoxModel<>();
        
      for (Township township : townshipDao.getAllTownships(idDepto)) {
          defaultCmb.addElement(township);
      }
      return defaultCmb;
  }

  public DefaultComboBoxModel<Town> getTownsComboBoxModel(int idTownship) {
      TownDao townDao = new TownDao();
      DefaultComboBoxModel<Town> defaultCmb = new DefaultComboBoxModel<>();
        
      for (Town town : townDao.getAllTowns(idTownship)) {
          defaultCmb.addElement(town);
      }
      return defaultCmb;
  }
  
  public DefaultComboBoxModel<UserType> getCustomerType(){
      return null;
  }
}
