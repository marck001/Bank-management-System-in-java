/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author alexis
 */
public class Empleado {
    private String codigo;
    private String apePaterno;
    private String apeMaterno;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String user;
    private String clave;
    protected ConstructorCrearCuenta constructor;

    public Empleado(String codigo, String apePaterno, String apeMaterno, String nombre,
            String ciudad, String direccion, String user, String clave) {
        this.codigo = codigo;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.user = user;
        this.clave = clave;
    }

    public Empleado(String codigo, String apePaterno, String apeMaterno, String nombre,
            String ciudad, String direccion, String user, String clave, ConstructorCrearCuenta constructor) {
        this.codigo = codigo;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.user = user;
        this.clave = clave;
        this.constructor = constructor;
    }

    public Cuenta construye(float movimiento, float saldo, float deposito, float retiro, int contador) {
        constructor.movimientoCuenta(movimiento, saldo, contador);
        constructor.retiroCuenta(retiro, saldo);
        constructor.depositoCuenta(deposito, saldo);
        Cuenta cuenta = constructor.resultado();
        return cuenta;
    }

    public Empleado(String codigo) {
        this.codigo = codigo;
    }

    public Empleado() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Empleado [getCodigo()=" + getCodigo() + ", getApePaterno()=" + getApePaterno() + ", getApeMaterno()="
                + getApeMaterno() + ", getNombre()=" + getNombre() + ", getCiudad()=" + getCiudad()
                + ", getDireccion()=" + getDireccion() + ", getUser()=" + getUser() + ", getClave()=" + getClave()
                + "]";
    }

}
