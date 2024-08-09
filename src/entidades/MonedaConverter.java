/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Imanol
 */
public class MonedaConverter {
    private String codigo;
    private String nombre;
    private float equivalenciaEnSoles;
  
    public MonedaConverter(String codigo, String nombre, float equivalenciaEnSoles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.equivalenciaEnSoles = equivalenciaEnSoles;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getEquivalenciaEnSoles() {
        return equivalenciaEnSoles;
    }
    //subete
}
