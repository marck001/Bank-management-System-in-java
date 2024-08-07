package patronBuilder;
import entidades.*;
import java.util.GregorianCalendar;

public class CuentaAhorro extends Cuenta {
    
   public CuentaAhorro() {
        this("NC", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "");
    }

    public CuentaAhorro(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave) {
        super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave);
    }

}