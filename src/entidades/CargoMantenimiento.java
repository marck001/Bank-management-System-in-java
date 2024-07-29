/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author Gaby Zanabria
 */
public class CargoMantenimiento {
    private Moneda moneda;
    public float cargMontoMaximo;
    public float cargImporte;

    public CargoMantenimiento() {
        this(new Moneda(),0.0f,0.0f);
    }

    public CargoMantenimiento(Moneda moneda, float cargMontoMaximo, float cargImporte) {
        this.moneda = moneda;
        this.cargMontoMaximo = cargMontoMaximo;
        this.cargImporte = cargImporte;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public float getCargMontoMaximo() {
        return cargMontoMaximo;
    }

    public void setCargMontoMaximo(float cargMontoMaximo) {
        this.cargMontoMaximo = cargMontoMaximo;
    }

    public float getCargImporte() {
        return cargImporte;
    }

    public void setCargImporte(float cargImporte) {
        this.cargImporte = cargImporte;
    }
    
}