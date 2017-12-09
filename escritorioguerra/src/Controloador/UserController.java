package Controloador;

import classes.Department;
import classes.Town;
import classes.Township;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vistas.IfrmSystem;
import vistas.dlgNewUser;
import vistas.frmExtraguerra;

public class UserController implements ActionListener{
    
    
    ListasController listasController = new ListasController();
    frmExtraguerra dad = new frmExtraguerra();
    IfrmSystem vistaus = new IfrmSystem();
    Department selectedDepto;
    Township selectedTownship;
    Town selectedTown;
    
    
    public UserController (IfrmSystem user1){
        this.vistaus = user1;
        
        vistaus.lstDepartments.setModel(listasController.getDepartmentsListModel());
        
        
        
        this.vistaus.btnDesbloquear.setActionCommand("");
        this.vistaus.btnDesbloquear.addActionListener(this);
        
        this.vistaus.btnNewUser.setActionCommand("");
        this.vistaus.btnNewUser.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ea) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String event1 = ea.getActionCommand();
    
    if (ea.getSource()==vistaus.btnNewUser){
        Frame f = JOptionPane.getFrameForComponent(dad);
        dlgNewUser dialog = new dlgNewUser(f, true);
        dialog.show();
    }
    }
     
}
