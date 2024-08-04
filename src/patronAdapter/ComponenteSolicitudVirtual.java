/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronAdapter;

import datos.*;
import entidades.*;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 
 * @author User
 */
public class ComponenteSolicitudVirtual {
    
    //Llamamos métodos de la capa LOGICA-->DATOS DE CUENTA
    
    public void retirarSaldoPorEmpleado(String codCuenta, float saldo) {
        String codBuscado, clave, mensaje;
        int contIntentos = 1;
        float saldoNuevo;
        Cuenta cuenta;
        Cliente cliente = new Cliente();
        ///1//   Buscamos q exista la cuenta
        codBuscado=DALCuenta.buscarCuenta(codCuenta);
        //condicional a 1
        if(codBuscado != null){
            ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
            cuenta = DALCuenta.obtenerCuenta(codBuscado);
            cliente = DALCliente.obtenerCliente(cuenta.getClieCodigo().getCodigo());
             //PEDIMOS CLAVE
            clave = JOptionPane.showInputDialog(null, "Ingresa tu clave:   ", "CONFIRMAR MOVIMIENTO", 1);
            do { 
                if(cuenta.getClave().equals(clave)){
                // HACEMOS EL RETIRO (DESCONTAMOS EL SALDO)   //METODO DE DAL QUE TENGA EL UPDATE
                mensaje = DALCuenta.retiroCuenta( saldo, codCuenta);
                    if(mensaje == null){
                        saldoNuevo = Float.parseFloat(DALCuenta.obtenerSaldo(codCuenta));                 
                    // Mostramos MENSAJITO nuevo saldo
                        showMessageDialog(null, cliente.getNombre() + "  su nuevo saldo es:  " + saldoNuevo, "Retiro existoso", 1 );
                    // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
                        GregorianCalendar fechaActual = new GregorianCalendar();
                        Movimiento mov = new Movimiento(1,fechaActual,saldo, null, cuenta.getCodigo(), "9999" , "004"); // puse 1 al comienzo, ta por definir
                    // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENT
                        mensaje = DALMovimiento.insertarMovimiento(mov);
                        if(mensaje ==null)
                            showMessageDialog(null, "Movimiento realizado de forma exitosa ");
                        else 
                        showMessageDialog(null, "Problemas en registrar el movimiento ");
                    }else{
                        showMessageDialog(null, "No se realizo el retiro, intente más tarde");
                    }
                    break;
                }
                else{
                    contIntentos++;
                    showMessageDialog(null, "Le quedan " + (3-contIntentos) + " intentos.","Clave incorrecta",0);
                }   
            } while (contIntentos!=3);
        }else{
            showMessageDialog(null, "La cuenta no existe o no está registrada.", "Error", 0);
        } 
    }

    public void depositarSaldoPorEmpleado(String codCuenta, float saldo, int op) {
        String codBuscado, clave, mensaje;
        int contIntentos = 0;
        float saldoNuevo;
        Cuenta cuenta = null;
        Cliente cliente = new Cliente();
       
        codBuscado = DALCuenta.buscarCuenta(codCuenta);

        if (codBuscado != null) {
            cuenta = DALCuenta.obtenerCuenta(codCuenta);
            cliente = DALCliente.obtenerCliente(cuenta.getClieCodigo().getCodigo());

          
            clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", 1);
            while (!cuenta.getClave().equals(clave) && contIntentos < 3) {
                contIntentos++;
                if (contIntentos < 3) {
                    showMessageDialog(null, "Clave incorrecta. Le quedan " + (3 - contIntentos) + " intentos.", "Clave incorrecta", 0);
                    clave = JOptionPane.showInputDialog(null, "Ingresa tu clave: ", "CONFIRMAR MOVIMIENTO", 1);
                } else {
                    showMessageDialog(null, "La cuenta no existe o no esta registrada." ,"ERROR", 0);
                    return;
                }
            }

            if (op == 1) {
                String codCuentaDestino = JOptionPane.showInputDialog("Ingrese el código de la cuenta destino:");
                String codBuscadoDestino = DALCuenta.buscarCuenta(codCuentaDestino);

                if (codBuscadoDestino != null) {
                    Cuenta cuentaDestino = DALCuenta.obtenerCuenta(codCuentaDestino);
                    mensaje = DALCuenta.depositoCuenta(saldo, codCuentaDestino);

                    if (mensaje == null) {
                        saldoNuevo = Float.parseFloat(DALCuenta.obtenerSaldo(codCuentaDestino));
                        showMessageDialog(null, cliente.getNombre() + " su nuevo saldo es: " + saldoNuevo, "Depósito exitoso", 1);

                        GregorianCalendar fechaActual = new GregorianCalendar();
                        Movimiento mov = new Movimiento(1, fechaActual, saldo, null, cuentaDestino.getCodigo(), "9999", "004");
                        mensaje = DALMovimiento.insertarMovimiento(mov);
                        if (mensaje == null) {
                            showMessageDialog(null, "Movimiento realizado de forma exitosa");
                        } else {
                            showMessageDialog(null, "Problemas en registrar el movimiento");
                        }
                    } else {
                        showMessageDialog(null, "No se realizó el depósito, intente más tarde");
                    }
                } else {
                    showMessageDialog(null, "La cuenta destino no existe o no está registrada.", "Error", 0);
                }
            } else if (op == 2) {
                
                mensaje = DALCuenta.retiroCuenta(saldo, cuenta.getCodigo());

                if (mensaje == null) {
                    saldoNuevo = Float.parseFloat(DALCuenta.obtenerSaldo(cuenta.getCodigo()));
                    showMessageDialog(null, cliente.getNombre() + " su nuevo saldo es: " + saldoNuevo, "Descuento exitoso", 1);

                    GregorianCalendar fechaActual = new GregorianCalendar();
                    Movimiento mov = new Movimiento(2, fechaActual, saldo, null, cuenta.getCodigo(), "9999", "005"); // Código de movimiento correspondiente a otro banco
                    mensaje = DALMovimiento.insertarMovimiento(mov);
                    if (mensaje == null) {
                        showMessageDialog(null, "Movimiento realizado de forma exitosa");
                    } else {
                        showMessageDialog(null, "Problemas en registrar el movimiento");
                    }
                } else {
                    showMessageDialog(null, "No se realizó el descuento, intente más tarde");
                }
            }
        } else {
            showMessageDialog(null, "La cuenta no existe o no está registrada.", "Error", 0);
        }
    }

