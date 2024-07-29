package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Celeste
 */
public class Movimiento implements Comparable<Movimiento> {
    private String codigo;
    private int numero;
    private GregorianCalendar fecha;
    private float importe;
    private String referencia;
    private Empleado empleado;
    private TipoMovimiento tipoMovimiento; 
    private Cuenta cuenta;

    public Movimiento() {
        this("", 0, new GregorianCalendar(2000, 0, 1), 0.0f, "", null, new TipoMovimiento(), null);
    }

    public Movimiento(String codigo, int numero, GregorianCalendar fecha, float importe, String referencia,
                      Empleado empleado, TipoMovimiento tipoMovimiento, Cuenta cuenta) {
        this.codigo = codigo;
        this.numero = numero;
        this.fecha = fecha;
        this.importe = importe;
        this.referencia = referencia;
        this.empleado = empleado;
        this.tipoMovimiento = tipoMovimiento;
        this.cuenta = cuenta;
    }

    public Movimiento(String codigo) {
        this(codigo, 0, new GregorianCalendar(2000, 0, 1), 0.0f, "", null, new TipoMovimiento(), null);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public GregorianCalendar getFechaCreacion() {
        return fecha;
    }

    public String getFechaCreacionCorta() {
        return getFecha(fecha);
    }

    private String getFecha(GregorianCalendar fecha) {
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int año = fecha.get(Calendar.YEAR);
        return (dia <= 9 ? "0" + dia : dia) + "/" + (mes <= 9 ? "0" + mes : mes) + "/" + año;
    }

    public void setFechaCreacion(int dia, int mes, int año) {
        fecha = new GregorianCalendar(año, mes - 1, dia);
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int compareTo(Movimiento movimiento) {
        return this.getCodigo().compareTo(movimiento.getCodigo());
    }
}