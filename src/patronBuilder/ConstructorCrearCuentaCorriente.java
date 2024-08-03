
package patronBuilder;
import java.util.GregorianCalendar;

import entidades.*;


public class ConstructorCrearCuentaCorriente extends ConstructorCrearCuenta {

    public ConstructorCrearCuentaCorriente() {
       cuenta = new CuentaCorriente();
    }

    public void setCodigo(String codigo) {
        cuenta.setCodigo(codigo);
    }

    public void setSaldo(float saldo) {
        cuenta.setSaldo(saldo);
    }

    public void setFechaCreacion(GregorianCalendar fecha) {
        cuenta.setFechaCreacion(fecha);
    }
    
    public void setEstado(String estado) {
        cuenta.setEstado(estado);
    }

    public void setContMovimientos(int contMovimientos) {
        cuenta.setContMovimientos(contMovimientos);
    }

    public void setClave(String clave) {
        cuenta.setClave(clave);
    }

    public void setMoneCodigo(Moneda moneCodigo) {
        cuenta.setMoneCodigo(moneCodigo);
    }

    public void setSucuCodigo(Sucursal sucuCodigo) {
        cuenta.setSucuCodigo(sucuCodigo);
    }

    public void setEmplCreaCuenta(Empleado emplCreaCuenta) {
        cuenta.setEmplCreaCuenta(emplCreaCuenta);
    }

    public void setClieCodigo(Cliente clieCodigo) {
        cuenta.setClieCodigo(clieCodigo);
    }
}
