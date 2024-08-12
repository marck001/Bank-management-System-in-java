
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
    }
        public void transferirSaldo(String codEmpleado, String codCuenta, String codCuentaDestino, float saldo) {
                   String codBuscado, clave, mensaje, mensaje2,mensaje3, mensaje4;
                   int contIntentos = 0, numMov, numMov1, aux1, aux2, aux3;
                   float saldoNuevo, retiroRemitente, saldoDestino;
                   float impuestoITF=Float.parseFloat(BLParametro.obtenerITF());
                   Cuenta cuenta;
                   Cliente cliente;
                   codBuscado = BLCuenta.buscar(codCuenta);

                   if (codBuscado != null) {
                       cuenta = BLCuenta.obtenerCuenta(codCuenta);
                       cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
                       clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", 1);
                       while (!cuenta.getClave().equals(clave) && contIntentos < 3) {
                           contIntentos++;
                           if (contIntentos < 3) {
                               showMessageDialog(null, "Clave incorrecta. Le quedan " + (3 - contIntentos) + " intentos.",
                                       "Clave incorrecta", 0);
                               clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", 1);
                           } else {
                               showMessageDialog(null, "Ha superado el limite de intentos, intente más tarde.", "ERROR", 0);
                               return;
                           }
                       }
                           String codBuscadoDestino = BLCuenta.buscar(codCuentaDestino);
                           MonedaConverter[] monedas = new MonedaConverter[5];
                                   monedas[0] = new MonedaConverter("01", "SOLES", 1.0f);
                                   monedas[1] = new MonedaConverter("02", "DÓLARES", 3.70f);
                                   monedas[2] = new MonedaConverter("03", "PESOS ARGENTINOS", 0.00397919165f);
                                   monedas[3] = new MonedaConverter("04", "PESOS CHILENOS", 0.0039815961f);
                                   monedas[4] = new MonedaConverter("05", "EUROS", 4.07f);

                           if (codBuscadoDestino != null) {
                               Cuenta cuentaDestino= BLCuenta.obtenerCuenta(codBuscadoDestino);
                               String moneDestino=cuentaDestino.getMoneCodigo();
                               String moneRemitente=cuenta.getMoneCodigo();
                               retiroRemitente=saldo;
                               saldoDestino=cuentaDestino.getSaldo();
                                   if(moneDestino.trim().equals(moneRemitente)){
                                       mensaje = BLCuenta.depositoCuenta(saldo, codCuentaDestino);
                                       mensaje2 = BLCuenta.retiroCuenta(saldo, codCuenta);                    
                                   } else{
                                       for (MonedaConverter moneda : monedas) {
                                              if (moneda.getCodigo().equals(moneRemitente)) {
                                                  saldo=saldo*moneda.getEquivalenciaEnSoles();
                                                  break; 
                                              }
                                       }
                                       for (MonedaConverter moneda : monedas) {
                                              if (moneda.getCodigo().equals(moneDestino)) {
                                                  saldo=saldo/moneda.getEquivalenciaEnSoles();
                                                  break; 
                                              }
                                       }
                                       mensaje = BLCuenta.depositoCuenta(saldo, codCuentaDestino);
                                       mensaje2 = BLCuenta.retiroCuenta(retiroRemitente, codCuenta);                             
                                   }

                               if (mensaje == null && mensaje2 == null) {
                                   saldoNuevo = Float.parseFloat(BLCuenta.obtenerSaldo(codCuenta));
                                   showMessageDialog(null, cliente.getNombre() + " su nuevo saldo es: " + saldoNuevo,
                                           "Depósito exitoso", 1);
                                   
                                   //cobramos ITF
                                   mensaje4=BLParametro.cobrarItf(cuenta.getCodigo(), impuestoITF, retiroRemitente);
                                   if(mensaje4==null)
                                       showMessageDialog(null, cliente.getNombre() + " se ha cobrado un ITF de " + impuestoITF +"% al monto de su transacción",
                                           "Cobro ITF", 1);
                                   
                                   //Sumamos puntos:
                                   if(cuenta.getCuenTipo().trim().equals("CREDITO")){
                                       mensaje3=DALCuenta.actualizarPuntosCredito(codCuenta, saldo);
                                   }
                                   //Realizamos movimientos
                                   GregorianCalendar fechaActual = new GregorianCalendar();
                                   numMov = BLMovimiento.NumeroMaxMovimiento(codBuscado);
                                   numMov1 = BLMovimiento.NumeroMaxMovimiento(codBuscadoDestino);
                                   aux1 = BLMovimiento.insertarMovimiento(numMov++, fechaActual, saldo, "SALIDA", codCuenta, "9999","009");                        
                                   aux2 = BLMovimiento.insertarMovimiento(numMov1++, fechaActual, saldo, "ENTRADA", codCuentaDestino,"9999", "008");
                                   
                                   //verificamos si se aplica costo por movimiento
                                   if (numMov++ > Integer.parseInt(BLParametro.obtenerMaxMov())) {
                                       CostoMovimiento costo = BLCostoMovimiento.obtenerCostoMovimiento(cuenta.getMoneCodigo());
                                        mensaje = BLCuenta.retiroCuenta(costo.getCostImporte(), codCuenta);
                                        if (mensaje == null) {
                                            showMessageDialog(null, "Ha superado los " +Integer.parseInt(BLParametro.obtenerMaxMov()) +" movimientos gratuitos, se ha aplicado el costo movimiento de " + costo.getCostImporte(), "Costo Movimiento", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                               } else {
                                   showMessageDialog(null, "Error 1: "+ mensaje + "\n" + "Error 2: "+mensaje2, "Error", 0);
                               }
                           } else {
                               showMessageDialog(null, "La cuenta destino no existe o no está registrada.", "Error", 0);
                           } 
                   } else {
                       showMessageDialog(null, "La cuenta no existe o no está registrada.", "Error", 0);
                   }

               }
        }
    
