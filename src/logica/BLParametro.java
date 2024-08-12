/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.*;

/**
 *
 * @author User
 */
public class BLParametro {
    public static String cobrarItf(String codigo, float impuesto, float montoTransf) {
        return DALParametro.cobrarItf(codigo, impuesto, montoTransf);
    }
    
    public static String obtenerITF() {
        return DALParametro.obtenerITF();
    }
    
    public static String obtenerMaxMov(){
        return DALParametro.obtenerMaxMov();
    }
}
