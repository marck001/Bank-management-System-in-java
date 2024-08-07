package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Celeste
 */
public class Movimiento implements Comparable<Movimiento> {
    
    private int numero;
    private GregorianCalendar fechaMov;
    private float importe;
    private String referencia; //referencia de la cuenta
    private String cuenCodigo;  // POR EJEM AKI, SOLO ES UN STRING codCuenta
    private String empCodigo; //codigo empleado   IGUAL AKI
    private String tipoMovimiento;  //dejalo ahi, solo pasamos una referencia, has undo
    
    public Movimiento() {
        this(0, new GregorianCalendar(2000, 0, 1), 0.0f, "");
    }

    public Movimiento(int numero, GregorianCalendar fechaMov, float importe, String referencia) {   //onde meto el codEmpleado?
        this.numero = numero;
        this.fechaMov = fechaMov;
        this.importe = importe;
        this.referencia = referencia;
        
    }

    public Movimiento(int numero, GregorianCalendar fechaMov, float importe, String referencia, 
        String cuenCodigo, String empCodigo, String tipoMovimiento){

        this.numero = numero;
        this.fechaMov = fechaMov;
        this.importe = importe;
        this.referencia = referencia;
        this.cuenCodigo = cuenCodigo;
        this.empCodigo = empCodigo;
        this.tipoMovimiento = tipoMovimiento;
    }

    public Movimiento(Cuenta codigo) {
        this(0, new GregorianCalendar(2000, 0, 1), 0.0f, "");
    }

    public String getCuenCodigo() {
        return cuenCodigo;
    }

    public void setCuenCodigo(String cuenCodigo) {
        this.cuenCodigo = cuenCodigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public GregorianCalendar getFechaMov() {
        return fechaMov;
    }

    public String getFechaMovCorta() {
        return getFechaCorta(getFechaMov());
    }

    private String getFechaCorta(GregorianCalendar fecha) {
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int año = fecha.get(Calendar.YEAR);
        return (dia <= 9 ? "0" + dia : dia) + "/" + (mes <= 9 ? "0" + mes : mes) + "/" + año;
    }

    public void setFechaMov(int dia, int mes, int año) {
        fechaMov = new GregorianCalendar(año, mes - 1, dia);
    }

    public void setFechaMov(GregorianCalendar fechaMov) {
        this.fechaMov = fechaMov;
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

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpleado(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    
    @Override
    public int compareTo(Movimiento movimiento) {
        return this.getCuenCodigo().compareTo(movimiento.getCuenCodigo());
    }
}