package logica;
import entidades.*;
import datos.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author alexisg im
 */

public class BLMoneda {
    private static Moneda moneda;

    public static int insertarMoneda(String codigo, String descripcion) {
        String mensaje;
        if (codigo.trim().length() == 2 && descripcion.trim().length() > 0 && descripcion.trim().length() <= 20) {
            if (buscarMoneda(codigo) == null || buscarMonedaDescripcion(descripcion)==null) {
                moneda = new Moneda(codigo, descripcion);
                mensaje = DALMoneda.insertarMoneda(moneda);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado en moneda", "Resultado", 1);
                    BLContador.aumentarContador("Moneda");
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error en registrar moneda", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos en registrar moneda", "Error", 0);
            return 3;
        }
    }

    public static String buscarMoneda(String codigo) {
        if (codigo.trim().length() == 2)
            return DALMoneda.buscarMoneda(codigo);
        else
            return null;
    }
    
    public static String buscarMonedaDescripcion(String descripcion) {
        if (descripcion.trim().length() > 0 && descripcion.trim().length() <= 20)
            return DALMoneda.buscarMonedaDescripcion(descripcion);
        else
            return null;
    }

    public static ArrayList<Moneda> listarMonedas() {
        return DALMoneda.listarMonedas();
    }

    public static String actualizarMoneda(String codigo, String descripcion) {
        String mensaje;
        if (descripcion.trim().length() > 1 && descripcion.trim().length() <= 20) {
            moneda = new Moneda(codigo, descripcion);
            mensaje = DALMoneda.actualizarMoneda(moneda);
            if (mensaje == null)
                mensaje = "Registro actualizado";
        } else
            mensaje = "Descripción no válida";
        return mensaje;
    }

    public static Moneda obtenerMoneda(String codigo) {
        if (codigo!=null && codigo.length() == 2 && buscarMoneda(codigo)!=null) {
            return DALMoneda.obtenerMoneda(codigo);
        } else
            return null;
    }
    
    public static String obtenerDescripcion(String codCuenta) {
        return DALMoneda.obtenerDescripcion(codCuenta);
    } 
    
}

