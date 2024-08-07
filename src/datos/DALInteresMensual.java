package datos;
import entidades.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class DALInteresMensual {
    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarInteres(InteresMensual interes) {
    String mensaje=null, sql;
        try {
            cn = Conexion.realizarConexion();
            sql ="{call sp_insertar_interes(?, ?)}";
            cs = cn.prepareCall(sql); 
            cs.setString(1, interes.getMoneda().getCodigo());
            cs.setFloat(2, interes.getInteImporte());
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

    public static String buscarInteres(String codigo) {
        String sql;
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_buscar_interes(?)}";
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

    public static ArrayList<InteresMensual> listarInteres() {
        String sql;
        ArrayList<InteresMensual> interes = new ArrayList<>();
        try {
            cn = Conexion.realizarConexion();
            sql = "{call sp_listar_interes()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
                interes.add(new InteresMensual(new Moneda(rs.getString(1)), rs.getFloat(2)));
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
        return interes;
    }

    public static String actualizarInteres(InteresMensual interes) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_actualizar_interes(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, interes.getMoneda().getCodigo());
            cs.setFloat(2,  interes.getInteImporte());
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

    public static InteresMensual obtenerInteres(String codigo) {
        InteresMensual inter = new InteresMensual();
        try {
            cn = Conexion.realizarConexion();
            String sql = "{call sp_buscar_interes(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                inter.setMoneda(new Moneda(rs.getString(1)));
                inter.setInteImporte(rs.getFloat(2));
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
        return inter;
    }
}