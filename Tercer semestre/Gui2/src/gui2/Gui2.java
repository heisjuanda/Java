/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author JuanDavid
 */
public class Gui2 extends JFrame {

    Container contenedor;
    JCheckBox caja1, caja2, caja3;
    manejador manejador;
    
    public Gui2() {

        super("hola");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        caja1 = new JCheckBox("viudo");
        caja1.addItemListener(manejador);
        contenedor.add(caja1);

        caja3 = new JCheckBox("casado");
        caja3.addItemListener(manejador);
        contenedor.add(caja3);

        caja2 = new JCheckBox("soltero");
        caja2.addItemListener(manejador);
        contenedor.add(caja2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(323, 213);
        setVisible(true);
    }

    private class manejador implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {
            if (ie.getSource() == caja1) {
                if (caja1.isSelected()) {
                    System.out.println(":,(");
                }
            }else if(ie.getSource()==caja2){
                System.out.println(":(");
            }else{
                System.out.println("._.");
            }
        }

    }

    public static void main(String[] args) {
        Gui2 g = new Gui2();
    }

}
