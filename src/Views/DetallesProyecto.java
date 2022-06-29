package Views;

import Main.Etapas;
import Models.Etapa;
import Models.Proyecto;
import Models.TipoProyecto;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public final class DetallesProyecto extends javax.swing.JFrame {
    private Proyecto proyectoEdit = new Proyecto();
    private Etapas etapasProyectoEdit = new Etapas();

    Vista v = new Vista();
 
    public DetallesProyecto(Proyecto proyecto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.proyectoEdit.copiar(proyecto);
        this.etapasProyectoEdit = Vista.proyectos.buscarEtapas(this.proyectoEdit.getCodigo());
        this.setInfo();
        this.gastadoEtapas();
        this.mostrarEtapasTabla();
        this.mostrarEtapasComboBox();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectEtapa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtGastado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        selectEstado = new javax.swing.JComboBox<>();
        updateStatus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalles = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEtapas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTotalGastado = new javax.swing.JTextField();
        lblSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setText("Proyecto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Etapa:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dinero gastado:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");

        selectEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No completado", "Completado" }));
        selectEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEstadoActionPerformed(evt);
            }
        });

        updateStatus.setText("Actualizar Estado");
        updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStatusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Detalles del Proyecto");

        tablaDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
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
        tablaDetalles.setRowHeight(25);
        tablaDetalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDetalles);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Etapas del Proyecto");

        tablaEtapas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Etapa", "Costo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEtapas.setRowHeight(25);
        tablaEtapas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaEtapas);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total gastado:");

        txtTotalGastado.setEditable(false);
        txtTotalGastado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selectEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtGastado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(230, 230, 230))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalGastado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGastado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateStatus)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalGastado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
         this.proyectoEdit = null;
         this.setVisible(false);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(Color.RED);
        lblSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(Color.WHITE);
        lblSalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblSalirMouseExited

    private void selectEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectEstadoActionPerformed

    public void setInfo() {
        this.title.setText("Proyecto: " + this.proyectoEdit.getNombre());
        
        DefaultTableModel model = (DefaultTableModel) this.tablaDetalles.getModel();
        model.setRowCount(0);
        
        Object[] data = new Object[4];
        data[0] = this.proyectoEdit.getCodigo();
        data[1] = this.proyectoEdit.getNombre();
        data[2] = this.proyectoEdit.getArea();
        data[3] = Vista.formato.format(this.proyectoEdit.getCosto());
        
        model.addRow(data);
        this.tablaDetalles.setModel(model);
    }
    
    public void mostrarEtapasTabla() {
        DefaultTableModel model = (DefaultTableModel) this.tablaEtapas.getModel();
        model.setRowCount(0);
        
        Etapa[] epts = this.etapasProyectoEdit.getEtapas();
        for (Etapa etapa : epts) {
            Object[] data = new Object[3];
            data[0] = etapa.getNombre();
            data[1] = Vista.formato.format(etapa.getCosto());
            
            if (etapa.isEstado() == false) {
                data[2] = "No completado";
            } else {
                data[2] = "Completado";
            }
            
            model.addRow(data);
        }
        
        this.tablaEtapas.setModel(model);
    }
    
    public void mostrarEtapasComboBox() {
        this.selectEtapa.removeAllItems();
        
        int cantEtapas = this.etapasProyectoEdit.getEtapas().length;
        String[] etapasN = new String[cantEtapas];
        
        for (int i = 0; i < cantEtapas; i++) {
            if (this.etapasProyectoEdit.getEtapas()[i].isEstado() == false) {
                etapasN[i] = (String) this.etapasProyectoEdit.getEtapas()[i].getNombre();
            } else {
                etapasN[i] = "";
            }
        }
        
        this.selectEtapa.setModel(new DefaultComboBoxModel<>(etapasN));
    }
    
    public void gastadoEtapas() {
        String gastado = Vista.formato.format(this.etapasProyectoEdit.totalGastadoEtapas());
        this.txtTotalGastado.setText(gastado);
    }
    
    private void updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStatusActionPerformed
        try {
            float costoE = Float.parseFloat(this.txtGastado.getText().trim());
            int etapa = this.selectEtapa.getSelectedIndex(),
            estado = this.selectEstado.getSelectedIndex();

            if (!"".equals(this.selectEtapa.getSelectedItem().toString())) {
                if (costoE > 0) {
                    Etapa etapaEdit = this.etapasProyectoEdit.getEtapas()[etapa];
                    etapaEdit.addCosto(costoE);

                    if (estado == 1) {
                        etapaEdit.setEstado(true);
                    }

                    this.gastadoEtapas();
                    this.mostrarEtapasTabla();
                    this.mostrarEtapasComboBox();

                    this.txtGastado.setText("");
                    this.selectEstado.setSelectedIndex(0);
                } else {
                    Vista.mensaje("El costo debe ser Mayor a 0!");
                }
            } else {
                 Vista.mensaje("Debe seleccionar una Etapa que no haya sido completada!");
            }
        } catch (NumberFormatException e) {
             Vista.mensaje("Debe llenar los campos correctamente!");
        }
    }//GEN-LAST:event_updateStatusActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        this.proyectoEdit = null;
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JComboBox<String> selectEstado;
    private javax.swing.JComboBox<String> selectEtapa;
    private javax.swing.JTable tablaDetalles;
    private javax.swing.JTable tablaEtapas;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtGastado;
    private javax.swing.JTextField txtTotalGastado;
    private javax.swing.JButton updateStatus;
    // End of variables declaration//GEN-END:variables
}
