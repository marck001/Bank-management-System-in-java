/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import logica.*;
/**
 *
 * @author Gaby Zanabria
 */
public class IFrmMonedas extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmMonedas
     */
    public IFrmMonedas() {
        initComponents();
    }
    
    private void activar(boolean estado) {
        txtCodigo.setEnabled(estado);
        cbxDescripcion.setEnabled(estado);
        txtMonto.setEnabled(estado);
        txtImporte.setEnabled(estado);
        txtCosto.setEnabled(estado);
        txtInteres.setEnabled(estado);
        btnRegistrar.setEnabled(estado);
        btnActualizar1.setEnabled(estado);
        btnActualizar2.setEnabled(estado);
        btnActualizar3.setEnabled(estado);
        btnActualizar4.setEnabled(estado);
        btnNuevo.setEnabled(!estado);               
    }
    
    private void limpiar() {
        txtCodigo.setText(null);
        txtMonto.setText(null);
        txtImporte.setText(null);
        txtCosto.setText(null);
        txtInteres.setText(null);
        cbxDescripcion.setSelectedIndex(0);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelDes = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnActualizar1 = new javax.swing.JButton();
        cbxDescripcion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnActualizar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtCosto = new javax.swing.JTextField();
        btnActualizar3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        btnActualizar4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        labelDes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDes.setForeground(new java.awt.Color(0, 0, 0));
        labelDes.setText("Descripcion:");
        jPanel2.add(labelDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 171, -1));

        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.gif"))); // NOI18N
        btnActualizar1.setMnemonic('A');
        btnActualizar1.setText("Actualizar");
        btnActualizar1.setEnabled(false);
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 32));

        cbxDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Moneda>", "PESOS ARGENTINOS", "PESOS CHILENOS", "EUROS" }));
        cbxDescripcion.setEnabled(false);
        jPanel2.add(cbxDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 170, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Importe:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        txtImporte.setEnabled(false);
        txtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteKeyTyped(evt);
            }
        });
        jPanel4.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 168, -1));

        txtMonto.setEnabled(false);
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        jPanel4.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 168, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Monto Maximo:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        btnActualizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.gif"))); // NOI18N
        btnActualizar2.setMnemonic('A');
        btnActualizar2.setText("Actualizar");
        btnActualizar2.setEnabled(false);
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 32));

        jPanel3.setBackground(new java.awt.Color(221, 221, 221));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCosto.setEnabled(false);
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        jPanel3.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 167, 32));

        btnActualizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.gif"))); // NOI18N
        btnActualizar3.setMnemonic('A');
        btnActualizar3.setText("Actualizar");
        btnActualizar3.setEnabled(false);
        btnActualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 32));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Costo:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(221, 221, 221));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo.gif"))); // NOI18N
        btnNuevo.setMnemonic('N');
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 32));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.gif"))); // NOI18N
        btnRegistrar.setMnemonic('R');
        btnRegistrar.setText("Guardar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, 32));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.gif"))); // NOI18N
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel5.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 110, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Interes:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        txtInteres.setEnabled(false);
        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });
        jPanel5.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, -1));

        btnActualizar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.gif"))); // NOI18N
        btnActualizar4.setMnemonic('A');
        btnActualizar4.setText("Actualizar");
        btnActualizar4.setEnabled(false);
        btnActualizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar4ActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 32));

        jPanel6.setBackground(new java.awt.Color(64, 4, 4));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Moneda");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(64, 4, 4));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Costo de Movimiento");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(64, 4, 4));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo de Mantenimiento");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(263, 263, 263))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(64, 4, 4));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registrar Interes Mensual");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(263, 263, 263))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       limpiar();
       activar(true);
       txtCodigo.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c=evt.getKeyChar();
        String text = txtCodigo.getText();
        if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)|| text.length() >= 2)
            evt.consume();
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
       char c=evt.getKeyChar();
        if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtMonto.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteKeyTyped
        char c=evt.getKeyChar();
        if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtImporte.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtImporteKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char c=evt.getKeyChar();
        if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtCosto.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
        char c=evt.getKeyChar();
        if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtInteres.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtInteresKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int respuesta;
        boolean exito = true; // Bandera para verificar si todas las operaciones son exitosas.

        codigo = txtCodigo.getText();
        descripcion = String.valueOf(cbxDescripcion.getSelectedItem());
        if ("<Moneda>".equals(descripcion)) {
            mostrarMensajeError("Debe seleccionar una descripción válida que no sea <Moneda>.");
            cbxDescripcion.requestFocus();
            return;
        }
        try {
            monto = Float.parseFloat(txtMonto.getText().trim());
        } catch (NumberFormatException e) {
            mostrarMensajeError("El campo Monto no puede estar vacío o contener valores no válidos.");
            txtMonto.requestFocus();
            return;
        }

        try {
            importe = Float.parseFloat(txtImporte.getText().trim());
        } catch (NumberFormatException e) {
            mostrarMensajeError("El campo Importe no puede estar vacío o contener valores no válidos.");
            txtImporte.requestFocus();
            return;
        }

        try {
            costo = Float.parseFloat(txtCosto.getText().trim());
        } catch (NumberFormatException e) {
            mostrarMensajeError("El campo Costo no puede estar vacío o contener valores no válidos.");
            txtCosto.requestFocus();
            return;
        }

        try {
            interes = Float.parseFloat(txtInteres.getText().trim());
        } catch (NumberFormatException e) {
            mostrarMensajeError("El campo Interés no puede estar vacío o contener valores no válidos.");
            txtInteres.requestFocus();
            return;
        }

        respuesta = BLMoneda.insertarMoneda(codigo, descripcion);
        if (respuesta != 0) { // Si la respuesta no es exitosa, detén el proceso.
            exito = false;
            manejarRespuesta(respuesta);
        }

        if (exito) {
            respuesta = BLCargoMantenimiento.insertarCargoMantenimiento(codigo, monto, importe);
            if (respuesta != 0) {
                exito = false;
                manejarRespuesta(respuesta);
            }
        }

        if (exito) {
            respuesta = BLCostoMovimiento.insertarCostoMovimiento(codigo, costo);
            if (respuesta != 0) {
                exito = false;
                manejarRespuesta(respuesta);
            }
        }

        if (exito) {
            respuesta = BLInteresMensual.insertarInteres(codigo, interes);
            manejarRespuesta(respuesta);
            if (respuesta == 0 || respuesta == 3) {
                limpiar();
                activar(false);
                btnNuevo.requestFocus();
            } else if (respuesta == 2) {
                txtCodigo.setText(null);
                txtCodigo.requestFocus();
            }
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        IFrmActualizarMoneda internalFrame = new IFrmActualizarMoneda();
        internalFrame.setVisible(true);
//        IFrmActualizarMoneda ifrmActualizarMoneda = new IFrmActualizarMoneda();
//        MainFrm.centrarInternalFrameExterno(ifrmActualizarMoneda);
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        IFrmActualizarMantenimiento internalFrame = new IFrmActualizarMantenimiento();
        internalFrame.setVisible(true);
//        IFrmActualizarMantenimiento ifrmActualizarMantenimiento = new IFrmActualizarMantenimiento();
//        FrmPrincipal.centrarInternalFrameExterno(ifrmActualizarMantenimiento );
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void btnActualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar3ActionPerformed
        IFrmActualizarCosto internalFrame = new  IFrmActualizarCosto();
        internalFrame.setVisible(true);
//       IFrmActualizarCosto ifrmActualizarCosto = new IFrmActualizarCosto();
//        FrmPrincipal.centrarInternalFrameExterno(ifrmActualizarCosto);
    }//GEN-LAST:event_btnActualizar3ActionPerformed

    private void btnActualizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar4ActionPerformed
        IFrmActualizarInteres internalFrame = new  IFrmActualizarInteres();
        internalFrame.setVisible(true);        
//        IFrmActualizarInteres ifrmActualizarInteres = new IFrmActualizarInteres();
//        FrmPrincipal.centrarInternalFrameExterno(ifrmActualizarInteres);
    }//GEN-LAST:event_btnActualizar4ActionPerformed
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }


    private void manejarRespuesta(int respuesta) {
        if (respuesta == 3) {
            limpiar();
            activar(false);
            btnNuevo.requestFocus();
        } else if (respuesta == 2) {
            txtCodigo.setText(null);
            txtCodigo.requestFocus();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnActualizar4;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelDes;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
    private String codigo, descripcion;
    private float monto=0.0f, importe=0.0f,costo=0.0f,interes=0.0f;
}
