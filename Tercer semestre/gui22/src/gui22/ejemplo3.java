/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui22;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author JuanDavid
 */
public class ejemplo3 extends JFrame {

    Container contenedor;
    manejador manejador = new manejador();
    manejador2 manejador2 = new manejador2();
    String figura = "";
    boolean tecla1 = false;
    int x = 0, y = 0, x1 = 0, y1 = 0;

    public ejemplo3() {
        contenedor = getContentPane();
        addKeyListener(manejador);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        if (figura.equals("cuadrado")) {
            int x = (int) (Math.random() * 550);
            int y = (int) (Math.random() * 550);
            int a = (int) (Math.random() * 25);
            int l = (int) (Math.random() * 25);
            g.fillRect(x, y, a, l);
        } else if (figura.equals("nada")) {
            int x = (int) (Math.random() * 550);
            int y = (int) (Math.random() * 550);
            int a = (int) (Math.random() * 25);
            int l = (int) (Math.random() * 25);
            g.drawLine(x, y, a, l);
        } else if (figura.equals("0")) {
            repaint();
            contenedor.setBackground(Color.WHITE);
            
        }
    }

    private class manejador2 extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent me) {
            x=me.getX();
            y=me.getY();
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {
            x1=me.getX();
            y1=me.getY();
            if(!figura.equals("")){
                repaint();
            }
            
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

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

            System.out.println("presiona");
            if (tecla1 && ke.getKeyCode() == KeyEvent.VK_C) {
                System.out.println("ingreso ctrl +c");
            }

            if (ke.getKeyCode() == KeyEvent.VK_CONTROL) {
                tecla1 = true;
                System.out.println("control");
            }

            if (ke.getKeyChar() == 'c') {
                figura = "cuadrado";
            } else if (ke.getKeyChar() == '1') {
                figura = "nada";
            } else {
                figura = "0";
                System.out.println(figura);
            }

            
            
            repaint();

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
