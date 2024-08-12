/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author Sistemas
 */
public class MonedaCompararDescripcion implements Comparator<Moneda> {

    @Override
    public int compare(Moneda moneda1, Moneda moneda2) {
        return moneda1.getDescripcion().compareToIgnoreCase(moneda2.getDescripcion());
    }    
}