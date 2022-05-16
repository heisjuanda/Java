/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

/**
 *
 * @author JuanDavid
 */
public class Porducto {

    double costo;
    String nombre;
    boolean dulce;
    boolean salado;
    boolean frio;
    boolean caliente;
    boolean energizante;


    public Porducto(double costo, String nombre, boolean dulce, boolean salado, boolean frio, boolean caliente, boolean energizante) {
        this.costo = costo;
        this.nombre = nombre;
        this.dulce = dulce;
        this.salado = salado;
        this.frio = frio;
        this.caliente = caliente;
        this.energizante = energizante;
    }



    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setDulce(boolean dulce) {
        this.dulce = dulce;
    }

    public void setSalado(boolean salado) {
        this.salado = salado;
    }

    public void setFrio(boolean frio) {
        this.frio = frio;
    }

    public void setCaliente(boolean caliente) {
        this.caliente = caliente;
    }

    public void setEnergizante(boolean energizante) {
        this.energizante = energizante;
    }

    public double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDulce() {
        return dulce;
    }

    public boolean isSalado() {
        return salado;
    }

    public boolean isFrio() {
        return frio;
    }

    public boolean isCaliente() {
        return caliente;
    }

    public boolean isEnergizante() {
        return energizante;
    }

}
