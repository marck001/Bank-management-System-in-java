/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
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
        public static String actualizarParametro(Parametro parametro) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_parametro(?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, parametro.getParaCodigo());
            cs.setString(2, parametro.getParaValor());
            cs.setString(3, parametro.getParaEstado());
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

   
    public static ArrayList<Parametro> listarParametro() {
        String sql;
        ArrayList<Parametro> obj = new ArrayList<>();
        try {
            // Parametro(String paraCodigo, String paraDescripcion, String paraValor, String paraEstado)
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_parametro()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                obj.add(new Parametro(rs.getString(1), rs.getString(2) , rs.getString(3),rs.getString(4)));
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
    public static Parametro obtenerParametro(String codigo) {
    Parametro parametro = new Parametro();
    try {
        cn = Conexion.realizarConexion();
        String sql = "{call sp_buscar_parametro(?)}";
        cs = cn.prepareCall(sql);
        cs.setString(1, codigo);
        rs = cs.executeQuery();
        while (rs.next()) {
            parametro.setParaCodigo(rs.getString(1));
            parametro.setParaDescripcion(rs.getString(2));
            parametro.setParaValor(rs.getString(3)); // Asignación correcta para Valor
            parametro.setParaEstado(rs.getString(4)); // Asignación correcta para Estado
        }
    } catch (ClassNotFoundException | SQLException ex) {
        showMessageDialog(null, ex.getMessage(), "Error", 0);
    } finally {
        try {
            if (rs != null) rs.close();
            if (cs != null) cs.close();
            if (cn != null) cn.close();
        } catch (SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }
    return parametro;
}

}
