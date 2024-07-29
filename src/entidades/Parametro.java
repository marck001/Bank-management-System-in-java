/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Manuel Arteaga
 */
public class Parametro {
        private String paraCodigo;
    private String paraDescripcion;
    private String paraValor;
    private String paraEstado;

    public Parametro() {
        this("", "", "", "");
    }

    public Parametro(String paraCodigo, String paraDescripcion, String paraValor, String paraEstado) {
        this.paraCodigo = paraCodigo;
        this.paraDescripcion = paraDescripcion;
        this.paraValor = paraValor;
        this.paraEstado = paraEstado;
    }

    public String getParaCodigo() {
        return paraCodigo;
    }

    public void setParaCodigo(String paraCodigo) {
        this.paraCodigo = paraCodigo;
    }

    public String getParaDescripcion() {
        return paraDescripcion;
    }

    public void setParaDescripcion(String paraDescripcion) {
        this.paraDescripcion = paraDescripcion;
    }

    public String getParaValor() {
        return paraValor;
    }

    public void setParaValor(String paraValor) {
        this.paraValor = paraValor;
    }

    public String getParaEstado() {
        return paraEstado;
    }

    public void setParaEstado(String paraEstado) {
        this.paraEstado = paraEstado;
    }
}
