package logica;
import entidades.*;
import datos.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class BLTipoMovimiento {
     private static TipoMovimiento tipoMov;   

     public static int insertarTipoMovimiento(String tipoCodigo, String tipoDescripcion, String tipoAccion, String tipoEstado) {
        String mensaje;

        if(tipoCodigo.trim().length()==3 && tipoDescripcion.trim().length()<=40 && tipoAccion.trim().length()<=10 && tipoEstado.trim().length()<=15){
            if(buscarTipoMovimiento(tipoCodigo) == null) {                
                tipoMov = new TipoMovimiento (tipoCodigo, tipoDescripcion, tipoAccion,tipoEstado);
                mensaje = DALTipoMovimiento.insertarTipoMovimiento(tipoMov);
                if(mensaje == null) {
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

    public static String buscarTipoMovimiento(String codigo) {
        if(codigo.trim().length()==3)
            return DALTipoMovimiento.buscarTipoMovimiento(codigo);
        else
            return null;
    }

    public static ArrayList<TipoMovimiento> listarTipoMovimiento() {
        return DALTipoMovimiento.listarTipoMovimiento();
    }
    
    public static String actualizarTipoMoviento(String tipoCodigo, String tipoDescripcion, String tipoAccion, String tipoEstado) {
        String mensaje;
        if(tipoCodigo.trim().length()==3 && tipoDescripcion.trim().length()<=40 && tipoAccion.trim().length()<=10 && tipoEstado.trim().length()<=15) {
            tipoMov = new TipoMovimiento(tipoCodigo,tipoDescripcion,tipoAccion,tipoEstado);
            mensaje = DALTipoMovimiento.actualizarTipoMoviento(tipoMov);
            if(mensaje == null)
                mensaje = "Registro actualizado";                
        } else
            mensaje = "Datos no validos";
        return mensaje;        
    }
     
    public static TipoMovimiento obtenerMoneda(String codigo) {
        if(codigo.trim().length()==3) {
            tipoMov = DALTipoMovimiento.obtenerTipoMovimiento(codigo);
            return tipoMov;
        } else
            return null;
    }
}
