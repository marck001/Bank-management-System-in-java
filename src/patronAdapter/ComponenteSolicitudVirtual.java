/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronAdapter;

/**
 *
 * @author User
 */
public class ComponenteSolicitudVirtual {
    
    //Llamamos métodos de la capa LOGICA-->DATOS DE CUENTA
    
    public void retirarSaldoPorEmpleado(String codCuenta, float saldo) {
        ///1//   Buscamos q exista la cuenta
        ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
        //condicional a 1
            ////PEDIMOS CLAVE
            // HACEMOS EL RETIRO (DESCONTAMOS EL SALDO)   //METODO DE DAL QUE TENGA EL QUERY
            // Mostramos MENSAJITO nuevo saldo
            // CREAMOS MOVIMIENTO CON DATOS DE 2 Y EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
            // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
    }

    public void depositarSaldoPorEmpleado(String codCuenta, float saldo, int op) {
        
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
    }

    public void recargarSaldoPorEmpleado(String codCuenta, float saldo) {
        ///1//   Buscamos SU cuenta
        ///2//  Extraemos esa cuenta y guardamos en objeto cuenta
        //condicional a 1
            ////PEDIMOS CLAVE
            // HACEMOS EL DEPOSITO A SU CUENTA MISMA (AUMENTAMOS EL SALDO)   //METODO DE DAL QUE TENGA EL QUERY
            // Mostramos MENSAJITO nuevo saldo
            // CREAMOS MOVIMIENTO CON DATOS DE 2, EMPLEADO 9999 y COD DE MOV CORRESPONDIENTE
            // REGISTRAMOS EL MOVIMIENTO EN TABLA MOVIMIENTO
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
