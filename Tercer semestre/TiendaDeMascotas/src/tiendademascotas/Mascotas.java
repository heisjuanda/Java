/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendademascotas;

import java.util.Scanner;

/**
 *
 * @author JuanDavid
 */
public class Mascotas {
    
    protected String nombre;
    protected int edad;
    protected double precio;

    public Mascotas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*public double comprar(){
       if(edad>=0 && edad<1){
           precio=20000/edad;
       }else if(edad>=1 && edad<5){
           precio=20000/5;
       }else if(edad<=5 && edad>15){
           precio=20000/10;
       }
        return precio;
    }*/
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
    
    
}
