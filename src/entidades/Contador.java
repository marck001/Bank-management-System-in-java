/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Manuel Arteaga
 */
public class Contador {
       private String contTabla;
    private int contItem;
    private int contLongitud;

    public Contador() {
        this("", 0, 0);
    }

    public Contador(String contTabla, int contItem, int contLongitud) {
        this.contTabla = contTabla;
        this.contItem = contItem;
        this.contLongitud = contLongitud;
    }

    public String getContTabla() {
        return contTabla;
    }

    public void setContTabla(String contTabla) {
        this.contTabla = contTabla;
    }

    public int getContItem() {
        return contItem;
    }

    public void setContItem(int contItem) {
        this.contItem = contItem;
    }

    public int getContLongitud() {
        return contLongitud;
    }

    public void setContLongitud(int contLongitud) {
        this.contLongitud = contLongitud;
    }
}
