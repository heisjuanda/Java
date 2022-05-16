/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

/**
 *
 * @author JuanDavid
 */
public class Interfaz extends JFrame {

    //double[] precios = {100000, 200000, 500000};
    String[] marcas = {"lambo", "ferrari", "Mazda"};
    ArrayList<Carro1> carros = new ArrayList<Carro1>();
    Carro1 c = new Carro1();

    manejador manejador = new manejador();
    Container contenedor;
    //Main m = new Main();
    JComboBox lista1 = new JComboBox(marcas);
    JButton boton1 = new JButton("Buscar precio y disponibilidad");
    JButton boton2 = new JButton("Comprar");
    JScrollBar scroll = new JScrollBar();
    JTextArea texto = new JTextArea(6,5);

    public Interfaz() {
        super("Compra carro barato!!");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Elegir marca");
        JLabel etiqueta2 = new JLabel("aquiiiiiiiii");

        //JTextComponent lista2 = new JTextArea("" + prueba());
        boton1.addActionListener(manejador);
        boton2.addActionListener(manejador);
        texto.add(scroll);
        etiqueta2.add(scroll);
        panel.add(texto);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta2);
        panel.add(etiqueta);
        panel.add(lista1);
        //panel.add(lista2);
        contenedor.add(panel);

        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public double dato() {
        String dato = "";
        double pre = 0;
        dato = (String) lista1.getSelectedItem();

        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getC() > 0) {
                if (carros.get(i).getNombre().equals(dato)) {
                    pre = carros.get(i).getPrecio();
                } else {
                    JOptionPane.showMessageDialog(this, "no se encuentra disponible ese vehículo");
                }
            }else{
                JOptionPane.showMessageDialog(this, "no hay vehículos de esa marca");
            }

        }

        return pre;
    }

    public void crearCarro() {
        Carro1 carro = new Carro1();
        /*int i = 0;
        double p = 0;
        String m = "";

        i = (int) (Math.random() * 3);
        m = marcas[i];
        i = 0;
        i = (int) (Math.random() * 3);
        p = precios[i];

        carro.setNombre(m);
        carro.setPrecio(p);*/
        carros.add(carro);
        for (int i = 0; i < carros.size(); i++) {
            System.out.println("1" + carros.get(i).getPrecio());
            System.out.println("2" + carros.get(i).getNombre());
        }

    }

    /*public double prueba() {
        double a = 0;
        a = Datos(dato());
        return a;
    }*/
    public void imprimir() {
        System.out.println("asdsa");
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i).getNombre());
            System.out.println(carros.get(i).getPrecio());

        }
    }

    public double Datos(String dato) {
        double pre = 0;
        for (int i = 0; i < carros.size(); i++) {
            if (dato.equals(carros.get(i).getNombre())) {
                pre = carros.get(i).getPrecio();
            } else {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }

        }
        return pre;
    }

    private class manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == boton1) {
                crearCarro();
                JOptionPane.showMessageDialog(null, " Precio del carro: " + dato());
                //JTextComponent lista2 = new JTextArea("" + prueba());
                imprimir();
            } else if (ae.getSource() == boton2) {
                c.comprar();
                System.out.println(c.getC());
            }

        }

    }

}
