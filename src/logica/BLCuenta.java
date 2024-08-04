/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import datos.*;
import entidades.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author marck
 */
public class BLCuenta {

   // private static CuentaCorriente obj;

    public static int insertarCuenta(String codigo, String emplcod, String cliente, String monecode, String sucursal, float saldo, GregorianCalendar fechaCreacion, String estado, int contMov, String clave) {
        String mensaje;
        if (codigo.trim().length() == 8 && contMov > 0 && saldo > 0 && estado.trim().length() > 0 && clave.trim().length() <= 20) {
            if (buscar(codigo) == null) {
           //     obj = new CuentaCorriente(codigo, new Empleado(emplcod), new Cliente(cliente), new Moneda(monecode), new Sucursal(sucursal), saldo, fechaCreacion, estado, contMov, clave);
                mensaje = null;
                //DALCuenta.insertaCuenta(obj); cambiar

                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "Codigo ya existe", "Error", 0);
                return 2;
            }

        } else {
            showMessageDialog(null, "Datos no validos", "Error", 0);
            return 3;
        }
    }

    public static String buscar(String codigo) {
        if (codigo.trim().length() == 8) {
            return DALCuenta.buscarCuenta(codigo);
        } else {
            return null;
        }
    }

    
    public static String buscarEmpleado(String codigo) {
        if (codigo.trim().length() == 4) {
            return DALEmpleado.buscarEmpleado(codigo);
        } else {
            return null;
        }
    }
    
            
    public static Cuenta obtenerCuenta(String codigo) {
        if (codigo.trim().length() == 8) {
            return DALCuenta.obtenerCuenta(codigo);
        } else {
            return null;
        }
    }
    
    public static String obtenerSaldo(String codigo) {
        if (codigo.trim().length() == 8) {
            return DALCuenta.obtenerSaldo(codigo);
        } else {
            return null;
        }
    }


}