        //OP 1  = OTRA CUENTA DE EUREKABANK
            ///1//   Buscamos q exista la cuenta A QN QUIERE DEPOSITAR
            ///2//   Extraemos esa cuenta y guardamos en objeto cuenta
            //condicional a 1
                //PEDIMOS CLAVE
                // HACEMOS EL DEPOSITO (AUMENTAMOS EL SALDO A LA NUEVA CUENTA)  //METODO DE DAL QUE TENGA EL QUERY
                // Mostramos MENSAJITO QUE SE HIZO EL MOVIMIENTO
                // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999
                // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
        //OP 2 = OTRA BANCO
               ////PEDIMOS CLAVE
               // HACEMOS EL DESCUENTO A LA CUENTA      //METODO DE DAL QUE TENGA EL QUERY DE DESCUENTO
               // Mostramos MENSAJITO QUE SE HIZO EL MOVIMIENTO A OTRO BANCO
               // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE-- REFERENCIA OTRO BANCO
               // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
    

    public void recargarSaldoPorEmpleado(String codCuenta, float saldo) {
        String codBuscado, clave, mensaje;
        int contIntentos = 1;
        float saldoNuevo;
        Cuenta cuenta;
        Cliente cliente = new Cliente();
        
        codBuscado = DALCuenta.buscarCuenta(codCuenta);
         if(codBuscado != null){
            cuenta = DALCuenta.obtenerCuenta(codBuscado);
            cliente = DALCliente.obtenerCliente(cuenta.getClieCodigo().getCodigo());
             clave = JOptionPane.showInputDialog(null, "Ingresa tu clave:   ", "CONFIRMAR MOVIMIENTO", 1);
        ///1//   Buscamos SU cuenta
        ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
        //condicional a 1
            ////PEDIMOS CLAVE
            // HACEMOS EL DEPOSITO A SU CUENTA MISMA (AUMENTAMOS EL SALDO)   //METODO DE DAL QUE TENGA EL QUERY
            // Mostramos MENSAJITO nuevo saldo
            // CREAMOS MOVIMIENTO CON DATOS DE 2, EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
            // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
    }
    }

    public void cancelarCuentaPorEmpleado(String codCuenta) {
      
        ///1//   Buscamos SU cuenta
        ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
        //condicional a 1
            ////PEDIMOS CLAVE 2 VECES
            // CAMBIAMOS DE ESTADO SU CUENTA   //METODO DE DAL QUE TENGA EL QUERY
            // Mostramos MENSAJITO TRISTE E INFORMATIVO
            // CREAMOS MOVIMIENTO CON DATOS DE 2, EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
            // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
    }

    public void reactivarCuentaPorEmpleado(String codCuenta) {
        ///1//   Buscamos SU cuenta
        ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
        //condicional a 1
            ////PEDIMOS CLAVE 2 VECES
            // CAMBIAMOS DE ESTADO SU CUENTA   //METODO DE DAL QUE TENGA EL QUERY
            // Mostramos MENSAJITO FELIZ E INFORMATIVO
            // CREAMOS MOVIMIENTO CON DATOS DE 2, EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
            // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
    }
    
}

