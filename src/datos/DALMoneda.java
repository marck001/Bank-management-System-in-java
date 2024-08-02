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
 * @author TheManu
 */
public class DALMoneda {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;
    
    public static String insertarMoneda(Moneda moneda) {
        String mensaje=null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_moneda(?, ?)}";   
            cs = cn.prepareCall(sql);
            cs.setString(1, moneda.getCodigo());
            cs.setString(2, moneda.getDescripcion());
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
    
    public static String buscarMoneda(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_moneda(?)}";
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
    
    public static ArrayList<Moneda> listarMonedas() {
        String sql;
        ArrayList<Moneda> monedas = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_monedas()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
                monedas.add(new Moneda(rs.getString(1), rs.getString(2)));
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
        return monedas;
    }
    
    public static String actualizarMoneda(Moneda moneda) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_moneda(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, moneda.getDescripcion());
            cs.setString(2, moneda.getCodigo());
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
    
    public static String eliminarMoneda(String codigo){
        String mensaje = null;
        
        try{
            cn = Conexion.realizarConexion();
            String sql = "{call sp_eliminar_moneda(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            cs.executeUpdate();
            
             mensaje = "Moneda con "+codigo+"eliminada";
            
        }catch(ClassNotFoundException | SQLException ex){
                mensaje = ex.getMessage();
            
        }finally {
            try {
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;  
        
        
    }
    
    public static Moneda obtenerMoneda(String codigo) {
        Moneda moneda = new Moneda();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_moneda(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                moneda.setCodigo(rs.getString(1));
                moneda.setDescripcion(rs.getString(2));
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
        return moneda;
    }
    
    
    
}
