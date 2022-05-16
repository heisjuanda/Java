/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui22;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author JuanDavid
 */
public class reto1 extends JFrame {

    Container contenedor;
    manejador manejador = new manejador();
    int x = 0, y = 0, x1 = 0, y1 = 0;

    public reto1() {
        contenedor = getContentPane();
        addMouseListener(manejador);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class manejador implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            /* System.out.println("click");
            //System.out.println(me.getX() + "," + me.getY());
            if (me.isAltDown()) {
                System.out.println("1");
            } else if (me.isMetaDown()) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }*/
            x = me.getX();
            y = me.getY();

            repaint();

        }

        @Override
        public void mousePressed(MouseEvent me) {
            System.out.println("presionar");
            x = me.getX();
            y = me.getY();

        }

        @Override
        public void mouseReleased(MouseEvent me) {
            System.out.println("soltar");
            x1 = me.getX();
            y1 = me.getY();
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            System.out.println("entra");
            //contenedor.setBackground(Color.BLUE);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            System.out.println("sale");
            // contenedor.setBackground(Color.yellow);
        }

    }

    public static void main(String[] args) {
        reto1 g = new reto1();

    }

    //pintar cosas
    @Override
    public void paint(Graphics g) {

        if (y != 0 || y1 != 0) {
            int rojo = (int) (Math.random() * 250);
            int verde = (int) (Math.random() * 250);
            int azul = (int) (Math.random() * 250);
            Color color = new Color(rojo, verde, azul);
            g.setColor(color);
            int ancho = x1 - x;
            int alto = y1 - y;
            g.fillRect(x, y, ancho, alto);
        }
        /*g.setColor(Color.black);
        g.drawLine(0, 0, 250, 250);
        g.drawString("juan", 50, 50);
        g.drawRect(80, 81, 200, 200);
        // coordenada1, coord2,tamaño1,tamaño2
        g.drawOval(40, 40, 200, 200);
        g.fillRect(60, 60, 100, 50);
        g.fillOval(90, 90, 50, 60);*/

    }

}
