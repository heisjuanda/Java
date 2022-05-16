/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui22;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JuanDavid
 */
public class ejemplo5 extends JFrame {

    Container contenedor;
    manejador manejador = new manejador();
    BorderLayout layout = new BorderLayout(20,20);

    public ejemplo5() {
        contenedor = getContentPane();
        contenedor.setLayout(layout);
        
        JLabel etiqueta = new JLabel("hola");
        contenedor.add(etiqueta);
        
        JLabel etiqueta1 = new JLabel("hola2");
        contenedor.add(etiqueta,BorderLayout.SOUTH);
        
        JButton boton1 = new JButton("sisis");
        contenedor.add(boton1,BorderLayout.EAST);
        
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


   

    private class manejador extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent ke) {
            System.out.println("tipea");
            //cual tecla es?
            char tecla = ke.getKeyChar();
            System.out.println(tecla);
        }

        @Override
        public void keyPressed(KeyEvent ke) {


        }

        @Override
        public void keyReleased(KeyEvent ke) {
            System.out.println("suelta");
        }

    }

    public static void main(String[] args) {
        ejemplo5 e = new ejemplo5();

    }
}



