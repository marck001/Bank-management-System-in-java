/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import entidades.*;
import datos.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;

/**
 *
 * @author TheFelix Chavez
 */

public class BLInteresMensual {
    private static InteresMensual interes;

    public static int insertarInteres(Moneda moneda, float inteImporte) {
        String mensaje;
        if(moneda.getCodigo().trim().length()==2 && inteImporte>0) {
            if(buscarInteres(interes.getMoneda().getCodigo()) == null) {
                interes = new InteresMensual(moneda, inteImporte);
                mensaje = DALInteresMensual.insertarInteres(interes);
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

    public static String buscarInteres(String codigo) {
        if(codigo.trim().length() == 2) {
            return DALInteresMensual.buscarInteres(codigo);
        } else {
            return null;
        }
    }
    
     public static ArrayList<InteresMensual> listarInteres() {
        return DALInteresMensual.listarInteres();
    }
    

    public static String actualizarInteres(Moneda moneda, float inteImporte) {
        String mensaje;
        if(moneda.getCodigo().trim().length()==2 && inteImporte>0) {
            interes = new InteresMensual(moneda, inteImporte);
            mensaje = DALInteresMensual.actualizarInteres(interes);
            if(mensaje==null)
                mensaje = "Registro actualizado";
            } else {
                mensaje = "No válida";
            }
            return mensaje;
    }

    public static InteresMensual obtenerInteres(String codigo) {
        if(codigo.trim().length()==2) {
            interes = DALInteresMensual.obtenerInteres(codigo);
            return interes;
        } else
            return null;
    }
}