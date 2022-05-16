/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendademascotas;

/**
 *
 * @author JuanDavid
 */
public class Habitad {
    
    private double precio;
    private int tamaño;

    public Habitad(int tamaño) {
        this.precio = 30000;
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
