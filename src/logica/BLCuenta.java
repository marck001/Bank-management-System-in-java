/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.*;
import patronBuilder.*;
import entidades.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author marck e imagay
 */
public class BLCuenta {
    private static CuentaCorriente obj;
    public static int insertarCuenta(String codigo, String emplcod, String cliente, String monecode, String sucursal,
            float saldo, GregorianCalendar fechaCreacion, String estado, int contMov, String clave) {
        String mensaje = null;
        if (codigo.trim().length() == 8 && emplcod.trim().length() == 4 && cliente.trim().length() == 5
                && sucursal.trim().length() == 3 && saldo > 0.0f && fechaCreacion != null && estado.trim().length() > 0
                && estado.trim().length() < 16 && contMov > 0 && clave.trim().length() == 6) {
            if (buscar(codigo) == null) {
                //got it
            obj = new CuentaCorriente(codigo, saldo, fechaCreacion, estado,contMov,clave, monecode,sucursal, cliente ,emplcod);
                mensaje = DALCuenta.insertaCuenta(obj);

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
        if (codigo.trim().length() == 8 && buscar(codigo) != null) {
            return DALCuenta.obtenerCuenta(codigo);
        } else {
            return null;
        }
    }

    public static String obtenerSaldo(String codigo) {
        if (codigo.trim().length() == 8 && buscar(codigo) != null) {
            return DALCuenta.obtenerSaldo(codigo);
        } else {
            return null;
        }
    }

    public static int actualizarCuenta(String codCuenta) {
        String mensaje = null;
        if (buscar(codCuenta) != null) {
            Cuenta cuenta = DALCuenta.obtenerCuenta(codCuenta);
            if (cuenta.getCodigo().trim().length() == 8 && cuenta.getEmplCreaCuenta().trim().length() == 4 &&
                    cuenta.getClieCodigo().trim().length() == 5 && cuenta.getSucuCodigo().trim().length() == 3
                    && cuenta.getSaldo() > 0.0f
                    && cuenta.getFechaCreacion() != null && cuenta.getEstado().trim().length() > 0
                    && cuenta.getEstado().trim().length() < 16
                    && cuenta.getContMovimientos() > 0 && cuenta.getClave().trim().length() == 6) {
                mensaje = DALCuenta.actualizarCuenta(cuenta);
                if (mensaje == null) {
                    showMessageDialog(null, "Actulización exitosa", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "Datos no válidos", "Error", 0);
                return 2;
            }

        } else {
            showMessageDialog(null, "Codigo de la cuenta no válida. ", "Error", 0);
            return 3;
        }
    }

    public static String retiroCuenta(float retiro, String codigo) {
        String mensaje;
        String saldoStr = obtenerSaldo(codigo);
        float saldo = Float.parseFloat(saldoStr);
        if (retiro > 0) {
            if (retiro <= saldo) {
                mensaje = DALCuenta.retiroCuenta(retiro, codigo);
            } else {
                mensaje = "Saldo de cuenta insuficiente";
            }
        } else {
            mensaje = "Monto del retiro inválido.";
        }

        return mensaje;
    }

    public static String depositoCuenta(float deposito, String codigo) {
        String mensaje;
        if (deposito > 0) {
            mensaje = DALCuenta.retiroCuenta(deposito, codigo);
        } else {
            mensaje = "Monto del depósito inválido.";
        }
        return mensaje;
    }

    public static String cancelarCuenta(String codCuenta) {
        return DALCuenta.cancelarCuenta(codCuenta);
    }

    public static String anularCuenta(String codCuenta) {
        return DALCuenta.anularCuenta(codCuenta);
    }

    public static String reactivarCuenta(String codCuenta) {
        return DALCuenta.reactivarCuenta(codCuenta);
    }

}
