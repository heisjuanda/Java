/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomenu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Usuario
 */
public class JPanelVentana1 extends JPanel implements MouseListener {

    Ventana objV;
    String nombre, apellido, color, lenguaje;
    int edad; 

    public JPanelVentana1(Ventana v) {
        objV = v;
        setSize(600, 400);
        setLocation(45, 35);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.BLACK));
        addMouseListener(this);
        
        nombre = apellido = color = lenguaje = "";
        edad = 0;

        setVisible(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Font f = new Font("Tahoma", Font.BOLD, 25);
        g.setFont(f);
        g.drawString("Ventana 1", 220, 35);

        ingreso(50, 75, 300, 35, "Nombre:", g);
        g.setColor(Color.RED);
        g.drawString(nombre, 50 + 80, 75 + 22);
        
        ingreso(50, 120, 300, 35, "Apellido:", g);
        g.setColor(Color.RED);
        g.drawString(apellido, 50 + 80, 120 + 22);
        
        ingreso(50, 165, 300, 35, "Color:", g);
        g.setColor(Color.RED);
        g.drawString(color, 50 + 80, 165 + 22);
        
        ingreso(50, 210, 300, 35, "Edad:", g);
        g.setColor(Color.RED);
        g.drawString(edad + "", 50 + 80, 210 + 22);
        
        ingreso(50, 255, 300, 35, "Lenguaje:", g);
        g.setColor(Color.RED);
        g.drawString(lenguaje, 50 + 80, 255 + 22);
        
        boton(125, 320, 350, 50, "             Volver al menu principal", g);
    }

    public void ingreso(int x, int y, int ancho, int alto, String etiqueta, Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(x, y, ancho, alto);
        Font f = new Font("Arial", Font.PLAIN, 12);
        g.setFont(f);
        g.drawString(etiqueta, x + 10, y + 22);       
    }

    public void boton(int x, int y, int ancho, int alto, String texto, Graphics g) {
        g.setColor(Color.red);
        g.drawRect(x, y, ancho, alto);
        Font f = new Font("Arial", Font.BOLD, 18);
        g.setFont(f);
        g.drawString(texto, x + 10, y + 32);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        //50, 75, 300, 35, "Nombre"
        if (x >= 50 && x <= 350 && y >= 75 && y <= 110) {
            nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
            repaint();
        }
        
        //50, 120, 300, 35, "Apellido:"
        if (x >= 50 && x <= 350 && y >= 120 && y <= 155) {
            apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
            repaint();
        }
        
        //50, 165, 300, 35, "Color:"
        if (x >= 50 && x <= 350 && y >= 165 && y <= 200) {
            String colores[] = {"Blanco", "Negro", "Rojo", "Azul"};
            //          indices=   0         1       2       3 
            color = (String) JOptionPane.showInputDialog(null,
                    "Selecciona un color", //mensaje
                    "Selección",//titulo del cuadro
                    JOptionPane.QUESTION_MESSAGE,//icono
                    null,//icono personalizado
                    colores, //array con las opciones
                    colores[1]);//opción por defecto => Negro
                        
            repaint();
        }
        
        //50, 210, 300, 35, "Edad:"
        if (x >= 50 && x <= 350 && y >= 210 && y <= 245) {
            String tmp = JOptionPane.showInputDialog("Ingrese su edad: ");
            edad = Integer.parseInt(tmp);
            repaint();
        }
        
        //50, 255, 300, 35, "Lenguaje:"
        if (x >= 50 && x <= 350 && y >= 255 && y <= 290) {
            String lenguajes[] = {"C", "C++", "DrRacket", "Java"};
            //          indices=   0         1       2       3 
            int opc = JOptionPane.showOptionDialog (null, 
                    "Selecciona tu lenguaje favorito", //mensaje
                    "Selección",//titulo del cuadro
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, //icono
                    null,  //icono personalizado
                    lenguajes, //array con las opciones
                    lenguajes[3]);//opción por defecto => Java
            
            lenguaje = lenguajes[opc];
            
            repaint();
        }
        
        //125, 320, 350, 50 boton volver al menu principal
        if (x >= 125 && x <= 475 && y >= 320 && y <= 370) {
            setVisible(false);//ocultar el jpanel ventana 1
            objV.mp.setVisible(true);
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
