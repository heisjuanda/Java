/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JuanDavid
 */
public class Gui extends JFrame {

    private Container contenedor;//crear contenedor
    private JLabel etiqueta1, etiqueta2;//crear etiqueta
    private JTextField campo1;//campo de texto
    private JButton boton1, boton2, boton3, boton4;//botones pros

    public Gui() {
        super("Conversión");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        boton1 = new JButton("Kilo a Gramos");
        boton1.addActionListener(new mBotones());
        contenedor.add(boton1);

        boton2 = new JButton("Onza a Gramo");
        boton2.addActionListener(new mBotones());
        contenedor.add(boton2);

        boton3 = new JButton("Libra a Onza");
        boton3.addActionListener(new mBotones());
        contenedor.add(boton3);

        boton4 = new JButton("Tonelada a Libra");
        boton4.addActionListener(new mBotones());
        contenedor.add(boton4);

        etiqueta1 = new JLabel("Digite el valor para realizar la conversión");
        contenedor.add(etiqueta1);
        
        campo1 = new JTextField(10);
        contenedor.add(campo1);
        
        setSize(600, 600);
        setVisible(true);

    }

    public static void main(String[] args) {
        Gui g = new Gui();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class mBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Convertir c = new Convertir();
            int valor = Integer.parseInt(campo1.getText());
            if (ae.getSource() == boton1) {
                JOptionPane.showMessageDialog(contenedor, c.KilosAGramo(valor) + " Gramos");
            } else if (ae.getSource() == boton2) {
                JOptionPane.showMessageDialog(contenedor, c.OnzaAGramo(valor) + " Gramos");
            } else if (ae.getSource() == boton3) {
                JOptionPane.showMessageDialog(contenedor, c.LibraAOnza(valor) + " Onzas");
            } else if (ae.getSource() == boton4) {
                JOptionPane.showMessageDialog(contenedor, c.ToneladaALibra(valor) + " Libras");
            }
        }

    }

}
