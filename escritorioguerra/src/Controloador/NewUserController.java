
package Controloador;

import classes.UserType;
import dao.UserDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vistas.dlgNewUser;

/**
 *
 * @author leoher
 */
public class NewUserController implements ActionListener{
    
    
    dlgNewUser usernew = new dlgNewUser(null, true);
    ListasController listasController = new ListasController();
    UserDao userdao = new UserDao();
    UserType selectedeUsType = null;
    int codty = 0;
    String newUsname = null;
    String newpass = null;

    public NewUserController(dlgNewUser usn) {
        this.usernew = usn;
        usn.cmbuserType.setModel(listasController.getUserTypeComboBoxModel());
        
        this.usernew.cmbuserType.setActionCommand("cmbuserType");
        this.usernew.cmbuserType.addActionListener(this);
        
        this.usernew.btnNewUsSave.setActionCommand("");
        this.usernew.btnNewUsSave.addActionListener(this);
        
        this.usernew.btnNewCloses.setActionCommand("");
        this.usernew.btnNewCloses.addActionListener(this);
        
    }
    public void IncertNewUser(){
        this.newUsname = this.usernew.txtNewUsername.getText();
        this.newpass = String.valueOf(this.usernew.txtNewUserpass.getPassword()
        );
      
        if ((this.newUsname != null) && (this.newpass != null) && 
                (this.codty != 0)) {
            int ax = JOptionPane.showConfirmDialog(null,"Confirma que desea"
                    + " ingresar el Usuario " + newUsname +" de tipo " 
                    +selectedeUsType.getUserType()+" al Sistema ",
                    "confirmacion",JOptionPane.OK_CANCEL_OPTION);
            if (ax == JOptionPane.YES_OPTION) {
                userdao.addUser(newUsname, newpass, codty);
                JOptionPane.showMessageDialog(null, "Has ingresado un "
                        + "nuevo usuarion satisfactoriamente.");
            } else if (ax == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Has seleccionado NO.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Asegurece de que a "
                    + "llenado todos los campos \n y de seleccionar un "
                    + "tipo de usuario \n ya que no se seleccióna "
                    + "automaticamene, por favor.", "Sin Selección"
                    , JOptionPane.WARNING_MESSAGE);
        }
        
    }
    

    @Override
    public void actionPerformed(ActionEvent nue) {
        String event1 = nue.getActionCommand();
        
        
        
        switch (nue.getActionCommand()) {
            case "cmbuserType":
                selectedeUsType = (
                        UserType) usernew.cmbuserType.getSelectedItem();
                codty = selectedeUsType.getIdUserType();
           break;
        }
        
        if(nue.getSource()==usernew.btnNewCloses){
            this.usernew.dispose();
        }
        
        if(nue.getSource()==usernew.btnNewUsSave){
            IncertNewUser();
        }
        
    }
    
}
