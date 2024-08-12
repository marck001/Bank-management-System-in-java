/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import static datos.DALCuenta.obtenerCuenta;
import static datos.DALCuenta.obtenerSaldo;
import entidades.Cuenta;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author ima
 */
public class DALContador {
     private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;
    public static String aumentarContador(String nombreItem) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_aumentarContador(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, nombreItem);
            cs.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }
}
