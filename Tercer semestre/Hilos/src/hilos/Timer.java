/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author JuanDavid
 */
public class Timer {
    
    public class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("entra");
        }
        
    }
    
    
    public static void main(String[] args) {
        Manejador  m = new Manejador();
        Timer t = new Timer(4000,m);
        t.start();
    }
}
