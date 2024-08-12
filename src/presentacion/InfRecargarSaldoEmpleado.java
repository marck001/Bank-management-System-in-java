/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import logica.BLCliente;
import patronBuilder.*;

/**
 *
 * @author User
 */
public class InfRecargarSaldoEmpleado extends javax.swing.JInternalFrame {
    private String codEmpleado;
    /**
     * Creates new form InfRecargarSaldoEmpleado
     */
    public InfRecargarSaldoEmpleado() {
        initComponents();
    }
    
    public InfRecargarSaldoEmpleado(String codEmpleado) {
        initComponents();
        this.codEmpleado=codEmpleado;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoRecargado = new javax.swing.JTextField();
        btnRecargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("     ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(135, 64, 64));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECARGAR SALDO ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 70));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Datos del Cliente");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Codigo");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigo.setToolTipText("Dni");
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 189, 36));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar2.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 139, 39));

        txtCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCuenta.setForeground(new java.awt.Color(204, 204, 204));
        txtCuenta.setText("(Código de Cuenta)");
        txtCuenta.setToolTipText("Codigo de Cuenta");
        txtCuenta.setEnabled(false);
        jPanel3.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 189, 37));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ingrese Monto");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtSaldoRecargado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSaldoRecargado.setToolTipText("Monto");
        txtSaldoRecargado.setEnabled(false);
        txtSaldoRecargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoRecargadoKeyTyped(evt);
            }
        });
        jPanel3.add(txtSaldoRecargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 183, 36));

        btnRecargar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnRecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recargarSaldo.png"))); // NOI18N
        btnRecargar.setText("REGARGAR");
        btnRecargar.setToolTipText("Recargar");
        btnRecargar.setEnabled(false);
        btnRecargar.setFocusCycleRoot(true);
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 222, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String mensaje=BLCliente.obtenerCodCuentaPorCliente(txtCodigo.getText());
        if(mensaje !=null){
            txtCuenta.setText(mensaje);
            txtSaldoRecargado.setEnabled(true);
            btnRecargar.setEnabled(true);
        }else 
            showMessageDialog(null, "No tiene cuenta registrada", "Recargar Saldo",0);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtSaldoRecargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoRecargadoKeyTyped
        char c = evt.getKeyChar();
        if(((c<'0') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE) && (c!= '.' || txtSaldoRecargado.getText().contains(".")))
           evt.consume();
        if (txtCuenta.getText().length() > 7)
            evt.consume();
    }//GEN-LAST:event_txtSaldoRecargadoKeyTyped

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        EmpleadoHace empleadoHace = new EmpleadoHace();;
         String codCuenta=BLCliente.obtenerCodCuentaPorCliente(txtCodigo.getText());
         if(Float.parseFloat(txtSaldoRecargado.getText())>0)
            empleadoHace.recargarSaldo(codCuenta, Float.parseFloat(txtSaldoRecargado.getText()), codEmpleado);
        else
             showMessageDialog(null, "Saldo inválido", "Error",0);
    }//GEN-LAST:event_btnRecargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtSaldoRecargado;
    // End of variables declaration//GEN-END:variables
}