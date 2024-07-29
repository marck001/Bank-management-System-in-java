/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Gaby Zanabria
 */
public class CostoMovimiento {
    private Moneda moneda;
    private float costImporte;

    public CostoMovimiento() {
        this(new Moneda(),0.0f);
    }

    public CostoMovimiento(Moneda moneda, float costImporte) {
        this.moneda = moneda;
        this.costImporte = costImporte;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public float getCostImporte() {
        return costImporte;
    }

    public void setCostImporte(float costImporte) {
        this.costImporte = costImporte;
    }
    
    
}
