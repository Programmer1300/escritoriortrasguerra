
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
        mnuCostomer = new javax.swing.JMenu();
        mniNameCode = new javax.swing.JMenuItem();
        mniSearchTown = new javax.swing.JMenuItem();
        mniList = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        mniPrinter = new javax.swing.JMenuItem();
        mniPayments = new javax.swing.JMenuItem();
        mniUsers = new javax.swing.JMenu();
        mniUser = new javax.swing.JMenuItem();
        mniSignOff = new javax.swing.JMenuItem();
        mniOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mnuCostomer.setMnemonic('e');
        mnuCostomer.setText("Clientes");

        mniNameCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/user-business-search-icon.png"))); // NOI18N
        mniNameCode.setMnemonic('t');
        mniNameCode.setText("Busqueda por codigo");
        mniNameCode.setToolTipText("");
        mniNameCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNameCodeActionPerformed(evt);
            }
        });
        mnuCostomer.add(mniNameCode);

        mniSearchTown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/office-building-icon.png"))); // NOI18N
        mniSearchTown.setMnemonic('y');
        mniSearchTown.setText("Busqueda por colonia");
        mniSearchTown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSearchTownActionPerformed(evt);
            }
        });
        mnuCostomer.add(mniSearchTown);

        mniList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/lista (1).png"))); // NOI18N
        mniList.setMnemonic('p');
        mniList.setText("Listados");
        mniList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListActionPerformed(evt);
            }
        });
        mnuCostomer.add(mniList);

        menuBar.add(mnuCostomer);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Cobros");
        helpMenu.setToolTipText("Menu para inprimir resivos y facturas");

        mniPrinter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Printer-icon.png"))); // NOI18N
        mniPrinter.setMnemonic('c');
        mniPrinter.setText("Inprimir Resivo");
        helpMenu.add(mniPrinter);

        mniPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/comprobar.png"))); // NOI18N
        mniPayments.setText("Pagos");
        mniPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPaymentsActionPerformed(evt);
            }
        });
        helpMenu.add(mniPayments);

        menuBar.add(helpMenu);

        mniUsers.setMnemonic('f');
        mniUsers.setText("Sistema");
        mniUsers.setToolTipText("control del sistema");
        mniUsers.setIconTextGap(5);

        mniUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/ajusC.png"))); // NOI18N
        mniUser.setMnemonic('o');
        mniUser.setText("Usuarios");
        mniUser.setToolTipText("administracion de los usuarios y permisos");
        mniUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUserActionPerformed(evt);
            }
        });
        mniUsers.add(mniUser);

        mniSignOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Log-Out-icon.png"))); // NOI18N
        mniSignOff.setText("Cerrar sesion");
        mniSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSignOffActionPerformed(evt);
            }
        });
        mniUsers.add(mniSignOff);

        mniOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Exit-icon.png"))); // NOI18N
        mniOut.setMnemonic('x');
        mniOut.setText("Salir");
        mniOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOutActionPerformed(evt);
            }
        });
        mniUsers.add(mniOut);

        menuBar.add(mniUsers);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOutActionPerformed
    }//GEN-LAST:event_mniOutActionPerformed

    private void mniUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniUserActionPerformed

    private void mniSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSignOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniSignOffActionPerformed

    private void mniSearchTownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSearchTownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniSearchTownActionPerformed

    private void mniListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniListActionPerformed

    private void mniNameCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNameCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniNameCodeActionPerformed

    private void mniPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPaymentsActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_mniPaymentsActionPerformed

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
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    public javax.swing.JMenuItem mniList;
    public javax.swing.JMenuItem mniNameCode;
    public javax.swing.JMenuItem mniOut;
    public javax.swing.JMenuItem mniPayments;
    public javax.swing.JMenuItem mniPrinter;
    public javax.swing.JMenuItem mniSearchTown;
    public javax.swing.JMenuItem mniSignOff;
    public javax.swing.JMenuItem mniUser;
    private javax.swing.JMenu mniUsers;
    public javax.swing.JMenu mnuCostomer;
    // End of variables declaration//GEN-END:variables

}
