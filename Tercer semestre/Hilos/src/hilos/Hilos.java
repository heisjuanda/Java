/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanDavid
 */
public class Hilos extends Thread {

    public Hilos(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("mensaje " + i + ": " + getName());
            
            try {
                int random = (int) (Math.random()*4000);
                sleep(random);//4 segundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
