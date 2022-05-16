/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.exceptions;

/**
 *
 * @author JuanDavid
 */
public class Comidas {

    String descripcion, nombre;//, tipo;
    double costo;
    int tiempoPreparacionEnMinutos;
    static int cantidad;
    TipoPlato tipo;

    public Comidas(String descripcion, String nombre, TipoPlato tipo, double costo, int tiempoPreparacionEnMinutos) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.tiempoPreparacionEnMinutos = tiempoPreparacionEnMinutos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public int getTiempoPreparacionEnMinutos() {
        return tiempoPreparacionEnMinutos;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setTiempoPreparacionEnMinutos(int tiempoPreparacionEnMinutos) {
        this.tiempoPreparacionEnMinutos = tiempoPreparacionEnMinutos;
    }

    public static void setCantidad(int cantidad) {
        Comidas.cantidad = cantidad;
    }

}
