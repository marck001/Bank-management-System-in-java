/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import entidades.*;
import datos.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author Gaby Zanabria
 */
public class BLCargoMantenimiento {
    private static CargoMantenimiento cargo;

    public static int insertarCargoMantenimiento(String codigo, float cargMontoMaximo, float cargImporte) {
        String mensaje;
        if (codigo.trim().length() == 2 && cargMontoMaximo > 0 && cargImporte>0) {
            if (buscarCargoMantenimiento(codigo) == null) {
                cargo=new CargoMantenimiento(new Moneda(codigo), cargMontoMaximo, cargImporte);
                mensaje = DALCargoMantenimiento.insertarCargoMantenimiento(cargo);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado en cargo mantenimiento", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error en registro cargo mantenimiento", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos en registro cargo mantenimiento", "Error", 0);
            return 3;
        }
    }

    public static String buscarCargoMantenimiento(String codigo) {
        if (codigo.trim().length() == 2)
            return DALCargoMantenimiento.buscarCargoMantenimiento(codigo);
        else
            return null;
    }

    public static ArrayList<CargoMantenimiento> listarCargoMantenimiento() {
        return DALCargoMantenimiento.listarCargoMantenimiento();
    }

    public static String actualizarCargoMantenimiento(String codigo, float cargMontoMaximo, float cargImporte) {
        String mensaje;
        if (codigo.trim().length() == 2 && cargMontoMaximo > 0 && cargImporte>0){
            cargo=new CargoMantenimiento(new Moneda(codigo), cargMontoMaximo, cargImporte);
            mensaje = DALCargoMantenimiento.actualizarCargoMantenimiento(cargo);
            if (mensaje == null)
                mensaje = "Registro actualizado";
        } else
            mensaje = "Descripción no válida";
        return mensaje;
    }



    public static CargoMantenimiento obtenerCargoMantenimiento(String codigo) {
        if (codigo.trim().length() == 2) {
            cargo= DALCargoMantenimiento.obtenerCargoMantenimiento(codigo);
            return cargo;
        } else
        return null;
    }
        
}
