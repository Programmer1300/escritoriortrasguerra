
package vistas;

import Controloador.ControlUser;
import dao.UserDao;

public class Escritorioguerra {
    
    public static frmLogin ini; 
    public static void main(String[] args) {
       IfrmSystem viewUser2 =  new IfrmSystem();
       UserDao usdao2 = new UserDao();
       ControlUser controlUs = new ControlUser(viewUser2, usdao2);
        
        
      ini = new frmLogin();
      ini.setTitle("Extracción de basura    Trasportes Guerra");
      //nun.setExtendedState(6);
      //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      ini.setVisible(true);
      
    }
}