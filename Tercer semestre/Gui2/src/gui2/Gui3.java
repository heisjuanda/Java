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
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;

/**
 *
 * @author JuanDavid
 */
public class Gui3 extends JFrame {

    Container contenedor;
    JRadioButton caja1, caja2, caja3;
    Manejador manejador;
    ButtonGroup grupo;
    JComboBox combo;
    JList lista;

    public Gui3() {

        super("hola");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        manejador = new Manejador();
        caja1 = new JRadioButton("viudo");
        caja1.addItemListener(manejador);
        contenedor.add(caja1);

        caja3 = new JRadioButton("casado");
        caja3.addItemListener(manejador);
        contenedor.add(caja3);

        caja2 = new JRadioButton("soltero");
        caja2.addItemListener(manejador);
        contenedor.add(caja2);

        grupo = new ButtonGroup();
        grupo.add(caja1);
        grupo.add(caja2);
        grupo.add(caja3);

        String colores[] = {"rojo", "azul", "blanco"};
        combo = new JComboBox(colores);
        contenedor.add(combo);
        
        String sabor[] = {"FRESA", "CHOCOLATE", "VAINILLA"};
        lista = new JList(sabor);
        contenedor.add(lista);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(323, 213);
        setVisible(true);
    }

    private class Manejador implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {
            if(grupo.getSelection()==caja1){
                System.out.println("112121");
            }
        }

    }

    public static void main(String[] args) {
        Gui3 g = new Gui3();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
