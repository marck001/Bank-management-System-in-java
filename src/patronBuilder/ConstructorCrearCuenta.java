package patronBuilder;

import entidades.*;
import java.util.GregorianCalendar;

public abstract class ConstructorCrearCuenta{

    protected Cuenta cuenta;

    public abstract void setCodigo(String codigo);
    public abstract void setSaldo(float saldo);
    public abstract void setFechaCreacion(GregorianCalendar fecha);
    public abstract void setEstado(String estado);
    public abstract void setContMovimientos(int contMovimientos);
    public abstract void setClave(String clave);
    public abstract void setMoneCodigo(String moneCodigo);
    public abstract void setSucuCodigo(String sucuCodigo);
    public abstract void setEmplCreaCuenta(String emplCreaCuenta);
    public abstract void setClieCodigo(String clieCodigo);
    public abstract void setCuenTipo(String cuenTipo);

    public Cuenta getCuenta() {
        return cuenta;
    }

}
