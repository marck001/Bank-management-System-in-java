/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.*;
import datos.*;
import patronComposite.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Manuel Arteaga 
 */
public class BLSucursal {

    public static String insertarSucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta, String tipo) {
        String mensaje;
        if (codigo.trim().length() > 0 && nombre.trim().length() > 0 && ciudad.trim().length() > 0 && direccion.trim().length() > 0) {
            if (buscarSucursal(codigo) == null) {
                Sucursal sucursal;
                if ("Departamental".equalsIgnoreCase(tipo)) {
                    sucursal = new SucursalDepartamental(codigo, nombre, ciudad, direccion, contCuenta);
                } else if ("Provincial".equalsIgnoreCase(tipo)) {
                    sucursal = new SucursalProvincial(codigo, nombre, ciudad, direccion, contCuenta);
                } else {
                    sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
                }
                mensaje = DALSucursal.insertarSucursal(sucursal);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                    return "Registro insertado";
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    return mensaje;
                }
            } else {
                showMessageDialog(null, "Código ya existe", "Error", 0);
                return "Código ya existe";
            }
        } else {
            showMessageDialog(null, "Datos no válidos", "Error", 0);
            return "Datos no válidos";
        }
    }

    public static String buscarSucursal(String codigo) {
        if (codigo.trim().length() > 0) {
            return DALSucursal.buscarSucursal(codigo);
        } else {
            return null;
        }
    }

    public static ArrayList<Sucursal> listarSucursales() {
        return DALSucursal.listarSucursales();
    }

    public static String actualizarSucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta, String tipo) {
        String mensaje;
        if (codigo.trim().length() > 0 && nombre.trim().length() > 0 && ciudad.trim().length() > 0 && direccion.trim().length() > 0) {
            Sucursal sucursal;
            if ("Departamental".equalsIgnoreCase(tipo)) {
                sucursal = new SucursalDepartamental(codigo, nombre, ciudad, direccion, contCuenta);
            } else if ("Provincial".equalsIgnoreCase(tipo)) {
                sucursal = new SucursalProvincial(codigo, nombre, ciudad, direccion, contCuenta);
            } else {
                sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
            }
            mensaje = DALSucursal.actualizarSucursal(sucursal);
            if (mensaje == null) {
                showMessageDialog(null, "Registro actualizado", "Resultado", 1);
                return "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
            showMessageDialog(null, mensaje, "Error", 0);
        }
        return mensaje;
    }

    public static Sucursal obtenerSucursal(String codigo) {
        if (codigo.trim().length() > 0) {
            return DALSucursal.obtenerSucursal(codigo);
        } else {
            return null;
        }
    }

}