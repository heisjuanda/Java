/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui22;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JuanDavid
 */
public class ejemplo4 extends JFrame {

    Container contenedor;
    manejador manejador = new manejador();
    FlowLayout layout = new FlowLayout();

    public ejemplo4() {
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        layout.setAlignment(FlowLayout.CENTER);
        addKeyListener(manejador);
        
        JLabel etiqueta = new JLabel("hola");
        contenedor.add(etiqueta);
        
        JLabel etiqueta1 = new JLabel("hola2");
        contenedor.add(etiqueta);
        
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
       
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
        ejemplo3 e = new ejemplo3();

    }
}


