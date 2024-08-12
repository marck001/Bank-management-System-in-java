
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronBuilder;

import datos.*;
import entidades.*;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import logica.*;

/**
 *
 * @author User
 */
public class EmpleadoHace {
    
    public void retirarSaldo(String codCuenta, float saldo, String codEmpleado) {
        String codBuscado, clave, mensaje;
        int contIntentos = 0, numMov;
        float saldoNuevo;
        Cuenta cuenta;
        Cliente cliente;
        ///1//   Buscamos q exista la cuenta
        codBuscado=BLCuenta.buscar(codCuenta);
        //condicional a 1
        if(codBuscado != null){
            ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
            cuenta = BLCuenta.obtenerCuenta(codBuscado);
            cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
             //PEDIMOS CLAVE
            do {
                clave = JOptionPane.showInputDialog(null, "Ingresa tu clave:   ", "CONFIRMAR MOVIMIENTO", 1);
                if(cuenta.getClave().equals(clave)){
                // HACEMOS EL RETIRO (DESCONTAMOS EL SALDO)   //METODO DE DAL QUE TENGA EL UPDATE
                mensaje = BLCuenta.retiroCuenta( saldo, codCuenta);
                    if(mensaje == null){
                        saldoNuevo = Float.parseFloat(BLCuenta.obtenerSaldo(codCuenta));                 
                    // Mostramos MENSAJITO nuevo saldo
                        showMessageDialog(null, cliente.getNombre() + "  su nuevo saldo es:  " + saldoNuevo, "Retiro existoso", 1 );
                    // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
                        GregorianCalendar fechaActual = new GregorianCalendar();
                        numMov= BLMovimiento.NumeroMaxMovimiento(codBuscado);
                    // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENT
                        int aux = BLMovimiento.insertarMovimiento(numMov++,fechaActual,saldo, "SALIDA", cuenta.getCodigo(), codEmpleado , "004");
                        System.out.println(aux);                        
                    }else{
                        showMessageDialog(null, mensaje, "Error",0);
                    }
                    break;
                }
                else{
                    contIntentos++;
                    showMessageDialog(null, "Le quedan " + (3-contIntentos) + " intentos.","Clave incorrecta",0);
                    if(contIntentos==3)
                        showMessageDialog(null, "Ha superado el limite de intentos, intente más tarde." ,"ERROR", 0);
                }   
            } while (contIntentos<3);
        }else{
            showMessageDialog(null, "La cuenta no existe o no está registrada.", "Error", 0);
        }
    }
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
       //XD
    }
        public void transferirSaldo(String codEmpleado, String codCuentaOrigen, String codCuentaDestino, float monto) {
            String codBuscadoOrigen, codBuscadoDestino, clave, mensajeRetiro, mensajeDeposito, mensaje;
            int contIntentos = 0, numMovOrigen, numMovDestino;
            float saldoNuevoOrigen, saldoNuevoDestino;
            float impuesto = 0.0008f; // ES DE 0.08%
            float montoImpuesto;
            float montoNeto;
            Cuenta cuentaOrigen, cuentaDestino;
            Cliente cliente;

            // Buscamos la cuenta ORIGEN
            codBuscadoOrigen = BLCuenta.buscar(codCuentaOrigen);
            if (codBuscadoOrigen != null) {
                cuentaOrigen = BLCuenta.obtenerCuenta(codBuscadoOrigen);
                cliente = BLCliente.obtenerCliente(codEmpleado);

                do {
                    clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", JOptionPane.INFORMATION_MESSAGE);
                    if (cuentaOrigen.getClave().equals(clave)) {

                        // Buscamos la cuenta DESTINO
                        codBuscadoDestino = BLCuenta.buscar(codCuentaDestino);
                        if (codBuscadoDestino != null) {
                            cuentaDestino = BLCuenta.obtenerCuenta(codBuscadoDestino);

                            // Calculamos el impuesto y el monto neto a transferir
                            montoImpuesto = monto * impuesto;
                            montoNeto = monto - montoImpuesto;

                            // Realizamos el retiro de la cuenta origen
                            mensajeRetiro = BLCuenta.retiroCuenta(monto, codCuentaOrigen);
                            if (mensajeRetiro == null) {
                                saldoNuevoOrigen = Float.parseFloat(BLCuenta.obtenerSaldo(codCuentaOrigen));

                                // Realizamos el depósito en la cuenta destino
                                mensajeDeposito = BLCuenta.depositoCuenta(montoNeto, codCuentaDestino);
                                if (mensajeDeposito == null) {
                                    saldoNuevoDestino = Float.parseFloat(BLCuenta.obtenerSaldo(codCuentaDestino));

                                    showMessageDialog(null, cliente.getNombre() + " su nuevo saldo es: " + saldoNuevoOrigen,
                                            "Transferencia exitosa", JOptionPane.INFORMATION_MESSAGE);

                                    // Registramos los movimientos en la base de datos
                                    GregorianCalendar fechaActual = new GregorianCalendar();
                                    CostoMovimiento costo = BLCostoMovimiento.obtenerCostoMovimiento(cuentaOrigen.getMoneCodigo());
                                    numMovOrigen = BLMovimiento.NumeroMaxMovimiento(codBuscadoOrigen) + 1;
                                    numMovDestino = BLMovimiento.NumeroMaxMovimiento(codBuscadoDestino) + 1;
                                    BLMovimiento.insertarMovimiento(numMovOrigen, fechaActual, monto, "SALIDA", cuentaOrigen.getCodigo(), codEmpleado, "009");
                                    BLMovimiento.insertarMovimiento(numMovDestino, fechaActual, montoNeto, "ENTRADA", cuentaDestino.getCodigo(), codEmpleado, "008");

                                    // Verificamos si se aplica costo por movimiento adicional
                                    if (numMovOrigen > 15) {
                                        mensaje = BLCuenta.retiroCuenta(costo.getCostImporte(), codCuentaOrigen);
                                        if (mensaje == null) {
                                            showMessageDialog(null, "Ha superado los 15 movimientos gratuitos, se ha aplicado el costo movimiento de " + costo.getCostImporte(), "Costo Movimiento", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                } else {
                                    showMessageDialog(null, "Error en el depósito: " + mensajeDeposito, "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                showMessageDialog(null, "Error en el retiro: " + mensajeRetiro, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            showMessageDialog(null, "La cuenta destino no existe o no está registrada.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    } else {
                        contIntentos++;
                        showMessageDialog(null, "Clave incorrecta. Le quedan " + (3 - contIntentos) + " intentos.", "Clave incorrecta", JOptionPane.WARNING_MESSAGE);
                        if (contIntentos == 3) {
                            showMessageDialog(null, "Ha superado el límite de intentos, intente más tarde.", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                } while (contIntentos < 3);
            } else {
                showMessageDialog(null, "La cuenta origen no existe o no está registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
}