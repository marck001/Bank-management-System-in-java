/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author Felix
 */
public  class Sucursal {

    private String codigo;
    private String nombre;
    private String ciudad;
    private String direccion;
    private int contCuenta;
    private ArrayList<Asignado> asignado;
    
    public Sucursal(){
        this("000", "NO", "CI", "DI", 0);
    }
    
    public Sucursal(String codigo) {
        this.codigo = codigo;
    }
    
    public Sucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.contCuenta = contCuenta;
        asignado = new ArrayList<>();
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public int getContCuenta() {
        return contCuenta;
    }
    
    public ArrayList<Asignado> getAsignados() {
        return asignado;
    }
    
    public Asignado getAsignado(int pos) {
        return asignado.get(pos);
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setContCuenta(int contCuenta) {
        this.contCuenta = contCuenta;
    }
    
    public void setAsignados(ArrayList<Asignado> asignado) {
        this.asignado = asignado;
    }
    
    public void setAsignado(Asignado itemAsignado) {
        asignado.add(itemAsignado);
    }
    
    public class Asignado {
        private String codigo;
        private GregorianCalendar fechaAlta;
        private GregorianCalendar fechaBaja;
        private Empleado codigoEmpleado;
        private Sucursal codigoSucursal;

        public Asignado(){
            this("000000", new GregorianCalendar(2000, 0, 1), new GregorianCalendar(2000, 0, 1));
        }
    
        public Asignado(String codigo) {
            this.codigo = codigo;
        }
    
        public Asignado(String asigcodigo, GregorianCalendar fechaAlta, GregorianCalendar fechaBaja) {
            this.codigo = asigcodigo;
            this.fechaAlta = fechaAlta;
            this.fechaBaja = fechaBaja;
        }

        public String getCodigo() {
            return codigo;
        }
        
        public GregorianCalendar getFechaAlta() {
            return fechaAlta;
        }
        
        public String getFechaAltaCorta() {
            return getFechaCorta(getFechaAlta());
        }
        
        public GregorianCalendar getFechaBaja() {
            return fechaBaja;
        }
        
        public String getFechaBajaCorta() {
            return getFechaCorta(getFechaBaja());
        }
        
        public Empleado getCodigoEmpleado() {
            return codigoEmpleado;
        }
        
        public Sucursal getCodigoSucursal() {
            return codigoSucursal;
        }
        
        private String getFechaCorta(GregorianCalendar fecha) {
        int dia, mes, año;
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH)+1;
        año = fecha.get(Calendar.YEAR);
        return año + "-" + (mes<=9?"0"+mes:mes) + "-" + (dia<=9?"0"+dia:dia);
        }
        
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        
        public void setFechaAlta(GregorianCalendar fechaAlta) {
            this.fechaAlta = fechaAlta;
        }
        
        public void setFechaAlta(int dia, int mes, int año) {
            fechaAlta = new GregorianCalendar(año, --mes, dia);
        }
        
        public void setFechaBaja(GregorianCalendar fechaBaja) {
            this.fechaBaja = fechaBaja;
        }

        public void setFechaBaja(int dia, int mes, int año) {
            fechaBaja = new GregorianCalendar(año, --mes, dia);
        }
        
        public void setCodigoEmpleado(Empleado codigoEmpleado) {
            this.codigoEmpleado = codigoEmpleado;
        }
        
        public void setCodigoSucursal(Sucursal codigoSucursal) {
            this.codigoSucursal = codigoSucursal;
        }

        @Override
        public String toString() {
            return "Asignado{" + "codigo=" + codigo + ", fechaAlta=" + fechaAlta +
                   ", fechaBaja=" + fechaBaja + ", codigoEmpleado=" + codigoEmpleado +
                   ", codigoSucursal=" + codigoSucursal + '}';
        }   
    }

    @Override
    public String toString() {
        return "Sucursal{" + "codigo=" + codigo + ", nombre=" + nombre +
               ", ciudad=" + ciudad + ", direccion=" + direccion +
               ", contCuenta=" + contCuenta + ", asignado=" + asignado + '}';
    }
}
