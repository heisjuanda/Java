/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.Animal;
import herencia.Mamiferos;
import herencia.Perro;

/**
 *
 * @author JuanDavid
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal animal = new Animal(5,2,"colombia");
       /*animal.setEdad(5);
       animal.setNumeroPatas(2);
       animal.setZonaHabitad("colombia");*/
       Mamiferos mamiferos = new Mamiferos(10,2,"argelia",1,false);
        System.out.println(mamiferos.getEdad());
       Perro perro = new Perro(10,5,"brazil",1,false,"pata alzada","WOOF","cabeza hacia arriba");
        System.out.println(perro.getEdad());
        perro.caminar();
        perro.caminar(12);
       
    }
    
}
