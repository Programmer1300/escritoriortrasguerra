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

public class IfrmPayments extends javax.swing.JInternalFrame {

    public IfrmPayments() {
        initComponents();
        this.tblDueBills.removeColumn(this.tblDueBills.getColumnModel().getColumn(0));
        PaymentsController payController = new PaymentsController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMonths = new javax.swing.ButtonGroup();
        menuDueBills = new javax.swing.JPopupMenu();
        mniCobrar = new javax.swing.JMenuItem();
        mniRecibo = new javax.swing.JMenuItem();
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
        panForwardPayment = new javax.swing.JPanel();
        txtPayIdService = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPayCustomer = new javax.swing.JTextField();
        txtPayNit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPayPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPayAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPayYear = new javax.swing.JTextField();
        cmbPayMonth = new javax.swing.JComboBox<>();
        lblDep6 = new javax.swing.JLabel();
        lblMuni6 = new javax.swing.JLabel();
        lblMuni7 = new javax.swing.JLabel();
        txtPayAmount = new javax.swing.JTextField();
        btnMakePayment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        menuDueBills.setToolTipText("");

        mniCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/comprobar.png"))); // NOI18N
        mniCobrar.setText("Cobrar");
        menuDueBills.add(mniCobrar);

        mniRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/receipt.png"))); // NOI18N
        mniRecibo.setText("Dejar Recibo");
        menuDueBills.add(mniRecibo);

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
                "ID Pago", "ID", "CLIENTE", "TELÉFONO", "NIT", "DIRECCIÓN", "MENSUALIDAD", "MES", "ESTADO DEL PAGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDueBills.setComponentPopupMenu(menuDueBills);
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
                                    .addComponent(txtAnioDueBills, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        tpnControl.addTab("Cobros Pendientes", panTowns);

        txtPayIdService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayIdServiceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese el ID del servicio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cliente");

        txtPayCustomer.setEditable(false);

        txtPayNit.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NIT");

        txtPayPhone.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Teléfono");

        txtPayAddress.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Dirección");

        txtPayYear.setToolTipText("Nonbre del Usuario del sistemal");

        cmbPayMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbPayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPayMonthActionPerformed(evt);
            }
        });

        lblDep6.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        lblDep6.setText("Mes");

        lblMuni6.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        lblMuni6.setText("Año");

        lblMuni7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMuni7.setText("Mensualidad (Q.)");

        txtPayAmount.setEditable(false);
        txtPayAmount.setToolTipText("Nonbre del Usuario del sistemal");

        btnMakePayment.setText("Realizar Pago");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATOS DEL SERVICIO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DATOS DEL PAGO");

        javax.swing.GroupLayout panForwardPaymentLayout = new javax.swing.GroupLayout(panForwardPayment);
        panForwardPayment.setLayout(panForwardPaymentLayout);
        panForwardPaymentLayout.setHorizontalGroup(
            panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panForwardPaymentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panForwardPaymentLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPayIdService, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panForwardPaymentLayout.createSequentialGroup()
                            .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPayAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panForwardPaymentLayout.createSequentialGroup()
                                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(txtPayCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtPayNit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPayPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(btnMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panForwardPaymentLayout.createSequentialGroup()
                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDep6)
                            .addComponent(cmbPayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMuni6)
                            .addComponent(txtPayYear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMuni7)
                            .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panForwardPaymentLayout.setVerticalGroup(
            panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panForwardPaymentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPayIdService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panForwardPaymentLayout.createSequentialGroup()
                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPayNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPayPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panForwardPaymentLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPayCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPayAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panForwardPaymentLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panForwardPaymentLayout.createSequentialGroup()
                                .addComponent(lblDep6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(cmbPayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panForwardPaymentLayout.createSequentialGroup()
                                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMuni6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMuni7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panForwardPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPayYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panForwardPaymentLayout.createSequentialGroup()
                        .addComponent(btnMakePayment)
                        .addGap(2, 2, 2)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        tpnControl.addTab("Realizar Pago Adelantado", panForwardPayment);

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

    private void cmbPayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPayMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPayMonthActionPerformed

    private void txtPayIdServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayIdServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayIdServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMonths;
    private static final javax.swing.JButton btnCanselar1 = new javax.swing.JButton();
    public javax.swing.JButton btnCheckDueBills;
    public javax.swing.JButton btnCheckPaymentsHistory;
    public javax.swing.JButton btnMakePayment;
    public javax.swing.JComboBox<Town> cmbColoniaDueBills;
    public javax.swing.JComboBox<Town> cmbColoniaHistory;
    public javax.swing.JComboBox<Department> cmbDeptoDueBills;
    public javax.swing.JComboBox<Department> cmbDeptoHistory;
    public javax.swing.JComboBox<String> cmbMesDueBills;
    public javax.swing.JComboBox<String> cmbMesHistory;
    public javax.swing.JComboBox<Township> cmbMunicipioDueBills;
    public javax.swing.JComboBox<Township> cmbMunicipioHistory;
    public javax.swing.JComboBox<String> cmbPayMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblDep1;
    private javax.swing.JLabel lblDep2;
    private javax.swing.JLabel lblDep3;
    private javax.swing.JLabel lblDep6;
    private javax.swing.JLabel lblMuni;
    private javax.swing.JLabel lblMuni1;
    private javax.swing.JLabel lblMuni2;
    private javax.swing.JLabel lblMuni3;
    private javax.swing.JLabel lblMuni6;
    private javax.swing.JLabel lblMuni7;
    private javax.swing.JLabel lblTowns;
    private javax.swing.JLabel lblTowns1;
    private javax.swing.JPopupMenu menuDueBills;
    public javax.swing.JMenuItem mniCobrar;
    public javax.swing.JMenuItem mniRecibo;
    private javax.swing.JPanel panForwardPayment;
    private javax.swing.JPanel panTowns;
    private javax.swing.JPanel panUser;
    public javax.swing.JTable tblDueBills;
    public javax.swing.JTable tblPaymentsHistory;
    public javax.swing.JTabbedPane tpnControl;
    public javax.swing.JTextField txtAnioDueBills;
    public javax.swing.JTextField txtAnioHistory;
    public javax.swing.JTextField txtPayAddress;
    public javax.swing.JTextField txtPayAmount;
    public javax.swing.JTextField txtPayCustomer;
    public javax.swing.JTextField txtPayIdService;
    public javax.swing.JTextField txtPayNit;
    public javax.swing.JTextField txtPayPhone;
    public javax.swing.JTextField txtPayYear;
    // End of variables declaration//GEN-END:variables
}