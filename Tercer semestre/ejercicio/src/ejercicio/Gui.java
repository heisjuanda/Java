/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author JuanDavid
 */
public class Gui extends JFrame {

    Container contenedor;
    JButton boton1 = new JButton("Comprar");
    Main m = new Main();
    JComboBox lista1 = new JComboBox(m.marc);

    public String dato() {
        String dato = "";
        dato = (String) lista1.getSelectedItem();
        return dato;
    }

    public Gui() {
        super("Tienda electrobien");
        contenedor = getContentPane();
        setLocationRelativeTo(null);
        contenedor.setLayout(new FlowLayout());
        Manejador manejador = new Manejador();

        JLabel etiqueta1 = new JLabel("modelo del carro:");
        //String[] marc = {"airforce", "real", "republic"};
        boton1.addActionListener(manejador);

        
        JLabel etiqueta2 = new JLabel("precio del carro: "+ m.PrecioV(dato()));
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.add(etiqueta1);
        panel.add(boton1);
        panel.add(lista1);
        panel.add(etiqueta2);

        contenedor.add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    private class Manejador implements ActionListener,MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == boton1) {
                m.Vehiculos(dato());
                m.si();
                JOptionPane.showMessageDialog(null, "Compra registrada!");
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

    }
    /*public static void main(String[] args) {
        Gui g = new Gui();
    }*/
}
