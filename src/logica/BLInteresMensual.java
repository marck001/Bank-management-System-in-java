/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import entidades.*;
import datos.*;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;

/**
 *
 * @author TheFelix Chavez
 */

public class BLInteresMensual {
    private static InteresMensual interes;

    public static int insertarInteres(String codigo, float inteImporte) {
        String mensaje;
        if (codigo.trim().length() == 2 && inteImporte > 0.0f) {
            interes = new InteresMensual(new Moneda(codigo), inteImporte);
            if (buscarInteres(interes.getMoneda().getCodigo()) == null) {
                mensaje = DALInteresMensual.insertarInteres(interes);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado en interes mensual", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error en registrar interes mensual", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "Codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos en registrar interes mensual", "Error", 0);
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
    

    public static String actualizarInteres(String codigo, float inteImporte) {
        String mensaje;
        if(codigo.trim().length()==2 && inteImporte>0) {
            interes = new InteresMensual(new Moneda(codigo), inteImporte);
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
    
    public static String realizarInteres(String fecha, float interes) {
        return DALInteresMensual.realizarInteres(fecha, interes);
    }
}