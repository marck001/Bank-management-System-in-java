package entidades;
import static javax.swing.JOptionPane.showMessageDialog;


public class ConstructorCrearCuentaAhorro extends ConstructorCrearCuenta {

    public ConstructorCrearCuentaAhorro() {
        cuenta = new CuentaAhorro();
    }
    
    @Override
    public void movimientoCuenta(float movimiento, float saldo, int contador) {
        float nuevoSaldo=0.0f;
        if(contador>15){
            nuevoSaldo=saldo-movimiento;
            showMessageDialog(null, "Su cuenta a excedido la cantidad de movimiento se le esta descontando: "+ movimiento+"su actual saldo es: "+ nuevoSaldo,
             "Movimiento", 1);
        } 
    }

    @Override
    public void retiroCuenta(float retiro, float saldo) {
        float montoResultado=0.0f;
        String mensaje;
        if(saldo>=retiro){
        montoResultado=saldo-retiro;
        mensaje="En su cuenta tiene "+montoResultado;
        showMessageDialog(null, mensaje, "Retiro", 1);
        }else{
        mensaje="La cantidad introducida sobrepasa al saldo de la cuenta";
         showMessageDialog(null, mensaje, "Retiro", 1);
        }
    }

    @Override
    public void depositoCuenta(float deposito, float saldo) {
        float montoResultado=0.0f;
        String mensaje;
        montoResultado=saldo+deposito;
        mensaje="En su cuenta tiene "+montoResultado;
        showMessageDialog(null, mensaje, "Deposito", 1);
    }
}
   