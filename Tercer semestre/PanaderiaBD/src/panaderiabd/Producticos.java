/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderiabd;

/**
 *
 * @author JuanDavid
 */
public class Producticos {
    int precio,cantidad;
    String nombre,id,descripcion;

    public Producticos(int precio, int cantidad, String nombre, String id, String descripcion) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
