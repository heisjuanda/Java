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
public class Alimento {
    
    private MarcaAlimento marca;
    private double precio;

    public Alimento(MarcaAlimento marca) {
        this.marca = marca;
        this.precio = 60000;
    }

    public MarcaAlimento getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(MarcaAlimento marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
