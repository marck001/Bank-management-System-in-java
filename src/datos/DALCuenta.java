/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import patronBuilder.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author marck
 */
public class DALCuenta {

    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertaCuenta(Cuenta obj) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cuenta(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getMoneCodigo().getCodigo());
            cs.setString(3, obj.getSucuCodigo().getCodigo());
            cs.setString(4, obj.getEmplCreaCuenta().getCodigo());
            cs.setString(5, obj.getClieCodigo().getCodigo());
            cs.setString(6, String.valueOf(obj.getSaldo()));
            cs.setString(7, obj.getFechaCreacion().toString());
            cs.setString(8, obj.getEstado());
            cs.setString(9, String.valueOf(obj.getContMovimientos()));
            cs.setString(10, obj.getClave()); 
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
    
     public static String buscarCuenta(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_cuenta(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("cuencodigo");
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
    
      public static String obtenerSaldo(String codigo) {
     
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_obtener_saldo(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
            
              return rs.getString("cuensaldo");
               
               //String codigo, Empleado empleado, Cliente cliente, Moneda moneda, Sucursal sucursal, float saldo, GregorianCalendar fechaCreacion, String estado, int contMov, String clave
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
