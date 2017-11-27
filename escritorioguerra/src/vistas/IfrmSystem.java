package vistas;

import classes.User;
import dao.UserDao;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author medev
 */
public class IfrmSystem extends javax.swing.JInternalFrame {
int blo=0;
UserDao usdao = new UserDao();
DefaultTableModel dtmUser;
    /**
     * Creates new form frmUser
     */
    public IfrmSystem() {
        initComponents();
        //this.tpnControl.setEnabled(false);
        this.tblUser.setEnabled(false);
        this.btnSaveCol.setEnabled(false);
        this.btnNewUser.setEnabled(false);
        this.btnAddTowns.setEnabled(false);
        this.btnDeleteTowns.setEnabled(false);
        this.btnSearchTowns.setEnabled(false);
        this.lstDepartments.setEnabled(false);
        this.lstTownships.setEnabled(false);
        this.lstTown.setEnabled(false);
        this.tblHistory.setEnabled(false);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuModif = new javax.swing.JMenuItem();
        btnDesbloquear = new javax.swing.JButton();
        tpnControl = new javax.swing.JTabbedPane();
        panUser = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        panTowns = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTown = new javax.swing.JList<>();
        btnSaveCol = new javax.swing.JButton();
        btnDeleteTowns = new javax.swing.JButton();
        btnAddTowns = new javax.swing.JButton();
        btnSearchTowns = new javax.swing.JButton();
        lblDep = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstDepartments = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstTownships = new javax.swing.JList<>();
        lblTowns = new javax.swing.JLabel();
        lblMuni = new javax.swing.JLabel();
        panRegistro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();

        mnuModif.setText("jMenuItem1");
        jPopupMenu1.add(mnuModif);

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/ajustes (2).png"))); // NOI18N

        btnDesbloquear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Lock-icon.png"))); // NOI18N
        btnDesbloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesbloquearActionPerformed(evt);
            }
        });

        btnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/user-business-add-icon.png"))); // NOI18N
        btnNewUser.setToolTipText("Guardar");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Npmbre de Usuario", "Contraseña", "tipo de usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUserMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblUser);

        javax.swing.GroupLayout panUserLayout = new javax.swing.GroupLayout(panUser);
        panUser.setLayout(panUserLayout);
        panUserLayout.setHorizontalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNewUser))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        panUserLayout.setVerticalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNewUser)
                .addContainerGap())
        );

        tpnControl.addTab("Usuarios", panUser);

        lstTown.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstTown);

        btnSaveCol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Check-icon.png"))); // NOI18N
        btnSaveCol.setToolTipText("Guardar");

        btnDeleteTowns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/building-delete-icon.png"))); // NOI18N
        btnDeleteTowns.setToolTipText("eliminar una colonia o condomino");

        btnAddTowns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/building-add-icon.png"))); // NOI18N
        btnAddTowns.setToolTipText("Agregar una colonia o condomino");

        btnSearchTowns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Search-icon.png"))); // NOI18N
        btnSearchTowns.setToolTipText("buscar una colonia");

        lblDep.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        lblDep.setText("Departamentos");

        lstDepartments.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstDepartments);

        lstTownships.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lstTownships);

        lblTowns.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        lblTowns.setText("colonias y condominios");

        lblMuni.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        lblMuni.setText("Municipios");

        javax.swing.GroupLayout panTownsLayout = new javax.swing.GroupLayout(panTowns);
        panTowns.setLayout(panTownsLayout);
        panTownsLayout.setHorizontalGroup(
            panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTownsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panTownsLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panTownsLayout.createSequentialGroup()
                        .addComponent(lblDep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMuni)
                        .addGap(73, 73, 73)))
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTowns)
                    .addGroup(panTownsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTowns)
                            .addComponent(btnDeleteTowns)
                            .addComponent(btnSearchTowns))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTownsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveCol)
                .addContainerGap())
        );
        panTownsLayout.setVerticalGroup(
            panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTownsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTowns, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panTownsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddTowns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteTowns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchTowns)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnSaveCol)
                .addContainerGap())
        );

        tpnControl.addTab("Colonias", panTowns);

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User", "Fecha", "Paginas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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
        jScrollPane3.setViewportView(tblHistory);

        javax.swing.GroupLayout panRegistroLayout = new javax.swing.GroupLayout(panRegistro);
        panRegistro.setLayout(panRegistroLayout);
        panRegistroLayout.setHorizontalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        tpnControl.addTab("Registros", panRegistro);

        btnCanselar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Delete-icon.png"))); // NOI18N
        btnCanselar.setToolTipText("Cerrar");
        btnCanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanselarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tpnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDesbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCanselar)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpnControl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDesbloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCanselar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloquearActionPerformed
  
        String pass = "Leo";
        if (blo==0){
        JFrame frame = new JFrame("InputDialog Example");
        String code = JOptionPane.showInputDialog(frame, " Ingrese el codigo para la confirmaion de desbloqueo",
                "confirmacion", JOptionPane.WARNING_MESSAGE);
        System.out.println(code);
            if (code == null) {
                JOptionPane.showMessageDialog(null, "Has canselado.");
            } else if (code.equals(pass)) {
                int ax = JOptionPane.showConfirmDialog(null, "Estas seguro?", "Desbloqueo", JOptionPane.OK_CANCEL_OPTION);
                if (ax == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Has desbloqueado.");
                    //this.tpnControl.setEnabled(true);
                    this.btnSaveCol.setEnabled(true);
                    this.btnNewUser.setEnabled(true);
                    this.btnAddTowns.setEnabled(true);
                    this.btnDeleteTowns.setEnabled(true);
                    this.btnSearchTowns.setEnabled(true);
                    this.lstDepartments.setEnabled(true);
                    this.lstTownships.setEnabled(true);
                    this.lstTown.setEnabled(true);
                    this.btnNewUser.setEnabled(true);
                    this.tblHistory.setEnabled(true);
                    dtmUser = (DefaultTableModel)tblUser.getModel();
                    Object[] columna = new Object[dtmUser.getColumnCount()];
                    ArrayList<User> usuarios =  usdao.displayUser();
                    tblUser.removeAll();
                    int tam = usuarios.size();
                    for(int i = 0; i < tam; i++){
                        columna[0] = usuarios.get(i).getUsername();
                        columna[1] = usuarios.get(i).getPass();
                        columna[2] = usuarios.get(i).getUserType();
                        dtmUser.addRow(columna);
                    }
                    blo = 1;
                    ImageIcon icono2 = new ImageIcon(System.getProperty("user.dir") + "/build/classes/resources/Icons/Unlock-icon.png");
                    this.btnDesbloquear.setIcon(icono2);
                } else if (ax == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Has seleccionado NO.");
                }
            }
        }else if (blo == 1){
            this.btnSaveCol.setEnabled(false);
            this.btnNewUser.setEnabled(false);
            this.btnAddTowns.setEnabled(false);
            this.btnDeleteTowns.setEnabled(false);
            this.btnSearchTowns.setEnabled(false);
            this.lstDepartments.setEnabled(false);
            this.lstTownships.setEnabled(false);
            this.lstTown.setEnabled(false);
            this.btnNewUser.setEnabled(false);
            this.tblHistory.setEnabled(false);

            ImageIcon icono3 = new ImageIcon(System.getProperty("user.dir") + "/build/classes/resources/Icons/Lock-icon.png");
            this.btnDesbloquear.setIcon(icono3);
            blo = 0;
        }    
    }//GEN-LAST:event_btnDesbloquearActionPerformed
    private void btnCanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanselarActionPerformed
        try {
            // TODO add your handling code here:
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(IfrmSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCanselarActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void tblUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMousePressed
        // TODO add your handling code here:
       // Integer filaSelec = tblUser.getSelectedRow();
        //Object[] options = null;
        
    }//GEN-LAST:event_tblUserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddTowns;
    private static final javax.swing.JButton btnCanselar = new javax.swing.JButton();
    public javax.swing.JButton btnDeleteTowns;
    public static javax.swing.JButton btnDesbloquear;
    public static final javax.swing.JButton btnNewUser = new javax.swing.JButton();
    public javax.swing.JButton btnSaveCol;
    public javax.swing.JButton btnSearchTowns;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblMuni;
    private javax.swing.JLabel lblTowns;
    public javax.swing.JList<String> lstDepartments;
    public javax.swing.JList<String> lstTown;
    public javax.swing.JList<String> lstTownships;
    private javax.swing.JMenuItem mnuModif;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JPanel panTowns;
    private javax.swing.JPanel panUser;
    public javax.swing.JTable tblHistory;
    public javax.swing.JTable tblUser;
    public javax.swing.JTabbedPane tpnControl;
    // End of variables declaration//GEN-END:variables
}
