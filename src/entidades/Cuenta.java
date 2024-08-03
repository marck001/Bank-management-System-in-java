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
    private Moneda moneCodigo;
    private Sucursal sucuCodigo;
    private Empleado emplCreaCuenta;
    private Cliente clieCodigo;
    
/* 
    public Cuenta() {
        this("", 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "");
    }

    */
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

    public Cuenta(String codigo, Empleado empleado, Cliente cliente, Moneda moneda, Sucursal sucursal, float saldo, GregorianCalendar fechaCreacion, String estado, int contMov, String clave) {
        this.codigo = codigo;
        this.emplCreaCuenta = empleado;
        this.clieCodigo = cliente;
        this.moneCodigo= moneda;
        this.sucuCodigo = sucursal;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.contMovimientos= contMov;
        this.clave = clave;
    }
    
    public Cuenta(String codigo){
        this(codigo, 0.0f, new GregorianCalendar(2000, 0, 1), "", 0, "");        
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
        int dia, mes , año;
        dia=fecha.get(Calendar.DAY_OF_MONTH);
        mes=fecha.get(Calendar.MONTH)+1;
        año=fecha.get(Calendar.YEAR);
        return (dia<=9? "0"+dia:dia)+ "/" + (mes<=9? "0"+mes:mes) + "/" + año;
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

    public Moneda getMoneCodigo() {
        return moneCodigo;
    }

    public void setMoneCodigo(Moneda moneCodigo) {
        this.moneCodigo = moneCodigo;
    }

    public Sucursal getSucuCodigo() {
        return sucuCodigo;
    }

    public void setSucuCodigo(Sucursal sucuCodigo) {
        this.sucuCodigo = sucuCodigo;
    }

    public Empleado getEmplCreaCuenta() {
        return emplCreaCuenta;
    }

    public void setEmplCreaCuenta(Empleado emplCreaCuenta) {
        this.emplCreaCuenta = emplCreaCuenta;
    }

    public Cliente getClieCodigo() {
        return clieCodigo;
    }

    public void setClieCodigo(Cliente clieCodigo) {
        this.clieCodigo = clieCodigo;
    }

    int compareTo(Cuenta codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int compareToIgnoreCase(Cuenta codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
