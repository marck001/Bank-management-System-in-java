package test;

import logica.BLEmpleado;
import entidades.Empleado;
import java.util.ArrayList;

public class BLEmpleadoTest {
    public static void main(String[] args) {
        // Prueba de inserción
        System.out.println("Prueba de inserción:");
        int resultadoInsercion = BLEmpleado.insertarEmpleado(
            "1234", "Gómez", "Pérez", "Juan", "Madrid", "Calle Falsa 123", "juan", "clave1234"
        );
        System.out.println("Resultado de la inserción: " + resultadoInsercion);

        // Prueba de búsqueda
        System.out.println("\nPrueba de búsqueda:");
        String empleadoEncontrado = BLEmpleado.buscarEmpleado("1234");
        System.out.println("Empleado encontrado: " + empleadoEncontrado);

        // Prueba de actualización
        System.out.println("\nPrueba de actualización:");
        String resultadoActualizacion = BLEmpleado.actualizarEmpleado(
            "1234", "Gómez", "Pérez", "Juan", "Barcelona", "Calle Nueva 456", "juan", "clave5678"
        );
        System.out.println("Resultado de la actualización: " + resultadoActualizacion);

        // Prueba de listado
        System.out.println("\nPrueba de listado:");
        ArrayList<Empleado> empleados = BLEmpleado.listarEmpleados();
        System.out.println("Número de empleados listados: " + empleados.size());

        // Prueba de obtención de empleado
        System.out.println("\nPrueba de obtención de empleado:");
        Empleado empleado = BLEmpleado.obtenerEmpleado("1234");
        System.out.println("Empleado obtenido: " + (empleado != null ? empleado.toString() : "No encontrado"));

        // Prueba de búsqueda por login
        System.out.println("\nPrueba de búsqueda por login:");
        String empleadoLogin = BLEmpleado.buscarEmpleadoLogin("juan", "clave5678");
        System.out.println("Empleado encontrado por login: " + empleadoLogin);
    }
}