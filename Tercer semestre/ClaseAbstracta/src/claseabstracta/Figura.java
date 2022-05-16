/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author JuanDavid
 */
public abstract class Figura {
    
    String nombre="";
    double area=0;
    
    public static void main(String[] args) {
        
    }
    
    public abstract double getArea();
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
