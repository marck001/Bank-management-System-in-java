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
public class SucursalDepartamental extends Sucursal{
       protected ArrayList<Sucursal> sucursal; 

    public SucursalDepartamental(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        super(codigo, nombre, ciudad, direccion, contCuenta); 
        this.sucursal = new ArrayList<>(); 
    }

    public boolean agregarSucursal(Sucursal sucursal) {
        if (!this.sucursal.contains(sucursal)) {
            this.sucursal.add(sucursal);
            return true;
        }
        return false;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursal;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", sucursalesDepartamentales=" + sucursal;
    }
}
