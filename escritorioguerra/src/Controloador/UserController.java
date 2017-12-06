package Controloador;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import vistas.IfrmSystem;
import vistas.dlgNewUser;
import vistas.frmExtraguerra;

public class UserController implements ActionListener{
    
    frmExtraguerra dad = new frmExtraguerra();
    IfrmSystem user0 = new IfrmSystem();
    
    public void usButton (IfrmSystem user1){
        this.user0 = user1;
        
        this.user0.btnDesbloquear.setActionCommand("");
        this.user0.btnDesbloquear.addActionListener(this);
        
        this.user0.btnNewUser.setActionCommand("");
        this.user0.btnNewUser.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ea) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String event1 = ea.getActionCommand();
    
    if (ea.getSource()==user0.btnNewUser){
        Frame f = JOptionPane.getFrameForComponent(dad);
        dlgNewUser dialog = new dlgNewUser(f, true);
        dialog.show();
    }
    }
     
}
