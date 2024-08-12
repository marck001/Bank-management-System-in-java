/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronBuilder;

import datos.DALCuenta;
import entidades.Cliente;
import entidades.Cuenta;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import logica.BLCliente;
import logica.BLCuenta;
import logica.BLMovimiento;

/**
 *
 * @author User
 */
public class EmpleadoHace {
    public void recargarSaldo(String codCuenta, float saldo, String codEmpleado) {
        String codBuscado, clave, mensaje, mensaje2;
        int contIntentos = 0, numMov, aux;
        float saldoNuevo;
        Cuenta cuenta;
        Cliente cliente;
        /// 1// Buscamos q exista la cuenta
        codBuscado = BLCuenta.buscar(codCuenta);
        // condicional a 1
        if (codBuscado != null) {
            /// 2// Extraemos esa cuenta y guardamos en objeto cuenta
            cuenta = BLCuenta.obtenerCuenta(codBuscado);
            cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
            // PEDIMOS CLAVE
            do {
                clave = JOptionPane.showInputDialog(null, "Ingresa tu clave:   ", "CONFIRMAR MOVIMIENTO", 1);
                if (cuenta.getClave().equals(clave)) {
                    // HACEMOS EL RETIRO (DESCONTAMOS EL SALDO) //METODO DE DAL QUE TENGA EL UPDATE
                    mensaje = BLCuenta.depositoCuenta(saldo, codCuenta);
                    if (mensaje == null) {
                        saldoNuevo = Float.parseFloat(BLCuenta.obtenerSaldo(codCuenta));
                        // Mostramos MENSAJITO nuevo saldo
                        showMessageDialog(null, cliente.getNombre() + "  su nuevo saldo es:  " + saldoNuevo,
                                "Retiro existoso", 1);
                        // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999 y COD DE MOV
                        // CORRESPONDIENTE
                        GregorianCalendar fechaActual = new GregorianCalendar();
                        numMov = BLMovimiento.NumeroMaxMovimiento(codBuscado); // puse 1 al comienzo, ta por definir
                        // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENT
                        aux = BLMovimiento.insertarMovimiento(numMov++, fechaActual, saldo, "ENTRADA", cuenta.getCodigo(),
                                codEmpleado, "003"); 
                                System.out.println(aux);  
                        //Sumamos puntos:
                        if(cuenta.getCuenTipo().trim().equals("CREDITO")){
                            mensaje2=DALCuenta.actualizarPuntosCredito(codCuenta, saldo);
                        }
                    } else {
                        showMessageDialog(null,  mensaje , "Error", 0);
                    }
                    break;
                } else {
                    contIntentos++;
                    showMessageDialog(null, "Le quedan " + (3 - contIntentos) + " intentos.", "Clave incorrecta", 0);
                    if (contIntentos == 3)
                        showMessageDialog(null, "Ha superado el limite de intentos, intente más tarde.", "ERROR", 0);
                }
            } while (contIntentos < 3);
        } else {
            showMessageDialog(null, "La cuenta no existe o no está registrada.", "Error", 0);
        }
       
    }
}
