package entidades;

public abstract class ConstructorCrearCuenta{

    protected Cuenta cuenta;

    public abstract void movimientoCuenta(float movimiento, float saldo, int contador);
    public abstract void retiroCuenta(float retiro,float saldo);
    public abstract void depositoCuenta(float deposito, float saldo);

    public Cuenta resultado() {
        return cuenta;
    }
}
