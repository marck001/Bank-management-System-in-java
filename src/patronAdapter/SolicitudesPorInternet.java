/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patronAdapter;

/**
 *
 * @author User
 */
public interface SolicitudesPorInternet {
    public void retirarSaldo(String codCuenta, float saldo);
    public void depositarSaldo(String codCuenta, float saldo, int opcion);
    public void recargarSaldo(String codCuenta, float saldo);
    public void cancelarCuenta(String codCuenta);
    public void reactivarCuenta(String codCuenta);
}
