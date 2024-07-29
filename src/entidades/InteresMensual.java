/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Gaby Zanabria
 */
public class InteresMensual {
    private Moneda moneda;
    private float inteImporte;

    public InteresMensual() {
        this(new Moneda(),0.0f);
    }

    public InteresMensual(Moneda moneda, float inteImporte) {
        this.moneda = moneda;
        this.inteImporte = inteImporte;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public float getInteImporte() {
        return inteImporte;
    }

    public void setInteImporte(float inteImporte) {
        this.inteImporte = inteImporte;
    }
    
}