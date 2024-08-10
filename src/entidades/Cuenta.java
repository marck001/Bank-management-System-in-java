/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author User
 */
public abstract class Cuenta {
    private String codigo;
    private float saldo;
    private GregorianCalendar fechaCreacion;
    private String estado;
    private int contMovimientos;
    private String clave;
    private String moneCodigo;
    private String sucuCodigo;
    private String emplCreaCuenta;
    private String clieCodigo;
    private String cuenTipo;

    
    public Cuenta(){
        this("", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, ""); 
    }

    public Cuenta(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.contMovimientos = contMovimientos;
        this.clave = clave;
    }
    public Cuenta(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos, String clave, String moneCodigo, String sucuCodigo, String emplCreaCuenta, String clieCodigo) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.contMovimientos = contMovimientos;
        this.clave = clave;
        this.moneCodigo = moneCodigo;
        this.sucuCodigo = sucuCodigo;
        this.emplCreaCuenta = emplCreaCuenta;
        this.clieCodigo = clieCodigo;
    }
    public Cuenta(String codigo){
        this(codigo, 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "");        
    }
   
    

    public Cuenta(String codigo, float saldo, GregorianCalendar fechaCreacion, String estado, int contMovimientos,
            String clave, String moneCodigo, String sucuCodigo, String emplCreaCuenta, String clieCodigo,
            String cuenTipo) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.contMovimientos = contMovimientos;
        this.clave = clave;
        this.moneCodigo = moneCodigo;
        this.sucuCodigo = sucuCodigo;
        this.emplCreaCuenta = emplCreaCuenta;
        this.clieCodigo = clieCodigo;
        this.cuenTipo = cuenTipo;
    }

    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }
    
    public String getFechaCreacionCorta() {
        return getFechaCorta(getFechaCreacion());
    }
    
    private String getFechaCorta(GregorianCalendar fecha){
        int dia, mes , year;
        dia=fecha.get(Calendar.DAY_OF_MONTH);
        mes=fecha.get(Calendar.MONTH)+1;
        year=fecha.get(Calendar.YEAR);
        return year + "-" + (mes <= 9 ? "0" + mes : mes) + "-" + (dia <= 9 ? "0" + dia : dia);
    }

    public void setFechaCreacion(int dia, int mes, int año){
        fechaCreacion = new GregorianCalendar(año, -mes, dia);
    }
    

    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getContMovimientos() {
        return contMovimientos;
    }

    public void setContMovimientos(int contMovimientos) {
        this.contMovimientos = contMovimientos;
    }

    public String getMoneCodigo() {
        return moneCodigo;
    }

    public void setMoneCodigo(String moneCodigo) {
        this.moneCodigo = moneCodigo;
    }

    public String getSucuCodigo() {
        return sucuCodigo;
    }

    public void setSucuCodigo(String sucuCodigo) {
        this.sucuCodigo = sucuCodigo;
    }

    public String getEmplCreaCuenta() {
        return emplCreaCuenta;
    }

    public void setEmplCreaCuenta(String emplCreaCuenta) {
        this.emplCreaCuenta = emplCreaCuenta;
    }

    public String getClieCodigo() {
        return clieCodigo;
    }

    public void setClieCodigo(String clieCodigo) {
        this.clieCodigo = clieCodigo;
    }

    public String getCuenTipo() {
        return cuenTipo;
    }

    public void setCuenTipo(String cuenTipo) {
        this.cuenTipo = cuenTipo;
    }
}
