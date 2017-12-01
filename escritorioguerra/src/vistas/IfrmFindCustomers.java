/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class IfrmFindCustomers extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmFindCustomers
     */
    public IfrmFindCustomers() {
        
        
        initComponents();
        this.panCodeName.setVisible(false);
        this.panTown.setVisible(false);
        this.panList.setVisible(false);
        this.lblNameCode.setVisible(false);
        this.lbldepartment.setVisible(false);
        this.lbltownship.setVisible(false);
        this.lblTown.setVisible(false);
        this.lblListType.setVisible(false);
        this.txtNameCode.setVisible(false);
        this.cmbDepartment.setVisible(false);
        this.cmbTownships.setVisible(false);
        this.cmbTown.setVisible(false);
        this.cmbListType.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnuOpition = new javax.swing.JPopupMenu();
        mniModi = new javax.swing.JMenuItem();
        mnuState = new javax.swing.JMenu();
        mniDel = new javax.swing.JMenuItem();
        mniActi = new javax.swing.JMenuItem();
        mniAddServis = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniPrinOne = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTown = new javax.swing.JTable();
        btnNewCus = new javax.swing.JButton();
        btnCanselar = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panTown = new javax.swing.JPanel();
        cmbDepartment = new javax.swing.JComboBox<>();
        lbldepartment = new javax.swing.JLabel();
        lbltownship = new javax.swing.JLabel();
        cmbTownships = new javax.swing.JComboBox<>();
        cmbTown = new javax.swing.JComboBox<>();
        lblTown = new javax.swing.JLabel();
        panCodeName = new javax.swing.JPanel();
        lblNameCode = new javax.swing.JLabel();
        txtNameCode = new javax.swing.JTextField();
        panList = new javax.swing.JPanel();
        lblListType = new javax.swing.JLabel();
        cmbListType = new javax.swing.JComboBox<>();

        mnuOpition.setToolTipText("");

        mniModi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/group-edit-icon.png"))); // NOI18N
        mniModi.setText("Modificar");
        mniModi.setToolTipText("Modifica la información del clinete y servisios");
        mniModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniModiActionPerformed(evt);
            }
        });
        mnuOpition.add(mniModi);

        mnuState.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/group-gear-icon.png"))); // NOI18N
        mnuState.setText("estados del servisio");
        mnuState.setToolTipText("opciones de estado");

        mniDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/status_offline.png"))); // NOI18N
        mniDel.setText("Inactivo");
        mniDel.setToolTipText("canbia el estado del servisio a Inactivo");
        mniDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDelActionPerformed(evt);
            }
        });
        mnuState.add(mniDel);

        mniActi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/status_online.png"))); // NOI18N
        mniActi.setText("Activar");
        mniActi.setToolTipText("Canbia el estatus del servisio a activo");
        mnuState.add(mniActi);

        mnuOpition.add(mnuState);

        mniAddServis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/group-add-icon.png"))); // NOI18N
        mniAddServis.setText("Agregar servicio");
        mniAddServis.setToolTipText("Agrega un servicio nuevo al cliente ");
        mniAddServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddServisActionPerformed(evt);
            }
        });
        mnuOpition.add(mniAddServis);
        mnuOpition.add(jSeparator1);

        mniPrinOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Printer-icon.png"))); // NOI18N
        mniPrinOne.setText("Inprimir resivo");
        mniPrinOne.setToolTipText("Inprime el resivo del servisio seleccionado");
        mnuOpition.add(mniPrinOne);

        setBorder(null);
        setIconifiable(true);
        setResizable(true);
        setTitle("Busqueda por codigo o Nombre");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/telemarketer.png"))); // NOI18N

        tblTown.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cuota", "Direccíon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTown.setComponentPopupMenu(mnuOpition);
        tblTown.setInheritsPopupMenu(true);
        jScrollPane3.setViewportView(tblTown);

        btnNewCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/group-add-icon.png"))); // NOI18N
        btnNewCus.setToolTipText("Nuevo cliente");
        btnNewCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCusActionPerformed(evt);
            }
        });

        btnCanselar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Delete-icon.png"))); // NOI18N
        btnCanselar.setToolTipText("Cerrar");
        btnCanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanselarActionPerformed(evt);
            }
        });

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/book_addresses.png"))); // NOI18N
        btnReport.setToolTipText("Reportes de clientes");

        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });

        lbldepartment.setText("Departamento");

        lbltownship.setText("Municipios");

        cmbTownships.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbTown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTown.setText("Colonia");

        javax.swing.GroupLayout panTownLayout = new javax.swing.GroupLayout(panTown);
        panTown.setLayout(panTownLayout);
        panTownLayout.setHorizontalGroup(
            panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTownLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panTownLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lbldepartment)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panTownLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(lbltownship)
                            .addGap(109, 109, 109)
                            .addComponent(lblTown))
                        .addGroup(panTownLayout.createSequentialGroup()
                            .addComponent(cmbTownships, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbTown, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        panTownLayout.setVerticalGroup(
            panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTownLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldepartment)
                        .addComponent(lbltownship)
                        .addComponent(lblTown))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panTownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTownships, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        lblNameCode.setText("Ingrese el  Codigo o el nombre del cliente ");

        txtNameCode.setToolTipText("Nombre o Codio ");
        txtNameCode.setComponentPopupMenu(mnuOpition);

        javax.swing.GroupLayout panCodeNameLayout = new javax.swing.GroupLayout(panCodeName);
        panCodeName.setLayout(panCodeNameLayout);
        panCodeNameLayout.setHorizontalGroup(
            panCodeNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCodeNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCodeNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNameCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNameCode))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panCodeNameLayout.setVerticalGroup(
            panCodeNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCodeNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblListType.setText("Listar servisios por :");

        cmbListType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panListLayout = new javax.swing.GroupLayout(panList);
        panList.setLayout(panListLayout);
        panListLayout.setHorizontalGroup(
            panListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListLayout.createSequentialGroup()
                .addComponent(cmbListType, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(panListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListType)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panListLayout.setVerticalGroup(
            panListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panListLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblListType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbListType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jLayeredPane1.setLayer(panTown, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panCodeName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panList, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(panCodeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(panList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(panTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(panCodeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewCus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReport))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCanselar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReport)
                            .addComponent(btnNewCus))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCanselar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanselarActionPerformed
        try {
            // TODO add your handling code here:
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(IfrmSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCanselarActionPerformed

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed

    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void btnNewCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCusActionPerformed
        // TODO add your handling code here:
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgNewCustomers dialog = new dlgNewCustomers(f, true);
        dialog.show();
    }//GEN-LAST:event_btnNewCusActionPerformed

    private void mniDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniDelActionPerformed

    private void mniAddServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddServisActionPerformed
        // TODO add your handling code here:
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgNewService dialog = new dlgNewService(f, true);
        dialog.show();
    }//GEN-LAST:event_mniAddServisActionPerformed

    private void mniModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniModiActionPerformed
        // TODO add your handling code here:
        Frame f = JOptionPane.getFrameForComponent(this);
        dlgModifyService dialog = new dlgModifyService(f, true);
        dialog.show();
    }//GEN-LAST:event_mniModiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanselar;
    private javax.swing.JButton btnNewCus;
    private javax.swing.JButton btnReport;
    public javax.swing.JComboBox<String> cmbDepartment;
    public javax.swing.JComboBox<String> cmbListType;
    public javax.swing.JComboBox<String> cmbTown;
    public javax.swing.JComboBox<String> cmbTownships;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JLabel lblListType;
    public javax.swing.JLabel lblNameCode;
    public javax.swing.JLabel lblTown;
    public javax.swing.JLabel lbldepartment;
    public javax.swing.JLabel lbltownship;
    public javax.swing.JMenuItem mniActi;
    private javax.swing.JMenuItem mniAddServis;
    private javax.swing.JMenuItem mniDel;
    private javax.swing.JMenuItem mniModi;
    public javax.swing.JMenuItem mniPrinOne;
    private javax.swing.JPopupMenu mnuOpition;
    public javax.swing.JMenu mnuState;
    public javax.swing.JPanel panCodeName;
    public javax.swing.JPanel panList;
    public javax.swing.JPanel panTown;
    public javax.swing.JTable tblTown;
    public javax.swing.JTextField txtNameCode;
    // End of variables declaration//GEN-END:variables
}
