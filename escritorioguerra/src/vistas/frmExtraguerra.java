
package vistas;

public class frmExtraguerra extends javax.swing.JFrame {

    public frmExtraguerra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        mniNameCode = new javax.swing.JMenuItem();
        mniSearchTown = new javax.swing.JMenuItem();
        mniList = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        opUser = new javax.swing.JMenuItem();
        opLogout = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        editMenu.setMnemonic('e');
        editMenu.setText("Clientes");

        mniNameCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/user-business-search-icon.png"))); // NOI18N
        mniNameCode.setMnemonic('t');
        mniNameCode.setText("Busqueda por codigo");
        mniNameCode.setToolTipText("");
        mniNameCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNameCodeActionPerformed(evt);
            }
        });
        editMenu.add(mniNameCode);

        mniSearchTown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/office-building-icon.png"))); // NOI18N
        mniSearchTown.setMnemonic('y');
        mniSearchTown.setText("Busqueda por colonia");
        mniSearchTown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSearchTownActionPerformed(evt);
            }
        });
        editMenu.add(mniSearchTown);

        mniList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/book.png"))); // NOI18N
        mniList.setMnemonic('p');
        mniList.setText("Listados");
        mniList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListActionPerformed(evt);
            }
        });
        editMenu.add(mniList);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Cobros");
        helpMenu.setToolTipText("Menu para inprimir resivos y facturas");

        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Printer-icon.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Inprimir Resivo");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/email.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Resibo espesifico");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Sistema");
        fileMenu.setToolTipText("control del sistema");
        fileMenu.setIconTextGap(5);

        opUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/ajusC.png"))); // NOI18N
        opUser.setMnemonic('o');
        opUser.setText("Usuarios");
        opUser.setToolTipText("administracion de los usuarios y permisos");
        opUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUserActionPerformed(evt);
            }
        });
        fileMenu.add(opUser);

        opLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Log-Out-icon.png"))); // NOI18N
        opLogout.setText("Cerrar sesion");
        opLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLogoutActionPerformed(evt);
            }
        });
        fileMenu.add(opLogout);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Exit-icon.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void opUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUserActionPerformed
        // TODO add your handling code here:
        IfrmSystem a = new IfrmSystem();
        this.desktopPane.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_opUserActionPerformed

    private void opLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLogoutActionPerformed
        // TODO add your handling code here:
      Escritorioguerra.ini.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_opLogoutActionPerformed

    private void mniSearchTownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSearchTownActionPerformed
        // TODO add your handling code here:
        IfrmSearchTown s = new IfrmSearchTown();
        this.desktopPane.add(s);
        s.setVisible(true);
    }//GEN-LAST:event_mniSearchTownActionPerformed

    private void mniListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniListActionPerformed

    private void mniNameCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNameCodeActionPerformed
        // TODO add your handling code here:
        IfrmFindCustomers d = new IfrmFindCustomers();
        this.desktopPane.add(d);
        d.setVisible(true);
    }//GEN-LAST:event_mniNameCodeActionPerformed

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
            java.util.logging.Logger.getLogger(frmExtraguerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmExtraguerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmExtraguerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmExtraguerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmExtraguerra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniList;
    private javax.swing.JMenuItem mniNameCode;
    private javax.swing.JMenuItem mniSearchTown;
    private javax.swing.JMenuItem opLogout;
    private javax.swing.JMenuItem opUser;
    // End of variables declaration//GEN-END:variables

}
