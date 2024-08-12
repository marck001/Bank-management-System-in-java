/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import logica.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author CRISTHIAN
 */
public class RegistrarMovimiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarMovimiento
     */
    public RegistrarMovimiento() {
        initComponents();
          this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    
    } 

     public void activar ( boolean estado){
        //Movimiento 
        txtcodCuenta.setEnabled(estado);
        txtcodEmpleado.setEnabled(estado);
        txtImporMov.setEnabled(estado);
        txtcuenReferencia.setEnabled(estado);
        txtTipoMovimiento.setEnabled(estado);
        cbxDiaN.setEnabled(true);
        cbxMesN.setEnabled(true);
        cbxAñoN.setEnabled(true);
        cbxnumMov.setEnabled(true);
        btnNuevo.setEnabled(!estado);
        btnRegistrar.setEnabled(estado);
        
        //Tipo Movimiento 
        txtTipoCodigo.setEnabled(estado);
        cbxDescripcion.setEnabled(true);
        txtAccion.setEnabled(estado);
        txtEstado.setEnabled(estado);
        btnNuevo2.setEnabled(estado);
        btnRegistrar2.setEnabled(estado);  
        
    }
      private void limpiar() {
        txtcodCuenta.setText(null);
        txtcodEmpleado.setText(null);
        cbxDiaN.setSelectedIndex(0);
        cbxMesN.setSelectedIndex(0);
        cbxAñoN.setSelectedIndex(0);
        cbxnumMov.setSelectedIndex(0);
        txtTipoCodigo.setText(null);
        cbxDescripcion.setSelectedIndex(0);
        txtAccion.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcodCuenta = new javax.swing.JLabel();
        lblnumMov = new javax.swing.JLabel();
        lblFechaMovi = new javax.swing.JLabel();
        lblCodEmpleado = new javax.swing.JLabel();
        lblImporMov = new javax.swing.JLabel();
        lblcuenReferencia = new javax.swing.JLabel();
        txtcodCuenta = new javax.swing.JTextField();
        txtcuenReferencia = new javax.swing.JTextField();
        txtcodEmpleado = new javax.swing.JTextField();
        txtImporMov = new javax.swing.JTextField();
        cbxDiaN = new javax.swing.JComboBox<>();
        cbxMesN = new javax.swing.JComboBox<>();
        cbxAñoN = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        cbxnumMov = new javax.swing.JComboBox<>();
        lblTipoMovimiento = new javax.swing.JLabel();
        txtTipoMovimiento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblAccion = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtTipoCodigo = new javax.swing.JTextField();
        txtAccion = new javax.swing.JTextField();
        btnNuevo2 = new javax.swing.JButton();
        btnRegistrar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        cbxDescripcion = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(110, 30, 58));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(622, 293));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel1.setText("Movimiento");

        lblcodCuenta.setText("Codigo Cuenta:");

        lblnumMov.setText("Numero Movimientos:");

        lblFechaMovi.setText("Fecha Movimientos:");

        lblCodEmpleado.setText("Codigo Empleado:");

        lblImporMov.setText("Importe Movimientos:");

        lblcuenReferencia.setText("Cuenta Referencia:");

        txtcodCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodCuentaActionPerformed(evt);
            }
        });
        txtcodCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodCuentaKeyTyped(evt);
            }
        });

        txtcuenReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuenReferenciaKeyTyped(evt);
            }
        });

        txtcodEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodEmpleadoKeyTyped(evt);
            }
        });

        cbxDiaN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        cbxMesN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbxAñoN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024" }));

        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo.gif"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.gif"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cbxnumMov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        lblTipoMovimiento.setText("Tipo Movimiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcodCuenta)
                            .addComponent(lblnumMov)
                            .addComponent(lblCodEmpleado)
                            .addComponent(lblFechaMovi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcodCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                        .addComponent(txtcodEmpleado))
                                    .addComponent(cbxnumMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImporMov)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblcuenReferencia))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxDiaN, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(cbxMesN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxAñoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(55, 55, 55)
                        .addComponent(btnRegistrar)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtImporMov, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(txtcuenReferencia)
                    .addComponent(txtTipoMovimiento))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcodCuenta)
                            .addComponent(txtcodCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImporMov)
                            .addComponent(txtImporMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnumMov)
                            .addComponent(cbxnumMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcuenReferencia)
                            .addComponent(txtcuenReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodEmpleado)
                            .addComponent(txtcodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoMovimiento)
                            .addComponent(txtTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaMovi)
                            .addComponent(cbxDiaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMesN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAñoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnRegistrar))
                        .addGap(14, 14, 14))))
        );

        jPanel1.setBackground(new java.awt.Color(110, 30, 58));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(622, 293));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel6.setText("Tipo Movimiento");

        lblDescripcion.setText("Tipo Codigo:");

        lblAccion.setText("Descripcion:");

        lblEstado.setText("Accion:");

        txtAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccionActionPerformed(evt);
            }
        });

        btnNuevo2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnNuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo.gif"))); // NOI18N
        btnNuevo2.setText("Nuevo");
        btnNuevo2.setToolTipText("Nuevo");
        btnNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo2ActionPerformed(evt);
            }
        });

        btnRegistrar2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRegistrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.gif"))); // NOI18N
        btnRegistrar2.setText("Registrar");
        btnRegistrar2.setToolTipText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado:");

        cbxDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEstado)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(lblAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addComponent(txtAccion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cbxDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnNuevo2)
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrar2)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtTipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblAccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cbxDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo2)
                    .addComponent(btnRegistrar2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
       activar(true);
       txtcodCuenta.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //movimiento
        int respuesta;
        cuenCodigo = txtcodCuenta.getText();
        empCodigo = txtcodEmpleado.getText();
        referencia = txtcuenReferencia.getText();
        tipoMovimiento = txtTipoMovimiento.getText();
        importe = Float.parseFloat(txtImporMov.getText());
        diaN = cbxDiaN.getSelectedIndex();
        mesN = cbxMesN.getSelectedIndex();
        añoN = Integer.parseInt(String.valueOf(cbxAñoN.getSelectedItem()));
        numero = Integer.parseInt(String.valueOf(cbxnumMov.getSelectedItem()));
        respuesta = BLMovimiento.insertarMovimiento(numero, fechaMov, importe, referencia, cuenCodigo, empCodigo, tipoMovimiento);
        if (respuesta == 0 || respuesta == 3) {
            limpiar();
            activar(false);
            btnNuevo.requestFocus();
        } else {
            if (respuesta == 2) {
                txtcodCuenta.setText(null);
                txtcodCuenta.requestFocus();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo2ActionPerformed
        limpiar();
       activar(true);
       txtcodCuenta.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo2ActionPerformed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        int respuesta;
        tipoCodigo = txtTipoCodigo.getText();
        tipoDescripcion = String.valueOf(cbxDescripcion.getSelectedItem());
        tipoAccion = txtAccion.getText();
        tipoEstado = txtEstado.getText();
        respuesta = BLTipoMovimiento.insertarTipoMovimiento(tipoCodigo, tipoDescripcion, tipoAccion, tipoEstado);
        if (respuesta == 0 || respuesta == 3) {
            limpiar();
            activar(false);
            btnNuevo.requestFocus();
        } else {
            if (respuesta == 2) {
                txtTipoCodigo.setText(null);
                txtTipoCodigo.requestFocus();
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void txtcodCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodCuentaActionPerformed

    private void txtcodCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodCuentaKeyTyped
           char c = evt.getKeyChar();
        if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE) ){
            evt.consume();
        }
        
        if (txtcodCuenta.getText().length() > 4)
            evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_txtcodCuentaKeyTyped

    private void txtcodEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodEmpleadoKeyTyped
         char c = evt.getKeyChar();
        if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE) ){
            evt.consume();
        }
        
        if (txtcodEmpleado.getText().length() > 4)
            evt.consume(); // TODO add your handling code here:
    }//GEN-LAST:event_txtcodEmpleadoKeyTyped

    private void txtcuenReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuenReferenciaKeyTyped
        char c = evt.getKeyChar();
        if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE) ){
            evt.consume();
        }
        
        if (txtcuenReferencia.getText().length() > 4)
            evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_txtcuenReferenciaKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JComboBox<String> cbxAñoN;
    private javax.swing.JComboBox<String> cbxDescripcion;
    private javax.swing.JComboBox<String> cbxDiaN;
    private javax.swing.JComboBox<String> cbxMesN;
    private javax.swing.JComboBox<String> cbxnumMov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblCodEmpleado;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaMovi;
    private javax.swing.JLabel lblImporMov;
    private javax.swing.JLabel lblTipoMovimiento;
    private javax.swing.JLabel lblcodCuenta;
    private javax.swing.JLabel lblcuenReferencia;
    private javax.swing.JLabel lblnumMov;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtImporMov;
    private javax.swing.JTextField txtTipoCodigo;
    private javax.swing.JTextField txtTipoMovimiento;
    private javax.swing.JTextField txtcodCuenta;
    private javax.swing.JTextField txtcodEmpleado;
    private javax.swing.JTextField txtcuenReferencia;
    // End of variables declaration//GEN-END:variables
    private String cuenCodigo,empCodigo,referencia,tipoMovimiento;
    private int numero;
    private GregorianCalendar fechaMov;
    private int diaN,mesN,añoN;
    private float importe;
    private String tipoCodigo,tipoDescripcion,tipoAccion,tipoEstado;
   
}
