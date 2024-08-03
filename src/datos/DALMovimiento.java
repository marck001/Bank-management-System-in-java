package datos;
import entidades.*;
import java.util.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class DALMovimiento {
private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    public static String insertarMovimiento(Movimiento obj) {
        String mensaje = null, sql;
        try{
            cn = Conexion.realizarConexion();
            sql = "{call sp_insertar_movimiento(?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);

            cs.setString(1, obj.getCuenCodigo().getCodigo());

              
          
        }catch (ClassNotFoundException | SQLException ex) {
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