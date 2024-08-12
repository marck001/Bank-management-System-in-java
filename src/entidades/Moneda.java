/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Gaby
 */
public class Moneda implements Comparable<Moneda> {
    private String codigo;
    private String descripcion;

    public Moneda() {
        this("00", "ND");
    }
    public Moneda(String codigo) {
        this(codigo, "ND");
    }

    public Moneda(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public int compareTo(Moneda moneda) {
        return this.getCodigo().compareTo(moneda.getCodigo());
    }    
}