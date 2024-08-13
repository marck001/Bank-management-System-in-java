/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.*;
import entidades.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BLParametro {
    private static Parametro parametro;
    public static String cobrarItf(String codigo, float impuesto, float montoTransf) {
        return DALParametro.cobrarItf(codigo, impuesto, montoTransf);
    }
    
    public static String obtenerITF() {
        return DALParametro.obtenerITF();
    }
    
    public static String obtenerMaxMov(){
        return DALParametro.obtenerMaxMov();
    }
    public static String actualizarParametro(String paraCodigo, String descripcion, String paraValor, String paraEstado) {
        String mensaje;
        if (paraCodigo.trim().length()==3 && paraValor.trim().length()<70) {
             parametro=new Parametro(paraCodigo,descripcion, paraValor, paraEstado);
            mensaje = DALParametro.actualizarParametro(parametro);
            if (mensaje == null)
                mensaje = "Registro actualizado";
        } else
            mensaje = "Datos no validos";
        return mensaje;
    }
     public static ArrayList<Parametro> listarParametro(){
         return DALParametro.listarParametro();
     }
     public static Parametro obtenerParametro(String codigo) {
        if (codigo.trim().length() == 3) {
            parametro = DALParametro.obtenerParametro(codigo);
            return parametro;
        } else
        return null;
    }
}
