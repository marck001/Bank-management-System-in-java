/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author marck
 */
public class DALEmpleado {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertaEmpleado(Empleado empleado) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_empleado(?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
           // String[] apeString = empleado.getApellidos().split(" ");

            cs.setString(1, empleado.getCodigo());
            cs.setString(2, empleado.getApePaterno());
            cs.setString(3, empleado.getApeMaterno());
            cs.setString(4, empleado.getNombre());
            cs.setString(5, empleado.getCiudad());
            cs.setString(6, empleado.getDireccion());
            cs.setString(7, empleado.getUser());
            cs.setString(8, empleado.getClave());
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

    public static String buscarEmpleado(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_empleado(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("emplcodigo");
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
    
    public static String buscarEmpleadoLogin(String usuario, String clave) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_empleado_login(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, usuario);
            cs.setString(2, clave);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("emplusuario");
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
    
    public static String buscarEmpleadoPorUser(String usuario) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_empleadoPorUsuario(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, usuario);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("emplcodigo");
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

    public static ArrayList<Empleado> listarEmpleados() {
        String sql;
        ArrayList<Empleado> empl = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_empleados}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                empl.add(new Empleado(rs.getString(1), rs.getString(2) , rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
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
        return empl;
    }

    public static String actualizarEmpleado(Empleado obj) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_empl(?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
           
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getApePaterno());
            cs.setString(3, obj.getApeMaterno());
            cs.setString(4, obj.getNombre());
            cs.setString(5, obj.getCiudad());
            cs.setString(6, obj.getDireccion());
            cs.setString(7, obj.getUser());
            cs.setString(8, obj.getClave());

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

    public static Empleado obtenerEmpleado(String codigo) {
        Empleado obj = new Empleado();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_empleado(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
               //obj = new Empleado(rs.getString(1),rs.getString(2)+" "+rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
            obj.setCodigo(rs.getString(1));
            obj.setApePaterno(rs.getString(2));
            obj.setApeMaterno(rs.getString(3));
            obj.setNombre(rs.getString(4));
            obj.setCiudad(rs.getString(5));
            obj.setDireccion(rs.getString(6));
            obj.setUser(rs.getString(7));
            obj.setClave(rs.getString(8));
            
               //String codigo, String apellidos, String nombre, String ciudad, String direccion, String user, String clave
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


    
}
