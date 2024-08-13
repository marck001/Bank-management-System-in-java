/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronAdapter;

import datos.DALCuenta;
import logica.*;
import entidades.*;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import patronBuilder.CuentaCredito;

/**
 * 
 * @author Imanoll y Alexis
 */
public class ComponenteSolicitudVirtual {

    // Llamamos métodos de la capa LOGICA-->DATOS DE CUENTA

    public void retirarSaldoPorEmpleado(String codCuenta, float saldo) {
        String codBuscado, clave, mensaje;
        int contIntentos = 0, numMov;
        float saldoNuevo;
        CuentaCredito cuenta;
        Cliente cliente;
        ///1//   Buscamos q exista la cuenta
        codBuscado=BLCuenta.buscar(codCuenta);
        //condicional a 1
        if(codBuscado != null){
            ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
            cuenta = BLCuenta.obtenerCuenta(codCuenta);
            System.out.print(cuenta.getClave());
            cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
            
             //PEDIMOS CLAVE
            do {
                clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", 1);
                if(cuenta.getClave().equalsIgnoreCase(clave)){
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
                        int aux = BLMovimiento.insertarMovimiento(numMov++,fechaActual,saldo, "SALIDA", cuenta.getCodigo(), "9999" , "004");
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

    public void depositarSaldoPorEmpleado(String codCuenta, float saldo, int op) {
        String codBuscado, clave, mensaje, mensaje2,mensaje3;
        int contIntentos = 0, numMov, numMov1, aux1, aux2, aux3;
        float saldoNuevo, retiroRemitente, saldoDestino;
        Cuenta cuenta;
        Cliente cliente;
        codBuscado = BLCuenta.buscar(codCuenta);

        if (codBuscado != null) {
            cuenta = BLCuenta.obtenerCuenta(codCuenta);
            cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
            clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", 1);
            while (!cuenta.getClave().equalsIgnoreCase(clave) && contIntentos < 3) {
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

            if (op == 1) {
                String codCuentaDestino = JOptionPane.showInputDialog("Ingrese el código de la cuenta destino:");
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
                        if(moneDestino.trim().equalsIgnoreCase(moneRemitente)){
                            mensaje = BLCuenta.depositoCuenta(saldo, codCuentaDestino);
                            mensaje2 = BLCuenta.retiroCuenta(saldo, codCuenta);                    
                        } else{
                            for (MonedaConverter moneda : monedas) {
                                   if (moneda.getCodigo().equalsIgnoreCase(moneRemitente)) {
                                       saldo=saldo*moneda.getEquivalenciaEnSoles();
                                       break; 
                                   }
                            }
                            for (MonedaConverter moneda : monedas) {
                                   if (moneda.getCodigo().equalsIgnoreCase(moneDestino)) {
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

                        GregorianCalendar fechaActual = new GregorianCalendar();
                        numMov = BLMovimiento.NumeroMaxMovimiento(codBuscado);
                        numMov1 = BLMovimiento.NumeroMaxMovimiento(codBuscadoDestino);
                        aux1 = BLMovimiento.insertarMovimiento(numMov++, fechaActual, saldo, "SALIDA", codCuenta, "9999","009");                        
                        aux2 = BLMovimiento.insertarMovimiento(numMov1++, fechaActual, saldo, "ENTRADA", codCuentaDestino,"9999", "008");
                        //Sumamos puntos:
                        if(cuenta.getCuenTipo().trim().equalsIgnoreCase("CREDITO")){
                            mensaje3=DALCuenta.actualizarPuntosCredito(codCuenta, saldo);
                        }
                    } else {
                        showMessageDialog(null, "Error 1: "+ mensaje + "\n" + "Error 2: "+mensaje2, "Error", 0);
                    }
                } else {
                    showMessageDialog(null, "La cuenta destino no existe o no está registrada.", "Error", 0);
                }
            } else if (op == 2) {

                mensaje = BLCuenta.retiroCuenta(saldo, cuenta.getCodigo());

                if (mensaje == null) {
                    saldoNuevo = Float.parseFloat(BLCuenta.obtenerSaldo(cuenta.getCodigo()));
                    showMessageDialog(null, cliente.getNombre() + " su nuevo saldo es: " + saldoNuevo,
                            "Descuento exitoso", 1);

                    GregorianCalendar fechaActual = new GregorianCalendar();
                    numMov = BLMovimiento.NumeroMaxMovimiento(codBuscado); // Código de movimiento correspondiente a otro banco
                    aux3 = BLMovimiento.insertarMovimiento(numMov++, fechaActual, saldo, "SALIDA A OTRO BANCO", cuenta.getCodigo(), "9999",
                            "009");
                            System.out.println(aux3); 
                } else {
                    showMessageDialog(null,  mensaje , "Error", 0);
                }
            }
        } else {
            showMessageDialog(null, "La cuenta no existe o no está registrada.", "Error", 0);
        }
         
    }

    // OP 1 = OTRA CUENTA DE EUREKABANK
    /// 1// Buscamos q exista la cuenta A QN QUIERE DEPOSITAR
    /// 2// Extraemos esa cuenta y guardamos en objeto cuenta
    // condicional a 1
    // PEDIMOS CLAVE
    // HACEMOS EL DEPOSITO (AUMENTAMOS EL SALDO A LA NUEVA CUENTA) //METODO DE DAL
    // QUE TENGA EL QUERY
    // Mostramos MENSAJITO QUE SE HIZO EL MOVIMIENTO
    // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999
    // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
    // OP 2 = OTRA BANCO
    //// PEDIMOS CLAVE
    // HACEMOS EL DESCUENTO A LA CUENTA //METODO DE DAL QUE TENGA EL QUERY DE
    // DESCUENTO
    // Mostramos MENSAJITO QUE SE HIZO EL MOVIMIENTO A OTRO BANCO
    // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999 y COD DE MOV
    // CORRESPONDIENTE-- REFERENCIA OTRO BANCO
    // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO

    public void recargarSaldoPorEmpleado(String codCuenta, float saldo) {
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
                clave = clave.trim();
                if (cuenta.getClave().equalsIgnoreCase(clave)) {
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
                        numMov=numMov+1;
                        aux = BLMovimiento.insertarMovimiento(numMov, fechaActual, saldo, "ENTRADA", cuenta.getCodigo(),
                                "9999", "003"); 
                                System.out.println(aux);  
                        //Sumamos puntos:
                        if(cuenta.getCuenTipo().trim().equalsIgnoreCase("CREDITO")){
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

    public void cancelarCuentaPorEmpleado(String codCuenta) {
        String codBuscado, clave, mensaje;
        Cuenta cuenta;
        Cliente cliente;
        int contIntentos = 0, numMov, aux;
        /// 1// Buscamos SU cuenta
        codBuscado = BLCuenta.buscar(codCuenta);
        /// 2// Extraemos esa cuenta y guardamos en objeto cuenta
        if (codBuscado != null) {
            cuenta = BLCuenta.obtenerCuenta(codBuscado);
            cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
            do {
                clave = JOptionPane.showInputDialog(null, "Ingresa tu clave:   ", "CONFIRMAR CANCELAMIENTO", 1);
                if (cuenta.getClave().equalsIgnoreCase(clave)) {
                    mensaje = BLCuenta.cancelarCuenta(codCuenta);
                    if (mensaje == null) {
                        showMessageDialog(null, cliente.getNombre() + "  su cuenta ha sido cancelada :(.",
                                "Eurebank: triste que te fueras :'( .", 1);
                        // CREAMOS MOVIMIENTO
                        GregorianCalendar fechaActual = new GregorianCalendar();
                        numMov = BLMovimiento.NumeroMaxMovimiento(codCuenta); // puse 1 al comienzo, ta por definir
                        // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENT
                        aux = BLMovimiento.insertarMovimiento(numMov++, fechaActual, 0.0f, "CANCELACION", cuenta.getCodigo(),
                                "9999", "002");

                                System.out.println(aux); 
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

    public void reactivarCuentaPorEmpleado(String codCuenta) {
        String codBuscado, clave, mensaje;
        int contIntentos = 0, numMov, aux;
        Cliente cliente;
        /// 1// Buscamos SU cuenta
        codBuscado = BLCuenta.buscar(codCuenta);
        if (codBuscado != null) {
            /// 2// Extraemos esa cuenta y guardamos en objeto cuenta
            Cuenta cuenta = BLCuenta.obtenerCuenta(codBuscado);
            cliente = BLCliente.obtenerCliente(cuenta.getClieCodigo());
            do {
                clave = JOptionPane.showInputDialog(null, "Ingresa tu clave:   ", "CONFIRMAR REACTIVACIÓN", 1);
                if (cuenta.getClave().equalsIgnoreCase(clave)) {
                    mensaje = BLCuenta.reactivarCuenta(codCuenta);
                    if (mensaje == null) {
                        showMessageDialog(null, cliente.getNombre() + "  su cuenta ha sido reactivada :).",
                                "Eurebank feliz que hayas vuelto <3.", 1);
                        // CREAMOS MOVIMIENTO
                        GregorianCalendar fechaActual = new GregorianCalendar();
                        numMov = BLMovimiento.NumeroMaxMovimiento(codCuenta); // puse 1 al comienzo, ta por definir
                        // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENT
                        aux = BLMovimiento.insertarMovimiento(numMov++, fechaActual, 0.0f, "REACTIVACION", cuenta.getCodigo(),
                                "9999", "011");
                                
                                System.out.println(aux); 
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