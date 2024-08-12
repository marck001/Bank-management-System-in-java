/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import datos.DALCuenta;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import patronBuilder.CuentaCredito;

/**
 * Esta clase realiza pruebas unitarias para la clase DALCuenta utilizando JUnit y Mockito.
 * Se simulan las interacciones con la base de datos a través de conexiones, llamadas y 
 * resultados simulados.
 */
public class DALCuentaTest {

    @Mock
    private Connection mockConnection; // Mock de la conexión a la base de datos
    @Mock
    private CallableStatement mockCallableStatement; // Mock de la sentencia SQL Callable
    @Mock
    private ResultSet mockResultSet; // Mock del conjunto de resultados

    /**
     * Configura los mocks antes de cada prueba.
     * @throws SQLException si ocurre un error en la simulación de la conexión a la base de datos.
     */
    @BeforeEach
    public void setUp() throws SQLException {
        MockitoAnnotations.openMocks(this);
        when(mockConnection.prepareCall(anyString())).thenReturn(mockCallableStatement);
    }

    /**
     * Prueba el método insertarCuentaCredito para verificar que la inserción sea exitosa
     * cuando se proporciona una cuenta válida.
     * @throws SQLException si ocurre un error en la simulación de la conexión a la base de datos.
     */
    @Test
    public void testInsertarCuentaCredito() throws SQLException {
        CuentaCredito cuentaCredito = new CuentaCredito("00200009", 1000.0f, new GregorianCalendar(), "ACTIVO", 10, "123456", "01", "002", "0001", "00001", "DEBITO");
        
        when(mockCallableStatement.executeUpdate()).thenReturn(1);

        String result = DALCuenta.insertarCuentaCredito(cuentaCredito);

        assertNull(result, "Debe ser null");
        verify(mockCallableStatement, times(2)).executeUpdate();
    }

    /**
     * Prueba el método buscarCuenta para verificar que se devuelve el código de cuenta correcto
     * cuando se busca una cuenta existente.
     * @throws SQLException si ocurre un error en la simulación de la conexión a la base de datos.
     */
    @Test
    public void testBuscarCuenta() throws SQLException {
        String codigo = "00200009";
        String expectedResult = "cuenCodigo";
        
        when(mockCallableStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getString("cuencodigo")).thenReturn(expectedResult);

        String result = DALCuenta.buscarCuenta(codigo);

        assertEquals(expectedResult, result, "El resultado debe ser igual al result set");
    }

    /**
     * Prueba el método obtenerSaldo para verificar que se devuelve el saldo correcto
     * cuando se consulta el saldo de una cuenta existente.
     * @throws SQLException si ocurre un error en la simulación de la conexión a la base de datos.
     */
    @Test
    public void testObtenerSaldo() throws SQLException {
        String codigo = "00200009";
        String expectedSaldo = "1000.0";

        when(mockCallableStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getString("cuensaldo")).thenReturn(expectedSaldo);

        String result = DALCuenta.obtenerSaldo(codigo);

        assertEquals(expectedSaldo, result, "Debe ser igual al resultado");
    }

    /**
     * Prueba el manejo de SQLException en el método insertarCuentaCredito para
     * verificar que el error se maneja correctamente y se devuelve un mensaje apropiado.
     * @throws SQLException si ocurre un error en la simulación de la conexión a la base de datos.
     */
    @Test
    public void testHandleSQLException() throws SQLException {
        when(mockCallableStatement.executeUpdate()).thenThrow(new SQLException("Database error"));

        CuentaCredito cuentaCredito = new CuentaCredito("00200009", 1000.0f, new GregorianCalendar(), "ACTIVO", 10, "123456", "01", "002", "0001", "00001", "DEBITO");

        String result = DALCuenta.insertarCuentaCredito(cuentaCredito);

        assertNotNull(result, "El resultado no debe ser null");
        assertTrue(result.contains("Database error"), "SQLException message");
    }
}
