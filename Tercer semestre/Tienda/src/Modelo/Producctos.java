/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JuanDavid
 */
public class Producctos {
    String nombre;
    int precioUds;
    String categria;

    public Producctos(String nombre, int precioUds, String categria) {
        this.nombre = nombre;
        this.precioUds = precioUds;
        this.categria = categria;
    }
    
    public Producctos() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioUds() {
        return precioUds;
    }

    public String getCategria() {
        return categria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioUds(int precioUds) {
        this.precioUds = precioUds;
    }

    public void setCategria(String categria) {
        this.categria = categria;
    }
    
    
}
