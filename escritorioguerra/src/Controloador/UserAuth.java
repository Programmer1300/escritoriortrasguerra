package Controloador;

import classes.User;
import dao.UserDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistas.frmExtraguerra;
import vistas.frmLogin;

public class UserAuth implements ActionListener {

  private frmLogin loginView;
  
  public UserAuth(frmLogin loginView) {
    this.loginView = loginView;
    
    loginView.btnLogin.addActionListener(this);
    loginView.btnLogin.setActionCommand("btnLogin");
    
  }
  
  @Override
  public void actionPerformed(ActionEvent ae) {
    UserDao userDao = new UserDao();
    switch (ae.getActionCommand()) {
      case "btnLogin":
        String txtUsername = loginView.txtUser.getText();
        String txtPass = "";
        
        char[] txtPassArr = loginView.txtPass.getPassword();
        
        for (char ch : txtPassArr) {
          txtPass += ch;
        }
        
        User user = userDao.userAuth(txtUsername, txtPass);
        
        if (user != null && 
                (user.getIdUserType() == 1 || user.getIdUserType() == 2)) {
            frmExtraguerra main = new frmExtraguerra();
            main.setTitle("Extracción de basura    Trasportes Guerra");
            main.setExtendedState(JFrame.MAXIMIZED_BOTH);
            main.setVisible(true);
            loginView.dispose();
            loginView.dispose();
            formControl zz = new formControl();
            zz.botones(main);
        } else {
            JOptionPane.showMessageDialog(
                    loginView, "Sus credenciales son incorrectas.\n Intente nuevamente, por favor.", 
                    "Usuario o contraseña incorrecta", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
        loginView.txtUser.setText("");
        loginView.txtPass.setText("");
        txtPass = "";
        txtPassArr = null;
        break;
    }
  }
  
}
