/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;

/**
 *
 * @author JuanDavid
 */
public class ProductorConsumidor {

    public static class PC {

        LinkedList<Integer> lista = new LinkedList<>();
        int capacidad = 2;

        public void producir() {
            int valor = 0;
            while (true) {
                synchronized (this) {

                    while (lista.size() == capacidad) {
                        try {
                            wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    System.out.println("Productor cocina" + valor);
                    lista.add(valor++);
                    notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }

        public void consumir() throws InterruptedException {

            while (true) {
                synchronized (this) {

                    while (lista.size() == 0) {
                        System.out.println("Consumidor esperando...");
                        wait();
                    }
                    int valor = lista.removeFirst();
                    System.out.println("Consumidor se comió la pizza" + valor);
                    notify();
                    Thread.sleep(1000);
                }
            }

        }

    }

    public static void main(String[] args) {

        PC pc1 = new PC();

        Thread hiloProductor = new Thread(new Runnable() {
            @Override
            public void run() {
                pc1.producir();
            }
        });
        
        Thread hiloConsumidor = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc1.consumir();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }

}
