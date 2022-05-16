/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class gui extends JFrame{
    
    Container contenedor;
    JTextArea area;
    manejoArchivos manejador;
    
    public gui(){
        setTitle("ejemplo archivos");
        manejador = new manejoArchivos();
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        area = new JTextArea(10,15);
        area.setText(manejador.mostrarInfoArchivo2());
        contenedor.add(area);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        gui g1 = new gui();
    }
    
}
