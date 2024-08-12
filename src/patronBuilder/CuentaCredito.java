package patronBuilder;
import entidades.*;
import java.util.GregorianCalendar;

public class CuentaCredito extends Cuenta {
   private float puntos;
  

    public CuentaCredito() {
        this("NC", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "","","","","","",00000000000);
    }

    public CuentaCredito(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave, String moneCodigo,
     String sucuCodigo, String emplCreaCuenta, String clieCodigo, String cuentipo, float puntos) {
        super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave, moneCodigo, sucuCodigo,emplCreaCuenta,clieCodigo, cuentipo);
        this.puntos = puntos;
    }

    public CuentaCredito(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave, String moneCodigo,
    String sucuCodigo, String emplCreaCuenta, String clieCodigo, String cuentipo) {
       super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave, moneCodigo, sucuCodigo,emplCreaCuenta,clieCodigo, cuentipo);
       
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

}