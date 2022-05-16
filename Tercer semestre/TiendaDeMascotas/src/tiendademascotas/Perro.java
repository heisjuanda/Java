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
public class Perro extends Mascotas{
    
    private Raza raza;

    public Perro(Raza raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
        this.precio = 200000;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    
   
    
    
    
}
