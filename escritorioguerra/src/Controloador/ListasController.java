package Controloador;

import classes.Department;
import classes.Town;
import classes.Township;
import classes.User;
import classes.UserType;
import dao.DeptoDao;
import dao.TownDao;
import dao.TownshipDao;
import dao.UsTypeDao;
import dao.UserDao;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class ListasController {

  public DefaultComboBoxModel<Department> getDepartmentsComboBoxModel() {
      DeptoDao deptoDao = new DeptoDao();
      DefaultComboBoxModel<Department> defaultCmb = new DefaultComboBoxModel<>();
        
      for (Department depto : deptoDao.getAllDepts()) {
          defaultCmb.addElement(depto);
      }
      return defaultCmb;
  }
  public DefaultListModel<Department> getDepartmentsListModel() {
      DeptoDao deptoDao = new DeptoDao();
      DefaultListModel<Department> defaultList = new DefaultListModel<>();
        
      for (Department depto : deptoDao.getAllDepts()) {
          defaultList.addElement(depto);
      }
      return defaultList;
  }
  
  public DefaultComboBoxModel<Township> getTownshipsComboBoxModel(int idDepto) {
      TownshipDao townshipDao = new TownshipDao();
      DefaultComboBoxModel<Township> defaultCmb = new DefaultComboBoxModel<>();
        
      for (Township township : townshipDao.getAllTownships(idDepto)) {
          defaultCmb.addElement(township);
      }
      return defaultCmb;
  }
  
  public DefaultListModel<Township> getTownshipsListModel(int idDepto) {
      TownshipDao townshipDao = new TownshipDao();
      DefaultListModel<Township> defaultList = new DefaultListModel<>();
        
      for (Township township : townshipDao.getAllTownships(idDepto)) {
          defaultList.addElement(township);
      }
      return defaultList;
  }

  public DefaultComboBoxModel<Town> getTownsComboBoxModel(int idTownship) {
      TownDao townDao = new TownDao();
      DefaultComboBoxModel<Town> defaultCmb = new DefaultComboBoxModel<>();
        
      for (Town town : townDao.getAllTowns(idTownship)) {
          defaultCmb.addElement(town);
      }
      return defaultCmb;
  }
  
  public DefaultListModel<Town> getTownsListModel(int idTownship) {
      TownDao townDao = new TownDao();
      DefaultListModel<Town> defaultList = new DefaultListModel<>();
        
      for (Town town : townDao.getAllTowns(idTownship)) {
          defaultList.addElement(town);
      }
      return defaultList;
  }
  
  public DefaultComboBoxModel<UserType> getUserTypeComboBoxModel(){
      UsTypeDao ustypedao = new UsTypeDao();
      DefaultComboBoxModel<UserType> defaultCmb = new DefaultComboBoxModel<>();
      
      for (UserType ustype : ustypedao.getAllusType()) {
          defaultCmb.addElement(ustype);
      }
      return defaultCmb;
  }

  public DefaultComboBoxModel<User> getUsersComboBoxModel(){
      UserDao userDao = new UserDao();
      DefaultComboBoxModel<User> userComboBox = new DefaultComboBoxModel<>(); 

      for (User user : userDao.displayUser()) {
        userComboBox.addElement(user);
      }
      return userComboBox;
  }
  
}
