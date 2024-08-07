/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronAdapter;

/**
 *
 * @author User
 */
public class SolicitudesPorInternetDetalladas implements SolicitudesPorInternet {
    ComponenteSolicitudVirtual solicitudCliente  = new ComponenteSolicitudVirtual();
    @Override
    public void retirarSaldo(String codCuenta, float saldo) {
        solicitudCliente.retirarSaldoPorEmpleado(codCuenta, saldo);
    }

    @Override
    public void depositarSaldo(String codCuenta, float saldo, int opcion) {
        solicitudCliente.depositarSaldoPorEmpleado(codCuenta, saldo, opcion);
    }

    @Override
    public void recargarSaldo(String codCuenta, float saldo) {
        solicitudCliente.recargarSaldoPorEmpleado(codCuenta, saldo);
    }

    @Override
    public void cancelarCuenta(String codCuenta) {
        solicitudCliente.cancelarCuentaPorEmpleado(codCuenta);
    }

    @Override
    public void reactivarCuenta(String codCuenta) {
        solicitudCliente.reactivarCuentaPorEmpleado(codCuenta);
    }
    
}
