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
public class DALCargoMantenimiento {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;
    
    public static String insertarCargoMantenimiento(CargoMantenimiento cargo) {
        String mensaje=null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cargo(?, ?, ?)}";   
            cs = cn.prepareCall(sql);
            cs.setString(1, cargo.getMoneda().getCodigo());
            cs.setFloat(2, cargo.getCargMontoMaximo());
            cs.setFloat(3, cargo.getCargImporte());
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
    
    public static String buscarCargoMantenimiento(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_cargo(?)}";
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
    
    public static ArrayList<CargoMantenimiento> listarCargoMantenimiento() {
        String sql;
        ArrayList<CargoMantenimiento> cargo = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_cargo()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while(rs.next()) {
                cargo.add(new CargoMantenimiento(new Moneda(rs.getString(1)), rs.getFloat(2), rs.getFloat(3)));
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
        return cargo;
    }
    
    public static String actualizarCargoMantenimiento(CargoMantenimiento cargo) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_cargo(?, ?,?)}";
            cs = cn.prepareCall(sql);
            cs.setFloat(1, cargo.getCargMontoMaximo());
            cs.setFloat(2, cargo.getCargImporte());
            cs.setString(3, cargo.getMoneda().getCodigo());
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
    
    public static CargoMantenimiento obtenerCargoMantenimiento(String codigo) {
        CargoMantenimiento cargo = new CargoMantenimiento();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_cargo(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                cargo.setMoneda(new Moneda (rs.getString(1)));
                cargo.setCargMontoMaximo(rs.getFloat(2));
                cargo.setCargImporte(rs.getFloat(3));
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
        return cargo;
    }
}
