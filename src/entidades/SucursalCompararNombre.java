/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.*;

/**
 *
 * @author Manuel Arteaga
 */
public class SucursalCompararNombre implements Comparator<Sucursal> {
    @Override
    public int compare(Sucursal sucursal1, Sucursal sucursal2) {
        return sucursal1.getNombre().compareToIgnoreCase(sucursal2.getNombre());
    }    
}
