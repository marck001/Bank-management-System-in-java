package datos;

import entidades.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class DALTipoMovimiento{
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarTipoMovimiento(TipoMovimiento tipoMov) {
        String mensaje=null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_tipoMovimiento(?, ?, ?,?)}";   
            cs = cn.prepareCall(sql);
            cs.setString(1, tipoMov.getTipoCodigo());
            cs.setString(2, tipoMov.getTipoDescripcion());
            cs.setString(3, tipoMov.getTipoAccion());
            cs.setString(4, tipoMov.getTipoEstado());
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

    public static String buscarTipoMovimiento(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_tipoMovimiento(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while(rs.next()) {
                return rs.getString("tipocodigo");
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

    public static ArrayList<TipoMovimiento> listarTipoMovimiento() {
        String sql;
        ArrayList<TipoMovimiento> tipoMov = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_tipoMovimiento()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
                tipoMov.add(new TipoMovimiento(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
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
        return tipoMov;
    }

    public static String actualizarTipoMoviento(TipoMovimiento tipoMov) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_tipoMovimiento(?, ?, ?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, tipoMov.getTipoCodigo());
            cs.setString(2, tipoMov.getTipoDescripcion());
            cs.setString(3, tipoMov.getTipoAccion());
            cs.setString(4, tipoMov.getTipoEstado());
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

    public static TipoMovimiento obtenerTipoMovimiento(String codigo) {
        TipoMovimiento tipoMov = new TipoMovimiento();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_tipoMovimiento(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                tipoMov.setTipoCodigo(rs.getString(1));
                tipoMov.setTipoDescripcion(rs.getString(2));
                tipoMov.setTipoAccion(rs.getString(3));
                tipoMov.setTipoEstado(rs.getString(4));
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
        return tipoMov;
    }
    
}