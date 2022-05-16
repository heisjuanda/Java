/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JuanDavid
 */
public class Productos {

    String nombre;
    String id;
    double precio;
    String tipoDeporte;

    public Productos(String nombre, String id, double precio, String tipoDeporte) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.tipoDeporte = tipoDeporte;
    }

    public Productos() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

}
