/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraclase;

import javax.swing.JOptionPane;
import primeraclase.Modelo.Perro;

/**
 *
 * @author JuanDavid
 */
public class principal2 {
    public static void main(String[] args) {
        Perro perro = new Perro("nombre","raza",1);
        Perro.ladrar();
        perro=null;
        System.gc();//garbage collector
        System.out.println(Perro.TIENECOLA);
        
    }
            
}
