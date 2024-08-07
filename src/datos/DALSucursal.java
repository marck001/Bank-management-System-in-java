/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.*;
import java.sql.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
import patronComposite.*;

/**
 *
 * @author Manuel Arteaga
 */
public class DALSucursal {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarSucursal(Sucursal sucursal) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            if (sucursal instanceof SucursalDepartamental) {
                sql = "{call sp_insertar_sucursal_departamental(?, ?, ?, ?, ?)}";
            } else if (sucursal instanceof SucursalProvincial) {
                sql = "{call sp_insertar_sucursal_provincial(?, ?, ?, ?, ?)}";
            } else {
                sql = "{call sp_insertar_sucursal(?, ?, ?, ?, ?)}";
            }

            cs = cn.prepareCall(sql);
            cs.setString(1, sucursal.getCodigo());
            cs.setString(2, sucursal.getNombre());
            cs.setString(3, sucursal.getCiudad());
            cs.setString(4, sucursal.getDireccion());
            cs.setInt(5, sucursal.getContCuenta());
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

    public static String buscarSucursal(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_sucursal(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("sucucodigo");
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

    public static ArrayList<Sucursal> listarSucursales() {
        String sql;
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_sucursales}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                Sucursal sucursal;
                if ("Departamental".equalsIgnoreCase(tipo)) {
                    sucursal = new SucursalDepartamental(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                } else if ("Provincial".equalsIgnoreCase(tipo)) {
                    sucursal = new SucursalProvincial(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                } else {
                    sucursal = new Sucursal(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                }
                sucursales.add(sucursal);
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
        return sucursales;
    }

    public static String actualizarSucursal(Sucursal sucursal) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql;
            if (sucursal instanceof SucursalDepartamental) {
                sql = "{call sp_actualizar_sucursal_departamental(?, ?, ?, ?, ?)}";
            } else if (sucursal instanceof SucursalProvincial) {
                sql = "{call sp_actualizar_sucursal_provincial(?, ?, ?, ?, ?)}";
            } else {
                sql = "{call sp_actualizar_sucursal(?, ?, ?, ?, ?)}";
            }

            cs = cn.prepareCall(sql);
            cs.setString(1, sucursal.getCodigo());
            cs.setString(2, sucursal.getNombre());
            cs.setString(3, sucursal.getCiudad());
            cs.setString(4, sucursal.getDireccion());
            cs.setInt(5, sucursal.getContCuenta());
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
    
    public static Sucursal obtenerSucursal(String codigo) {
        Sucursal sucursal = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_sucursal(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            if (rs.next()) {
                String tipo = rs.getString("tipo");
                if ("Departamental".equalsIgnoreCase(tipo)) {
                    sucursal = new SucursalDepartamental(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                } else if ("Provincial".equalsIgnoreCase(tipo)) {
                    sucursal = new SucursalProvincial(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                } else {
                    sucursal = new Sucursal(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                }
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
        return sucursal;
    }

}
