/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author JuanDavid
 */
public class Hilo2 {

    public static void main(String[] args) {
        Hilos hilo1 = new Hilos("Juan");
        Hilos hilo2 = new Hilos("David");

        hilo1.start();
        hilo2.start();
    }
}
