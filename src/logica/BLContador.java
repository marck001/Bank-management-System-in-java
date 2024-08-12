/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import datos.*;
/**
 *
 * @author ima
 */
public class BLContador {
    public static String aumentarContador(String nombreItem) {
        return DALContador.aumentarContador(nombreItem);
    }
}
