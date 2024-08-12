/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Manuel Arteaga
 */
public class ControladorSucursales {
    private ArrayList<SucursalDepartamental> sucursalesDepartamentales;

    public ControladorSucursales() {
        sucursalesDepartamentales = new ArrayList<>();
    }

    public boolean agregarSucursalDepartamental(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        for (SucursalDepartamental sd : sucursalesDepartamentales) {
            if (sd.getCiudad().equals(ciudad)) {
                return false; 
            }
        }
        
        SucursalDepartamental newSucursal = new SucursalDepartamental(codigo, nombre, ciudad, direccion, contCuenta);
        sucursalesDepartamentales.add(newSucursal);
        return true;
    }

    public boolean agregarSucursalProvincial(String codigoDepartamental, String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        for (SucursalDepartamental sd : sucursalesDepartamentales) {
            if (sd.getCodigo().equals(codigoDepartamental) && sd.getCiudad().equals(ciudad)) {
                return sd.agregarSucursal(new SucursalProvincial(codigo, nombre, ciudad, direccion, contCuenta));
            }
        }
        return false; 
    }

}