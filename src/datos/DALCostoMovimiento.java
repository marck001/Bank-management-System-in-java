/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Gaby Zanabria
 */
public class DALCostoMovimiento {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;
    
    public static String insertarCostoMovimiento(CostoMovimiento costo) {
        String mensaje=null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_costo(?, ?)}";   
            cs = cn.prepareCall(sql);
            cs.setString(1, costo.getMoneda().getCodigo());
            cs.setFloat(2, costo.getCostImporte());
            cs.executeUpdate();            
        } catch(ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }
    
    public static String buscarCostoMovimiento(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_costo(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while(rs.next()) {
                return rs.getString("monecodigo");
            }
        } catch(ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return null;
    }
    
    public static ArrayList<CostoMovimiento> listarCostoMovimiento() {
        String sql;
        ArrayList<CostoMovimiento> costo = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_costo()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while(rs.next()) {
                costo.add(new CostoMovimiento(new Moneda(rs.getString(1)), rs.getFloat(2)));
            }
        }catch(ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return costo;
    }
    
    public static String actualizarCostoMovimiento(CostoMovimiento costo) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_costo(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setFloat(1, costo.getCostImporte());
            cs.setString(2, costo.getMoneda().getCodigo());
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
    
    public static CostoMovimiento obtenerCostoMovimiento(String codigo) {
        CostoMovimiento costo = new CostoMovimiento();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_costo(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                costo.setMoneda(new Moneda(rs.getString(1)));
                costo.setCostImporte(rs.getFloat(2));
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
        return costo;
    }
}
