/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import static datos.DALCuenta.*;
import entidades.*;
import java.sql.*;
import java.util.*;
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
    
    public static ArrayList<Contador> listarContador() {
        String sql;
        ArrayList<Contador> obj = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_contador}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                obj.add(new Contador(rs.getString(1), rs.getInt(2) , rs.getInt(3)));
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
        return obj;
    }
    
    public static String obtenerConteo(String tabla) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_obtener_conteo(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, tabla);
            rs = cs.executeQuery();
           if (rs.next()) {
                return rs.getString("contitem");
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
        return "0";
    }
}
