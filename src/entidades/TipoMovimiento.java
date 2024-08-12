/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Manuel Arteaga
 */
public class TipoMovimiento {
    private String tipoCodigo;
    private String tipoDescripcion;
    private String tipoAccion;
    private String tipoEstado;

    public TipoMovimiento() {
        this("", "", "", "");
    }

    public TipoMovimiento(String tipoCodigo, String tipoDescripcion, String tipoAccion, String tipoEstado) {
        this.tipoCodigo = tipoCodigo;
        this.tipoDescripcion = tipoDescripcion;
        this.tipoAccion = tipoAccion;
        this.tipoEstado = tipoEstado;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    public String getTipoDescripcion() {
        return tipoDescripcion;
    }

    public void setTipoDescripcion(String tipoDescripcion) {
        this.tipoDescripcion = tipoDescripcion;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }
}
