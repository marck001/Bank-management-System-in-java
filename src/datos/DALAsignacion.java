/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Manuel Arteaga
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DALAsignacion {
    private static Connection cn;
    private static CallableStatement cs;
    private static ResultSet rs;

    public static String asignarEmpleadoASucursal(String codigoAsignacion, String codigoSucursal, String codigoEmpleado) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            
            String sql = "{call sp_asignar_empleado_a_sucursal(?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigoAsignacion);
            cs.setString(2, codigoSucursal);
            cs.setString(3, codigoEmpleado);
            cs.executeUpdate();
            
            mensaje = "Empleado asignado exitosamente a la sucursal";
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                if (rs != null) rs.close();
                if (cs != null) cs.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }
}