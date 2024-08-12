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
public class BLCostoMovimiento {
    private static CostoMovimiento costo;

    public static int insertarCostoMovimiento(String codigo, float costImporte) {
        String mensaje;
        if (codigo.trim().length() == 2 && costImporte > 0.0f) {
            if (buscarCostoMovimiento(codigo) == null) {
                costo = new CostoMovimiento(new Moneda(codigo), costImporte);
                mensaje = DALCostoMovimiento.insertarCostoMovimiento(costo);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado en costo de movimiento", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error al registrar costo de Movimiento", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos en registrar costo de Movimiento", "Error", 0);
            return 3;
        }
    }

    public static String buscarCostoMovimiento(String codigo) {
        if (codigo.trim().length() == 2)
            return DALCostoMovimiento.buscarCostoMovimiento(codigo);
        else
            return null;
    }

    public static ArrayList<CostoMovimiento> listarCostoMovimiento() {
        return DALCostoMovimiento.listarCostoMovimiento();
    }

    public static String actualizarCostoMovimiento(String codigo, float costImporte) {
        String mensaje;
         if (codigo.trim().length() == 2 && costImporte > 0.0f) {
            costo = new CostoMovimiento(new Moneda(codigo), costImporte);
            mensaje = DALCostoMovimiento.actualizarCostoMovimiento(costo);
            if (mensaje == null)
                mensaje = "Registro actualizado";
        } else
            mensaje = "Descripción no válida";
        return mensaje;
    }


    public static CostoMovimiento obtenerCostoMovimiento(String codigo) {
        if (codigo.trim().length() == 2) {
            costo = DALCostoMovimiento.obtenerCostoMovimiento(codigo);
            return costo;
        } else
        return null;
    }
}
