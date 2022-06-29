package Views;

import java.awt.Color;
import javax.swing.JPanel;
import Main.Etapas;
import Main.Proyectos;
import Main.TipoProyectos;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Models.Etapa;
import Models.Material;
import Models.Proyecto;
import Models.TipoProyecto;


public class Vista extends javax.swing.JFrame {
    
    public static NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    public static final Proyectos proyectos = new Proyectos();
    public static final TipoProyectos tps = new TipoProyectos();
    private String cod1 = "";
    private String cod2 = "";

    
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        indcotizar.setBackground(new java.awt.Color(231,166,36));
    }
    
    public void vistaEditarProyecto(Proyecto proyecto) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            DetallesProyecto dp = new DetallesProyecto(proyecto);
            dp.setVisible(true);
            dp.setResizable(false);
            dp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlback = new javax.swing.JPanel();
        pnlnameicon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlizqu = new javax.swing.JPanel();
        lblicono = new javax.swing.JLabel();
        lblcotizar = new javax.swing.JLabel();
        indcotizar = new javax.swing.JPanel();
        lblproyectos = new javax.swing.JLabel();
        indproyectos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlcentet = new javax.swing.JPanel();
        pnlCotizar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipoProyecto = new javax.swing.JComboBox<>();
        titleOP1 = new javax.swing.JLabel();
        titleOP2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateriales2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMateriales1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        costoOP1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        selectOption = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        costoOP2 = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        pnlProyectos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        codPTE = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        pnlop = new javax.swing.JPanel();
        lblselect = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlback.setBackground(new java.awt.Color(204, 204, 204));
        pnlback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlnameicon.setBackground(new java.awt.Color(255, 255, 255));
        pnlnameicon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 166, 36));
        jLabel2.setText("DH ");
        jLabel2.setFocusable(false);
        pnlnameicon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 166, 36));
        jLabel3.setText("CONSTRUCTOR");
        jLabel3.setFocusable(false);
        pnlnameicon.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlback.add(pnlnameicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 40));

        pnlizqu.setBackground(new java.awt.Color(255, 255, 255));
        pnlizqu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image2vector (2) (1).png"))); // NOI18N
        pnlizqu.add(lblicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        lblcotizar.setBackground(new java.awt.Color(0, 0, 0));
        lblcotizar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblcotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bosquejo.png"))); // NOI18N
        lblcotizar.setText("COTIZAR");
        lblcotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcotizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcotizarMouseClicked(evt);
            }
        });
        pnlizqu.add(lblcotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        indcotizar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indcotizarLayout = new javax.swing.GroupLayout(indcotizar);
        indcotizar.setLayout(indcotizarLayout);
        indcotizarLayout.setHorizontalGroup(
            indcotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indcotizarLayout.setVerticalGroup(
            indcotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlizqu.add(indcotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 10, 50));

        lblproyectos.setBackground(new java.awt.Color(0, 0, 0));
        lblproyectos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pared-de-ladrillo.png"))); // NOI18N
        lblproyectos.setText("PROYECTOS");
        lblproyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblproyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblproyectosMouseClicked(evt);
            }
        });
        pnlizqu.add(lblproyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        indproyectos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indproyectosLayout = new javax.swing.GroupLayout(indproyectos);
        indproyectos.setLayout(indproyectosLayout);
        indproyectosLayout.setHorizontalGroup(
            indproyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        indproyectosLayout.setVerticalGroup(
            indproyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlizqu.add(indproyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(231, 166, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlizqu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 150, 30));

        pnlback.add(pnlizqu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 520));

        pnlcentet.setBackground(new java.awt.Color(255, 255, 255));
        pnlcentet.setLayout(new java.awt.CardLayout());

        pnlCotizar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Código del Proyecto:");

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigo.setMaximumSize(new java.awt.Dimension(150, 25));
        txtCodigo.setMinimumSize(new java.awt.Dimension(150, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre del Proyecto:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(150, 25));
        txtNombre.setMinimumSize(new java.awt.Dimension(150, 25));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Área (m^2):");

        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtArea.setMaximumSize(new java.awt.Dimension(150, 25));
        txtArea.setMinimumSize(new java.awt.Dimension(150, 25));
        txtArea.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtAreaInputMethodTextChanged(evt);
            }
        });
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de Proyecto:");

        tipoProyecto.setBackground(new java.awt.Color(255, 255, 255));
        tipoProyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vivienda", "Edificio", "Camino" }));
        tipoProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProyectoActionPerformed(evt);
            }
        });

        titleOP1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleOP1.setText("  ");

        titleOP2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleOP2.setText("  ");

        tablaMateriales2.setBackground(new java.awt.Color(255, 255, 255));
        tablaMateriales2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaMateriales2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Precio (m^2)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMateriales2.setRowHeight(25);
        tablaMateriales2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaMateriales2);

        tablaMateriales1.setBackground(new java.awt.Color(255, 255, 255));
        tablaMateriales1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaMateriales1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Precio (m^2)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMateriales1.setRowHeight(25);
        tablaMateriales1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaMateriales1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Costo total del Proyecto:");

        costoOP1.setEditable(false);
        costoOP1.setBackground(new java.awt.Color(255, 255, 255));
        costoOP1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        costoOP1.setMaximumSize(new java.awt.Dimension(150, 25));
        costoOP1.setMinimumSize(new java.awt.Dimension(150, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Opción a negociar:");

        selectOption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Opción #1", "Opción #2" }));
        selectOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOptionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Costo total del Proyecto:");

        costoOP2.setEditable(false);
        costoOP2.setBackground(new java.awt.Color(255, 255, 255));
        costoOP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        costoOP2.setMaximumSize(new java.awt.Dimension(150, 25));
        costoOP2.setMinimumSize(new java.awt.Dimension(150, 25));

        btnComprar.setBackground(new java.awt.Color(231, 166, 36));
        btnComprar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprar.setText("INICIAR PROYECTO");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCotizarLayout = new javax.swing.GroupLayout(pnlCotizar);
        pnlCotizar.setLayout(pnlCotizarLayout);
        pnlCotizarLayout.setHorizontalGroup(
            pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCotizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCotizarLayout.createSequentialGroup()
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCotizarLayout.createSequentialGroup()
                                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectOption, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(costoOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(titleOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlCotizarLayout.createSequentialGroup()
                                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCotizarLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(costoOP2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(titleOP2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 23, Short.MAX_VALUE))))
                    .addGroup(pnlCotizarLayout.createSequentialGroup()
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCotizarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tipoProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlCotizarLayout.setVerticalGroup(
            pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCotizarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlCotizarLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlCotizarLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCotizarLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlCotizarLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(29, 29, 29)))
                    .addComponent(tipoProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlCotizarLayout.createSequentialGroup()
                        .addComponent(titleOP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCotizarLayout.createSequentialGroup()
                        .addComponent(titleOP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(costoOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(costoOP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(pnlCotizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnComprar)
                        .addComponent(selectOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pnlcentet.add(pnlCotizar, "card2");

        pnlProyectos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Editar Proyecto:");

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Proyecto");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tablaProyectos.setBackground(new java.awt.Color(255, 255, 255));
        tablaProyectos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Área", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProyectos.setRowHeight(25);
        tablaProyectos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaProyectos);

        javax.swing.GroupLayout pnlProyectosLayout = new javax.swing.GroupLayout(pnlProyectos);
        pnlProyectos.setLayout(pnlProyectosLayout);
        pnlProyectosLayout.setHorizontalGroup(
            pnlProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProyectosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProyectosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codPTE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117)))
                .addGap(30, 30, 30))
        );
        pnlProyectosLayout.setVerticalGroup(
            pnlProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProyectosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(codPTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pnlcentet.add(pnlProyectos, "card3");

        pnlback.add(pnlcentet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 750, 470));

        pnlop.setBackground(new java.awt.Color(255, 255, 255));
        pnlop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblselect.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblselect.setForeground(new java.awt.Color(231, 166, 36));
        lblselect.setText("COTIZAR");
        pnlop.add(lblselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("X");
        lblSalir.setToolTipText("SALIR");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setFocusable(false);
        lblSalir.setOpaque(true);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        pnlop.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 40));

        pnlback.add(pnlop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 750, 40));

        getContentPane().add(pnlback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void colorselect(JPanel pnl) {
        pnl.setBackground(new java.awt.Color(231, 166, 36));
    }

    public void colorreset(JPanel pnl) {
        pnl.setBackground(new java.awt.Color(255, 255, 255));
    }
    
    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(Color.RED);
        lblSalir.setForeground(Color.WHITE);

    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(Color.WHITE);
        lblSalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblcotizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcotizarMouseClicked
        pnlProyectos.setVisible(false);
        pnlCotizar.setVisible(true);
        colorselect(indcotizar);
        colorreset(indproyectos);
        lblselect.setText("COTIZAR");
    }//GEN-LAST:event_lblcotizarMouseClicked

    private void lblproyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblproyectosMouseClicked
        pnlProyectos.setVisible(true);
        pnlCotizar.setVisible(false);
        colorselect(indproyectos);
        colorreset(indcotizar);
        lblselect.setText("PROYECTOS");
    }//GEN-LAST:event_lblproyectosMouseClicked

     public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtAreaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtAreaInputMethodTextChanged

    }//GEN-LAST:event_txtAreaInputMethodTextChanged

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed

    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyPressed

    }//GEN-LAST:event_txtAreaKeyPressed

    private void tipoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProyectoActionPerformed
        TipoProyecto[] tiposP = this.getTipoProyectos();

        switch (this.tipoProyecto.getSelectedIndex()) {
            case 1 -> {
                this.mostrarMaterialesOP1(tiposP[0], "Ambiental y Moderna");
                this.mostrarMaterialesOP2(tiposP[1], "Básica y Económica");
                this.cotizarProyectos();
            }
            case 2 -> {
                this.mostrarMaterialesOP1(tiposP[0], "Ecológica y Autosustentable");
                this.mostrarMaterialesOP2(tiposP[1], "Básica y Económica");
                this.cotizarProyectos();
            }
            case 3 -> {
                this.mostrarMaterialesOP1(tiposP[0], "4ta Generación");
                this.mostrarMaterialesOP2(tiposP[1], "Básica");
                this.cotizarProyectos();
            }
            default -> {
                this.cod1 = "";
                this.cod2 = "";
                this.clearTables();
            }
        }
    }//GEN-LAST:event_tipoProyectoActionPerformed

    private void selectOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectOptionActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            String cod = this.txtCodigo.getText().trim(),
            name = this.txtNombre.getText().trim();

            float area = Float.parseFloat(this.txtArea.getText().trim());
            int opProyecto = this.tipoProyecto.getSelectedIndex(),
            optionP = this.selectOption.getSelectedIndex();

            Proyecto newProyecto = new Proyecto();
            newProyecto.setCodigo(cod);
            newProyecto.setNombre(name);
            newProyecto.setArea(area);

            if (
                (newProyecto.validarCodigo()) &&
                (newProyecto.validarNombre()) &&
                (newProyecto.validarArea())
            ) {
                if (opProyecto != 0) {
                    TipoProyecto newTP = Vista.tps.getTipoProyecto(opProyecto + "" + (optionP - 1));
                    newTP.setCodP(cod);

                    Etapas newEtapas = new Etapas();
                    newEtapas.setCodP(cod);
                    if ((opProyecto == 1) || (opProyecto == 2)) {
                        Etapa[] etapasVE = new Etapa[8];
                        etapasVE[0] = new Etapa("Diseño", 0, false);
                        etapasVE[1] = new Etapa("Elaboración", 0, false);
                        etapasVE[2] = new Etapa("Tramitación", 0, false);
                        etapasVE[3] = new Etapa("Preparación de Terreno y Cimentación", 0, false);
                        etapasVE[4] = new Etapa("Estructuras de obra gruesa", 0, false);
                        etapasVE[5] = new Etapa("Instalaciones eléctricas, sanitarias y HVAC", 0, false);
                        etapasVE[6] = new Etapa("Acabados", 0, false);
                        etapasVE[7] = new Etapa("Finalizado", 0, false);

                        newEtapas.setEtapas(etapasVE);
                    } else {
                        Etapa[] etapasC = new Etapa[7];
                        etapasC[0] = new Etapa("Planeación", 0, false);
                        etapasC[1] = new Etapa("Selección de ruta", 0, false);
                        etapasC[2] = new Etapa("Diseño", 0, false);
                        etapasC[3] = new Etapa("Obtención de materiales", 0, false);
                        etapasC[4] = new Etapa("Construcción", 0, false);
                        etapasC[5] = new Etapa("Control", 0, false);
                        etapasC[6] = new Etapa("Finalizado", 0, false);

                        newEtapas.setEtapas(etapasC);
                    }

                    Vista.proyectos.agregarEtapas(newEtapas);

                    if ( Vista.proyectos.buscarProyecto(cod) == null) {
                        newProyecto.setCosto(newTP.costoProyecto(area));
                        Vista.proyectos.agregarProyecto(newProyecto);
                        Vista.proyectos.agregarTP(newTP);
                        this.mostrarProyectos();
                        this.clearTables();
                        this.limpiarCampos();
                    } else {
                        Vista.mensaje("Ya existe un proyecto con el código: " + cod);
                    }
                } else {
                    Vista.mensaje("Debe seleccionar un tipo de Proyecto");
                }
            } else {
                String mensajeError = "Posibles errores: \n";
                mensajeError += "- Código: 4 dígitos. \n";
                mensajeError += "- Nombre: Texto no vacío ni espacios en blanco. \n";
                mensajeError += "- Área: Número positivo.";

                Vista.mensaje(mensajeError);
            }
        } catch (NumberFormatException e) {
            Vista.mensaje("Llene los Campos correctamente!");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            String cod = this.codPTE.getText().trim();
            Proyecto pEdit = Vista.proyectos.buscarProyecto(cod);

            if (pEdit != null) {
                this.vistaEditarProyecto(pEdit);
            } else {
                Vista.mensaje("No se ha encontrado el proyecto!");
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_btnEditarActionPerformed

     public void clearTables() {
        DefaultTableModel model1 = (DefaultTableModel) this.tablaMateriales1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) this.tablaMateriales2.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        
        this.tablaMateriales1.setModel(model1);
        this.tablaMateriales2.setModel(model2);
    }
    
    /* Limpiar Campos de Texto */
    public void limpiarCampos() {
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtArea.setText("");
        this.costoOP1.setText("");
        this.costoOP2.setText("");
        this.tipoProyecto.setSelectedIndex(0);
        this.selectOption.setSelectedIndex(0);
    }
    
    /* Mostrar Materiales en Tabla */
    public void mostrarMaterialesOP1(TipoProyecto tp, String title) {
        DefaultTableModel model = (DefaultTableModel) this.tablaMateriales1.getModel();
        model.setRowCount(0);
        
        for (Material material : tp.getMateriales()) {
            Object[] data = new Object[2];
            data[0] = material.getNombre();
            data[1] = Vista.formato.format(material.getPrecio());
            
            model.addRow(data);
        }
        
        this.tablaMateriales1.setModel(model);
        this.titleOP1.setText(title);
    }
    
    public void mostrarMaterialesOP2(TipoProyecto tp, String title) {
        DefaultTableModel model = (DefaultTableModel) this.tablaMateriales2.getModel();
        model.setRowCount(0);
        
        for (Material material : tp.getMateriales()) {
            Object[] data = new Object[2];
            data[0] = material.getNombre();
            data[1] = Vista.formato.format(material.getPrecio());
            
            model.addRow(data);
        }
        
        this.tablaMateriales2.setModel(model);
        this.titleOP2.setText(title);
    }
    
    /* Obtener Índices de tipoProyecto (ComboBox) */
    public TipoProyecto[] getTipoProyectos() {
        TipoProyecto[] tps2 = new TipoProyecto[2];
        this.cod1 = this.tipoProyecto.getSelectedIndex() + "" + 0;
        this.cod2 = this.tipoProyecto.getSelectedIndex() + "" + 1;
        TipoProyecto tp1 = Vista.tps.getTipoProyecto(this.cod1);
        TipoProyecto tp2 = Vista.tps.getTipoProyecto(this.cod2);
        
        tps2[0] = tp1;
        tps2[1] = tp2;
        
        return tps2;
    }
    
    /* Mostrar Proyectos Tabla */
    public void mostrarProyectos() {
        DefaultTableModel model = (DefaultTableModel) this.tablaProyectos.getModel();
        model.setRowCount(0);
        
        for (Proyecto proyecto : Vista.proyectos.getListaProyectos()) {
            Object[] data = new Object[4];
            data[0] = proyecto.getCodigo();
            data[1] = proyecto.getNombre();
            data[2] = proyecto.getArea();
            data[3] = Vista.formato.format(proyecto.getCosto());
            
            model.addRow(data);
        }
        
        this.tablaProyectos.setModel(model);
    }
    
    /* Obtener Cotizaciones de Proyectos */
    public void cotizarProyectos() {
        try {
            float area = Float.parseFloat(this.txtArea.getText());
            TipoProyecto[] tiposP = this.getTipoProyectos();
            
            long costo1 = (long) (tiposP[0].costoMateriales() * area);
            long costo2 = (long) (tiposP[1].costoMateriales() * area);
            this.costoOP1.setText(String.valueOf(Vista.formato.format(costo1)));
            this.costoOP2.setText(String.valueOf(Vista.formato.format(costo2)));
        } catch (NumberFormatException e) {
        }
    }
      
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField codPTE;
    private javax.swing.JTextField costoOP1;
    private javax.swing.JTextField costoOP2;
    private javax.swing.JPanel indcotizar;
    private javax.swing.JPanel indproyectos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblcotizar;
    private javax.swing.JLabel lblicono;
    private javax.swing.JLabel lblproyectos;
    private javax.swing.JLabel lblselect;
    private javax.swing.JPanel pnlCotizar;
    private javax.swing.JPanel pnlProyectos;
    private javax.swing.JPanel pnlback;
    private javax.swing.JPanel pnlcentet;
    private javax.swing.JPanel pnlizqu;
    private javax.swing.JPanel pnlnameicon;
    private javax.swing.JPanel pnlop;
    private javax.swing.JComboBox<String> selectOption;
    private javax.swing.JTable tablaMateriales1;
    private javax.swing.JTable tablaMateriales2;
    private javax.swing.JTable tablaProyectos;
    private javax.swing.JComboBox<String> tipoProyecto;
    private javax.swing.JLabel titleOP1;
    private javax.swing.JLabel titleOP2;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
