/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import logica.*;
/**
 *
 * @author Usuarrrio
 */
public class LoginCliente extends javax.swing.JFrame {

    /**
     * Creates new form LoginCliente
     */
    int xMouse, yMouse;
    
    public LoginCliente() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passCodigo = new javax.swing.JPasswordField();
        panelBtnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Cliente");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clienteicon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EUREKABANK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lblNombre.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblNombre.setText("Código");
        lblNombre.setToolTipText("");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 72, 22));

        txtDni.setForeground(new java.awt.Color(204, 204, 204));
        txtDni.setText("Ingrese su numero de Dni");
        txtDni.setBorder(null);
        txtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniMousePressed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        lblDni.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblDni.setText("Número de DNI");
        lblDni.setToolTipText("");
        jPanel2.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 22));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 10));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, -1));

        passCodigo.setForeground(new java.awt.Color(204, 204, 204));
        passCodigo.setText("********");
        passCodigo.setBorder(null);
        passCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passCodigoMousePressed(evt);
            }
        });
        passCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passCodigoKeyTyped(evt);
            }
        });
        jPanel2.add(passCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 210, 30));

        panelBtnEntrar.setBackground(new java.awt.Color(68, 171, 181));

        lblEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnEntrarLayout = new javax.swing.GroupLayout(panelBtnEntrar);
        panelBtnEntrar.setLayout(panelBtnEntrarLayout);
        panelBtnEntrarLayout.setHorizontalGroup(
            panelBtnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelBtnEntrarLayout.setVerticalGroup(
            panelBtnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panelBtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        panelBtnVolver.setBackground(new java.awt.Color(68, 171, 181));

        lblVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVolver.setForeground(new java.awt.Color(255, 255, 255));
        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setText("VOLVER");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnVolverLayout = new javax.swing.GroupLayout(panelBtnVolver);
        panelBtnVolver.setLayout(panelBtnVolverLayout);
        panelBtnVolverLayout.setHorizontalGroup(
            panelBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelBtnVolverLayout.setVerticalGroup(
            panelBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panelBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 80, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 300, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMousePressed
        if(txtDni.getText().equals("Ingrese su numero de Dni")) {
            txtDni.setText("");
            txtDni.setForeground(Color.black);
        }
        if(String.valueOf(passCodigo.getPassword()).isEmpty()) {
            passCodigo.setText("********");
            passCodigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDniMousePressed

    private void passCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passCodigoMousePressed
        if(String.valueOf(passCodigo.getPassword()).equals("********")) {
            passCodigo.setText("");
            passCodigo.setForeground(Color.black);
        }
        if(txtDni.getText().isEmpty()) {
            txtDni.setText("Ingrese su numero de Dni");
            txtDni.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passCodigoMousePressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        dni = txtDni.getText();
        codigo = String.valueOf(passCodigo.getPassword());
        respuesta1 = BLCliente.buscarClienteLogin(codigo, dni);
        respuesta2 = BLCliente.obtenerCodCuentaPorCliente(codigo);
        if(respuesta1!=null && respuesta2!= null) {
            new BancaPorInternet(respuesta2);
        } else {
            if(respuesta2==null) {
                showMessageDialog(null, "No tiene cuenta registrada", "Login Cliente",0);
            }
            showMessageDialog(null, "Codigo o clave erronea, intente nuevamente", "Login Cliente",0);
            txtDni.setText("Ingrese su numero de Dni");
            txtDni.setForeground(Color.gray);
            passCodigo.setText("********");
            passCodigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        LoginMenu frm = new LoginMenu();
        frm.setVisible(true);
        frm.pack();
        frm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE)
            evt.consume();
    }//GEN-LAST:event_txtDniKeyTyped

    private void passCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passCodigoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE)
            evt.consume();
    }//GEN-LAST:event_passCodigoKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel panelBtnEntrar;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JPasswordField passCodigo;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
    private String codigo, dni, respuesta1, respuesta2;
}
