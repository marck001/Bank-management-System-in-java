package patronBuilder;

import java.util.GregorianCalendar;

public class ConstructorCrearCuentaDebito extends ConstructorCrearCuenta {
  

    public ConstructorCrearCuentaDebito() {
        cuenta = new CuentaDebito();
    }

    @Override
    public void setCodigo(String codigo) {
        cuenta.setCodigo(codigo);
    }

    @Override
    public void setSaldo(float saldo) {
        cuenta.setSaldo(saldo);
    }

    @Override
    public void setFechaCreacion(GregorianCalendar fecha) {
        cuenta.setFechaCreacion(fecha);
    }

    @Override
    public void setEstado(String estado) {
        cuenta.setEstado(estado);
    }

    @Override
    public void setContMovimientos(int contMovimientos) {
        cuenta.setContMovimientos(contMovimientos);
    }

    @Override
    public void setClave(String clave) {
        cuenta.setClave(clave);
    }

    @Override
    public void setMoneCodigo(String moneCodigo) {
        cuenta.setMoneCodigo(moneCodigo);
    }

    @Override
    public void setSucuCodigo(String sucuCodigo) {
        cuenta.setSucuCodigo(sucuCodigo);
    }

    @Override
    public void setEmplCreaCuenta(String emplCreaCuenta) {
        cuenta.setEmplCreaCuenta(emplCreaCuenta);
    }

    @Override
    public void setClieCodigo(String clieCodigo) {
        cuenta.setClieCodigo(clieCodigo);
    }

    @Override
    public void setCuenTipo(String cuenTipo) {
      cuenta.setCuenTipo(cuenTipo);
    }
   

}
