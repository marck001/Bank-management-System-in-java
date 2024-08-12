/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
import static logica.BLCuenta.*;

/**
 *
 * @author User
 */
public class DALParametro {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;
    public static String cobrarItf(String codigo, float impuesto, float montoTransf) {
        String mensaje = null;
        Cuenta cuenta = obtenerCuenta(codigo);
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_cobrarITF(?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
            cs.setFloat(2, impuesto);
            cs.setFloat(3, montoTransf);
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
    
    public static String obtenerITF() {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_obtenerITF()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("paravalor");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return null;
    }
    
    public static String obtenerMaxMov() {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_obtenerMaxMovimientos()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("paravalor");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return null;
    }
    
}
