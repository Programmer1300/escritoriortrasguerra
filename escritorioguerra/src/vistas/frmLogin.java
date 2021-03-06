/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.awt.AWTUtilities;
import javax.swing.UIManager;
import Controloador.UserAuth;


/**
 *
 * @author leoher
 */


public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin1
     */
    int x,y;
    public frmLogin() {
        initComponents();
        UserAuth userAuth = new UserAuth(this);
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lbUserFon = new javax.swing.JLabel();
        lbExit = new javax.swing.JLabel();
        lbUserFon1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(525, 535));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(510, 335));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        lbTitulo.setFont(new java.awt.Font("Mode G", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Inicio de sesión");
        lbTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbTituloMouseDragged(evt);
            }
        });
        lbTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbTituloMousePressed(evt);
            }
        });
        jPanel1.add(lbTitulo);
        lbTitulo.setBounds(100, 90, 340, 50);

        lbUser.setFont(new java.awt.Font("Mode G", 0, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("Usuario");
        jPanel1.add(lbUser);
        lbUser.setBounds(60, 160, 420, 20);

        lbPass.setFont(new java.awt.Font("Mode G", 0, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 255, 255));
        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPass.setText("Contraseña");
        jPanel1.add(lbPass);
        lbPass.setBounds(40, 240, 460, 20);

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setToolTipText("Ingrese el usuario");
        txtUser.setBorder(null);
        txtUser.setOpaque(false);
        jPanel1.add(txtUser);
        txtUser.setBounds(190, 185, 180, 30);

        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setToolTipText("Ingrese la Contraseña");
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        jPanel1.add(txtPass);
        txtPass.setBounds(190, 270, 180, 30);

        lbUserFon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/txt_med.png"))); // NOI18N
        jPanel1.add(lbUserFon);
        lbUserFon.setBounds(180, 260, 200, 50);

        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/cerrar_32px.png"))); // NOI18N
        lbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        jPanel1.add(lbExit);
        lbExit.setBounds(260, 430, 33, 33);

        lbUserFon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/txt_med.png"))); // NOI18N
        jPanel1.add(lbUserFon1);
        lbUserFon1.setBounds(180, 180, 200, 40);

        btnLogin.setBackground(new java.awt.Color(0, 140, 81));
        btnLogin.setForeground(new java.awt.Color(0, 102, 51));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/LOGOes.png"))); // NOI18N
        btnLogin.setToolTipText("Entrar");
        btnLogin.setBorder(null);
        jPanel1.add(btnLogin);
        btnLogin.setBounds(210, 330, 130, 70);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/500px-NEPHRITIS.png"))); // NOI18N
        lbFondo.setToolTipText("");
        jPanel1.add(lbFondo);
        lbFondo.setBounds(20, 0, 500, 500);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTituloMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lbTituloMousePressed

    private void lbTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTituloMouseDragged
        // TODO add your handling code here:
         this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lbTituloMouseDragged

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUserFon;
    private javax.swing.JLabel lbUserFon1;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
