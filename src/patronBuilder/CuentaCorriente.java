
package patronBuilder;
import entidades.*;
import java.util.GregorianCalendar;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente() {
        this("NC", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "","","","","");
    }

    public CuentaCorriente(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave, String moneCodigo, String sucuCodigo, String emplCreaCuenta, String clieCodigo) {
        super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave);
    }

    
}
