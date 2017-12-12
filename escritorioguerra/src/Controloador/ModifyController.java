package Controloador;

import classes.UserType;
import dao.UserDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import vistas.IfrmSystem;
import vistas.dlgModifyUser;

/**
 *
 * @author leoher
 */
public class ModifyController implements ActionListener{
    
    dlgModifyUser modifyuser = new dlgModifyUser(null, true);
    ListasController listasController = new ListasController();
    UserDao userdao = new UserDao();
    UserType selectedeUsType = null;
    int codty = 0;
    IfrmSystem vistaus = new IfrmSystem();

    public ModifyController(dlgModifyUser modus) {
        
        this.modifyuser = modus;
        modus.cmbModuserType.setModel(listasController.getUserTypeComboBoxModel());
        
        
        this.modifyuser.cmbModuserType.setActionCommand("cmbModuserType");
        this.modifyuser.cmbModuserType.addActionListener(this);
        
        this.modifyuser.btnModUserClose.setActionCommand("");
        this.modifyuser.btnModUserClose.addActionListener(this);
        
        this.modifyuser.btnModUserSave.setActionCommand("");
        this.modifyuser.btnModUserSave.addActionListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent modus1) {
        String event1 = modus1.getActionCommand();
        
        //switch (modus1.getActionCommand()) {
        //    case "cmbModuserType":
        //        selectedeUsType = (
        //                UserType) modifyuser.cmbModuserType.getSelectedItem();
        //        codty = selectedeUsType.getIdUserType();
        //   break;
        //}
        if(modus1.getSource()==modifyuser.btnModUserClose){
            this.modifyuser.dispose();
        }
        
    }
    
}
