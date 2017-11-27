package vistas;

import Controloador.ListasController;
import Controloador.PaymentsController;
import classes.Department;
import classes.Town;
import classes.Township;
import dao.DeptoDao;
import dao.PaymentsDAO;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class IfrmPayments extends javax.swing.JInternalFrame {

    public IfrmPayments() {
        initComponents();
        PaymentsController payController = new PaymentsController(this);
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btgMonths = new javax.swing.ButtonGroup();
    tpnControl = new javax.swing.JTabbedPane();
    panUser = new javax.swing.JPanel();
    jScrollPane6 = new javax.swing.JScrollPane();
    tblPaymentsHistory = new javax.swing.JTable();
    btnCheckPaymentsHistory = new javax.swing.JButton();
    txtAnioHistory = new javax.swing.JTextField();
    cmbMesHistory = new javax.swing.JComboBox<>();
    lblDep2 = new javax.swing.JLabel();
    lblMuni2 = new javax.swing.JLabel();
    cmbDeptoHistory = new javax.swing.JComboBox<>();
    lblDep3 = new javax.swing.JLabel();
    lblMuni3 = new javax.swing.JLabel();
    cmbMunicipioHistory = new javax.swing.JComboBox<>();
    cmbColoniaHistory = new javax.swing.JComboBox<>();
    lblTowns1 = new javax.swing.JLabel();
    panTowns = new javax.swing.JPanel();
    btnCheckDueBills = new javax.swing.JButton();
    lblDep = new javax.swing.JLabel();
    lblTowns = new javax.swing.JLabel();
    lblMuni = new javax.swing.JLabel();
    cmbDeptoDueBills = new javax.swing.JComboBox<>();
    cmbMunicipioDueBills = new javax.swing.JComboBox<>();
    cmbColoniaDueBills = new javax.swing.JComboBox<>();
    jScrollPane5 = new javax.swing.JScrollPane();
    tblDueBills = new javax.swing.JTable();
    cmbMesDueBills = new javax.swing.JComboBox<>();
    lblDep1 = new javax.swing.JLabel();
    txtAnioDueBills = new javax.swing.JTextField();
    lblMuni1 = new javax.swing.JLabel();

    setBorder(null);
    setIconifiable(true);
    setToolTipText("gestor de cobors");
    setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/comprobar (1).png"))); // NOI18N

    tblPaymentsHistory.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "CLIENTE", "NIT", "TELÉFONO", "DIRECCIÓN", "MONTO", "MES", "FECHA DEL PAGO"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane6.setViewportView(tblPaymentsHistory);
    if (tblPaymentsHistory.getColumnModel().getColumnCount() > 0) {
      tblPaymentsHistory.getColumnModel().getColumn(0).setResizable(false);
      tblPaymentsHistory.getColumnModel().getColumn(2).setResizable(false);
      tblPaymentsHistory.getColumnModel().getColumn(4).setResizable(false);
      tblPaymentsHistory.getColumnModel().getColumn(6).setResizable(false);
    }

    btnCheckPaymentsHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/table-refresh-icon.png"))); // NOI18N
    btnCheckPaymentsHistory.setToolTipText("Consultar Historial de Cobros");
    btnCheckPaymentsHistory.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCheckPaymentsHistoryActionPerformed(evt);
      }
    });

    txtAnioHistory.setToolTipText("Nonbre del Usuario del sistemal");

    cmbMesHistory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
    cmbMesHistory.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbMesHistoryActionPerformed(evt);
      }
    });

    lblDep2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblDep2.setText("Mes");

    lblMuni2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblMuni2.setText("Año");

    cmbDeptoHistory.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbDeptoHistoryActionPerformed(evt);
      }
    });

    lblDep3.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblDep3.setText("Departamentos");

    lblMuni3.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblMuni3.setText("Municipios");

    cmbMunicipioHistory.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbMunicipioHistoryActionPerformed(evt);
      }
    });

    lblTowns1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblTowns1.setText("Colonias");

    javax.swing.GroupLayout panUserLayout = new javax.swing.GroupLayout(panUser);
    panUser.setLayout(panUserLayout);
    panUserLayout.setHorizontalGroup(
      panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panUserLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
          .addGroup(panUserLayout.createSequentialGroup()
            .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panUserLayout.createSequentialGroup()
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblDep2)
                  .addComponent(cmbMesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panUserLayout.createSequentialGroup()
                    .addComponent(lblMuni2)
                    .addGap(181, 181, 181))
                  .addComponent(txtAnioHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
              .addGroup(panUserLayout.createSequentialGroup()
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblDep3)
                  .addComponent(cmbDeptoHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cmbMunicipioHistory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(lblMuni3))))
            .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panUserLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblTowns1)
                  .addComponent(cmbColoniaHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(panUserLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnCheckPaymentsHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap())
    );
    panUserLayout.setVerticalGroup(
      panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUserLayout.createSequentialGroup()
        .addGap(11, 11, 11)
        .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblDep3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblMuni3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblTowns1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(3, 3, 3)
        .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cmbDeptoHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cmbMunicipioHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cmbColoniaHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panUserLayout.createSequentialGroup()
            .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panUserLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblDep2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panUserLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMuni2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cmbMesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtAnioHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(panUserLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnCheckPaymentsHistory)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        .addGap(23, 23, 23))
    );

    tpnControl.addTab("Historial de Cobros", panUser);

    btnCheckDueBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/DesList.png"))); // NOI18N
    btnCheckDueBills.setToolTipText("Consultar Cobros Pendientes");

    lblDep.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblDep.setText("Departamentos");

    lblTowns.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblTowns.setText("Colonias");

    lblMuni.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblMuni.setText("Municipios");

    cmbDeptoDueBills.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbDeptoDueBillsActionPerformed(evt);
      }
    });

    cmbMunicipioDueBills.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbMunicipioDueBillsActionPerformed(evt);
      }
    });

    cmbColoniaDueBills.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbColoniaDueBillsActionPerformed(evt);
      }
    });

    tblDueBills.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "CLIENTE", "NIT", "TELÉFONO", "DIRECCIÓN", "MENSUALIDAD", "MES", "ESTADO DEL PAGO"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane5.setViewportView(tblDueBills);
    if (tblDueBills.getColumnModel().getColumnCount() > 0) {
      tblDueBills.getColumnModel().getColumn(0).setResizable(false);
      tblDueBills.getColumnModel().getColumn(2).setResizable(false);
      tblDueBills.getColumnModel().getColumn(4).setResizable(false);
      tblDueBills.getColumnModel().getColumn(6).setResizable(false);
    }

    cmbMesDueBills.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

    lblDep1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblDep1.setText("Mes");

    txtAnioDueBills.setToolTipText("Nonbre del Usuario del sistemal");

    lblMuni1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
    lblMuni1.setText("Año");

    javax.swing.GroupLayout panTownsLayout = new javax.swing.GroupLayout(panTowns);
    panTowns.setLayout(panTownsLayout);
    panTownsLayout.setHorizontalGroup(
      panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panTownsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane5)
          .addGroup(panTownsLayout.createSequentialGroup()
            .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panTownsLayout.createSequentialGroup()
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblDep1)
                  .addComponent(cmbMesDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panTownsLayout.createSequentialGroup()
                    .addComponent(lblMuni1)
                    .addGap(181, 181, 181))
                  .addComponent(txtAnioDueBills, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
              .addGroup(panTownsLayout.createSequentialGroup()
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblDep)
                  .addComponent(cmbDeptoDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cmbMunicipioDueBills, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(lblMuni))))
            .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panTownsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblTowns)
                  .addComponent(cmbColoniaDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(panTownsLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnCheckDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap())
    );
    panTownsLayout.setVerticalGroup(
      panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panTownsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblDep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblTowns, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(3, 3, 3)
        .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cmbDeptoDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cmbMunicipioDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cmbColoniaDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panTownsLayout.createSequentialGroup()
            .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panTownsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblDep1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panTownsLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMuni1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panTownsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cmbMesDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtAnioDueBills, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(panTownsLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnCheckDueBills)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        .addGap(22, 22, 22))
    );

    tpnControl.addTab("Cobros Pendientes", panTowns);

    btnCanselar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/Delete-icon.png"))); // NOI18N
    btnCanselar1.setToolTipText("Cerrar");
    btnCanselar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCanselar1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(738, Short.MAX_VALUE)
        .addComponent(btnCanselar1)
        .addGap(20, 20, 20))
      .addGroup(layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(tpnControl, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(tpnControl, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCanselar1)
        .addContainerGap(15, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnCanselar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanselar1ActionPerformed
        try {
            // TODO add your handling code here:
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(IfrmSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCanselar1ActionPerformed

  private void cmbMunicipioHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioHistoryActionPerformed

  }//GEN-LAST:event_cmbMunicipioHistoryActionPerformed

  private void cmbDeptoHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptoHistoryActionPerformed

  }//GEN-LAST:event_cmbDeptoHistoryActionPerformed

  private void cmbMunicipioDueBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioDueBillsActionPerformed

  }//GEN-LAST:event_cmbMunicipioDueBillsActionPerformed

  private void cmbDeptoDueBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptoDueBillsActionPerformed

  }//GEN-LAST:event_cmbDeptoDueBillsActionPerformed

  private void cmbColoniaDueBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColoniaDueBillsActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cmbColoniaDueBillsActionPerformed

  private void cmbMesHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesHistoryActionPerformed
    
  }//GEN-LAST:event_cmbMesHistoryActionPerformed

  private void btnCheckPaymentsHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckPaymentsHistoryActionPerformed

  }//GEN-LAST:event_btnCheckPaymentsHistoryActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup btgMonths;
  private static final javax.swing.JButton btnCanselar1 = new javax.swing.JButton();
  public javax.swing.JButton btnCheckDueBills;
  public javax.swing.JButton btnCheckPaymentsHistory;
  public javax.swing.JComboBox<Town> cmbColoniaDueBills;
  public javax.swing.JComboBox<Town> cmbColoniaHistory;
  public javax.swing.JComboBox<Department> cmbDeptoDueBills;
  public javax.swing.JComboBox<Department> cmbDeptoHistory;
  public javax.swing.JComboBox<String> cmbMesDueBills;
  public javax.swing.JComboBox<String> cmbMesHistory;
  public javax.swing.JComboBox<Township> cmbMunicipioDueBills;
  public javax.swing.JComboBox<Township> cmbMunicipioHistory;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JScrollPane jScrollPane6;
  private javax.swing.JLabel lblDep;
  private javax.swing.JLabel lblDep1;
  private javax.swing.JLabel lblDep2;
  private javax.swing.JLabel lblDep3;
  private javax.swing.JLabel lblMuni;
  private javax.swing.JLabel lblMuni1;
  private javax.swing.JLabel lblMuni2;
  private javax.swing.JLabel lblMuni3;
  private javax.swing.JLabel lblTowns;
  private javax.swing.JLabel lblTowns1;
  private javax.swing.JPanel panTowns;
  private javax.swing.JPanel panUser;
  public javax.swing.JTable tblDueBills;
  public javax.swing.JTable tblPaymentsHistory;
  public javax.swing.JTabbedPane tpnControl;
  public javax.swing.JTextField txtAnioDueBills;
  public javax.swing.JTextField txtAnioHistory;
  // End of variables declaration//GEN-END:variables
}
