package datos;

import entidades.*;
import java.sql.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class DALMovimiento {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarMovimiento(Movimiento obj) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_movimiento(?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setInt(1, obj.getNumero());
            cs.setString(2, obj.getFechaCreacionCorta());
            cs.setString(3, String.valueOf(obj.getImporte()));
            cs.setString(4, obj.getReferencia());
            cs.setString(5, DALCuenta.buscarCuenta(obj.getCuenCodigo()));
            cs.setString(6, obj.getEmpCodigo());
            cs.setString(7, String.valueOf(obj.getTipoMovimiento()));
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

    public static String buscarMovimiento(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_movimiento(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("movicodigo");
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

    public static String actualizarMovimiento(Movimiento obj) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_movimiento(?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setInt(1, obj.getNumero());
            cs.setString(2, obj.getFechaCreacionCorta());
            cs.setString(3, String.valueOf(obj.getImporte()));
            cs.setString(4, obj.getReferencia());
            cs.setString(5, DALCuenta.buscarCuenta(obj.getCuenCodigo()));
            cs.setString(6, obj.getEmpCodigo());
            cs.setString(7, String.valueOf(obj.getTipoMovimiento()));
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

    public static Movimiento obtenerMovimiento(String Codigo) {
        Movimiento obj = new Movimiento();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_movimiento(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, Codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                obj.setNumero(rs.getInt(1));
                String fechaString = rs.getString(2);
                String[] dateParts = fechaString.split("-");
                int year = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]) - 1;
                int day = Integer.parseInt(dateParts[2]);
                obj.setFecha(new GregorianCalendar(year, month, day));
                obj.setImporte(rs.getFloat(3));
                obj.setReferencia(rs.getString(4));
                obj.setCuenCodigo(rs.getString(5));
                obj.setEmpleado(rs.getString(6));
                obj.setTipoMovimiento(rs.getString(7));
                obj.setNumero(rs.getInt(1));
                String[] date = rs.getString(2).split("-");
                obj.setFechaCreacion(Integer.parseInt(date[0]), Integer.parseInt(date[1]) - 1,
                        Integer.parseInt(date[2]));
                obj.setImporte(Float.parseFloat(rs.getString(3)));
                obj.setReferencia(rs.getString(4));
                obj.setCuenCodigo(rs.getString(5));
                obj.setEmpleado(rs.getString(6));
                obj.setTipoMovimiento(rs.getString(7));
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

    public static ArrayList<Movimiento> listarMovimientos() {
        String sql;
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_movimiento()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {

                String[] string = rs.getString(2).split("-");

                movimientos.add(new Movimiento(rs.getInt(1),
                        new GregorianCalendar(Integer.parseInt(string[0]), Integer.parseInt(string[1]),
                                Integer.parseInt(string[2])),
                        rs.getFloat(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));

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
        return movimientos;
    }
    
    public static int NumeroMaxMovimiento(String cuenCodigo){
        int max = 0;
        try{
            cn = Conexion.realizarConexion();
            String sql = "{call sp_returnMax(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenCodigo);
            rs = cs.executeQuery();
            if(rs.next()){
                max = rs.getInt("moviNumero");
            }
            
            cs.executeUpdate();
        }catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        
        }return max;
        
    }
}
