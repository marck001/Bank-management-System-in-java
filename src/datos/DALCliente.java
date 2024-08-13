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
 * @author marco
 */
public class DALCliente {

    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertaCliente(Cliente cliente) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cliente.getCodigo());
            cs.setString(2, cliente.getApellidoPaterno());
            cs.setString(3, cliente.getApellidoMaterno());
            cs.setString(4, cliente.getNombre());
            cs.setString(5, cliente.getDni());
            cs.setString(6, cliente.getCiudad());
            cs.setString(7, cliente.getDireccion());
            cs.setString(8, cliente.getTelefono());
            cs.setString(9, cliente.getEmail());
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

    public static String buscarCliente(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_cliente(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("cliecodigo");
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
    
    public static String buscarClienteLogin(String codigo, String dni) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_cliente_login(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            cs.setString(2, dni);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("clieemail");
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
    public static String obtenerCodCuentaPorCliente(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_cuenta_por_cliente(?)}";
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
    
    public static ArrayList<Cliente> listarClientes() {
        String sql;
        ArrayList<Cliente> obj = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_clientes()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                obj.add(new Cliente(rs.getString(1), rs.getString(2) , rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
            
            //String codigo, String apellidoPaterno, String apellidoMaterno, String nombre, String dni, String ciudad, String direccion, String email, String telefono
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

    public static String actualizarCliente(Cliente obj) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getApellidoPaterno());
            cs.setString(3, obj.getApellidoMaterno());
            cs.setString(4, obj.getNombre());
            cs.setString(5, obj.getDni());
            cs.setString(6, obj.getCiudad());
            cs.setString(7, obj.getDireccion());
            cs.setString(8, obj.getTelefono());
            cs.setString(9, obj.getEmail());
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

    public static Cliente obtenerCliente(String codigo) {
        Cliente obj = new Cliente();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_cliente(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                obj.setCodigo(rs.getString(1));
                obj.setApellidoPaterno(rs.getString(2));
                obj.setApellidoMaterno(rs.getString(3));
                obj.setNombre(rs.getString(4));
                obj.setDni(rs.getString(5));
                obj.setCiudad(rs.getString(6));
                obj.setDireccion(rs.getString(7));
                obj.setTelefono(rs.getString(8));
                obj.setEmail(rs.getString(9));
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
