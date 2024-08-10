package patronBuilder;
import entidades.*;
import java.util.GregorianCalendar;

public class CuentaCredito extends Cuenta {
   private int puntos;
  

    public CuentaCredito() {
        this("NC", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "","","","","","",00000000000);
    }

    public CuentaCredito(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave, String moneCodigo,
     String sucuCodigo, String emplCreaCuenta, String clieCodigo, String cuentipo, int puntos) {
        super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave, moneCodigo, sucuCodigo,emplCreaCuenta,clieCodigo, cuentipo);
        this.puntos = puntos;
    }

    public CuentaCredito(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave, String moneCodigo,
    String sucuCodigo, String emplCreaCuenta, String clieCodigo, String cuentipo) {
       super(codigo, saldo, fechaCreacion, estado, contMovimientos, clave, moneCodigo, sucuCodigo,emplCreaCuenta,clieCodigo, cuentipo);
       
   }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
   
    //String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos,
    //String clave, String moneCodigo, String sucuCodigo, String emplCreaCuenta, String clieCodigo,
    //String cuenTipo


}