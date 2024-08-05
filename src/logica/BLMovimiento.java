package logica;

import datos.*;
import entidades.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
//public Movimiento(int numero, GregorianCalendar fecha, float importe, String referencia, 
//    String cuenCodigo, String empCodigo, String tipoMovimiento)

// @Autor Celeste

public class BLMovimiento {

    private static Movimiento obj;

    public static int insertarMovimiento(int numero, GregorianCalendar fecha, float importe, String referencia,
            String cuenCodigo, String empCodigo, String tipoMovimiento) {
        String mensaje = null;
        if (numero > 0 && fecha != null && importe > 0 && importe == 0.0f && referencia.trim().length() > 0
                && cuenCodigo.trim().length() == 8 && empCodigo.trim().length() == 4
                && tipoMovimiento.trim().length() > 0) {
            if (buscarMovimiento(cuenCodigo) == null) {
                obj = new Movimiento();
                mensaje = DALMovimiento.insertarMovimiento(obj);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "Codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos", "Error", 0);
            return 3;
        }
    }

    //done

    public static String buscarMovimiento(String cuenCodigo) {
        if (cuenCodigo.trim().length() == 8) {
            return DALMovimiento.buscarMovimiento(cuenCodigo);
        } else {
            return null;
        }
    }

    public static String actualizarMovimiento(int numero, GregorianCalendar fecha, float importe, String referencia,
            String cuenCodigo, String empCodigo, String tipoMovimiento) {
        String mensaje = null;

        if (numero > 0 && fecha != null && importe >  0.0f && referencia.trim().length() > 0
                && cuenCodigo.trim().length() == 8 && empCodigo.trim().length() == 4
                && tipoMovimiento.trim().length() > 0) {
            obj = new Movimiento(numero, fecha, importe, referencia, cuenCodigo, empCodigo, tipoMovimiento);
            ;
            mensaje = DALMovimiento.actualizarMovimiento(obj);

            if (mensaje == null)
                mensaje = "Registro actualizado";
        } else
            mensaje = "No válido";
        return mensaje;

    }

    public static Movimiento obtenerMovimiento(String cuenCodigo) {
        if (cuenCodigo.trim().length() == 8) {
            obj = DALMovimiento.obtenerMovimiento(cuenCodigo);
            return obj;
        } else
            return null;
    }

    public static int NumeroMaxMovimiento(String cuenCodigo) {
        return DALMovimiento.NumeroMaxMovimiento(cuenCodigo);
    }

}
