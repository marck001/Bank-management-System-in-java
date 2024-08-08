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
public class SucursalProvincial extends Sucursal {
    private ArrayList<Sucursal> sucursales;

    public SucursalProvincial(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        super(codigo, nombre, ciudad, direccion, contCuenta);
        this.sucursales = new ArrayList<>();
    }

    
    public boolean agregarSucursal(Sucursal sucursal) {
        if (!sucursales.contains(sucursal)) {
            sucursales.add(sucursal);
            return true;
        }
        return false;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }
}