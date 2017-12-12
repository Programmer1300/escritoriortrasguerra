package Controloador;

import classes.Department;
import classes.Town;
import classes.Township;
import classes.UserType;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vistas.IfrmSystem;
import vistas.dlgModifyUser;
import vistas.dlgNewUser;
import vistas.frmExtraguerra;

public class UserController implements ActionListener{
    
    dlgModifyUser modifyuser = new dlgModifyUser(null, true);
    ListasController listasController = new ListasController();
    frmExtraguerra dad = new frmExtraguerra();
    IfrmSystem vistaus = new IfrmSystem();
    Department selectedDepto = new Department();
    Township selectedTownship = new Township();
    
    
    public UserController (IfrmSystem user1){
        this.vistaus = user1;
        
        vistaus.lstDepartments.setModel(
                listasController.getDepartmentsListModel());
        
        vistaus.lstDepartments.addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectedDepto = vistaus.lstDepartments.getSelectedValue();
                vistaus.lstTownships.setModel(
                  listasController.getTownshipsListModel(
                          selectedDepto.getIdDepto()));
            }
        });
        
        vistaus.lstTownships.addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectedTownship = vistaus.lstTownships.getSelectedValue();
                vistaus.lstTown.setModel(listasController.getTownsListModel(
                    selectedTownship.getIdTownship()));
            }
        });
        
        vistaus.tblUser.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked( MouseEvent evt ){           
              
             }   
             
        }); 
        
        this.vistaus.btnDesbloquear.setActionCommand("");
        this.vistaus.btnDesbloquear.addActionListener(this);
        
        this.vistaus.btnNewUser.setActionCommand("");
        this.vistaus.btnNewUser.addActionListener(this);
        
        this.vistaus.mniModi.setActionCommand("Modificar");
        this.vistaus.mniModi.addActionListener(this);
        
        this.vistaus.btnSysClose1.setActionCommand("");
        this.vistaus.btnSysClose1.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ea) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String event1 = ea.getActionCommand();
    
    if (ea.getSource()==vistaus.btnNewUser){
        Frame f = JOptionPane.getFrameForComponent(dad);
        dlgNewUser dialog = new dlgNewUser(f, true);
        NewUserController nn = new NewUserController(dialog);
        dialog.show();
        
    }
    
    if (ea.getSource()==vistaus.mniModi){
        Frame f = JOptionPane.getFrameForComponent(dad);
        dlgModifyUser modifyUser = new dlgModifyUser(f, true);
          int filaSelec = vistaus.tblUser.getSelectedRow();
                
            if (filaSelec >= 0) {
                Object[] Modifyinfo = {vistaus.tblUser.getValueAt(filaSelec, 0),
                    vistaus.tblUser.getValueAt(filaSelec, 1),
                    vistaus.tblUser.getValueAt(filaSelec, 2)};
        ModifyController nnm = new ModifyController(modifyUser);
        nnm.modifyuser.txtModUsername.setText(String.valueOf(Modifyinfo[0]));
        UserType ust = new UserType(4, Modifyinfo[1].toString());
        nnm.modifyuser.cmbModuserType.setSelectedItem(ust);
        nnm.modifyuser.jrbUserAct.setSelected(true);
        modifyUser.show();
    }
    }
    
    if (ea.getSource()==vistaus.btnSysClose1){
         try {
            // TODO add your handling code here:
            vistaus.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(IfrmSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
     
}
