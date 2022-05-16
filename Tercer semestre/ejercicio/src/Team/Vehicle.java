/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team;

/**
 *
 * @author JuanDavid
 */
public class Vehicle {

    protected double precio;
    protected String nombre;
    protected static int cantidad;

    public Vehicle() {
        this.precio = 0;
        this.nombre = "";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
