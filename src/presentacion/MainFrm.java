/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.JDesktopPane;

/**
 *
 * @author marck
 */
public class MainFrm extends javax.swing.JFrame {

    private static Menu main = new Menu();
    private static IFrmPresentacion main2 = new IFrmPresentacion();
    private JInternalFrame currentInternalFrame = null;
    private String codEmpleado;
    /**
     * Creates new form MainFrmTest
     */
    Color defaultColor, clickedColor;

    public MainFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
             "Octubre", "Noviembre", "Diciembre"};
        //fecha7.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
        fecha1.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
        centrarInternalFrame1(main);
        //centrarInternalFrame2(main2);
        defaultColor = new Color(64, 4, 4);
        clickedColor = new Color(104, 7, 7);

        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);

        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
       
    }
    
    public MainFrm(String frame) {
        initComponents();
        this.setLocationRelativeTo(null);
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
             "Octubre", "Noviembre", "Diciembre"};
        //fecha7.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
        fecha1.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
        main2.setName(frame);
        centrarInternalFrame2(main2);
        //centrarInternalFrame2(main2);
        defaultColor = new Color(64, 4, 4);
        clickedColor = new Color(104, 7, 7);

        System.out.print(frame);
        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);

        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
        /*
        mnuTab3.setBackground(defaultColor);
        thirdPanelTab1.setBackground(defaultColor);
        thirdPanelTab2.setBackground(defaultColor);
        thirdPanelTab3.setBackground(defaultColor);
        thirdPanelTab4.setBackground(defaultColor);
        thirdPanelTab5.setBackground(defaultColor);
        thirdPanelTab6.setBackground(defaultColor);
         */
        //tabbedPanel1.setEnabledAt(1, false);
        //   tabbedPanel1.setEnabledAt(2, false);
    }

    public void setCodigoEmpleado(String codEmple) {
        this.codEmpleado = codEmple;
    }

    public void setPanel(boolean isAdmin, int index) {
        if (!isAdmin) {
            tabbedPanel1.setEnabledAt(0, false);
            tabbedPanel1.setSelectedIndex(index);
        }
    }

    public void setUser(int number, String name, boolean isAdmin) {

        if (number == 0) {
            txtUserAdmin.setText("Administrador");
            txtUserEmpleado.setText("Administrador");
           

        } else if (number == 1) {
            txtUserEmpleado.setText(name);
            setPanel(isAdmin, 1);
        } 

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPanel1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        FirstPanelMenu = new javax.swing.JPanel();
        mnuTab1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        firstPanelTab1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        firstPanelTab2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        firstPanelTab3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        firstPanelTab4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        firstPanelTab11 = new javax.swing.JPanel();
        firstPanelTab5 = new javax.swing.JLabel();
        firstPanelTab12 = new javax.swing.JPanel();
        firstPanelTab6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/presentacion/fondo.jpg"));
        Image image = icon.getImage();
        dspFondo =  new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        Header1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        txtUserAdmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mnuTab2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        secondPanelTab1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        secondPanelTab2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        secondPanelTab3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        secondPanelTab4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        secondPanelTab5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        secondPanelTab6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        secondPanelTab7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        secondPanelTab8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        dspFondo1 =  new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        Header = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        txtUserEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPanel1.setBackground(new java.awt.Color(64, 4, 4));
        tabbedPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabbedPanel1.setForeground(java.awt.SystemColor.controlDkShadow);
        tabbedPanel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(64, 4, 4));

        FirstPanelMenu.setBackground(new java.awt.Color(68, 4, 4));
        FirstPanelMenu.setPreferredSize(new java.awt.Dimension(254, 637));

        mnuTab1.setBackground(new java.awt.Color(102, 0, 0));
        mnuTab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuTab1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuTab1MousePressed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sistema.gif"))); // NOI18N
        jLabel10.setText(" Datos Sistema");

        javax.swing.GroupLayout mnuTab1Layout = new javax.swing.GroupLayout(mnuTab1);
        mnuTab1.setLayout(mnuTab1Layout);
        mnuTab1Layout.setHorizontalGroup(
            mnuTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnuTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnuTab1Layout.setVerticalGroup(
            mnuTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnuTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        firstPanelTab1.setBackground(new java.awt.Color(102, 0, 0));
        firstPanelTab1.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstPanelTab1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelTab1MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.gif"))); // NOI18N
        jLabel11.setText("Registrar Sucursal");

        javax.swing.GroupLayout firstPanelTab1Layout = new javax.swing.GroupLayout(firstPanelTab1);
        firstPanelTab1.setLayout(firstPanelTab1Layout);
        firstPanelTab1Layout.setHorizontalGroup(
            firstPanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelTab1Layout.setVerticalGroup(
            firstPanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        firstPanelTab2.setBackground(new java.awt.Color(102, 0, 0));
        firstPanelTab2.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstPanelTab2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelTab2MousePressed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Acerca.gif"))); // NOI18N
        jLabel12.setText(" Tipo Movimiento");

        javax.swing.GroupLayout firstPanelTab2Layout = new javax.swing.GroupLayout(firstPanelTab2);
        firstPanelTab2.setLayout(firstPanelTab2Layout);
        firstPanelTab2Layout.setHorizontalGroup(
            firstPanelTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelTab2Layout.setVerticalGroup(
            firstPanelTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        firstPanelTab3.setBackground(new java.awt.Color(102, 0, 0));
        firstPanelTab3.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstPanelTab3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelTab3MousePressed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleado.gif"))); // NOI18N
        jLabel13.setText(" Registrar Empleados");

        javax.swing.GroupLayout firstPanelTab3Layout = new javax.swing.GroupLayout(firstPanelTab3);
        firstPanelTab3.setLayout(firstPanelTab3Layout);
        firstPanelTab3Layout.setHorizontalGroup(
            firstPanelTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        firstPanelTab3Layout.setVerticalGroup(
            firstPanelTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        firstPanelTab4.setBackground(new java.awt.Color(102, 0, 0));
        firstPanelTab4.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstPanelTab4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelTab4MousePressed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Abrir.gif"))); // NOI18N
        jLabel14.setText("Registrar Cuenta");

        javax.swing.GroupLayout firstPanelTab4Layout = new javax.swing.GroupLayout(firstPanelTab4);
        firstPanelTab4.setLayout(firstPanelTab4Layout);
        firstPanelTab4Layout.setHorizontalGroup(
            firstPanelTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelTab4Layout.setVerticalGroup(
            firstPanelTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        firstPanelTab11.setBackground(new java.awt.Color(102, 0, 0));
        firstPanelTab11.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstPanelTab11MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelTab11MousePressed(evt);
            }
        });

        firstPanelTab5.setBackground(new java.awt.Color(255, 255, 255));
        firstPanelTab5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstPanelTab5.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monedas.png"))); // NOI18N
        firstPanelTab5.setText(" Registrar Monedas");

        javax.swing.GroupLayout firstPanelTab11Layout = new javax.swing.GroupLayout(firstPanelTab11);
        firstPanelTab11.setLayout(firstPanelTab11Layout);
        firstPanelTab11Layout.setHorizontalGroup(
            firstPanelTab11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelTab11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPanelTab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        firstPanelTab11Layout.setVerticalGroup(
            firstPanelTab11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanelTab5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        firstPanelTab12.setBackground(new java.awt.Color(102, 0, 0));
        firstPanelTab12.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstPanelTab12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelTab12MousePressed(evt);
            }
        });

        firstPanelTab6.setBackground(new java.awt.Color(255, 255, 255));
        firstPanelTab6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstPanelTab6.setForeground(new java.awt.Color(255, 255, 255));
        firstPanelTab6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Circulo.gif"))); // NOI18N
        firstPanelTab6.setText("Actualizar Parametro");

        javax.swing.GroupLayout firstPanelTab12Layout = new javax.swing.GroupLayout(firstPanelTab12);
        firstPanelTab12.setLayout(firstPanelTab12Layout);
        firstPanelTab12Layout.setHorizontalGroup(
            firstPanelTab12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelTab12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPanelTab6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelTab12Layout.setVerticalGroup(
            firstPanelTab12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanelTab6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/al.jpg"))); // NOI18N

        javax.swing.GroupLayout FirstPanelMenuLayout = new javax.swing.GroupLayout(FirstPanelMenu);
        FirstPanelMenu.setLayout(FirstPanelMenuLayout);
        FirstPanelMenuLayout.setHorizontalGroup(
            FirstPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnuTab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstPanelTab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstPanelTab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstPanelTab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstPanelTab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstPanelTab11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(firstPanelTab12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FirstPanelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        FirstPanelMenuLayout.setVerticalGroup(
            FirstPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnuTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPanelTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPanelTab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPanelTab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPanelTab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPanelTab11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPanelTab12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Header1.setBackground(new java.awt.Color(68, 4, 4));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Eureka Bank Services");

        fecha1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha1.setForeground(new java.awt.Color(255, 255, 255));
        fecha1.setText("Hoy es Sábado 28 de Abril de 2018");

        txtUserAdmin.setBackground(new java.awt.Color(255, 255, 255));
        txtUserAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtUserAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.gif"))); // NOI18N
        txtUserAdmin.setText("User");

        javax.swing.GroupLayout Header1Layout = new javax.swing.GroupLayout(Header1);
        Header1.setLayout(Header1Layout);
        Header1Layout.setHorizontalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap())
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(fecha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(txtUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        Header1Layout.setVerticalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(FirstPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dspFondo)
                    .addComponent(Header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dspFondo))
            .addComponent(FirstPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1751, Short.MAX_VALUE)
        );

        tabbedPanel1.addTab("Admin", jPanel1);

        jPanel2.setBackground(new java.awt.Color(64, 4, 4));

        jPanel4.setBackground(new java.awt.Color(68, 4, 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(254, 637));

        mnuTab2.setBackground(new java.awt.Color(102, 0, 0));
        mnuTab2.setForeground(new java.awt.Color(255, 51, 51));
        mnuTab2.setPreferredSize(new java.awt.Dimension(180, 49));
        mnuTab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuTab2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuTab2MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Aula.gif"))); // NOI18N
        jLabel1.setText("Menu");

        javax.swing.GroupLayout mnuTab2Layout = new javax.swing.GroupLayout(mnuTab2);
        mnuTab2.setLayout(mnuTab2Layout);
        mnuTab2Layout.setHorizontalGroup(
            mnuTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mnuTab2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        mnuTab2Layout.setVerticalGroup(
            mnuTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnuTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        secondPanelTab1.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab1.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab1MousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lista.gif"))); // NOI18N
        jLabel2.setText("Cuentas Disponibles");

        javax.swing.GroupLayout secondPanelTab1Layout = new javax.swing.GroupLayout(secondPanelTab1);
        secondPanelTab1.setLayout(secondPanelTab1Layout);
        secondPanelTab1Layout.setHorizontalGroup(
            secondPanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        secondPanelTab1Layout.setVerticalGroup(
            secondPanelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        secondPanelTab2.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab2.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Acerca.gif"))); // NOI18N
        jLabel3.setText("Registrar Cliente");

        javax.swing.GroupLayout secondPanelTab2Layout = new javax.swing.GroupLayout(secondPanelTab2);
        secondPanelTab2.setLayout(secondPanelTab2Layout);
        secondPanelTab2Layout.setHorizontalGroup(
            secondPanelTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        secondPanelTab2Layout.setVerticalGroup(
            secondPanelTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        secondPanelTab3.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab3.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab3MousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleado.gif"))); // NOI18N
        jLabel4.setText("Información personal");

        javax.swing.GroupLayout secondPanelTab3Layout = new javax.swing.GroupLayout(secondPanelTab3);
        secondPanelTab3.setLayout(secondPanelTab3Layout);
        secondPanelTab3Layout.setHorizontalGroup(
            secondPanelTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelTab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        secondPanelTab3Layout.setVerticalGroup(
            secondPanelTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        secondPanelTab4.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab4.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab4MousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Docente.gif"))); // NOI18N
        jLabel5.setText("Clientes");

        javax.swing.GroupLayout secondPanelTab4Layout = new javax.swing.GroupLayout(secondPanelTab4);
        secondPanelTab4.setLayout(secondPanelTab4Layout);
        secondPanelTab4Layout.setHorizontalGroup(
            secondPanelTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secondPanelTab4Layout.setVerticalGroup(
            secondPanelTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        secondPanelTab5.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab5.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab5MousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monedas.png"))); // NOI18N
        jLabel6.setText("Asignar Cuenta");

        javax.swing.GroupLayout secondPanelTab5Layout = new javax.swing.GroupLayout(secondPanelTab5);
        secondPanelTab5.setLayout(secondPanelTab5Layout);
        secondPanelTab5Layout.setHorizontalGroup(
            secondPanelTab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secondPanelTab5Layout.setVerticalGroup(
            secondPanelTab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        secondPanelTab6.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab6.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab6MousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recargaarSimbo (1).png"))); // NOI18N
        jLabel7.setText(" Recargar Saldo");

        javax.swing.GroupLayout secondPanelTab6Layout = new javax.swing.GroupLayout(secondPanelTab6);
        secondPanelTab6.setLayout(secondPanelTab6Layout);
        secondPanelTab6Layout.setHorizontalGroup(
            secondPanelTab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab6Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        secondPanelTab6Layout.setVerticalGroup(
            secondPanelTab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/al.jpg"))); // NOI18N

        secondPanelTab7.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab7.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab7MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calcular.gif"))); // NOI18N
        jLabel9.setText(" Transferencia");

        javax.swing.GroupLayout secondPanelTab7Layout = new javax.swing.GroupLayout(secondPanelTab7);
        secondPanelTab7.setLayout(secondPanelTab7Layout);
        secondPanelTab7Layout.setHorizontalGroup(
            secondPanelTab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        secondPanelTab7Layout.setVerticalGroup(
            secondPanelTab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        secondPanelTab8.setBackground(new java.awt.Color(102, 0, 0));
        secondPanelTab8.setForeground(new java.awt.Color(255, 51, 51));
        secondPanelTab8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondPanelTab8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                secondPanelTab8MousePressed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_ayuda_msocios.gif"))); // NOI18N
        jLabel15.setText(" Retirar Saldo");

        javax.swing.GroupLayout secondPanelTab8Layout = new javax.swing.GroupLayout(secondPanelTab8);
        secondPanelTab8.setLayout(secondPanelTab8Layout);
        secondPanelTab8Layout.setHorizontalGroup(
            secondPanelTab8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelTab8Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        secondPanelTab8Layout.setVerticalGroup(
            secondPanelTab8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnuTab2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addComponent(secondPanelTab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secondPanelTab8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnuTab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPanelTab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dspFondo1Layout = new javax.swing.GroupLayout(dspFondo1);
        dspFondo1.setLayout(dspFondo1Layout);
        dspFondo1Layout.setHorizontalGroup(
            dspFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dspFondo1Layout.setVerticalGroup(
            dspFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Header.setBackground(new java.awt.Color(68, 4, 4));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Eureka Bank Services");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 28 de Abril de 2018");

        txtUserEmpleado.setBackground(new java.awt.Color(72, 4, 4));
        txtUserEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtUserEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.gif"))); // NOI18N
        txtUserEmpleado.setText("User");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(665, Short.MAX_VALUE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(txtUserEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtUserEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(dspFondo1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1751, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dspFondo1))
        );

        tabbedPanel1.addTab("Empleado", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondPanelTab6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab6MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(clickedColor);
         secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_secondPanelTab6MousePressed

    private void secondPanelTab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab6MouseClicked
        // TODO add your handling code here:
        InfRecargarSaldoEmpleado tab = new InfRecargarSaldoEmpleado(codEmpleado);
        centrarInternalFrame2(tab);

    }//GEN-LAST:event_secondPanelTab6MouseClicked

    private void secondPanelTab5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab5MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(clickedColor);
        secondPanelTab6.setBackground(defaultColor);
         secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_secondPanelTab5MousePressed

    private void secondPanelTab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab5MouseClicked
        // TODO add your handling code here:

        RegistrarCuenta tab = new RegistrarCuenta();
        centrarInternalFrame2(tab);

    }//GEN-LAST:event_secondPanelTab5MouseClicked

    private void secondPanelTab4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab4MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(clickedColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
        secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_secondPanelTab4MousePressed

    private void secondPanelTab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab4MouseClicked
            IFrmListaClientes tab = new IFrmListaClientes();
                centrarInternalFrame2(tab);
    }//GEN-LAST:event_secondPanelTab4MouseClicked

    private void secondPanelTab3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab3MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(clickedColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
         secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_secondPanelTab3MousePressed

    private void secondPanelTab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab3MouseClicked
        FrmDatosPersonales tab = new FrmDatosPersonales();
        centrarInternalFrame2(tab);
        
    }//GEN-LAST:event_secondPanelTab3MouseClicked

    private void secondPanelTab2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab2MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(clickedColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
         secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_secondPanelTab2MousePressed

    private void secondPanelTab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab2MouseClicked
        // TODO add your handling code here:
        InfRegCliente tab = new InfRegCliente();
        centrarInternalFrame2(tab);
    }//GEN-LAST:event_secondPanelTab2MouseClicked

    private void secondPanelTab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab1MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(clickedColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
         secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_secondPanelTab1MousePressed

    private void secondPanelTab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab1MouseClicked
        // TODO add your handling code here:
        IFrmListaAmbasCuentas tab = new IFrmListaAmbasCuentas();
            centrarInternalFrame2(tab);
    }//GEN-LAST:event_secondPanelTab1MouseClicked

    private void firstPanelTab12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab12MousePressed
        // TODO add your handling code here:
        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(clickedColor);
    }//GEN-LAST:event_firstPanelTab12MousePressed

    private void firstPanelTab12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab12MouseClicked
        // TODO add your handling code here:
        
        IFrmActualizarParametro tab = new IFrmActualizarParametro();
         centrarInternalFrame1(tab);
    }//GEN-LAST:event_firstPanelTab12MouseClicked

    private void firstPanelTab11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab11MousePressed
        // TODO add your handling code here:
        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(clickedColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);
    }//GEN-LAST:event_firstPanelTab11MousePressed

    private void firstPanelTab11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab11MouseClicked
        // TODO add your handling code here:

        IFrmMonedas tab = new IFrmMonedas();
        centrarInternalFrame1(tab);


    }//GEN-LAST:event_firstPanelTab11MouseClicked

    private void firstPanelTab4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab4MousePressed
        // TODO add your handling code here:
        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(clickedColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);
    }//GEN-LAST:event_firstPanelTab4MousePressed

    private void firstPanelTab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab4MouseClicked
        // TODO add your handling code here:

        RegistrarCuentaAdmin tab = new RegistrarCuentaAdmin();
        centrarInternalFrame1(tab);
    }//GEN-LAST:event_firstPanelTab4MouseClicked

    private void firstPanelTab3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab3MousePressed
        // TODO add your handling code here:

        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(clickedColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);
    }//GEN-LAST:event_firstPanelTab3MousePressed

    private void firstPanelTab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab3MouseClicked
        // TODO add your handling code here:
        IFrmRegEmpleado tab = new IFrmRegEmpleado();
        centrarInternalFrame1(tab);
    }//GEN-LAST:event_firstPanelTab3MouseClicked

    private void firstPanelTab2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab2MousePressed
        // TODO add your handling code here:

        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(clickedColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);
    }//GEN-LAST:event_firstPanelTab2MousePressed

    private void firstPanelTab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab2MouseClicked
        // TODO add your handling code here:

        RegistrarTipoMovimiento tab = new RegistrarTipoMovimiento();
        centrarInternalFrame1(tab);

        //
    }//GEN-LAST:event_firstPanelTab2MouseClicked

    private void firstPanelTab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab1MousePressed
        // TODO add your handling code here:

        mnuTab1.setBackground(defaultColor);
        firstPanelTab1.setBackground(clickedColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);
    }//GEN-LAST:event_firstPanelTab1MousePressed

    private void firstPanelTab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelTab1MouseClicked
        RegistrarSucursal x = new RegistrarSucursal();
        centrarInternalFrame1(x);
    }//GEN-LAST:event_firstPanelTab1MouseClicked

    private void mnuTab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTab1MousePressed
        // TODO add your handling code here:
        mnuTab1.setBackground(clickedColor);
        firstPanelTab1.setBackground(defaultColor);
        firstPanelTab2.setBackground(defaultColor);
        firstPanelTab3.setBackground(defaultColor);
        firstPanelTab4.setBackground(defaultColor);
        firstPanelTab11.setBackground(defaultColor);
        firstPanelTab6.setBackground(defaultColor);
        firstPanelTab12.setBackground(defaultColor);
    }//GEN-LAST:event_mnuTab1MousePressed

    private void mnuTab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTab1MouseClicked
        // TODO add your handling code here:
        centrarInternalFrame1(main);

    }//GEN-LAST:event_mnuTab1MouseClicked

    private void secondPanelTab7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab7MouseClicked
        // TODO add your handling code here:
        IFrmTransferirSaldoEmpleado tab = new IFrmTransferirSaldoEmpleado(codEmpleado);
        centrarInternalFrame2(tab);

    }//GEN-LAST:event_secondPanelTab7MouseClicked

    private void secondPanelTab7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab7MousePressed
        // TODO add your handling code here:

        ///
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
        secondPanelTab7.setBackground(clickedColor);
        secondPanelTab8.setBackground(defaultColor);

    }//GEN-LAST:event_secondPanelTab7MousePressed

    private void secondPanelTab8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab8MouseClicked
        // TODO add your handling code here:
        IFmrRetirarSaldoEmpleado tab = new IFmrRetirarSaldoEmpleado(codEmpleado);
        centrarInternalFrame2(tab);
    }//GEN-LAST:event_secondPanelTab8MouseClicked

    private void secondPanelTab8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondPanelTab8MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(defaultColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
        secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(clickedColor);

    }//GEN-LAST:event_secondPanelTab8MousePressed

    private void mnuTab2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTab2MousePressed
        // TODO add your handling code here:
        mnuTab2.setBackground(clickedColor);
        secondPanelTab1.setBackground(defaultColor);
        secondPanelTab2.setBackground(defaultColor);
        secondPanelTab3.setBackground(defaultColor);
        secondPanelTab4.setBackground(defaultColor);
        secondPanelTab5.setBackground(defaultColor);
        secondPanelTab6.setBackground(defaultColor);
        secondPanelTab7.setBackground(defaultColor);
        secondPanelTab8.setBackground(defaultColor);
    }//GEN-LAST:event_mnuTab2MousePressed

    private void mnuTab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTab2MouseClicked
        // TODO add your handling code here:
         centrarInternalFrame2(main2);
    }//GEN-LAST:event_mnuTab2MouseClicked

    /**
     * @param args the command line arguments
     */
    private void centrarInternalFrame1(JInternalFrame interna) {
        if (currentInternalFrame != null) {
            currentInternalFrame.dispose();
        }

        currentInternalFrame = interna;

        dspFondo.removeAll();
        dspFondo.add(interna);

        int x = dspFondo.getWidth() / 2 - interna.getWidth() / 2;
        int y = dspFondo.getHeight() / 2 - interna.getHeight() / 2;

        interna.setLocation(x, y);
        interna.show();
    }

    private void centrarInternalFrame2(JInternalFrame interna) {
        if (currentInternalFrame != null) {
            currentInternalFrame.dispose();
        }

        currentInternalFrame = interna;

        dspFondo1.removeAll();
        dspFondo1.add(interna);

        int x = dspFondo1.getWidth() / 2 - interna.getWidth() / 2;
        int y = dspFondo1.getHeight() / 2 - interna.getHeight() / 2;

        interna.setLocation(x, y);
        interna.show();
    }

//    private void centrarInternalFrame3(JInternalFrame interna) {
//        if (currentInternalFrame != null) {
//            currentInternalFrame.dispose();
//        }
//
//        currentInternalFrame = interna;
//
//        dspFondo2.removeAll();
//        dspFondo2.add(interna);
//
//
//        int x = dspFondo2.getWidth() / 2 - interna.getWidth() / 2;
//        int y = dspFondo2.getHeight() / 2 - interna.getHeight() / 2;
//
//        interna.setLocation(x, y);
//        interna.show();
//    } 
//
    public static void centrarInternalFrameExterno(JInternalFrame interna) {
        centrarInternalFrame(interna);
    }

    public static void centrarInternalFrameExterno2(JInternalFrame interna) {
        centrarInternalFrameParaExterna(interna);
    }

    private static void centrarInternalFrame(JInternalFrame interna) {
        
        int x = dspFondo.getWidth() / 2 - interna.getWidth() / 2;
        int y = dspFondo.getHeight() / 2 - interna.getHeight() / 2;
        if (interna.isShowing()) {
            interna.setLocation(x, y);
        } else {
            dspFondo.add(interna);
            interna.setLocation(x, y);
            interna.setVisible(true);
        }
    }

    private static void centrarInternalFrameParaExterna(JInternalFrame interna) {
        int x = dspFondo1.getWidth() / 2 - interna.getWidth() / 2;
        int y = dspFondo1.getHeight() / 2 - interna.getHeight() / 2;
        if (interna.isShowing()) {
            interna.setLocation(x, y);
        } else {
            dspFondo1.add(interna);
            interna.setLocation(x, y);
            interna.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FirstPanelMenu;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Header1;
    private static javax.swing.JDesktopPane dspFondo;
    private static javax.swing.JDesktopPane dspFondo1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fecha1;
    private javax.swing.JPanel firstPanelTab1;
    private javax.swing.JPanel firstPanelTab11;
    private javax.swing.JPanel firstPanelTab12;
    private javax.swing.JPanel firstPanelTab2;
    private javax.swing.JPanel firstPanelTab3;
    private javax.swing.JPanel firstPanelTab4;
    private javax.swing.JLabel firstPanelTab5;
    private javax.swing.JLabel firstPanelTab6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mnuTab1;
    private javax.swing.JPanel mnuTab2;
    private javax.swing.JPanel secondPanelTab1;
    private javax.swing.JPanel secondPanelTab2;
    private javax.swing.JPanel secondPanelTab3;
    private javax.swing.JPanel secondPanelTab4;
    private javax.swing.JPanel secondPanelTab5;
    private javax.swing.JPanel secondPanelTab6;
    private javax.swing.JPanel secondPanelTab7;
    private javax.swing.JPanel secondPanelTab8;
    private javax.swing.JTabbedPane tabbedPanel1;
    private javax.swing.JLabel txtUserAdmin;
    private javax.swing.JLabel txtUserEmpleado;
    // End of variables declaration//GEN-END:variables
}
