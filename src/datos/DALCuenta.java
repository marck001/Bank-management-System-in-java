/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;
import patronBuilder.*;
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
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_obtener_saldo(?)}";
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

    public static Cuenta obtenerCuenta (String cuenCodigo){
        Cuenta obj = new CuentaCorriente();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_busca_cuenta(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenCodigo);
            rs = cs.executeQuery();
            while(rs.next()) {
                //public Cuenta(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave) 
                obj.setCodigo(rs.getString(1));
                obj.setMoneCodigo(new Moneda(rs.getString(2))); 
                obj.setEmplCreaCuenta(new Empleado(rs.getString(3)));
                obj.setClieCodigo(new Cliente(rs.getString(4)));
                obj.setSaldo(Float.valueOf(rs.getString(5)));
                String [] date = rs.getString(7).split("-");
                obj.setFechaCreacion(new GregorianCalendar(Integer.parseInt(date[0]), Integer.parseInt(date[1]) - 1, Integer.parseInt(date[2])));
                obj.setEstado(rs.getString(8));
                obj.setContMovimientos(Integer.parseInt(rs.getString(9)));
                obj.setClave(rs.getString(10));
            }
    }catch (Exception e) {
        showMessageDialog(null, e.getMessage(), "Error", 0);
    }finally {
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
/**
 * @return
 */
public static ArrayList<Cuenta> listarCuentasCorriente() {
    String sql;
    ArrayList<Cuenta> list= new ArrayList<>(); 
    try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_cuentas()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
              String [] string =   rs.getString(3).split("-");
              list.add(new CuentaCorriente(rs.getString(1), Float.parseFloat(rs.getString(2)) , new GregorianCalendar(Integer.parseInt(string[0]),Integer.parseInt(string[1]),Integer.parseInt(string[2])), rs.getString(4),Integer.parseInt(rs.getString(5)) , rs.getString(6)));
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
        return list;
}

public static ArrayList<Cuenta> listarCuentasAhorro() {
    String sql;
    ArrayList<Cuenta> list= new ArrayList<>(); 
    try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_cuentas()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
              String [] string =   rs.getString(3).split("-");

              
                
              // cuenta 
              list.add(new CuentaAhorro(rs.getString(1), Float.parseFloat(rs.getString(2)) , new GregorianCalendar(Integer.parseInt(string[0]),Integer.parseInt(string[1]),Integer.parseInt(string[2])), rs.getString(4),Integer.parseInt(rs.getString(5)) , rs.getString(6)));
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
        return list;
}

     public static String actualizarCuenta(Cuenta obj){
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_Cuenta(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
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
 /*   public static String retiroCuenta (float retiro, String codigo){
        String mesaje, saldo;
        float nuevoSaldo=0.0f;
        saldo= obtenerSaldo(codigo);
        nuevoSaldo=

        return mensaje;
    }*/

}