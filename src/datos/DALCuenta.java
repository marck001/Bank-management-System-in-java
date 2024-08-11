/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;
import java.sql.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
import patronBuilder.*;

/**
 *
 * @author marck e ima
 */
public class DALCuenta {

    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarCuentaCredito(CuentaCredito obj) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cuenta_(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getMoneCodigo());
            cs.setString(3, obj.getSucuCodigo());
            cs.setString(4, obj.getEmplCreaCuenta());
            cs.setString(5, obj.getClieCodigo());
            cs.setString(6, String.valueOf(obj.getSaldo()));
            cs.setString(7, obj.getFechaCreacion().toString());
            cs.setString(8, obj.getEstado());
            cs.setString(9, String.valueOf(obj.getContMovimientos()));
            cs.setString(10, obj.getClave());
            cs.setString(11, obj.getCuenTipo());
           

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

    public static String insertarCuentaDebito(CuentaDebito obj) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cuenta_(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getMoneCodigo());
            cs.setString(3, obj.getSucuCodigo());
            cs.setString(4, obj.getEmplCreaCuenta());
            cs.setString(5, obj.getClieCodigo());
            cs.setString(6, String.valueOf(obj.getSaldo()));
            cs.setString(7, obj.getFechaCreacion().toString());
            cs.setString(8, obj.getEstado());
            cs.setString(9, String.valueOf(obj.getContMovimientos()));
            cs.setString(10, obj.getClave());
            cs.setString(11, obj.getCuenTipo());
           

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



  /*
    public static String insertarCuentaDebito(CuentaDebito obj) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cuentaDebito(?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getCuenTipo());
            cs.setInt(3, obj.getNumTarjeta());
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

    public static String insertarCuentaCredito(CuentaCredito obj) {
        String mensaje = null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_cuentaCredito(?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getCuenTipo());
            cs.setInt(11, obj.getPuntos());
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

     */

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

    public static Cuenta obtenerCuenta(String cuenCodigo) {
        Cuenta obj = new CuentaDebito();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_busca_cuenta(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenCodigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                obj.setCodigo(rs.getString(1));
                obj.setMoneCodigo(rs.getString(2));
                obj.setSucuCodigo(rs.getString(3));
                obj.setEmplCreaCuenta(rs.getString(4));
                obj.setClieCodigo(rs.getString(5));
                obj.setSaldo(Float.parseFloat(rs.getString(6)));
                String[] date = rs.getString(7).split("-");
                obj.setFechaCreacion(new GregorianCalendar(Integer.parseInt(date[0]), Integer.parseInt(date[1]) - 1,
                        Integer.parseInt(date[2])));
                obj.setEstado(rs.getString(8));
                obj.setContMovimientos(Integer.parseInt(rs.getString(9)));
                obj.setClave(rs.getString(10));
                obj.setCuenTipo(rs.getString(11));
            }
        } catch (ClassNotFoundException | SQLException e) {
            showMessageDialog(null, e.getMessage(), "Error", 0);
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

    public static ArrayList<CuentaDebito> listarCuentasDebito() {
        String sql;
        ArrayList<CuentaDebito> list = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_cuentas()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while (rs.next()) {

                String[] string = rs.getString(3).split("-");
                // String codigo, float saldo, GregorianCalendar fechaCreacion, String estado,
                // int contMovimientos, String clave, String moneCodigo, String sucuCodigo,
                // String emplCreaCuenta, String clieCodigo
                list.add(new CuentaDebito(rs.getString(1), Float.parseFloat(rs.getString(2)),
                        new GregorianCalendar(Integer.parseInt(string[0]), Integer.parseInt(string[1]),
                                Integer.parseInt(string[2])),
                        rs.getString(4), Integer.parseInt(rs.getString(5)), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));

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
        return list;
    }

    public static ArrayList<CuentaCredito> listarCuentasCredito() {
        String sql;
        ArrayList<CuentaCredito> list = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_cuentas()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while (rs.next()) {
                String[] string = rs.getString(3).split("-");
                list.add(new CuentaCredito(rs.getString(1), Float.parseFloat(rs.getString(2)),
                        new GregorianCalendar(Integer.parseInt(string[0]), Integer.parseInt(string[1]),
                                Integer.parseInt(string[2])),
                        rs.getString(4), Integer.parseInt(rs.getString(5)), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
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
        return list;
    }

    public static String actualizarCuenta(Cuenta obj) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_Cuenta(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getMoneCodigo());
            cs.setString(3, obj.getSucuCodigo());
            cs.setString(4, obj.getEmplCreaCuenta());
            cs.setString(5, obj.getClieCodigo());
            cs.setString(6, String.valueOf(obj.getSaldo()));
            cs.setString(7, obj.getFechaCreacion().toString());
            cs.setString(8, obj.getEstado());
            cs.setString(9, String.valueOf(obj.getContMovimientos()));
            cs.setString(10, obj.getClave());
            cs.setString(11, obj.getCuenTipo());
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

    public static String retiroCuenta(float retiro, String codigo) {
        String mensaje = null;
        String saldoStr = obtenerSaldo(codigo);
        float saldo = Float.parseFloat(saldoStr);
        Cuenta cuenta = obtenerCuenta(codigo);
        float nuevoSaldo = saldo - retiro;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_Saldo(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
            cs.setString(2, String.valueOf(nuevoSaldo));
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

    public static String depositoCuenta(float deposito, String codigo) {
        String mensaje = null;
        String saldoStr = obtenerSaldo(codigo);
        float saldo = Float.parseFloat(saldoStr);
        Cuenta cuenta = obtenerCuenta(codigo);
        float nuevoSaldo = saldo + deposito;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_Saldo(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
            cs.setString(2, String.valueOf(nuevoSaldo));
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

    public static String cancelarCuenta(String codCuenta) {
        String mensaje = null;
        Cuenta cuenta = obtenerCuenta(codCuenta);
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_cancelarCuentaCliente(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
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

    public static String anularCuenta(String codCuenta) {
        String mensaje = null;
        Cuenta cuenta = obtenerCuenta(codCuenta);
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_cancelarCuentaEmpleado(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
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

    public static String reactivarCuenta(String codCuenta) {
        String mensaje = null;
        Cuenta cuenta = obtenerCuenta(codCuenta);
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_reactivarCuenta(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
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
    
    public static String obtenerPuntosCredito(String codCuenta){
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_obtenerPuntos(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codCuenta);
            rs = cs.executeQuery();
            while (rs.next()) {
                return rs.getString("cuenPuntos");
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
    
    public static String actualizarPuntosCredito(String codCuenta, float saldo){
        String mensaje = null;
        String puntosStr = obtenerPuntosCredito(codCuenta);
        float puntos =Float.parseFloat(puntosStr);
        float nuevosPuntos = puntos + (saldo*0.2f);
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_puntos(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codCuenta);
            cs.setString(2, String.valueOf(nuevosPuntos));
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
    
    public static String converterPuntosCreditoASaldo(String codCuenta, float puntosAconvertir){
        String mensaje = null;
        String puntosStr = obtenerPuntosCredito(codCuenta);
        float puntos =Float.parseFloat(puntosStr);
        Cuenta cuenta = obtenerCuenta(codCuenta);
        float nuevoSaldo = cuenta.getSaldo()+((puntos + puntosAconvertir)*0.02f);
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_Saldo(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, cuenta.getCodigo());
            cs.setString(2, String.valueOf(nuevoSaldo));
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

}