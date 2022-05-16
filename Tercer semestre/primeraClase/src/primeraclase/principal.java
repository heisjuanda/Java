/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraclase;

import primeraclase.Modelo.Perro;



/**
 *
 * @author JuanDavid
 */
public class principal {
    public static void main (String args []){
        //int conta=0;
        Perro pepe = new Perro("pipe","criollo",4);
       // conta++;
        pepe.setName("pipe");
        pepe.getName();
        Perro pipe = new Perro ("pipe","criollo",5);
        //conta++;
        pipe.getRaza();
        //System.out.println("se han creado "+conta);
         Perro manchis = new Perro("manchis","criollo",4);
         System.out.println(Perro.contador);
    }
}
