
package patronBuilder;

import entidades.*;
import java.util.GregorianCalendar;

public class CuentaDebito extends Cuenta {
    private int numTarjeta;

    public CuentaDebito() {
        this("NC", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "", "", "", "", "", " ", 00000000000000);
    }

    public CuentaDebito(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos,
            String clave, String moneCodigo, String sucuCodigo, String emplCreaCuenta, String clieCodigo,
            String cuenTipo, int numTarjeta) {
        super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave);
        this.numTarjeta = numTarjeta;

    }

    public CuentaDebito(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos,
            String clave, String moneCodigo, String sucuCodigo, String emplCreaCuenta, String clieCodigo,
            String cuenTipo) {
        super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave, moneCodigo, sucuCodigo, emplCreaCuenta,
                clieCodigo, cuenTipo);

    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

}
