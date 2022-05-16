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
public class MenuPrincipal extends JPanel implements MouseListener{

    Ventana objV;
    
    public MenuPrincipal(Ventana v){
        objV = v;
        setSize(600, 400);
        setLocation(45, 35);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.BLACK));
        addMouseListener(this);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Font f = new Font("Tahoma", Font.BOLD, 25);
        g.setFont(f);
        g.drawString("Menu principal", 200, 35);
        //(600-350)/2 => 125
        boton(125, 75, 350, 50, "                        Ventana 1", g);
        boton(125, 135, 350, 50, "                 Salir de la aplicación", g);
    }
    
    public void boton(int x, int y, int ancho, int alto, String texto, Graphics g){
        g.setColor(Color.red);
        g.drawRect(x, y, ancho, alto);
        Font f = new Font("Arial", Font.BOLD, 18);
        g.setFont(f);
        g.drawString(texto, x+10, y+32);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        
        //125, 75, 350, 50 boton de Ventana 1
        if(x >= 125 && x <= 475 && y >= 75 && y <= 125){
            setVisible(false);//ocultar el panel del menu principal
            objV.v1.setVisible(true);//mostrar el panel de la ventana 1
        }

        //125, 135, 350, 50 boton de salir
        if(x >= 125 && x <= 475 && y >= 135 && y <= 185){
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Desea realmente salir de la aplicación?", 
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);
            
            if(respuesta == JOptionPane.YES_OPTION) System.exit(0);
        }
    }
    
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    
}
