/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import panaderia.Gui.manejador;

/**
 *
 * @author JuanDavid
 */
public class Gui extends JFrame {

    private Container contenedor;
    /* Bebidas[] listaB = new Bebidas[5];
    Alimentos[] listaA = new Alimentos[5];
    ArrayList<Bebidas>bb=new ArrayList<>();*/
    String[] nombresProductos = {"-", "vive100", "pandebono", "pan", "gatorade", "rosquilla", "empanada", "papa aborrajadas", "chorizos", "gaseosa", "jugo", "cafe", "chocolate"};

    double precioFinal = 0;
    int cantidadTotal = 0;
    JComboBox lista1 = new JComboBox<>(nombresProductos);
    JButton compra = new JButton("compra!");
    JButton finalizar = new JButton("no llevaré más!");
    JPanel panel = new JPanel();
    JTextArea areaDeTexto = new JTextArea(20, 20);

    public Gui() {
        super("Rico pan");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        manejador m = new manejador();
        //JComboBox bebidas = new JComboBox();
        JLabel etiqueta1 = new JLabel("Productos: ");
        contenedor.add(etiqueta1);
        contenedor.add(lista1);

        /*JLabel etiqueta2 = new JLabel("Costo total: " + precioFinal);
        contenedor.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("Cantidad total: " + cantidadTotal);
        contenedor.add(etiqueta3);*/
        compra.addActionListener(m);
        finalizar.addActionListener(m);
        contenedor.add(compra);
        contenedor.add(finalizar);
        mostrarInfoCompra();
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mostrarInfoCompra() {

        /* JLabel etiqueta2 = new JLabel("Costo total: " + precioFinal);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("Cantidad total: " + cantidadTotal);
        panel.add(etiqueta3);*/
        if (cantidadTotal == 5) {
            areaDeTexto.setText("Gracias por su compra:\n\n" + "El costo total fue de: " + precioFinal + " pesos" + "\nCantidad total de productos: " + cantidadTotal
                    + "\n\nEsperamos vuelva pronto!");
        } else if (cantidadTotal == -1) {
            areaDeTexto.setText("Gracias por su compra:\n\n" + "El costo total fue de: " + precioFinal + " pesos" + "\n\nEsperamos vuelva pronto!");
        } else {
            areaDeTexto.setText("Información de la compra:\n\n" + "Costo total: " + precioFinal + " pesos" + "\nCantidad total: " + cantidadTotal);
        }
        panel.add(areaDeTexto);

        contenedor.add(panel);
    }

    public class manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == compra) {
                costo(dato());
            } else if (ae.getSource() == finalizar) {
                cantidadTotal = -1;
                noLlevarMas();
            }

        }
    }

    public String dato() {
        String dato = "";
        dato = (String) lista1.getSelectedItem();
        return dato;
    }

    public void costo(String dato) {

        if (cantidadTotal < 5) {
            if (dato.equals("vive100")) {
                Bebidas vive100 = new Bebidas(1000, "vive100", true, false, true, false, true);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un vive100 por: " + vive100.getCosto());
                precioFinal += vive100.getCosto();
                cantidadTotal += 1;

            } else if (dato.equals("pandebono")) {
                Alimentos pandebono = new Alimentos(500, "pandebono", false, true, false, true, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un pandebono por: " + pandebono.getCosto());
                precioFinal += pandebono.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("pan")) {
                Alimentos pan = new Alimentos(2000, "pan", false, true, false, true, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un pan por: " + pan.getCosto());
                precioFinal += pan.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("gatorade")) {
                Bebidas gatorade = new Bebidas(2500, "gatorade", true, false, true, false, true);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un gatorade por: " + gatorade.getCosto());
                precioFinal += gatorade.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("rosquilla")) {
                Alimentos rosquilla = new Alimentos(900, "rosquilla", true, true, false, true, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de una rosquilla por: " + rosquilla.getCosto());
                precioFinal += rosquilla.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("empanada")) {
                Alimentos empanada = new Alimentos(600, "empanada", false, true, false, true, false);
                //                                precio,nombre,    dulce?,salado?,frio?,hot?,energizante?
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de una empanada por: " + empanada.getCosto());
                precioFinal += empanada.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("papa aborrajadas")) {
                Alimentos papaaborrajadas = new Alimentos(750, "papa aborrajadas", true, true, false, true, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de una papa aborrajadas por: " + papaaborrajadas.getCosto());
                precioFinal += papaaborrajadas.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("chorizos")) {
                Alimentos chorizos = new Alimentos(600, "chorizos", false, true, false, true, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un chorizos por: " + chorizos.getCosto());
                precioFinal += chorizos.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("gaseosa")) {
                Bebidas gaseosa = new Bebidas(4000, "gaseosa", true, false, true, false, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de una gaseosa por: " + gaseosa.getCosto());
                precioFinal += gaseosa.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("jugo")) {
                Bebidas jugo = new Bebidas(1200, "jugo", true, false, true, false, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un jugo por: " + jugo.getCosto());
                precioFinal += jugo.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("cafe")) {
                Bebidas cafe = new Bebidas(700, "cafe", true, false, false, true, true);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un cafe por: " + cafe.getCosto());
                precioFinal += cafe.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("chocolate")) {
                Bebidas chocolate = new Bebidas(800, "chocolate", true, false, false, true, false);
                JOptionPane.showMessageDialog(contenedor, "Gracias por su compra de un chocolate por: " + chocolate.getCosto());
                precioFinal += chocolate.getCosto();
                cantidadTotal += 1;
            } else if (dato.equals("-")) {
                JOptionPane.showMessageDialog(contenedor, "No se ha seleccioinado una opción");
            }
        } else {
            JOptionPane.showMessageDialog(contenedor, "No podes comprar más, recorda que es venezuela");
        }
        mostrarInfoCompra();

    }

    public void noLlevarMas() {
        mostrarInfoCompra();
    }
}
