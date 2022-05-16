package taller.exceptions;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author JuanDavid
 */
public final class GuiRestaurante extends JFrame {

    private Container contenedor;
    String[] nombresProductos = {"-", "entrada", "bebida", "plato fuerte"};
    double precioFinal = 0;
    int cantidadTotal = 0;
    boolean llevobebida = false;
    String descrptcionesGlobales = "";
    JComboBox lista1 = new JComboBox<>(nombresProductos);
    JButton añadir = new JButton("añadir");
    JButton revisarProducto = new JButton("descripción del producto");
    JButton pagar = new JButton("pagar");
    JPanel panel = new JPanel();
    JLabel cantidadAlimento = new JLabel("cantidad:");
    JTextArea cantidadComidas = new JTextArea(1, 1);
    JTextArea descripcion = new JTextArea(20, 20);

    Comidas papitas = new Comidas("papas con salsa en un plato pequeño", "papitas", TipoPlato.entrada, 2500, 5);
    Comidas limonada = new Comidas("jugo con sabor a limón con azucar", "limonada", TipoPlato.bebida, 1500, 2);
    Comidas salchipapa = new Comidas("papas con queso, pollo,chorizo,patacon,maiz,salsas y carne de cerdo", "salchipapa grande", TipoPlato.plato_fuerte, 15000, 15);

    public GuiRestaurante() {
        super("Restaurante con P de pobre");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        manejador m = new manejador();

        JLabel etiqueta1 = new JLabel("Platos: ");
        contenedor.add(etiqueta1);
        contenedor.add(lista1);
        añadir.addActionListener(m);
        pagar.addActionListener(m);
        revisarProducto.addActionListener(m);
        contenedor.add(cantidadAlimento);//label
        contenedor.add(cantidadComidas);//area de texto user
        contenedor.add(revisarProducto);//button
        contenedor.add(añadir);
        contenedor.add(pagar);
        mostrarInfoCompra();
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mostrarInfoCompra() {
        descripcion.setText(descrptcionesGlobales);
        panel.add(descripcion);
        contenedor.add(panel);
    }

    public class manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == añadir) {
                costo(dato());
            }
            if (ae.getSource() == revisarProducto) {
                Descrip();
            }
            if (ae.getSource() == pagar) {
                pagar();
            }

        }
    }

    public String dato() {
        String dato = "";
        dato = (String) lista1.getSelectedItem();
        return dato;
    }

    public void Descrip() {

        switch (dato()) {
            case "entrada":
                descrptcionesGlobales = papitas.getDescripcion() + "\n $$$: " + papitas.getCosto() + "\n tiempo:" + papitas.getTiempoPreparacionEnMinutos();
                System.out.println("entrAD");
                break;
            case "bebida":
                descrptcionesGlobales = descrptcionesGlobales = limonada.getDescripcion() + "\n $$$: " + limonada.getCosto() + "\n tiempo:" + limonada.getTiempoPreparacionEnMinutos();
                System.out.println("bebida");
                break;
            case "plato fuerte":
                descrptcionesGlobales = salchipapa.getDescripcion() + "\n $$$: " + salchipapa.getCosto() + "\n tiempo:" + salchipapa.getTiempoPreparacionEnMinutos();
                ;
                System.out.println("patlo fuera");
                break;
            default:
                break;
        }
        mostrarInfoCompra();
    }

    public int cantidadAllevar() {
        int d = 0;
        try {
            d = Integer.parseInt(cantidadComidas.getText());
            cantidadTotal += d;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(contenedor, "un número porfa, no sé de letras");
        }

        if (cantidadTotal > 200000) {
            JOptionPane.showMessageDialog(contenedor, "no es normal gastar tanto en comida, creo que se equivocó");
        }

        return d;
    }

    public void costo(String dato) {

        if (dato.equals("entrada")) {
            precioFinal += papitas.getCosto() * cantidadAllevar();
            descrptcionesGlobales = "añadido exitosamente!\n\n";
        } else if (dato.equals("bebida")) {
            llevobebida = true;
            precioFinal += limonada.getCosto() * cantidadAllevar();
            descrptcionesGlobales = "añadido exitosamente!\n\n";
        } else if (dato.equals("plato fuerte")) {
            precioFinal += salchipapa.getCosto() * cantidadAllevar();
            descrptcionesGlobales = "añadido exitosamente!\n\n";
        } else if (dato.equals("-")) {
            JOptionPane.showMessageDialog(contenedor, "No se ha seleccioinado una opción");
            descrptcionesGlobales = "";
        }

        mostrarInfoCompra();
    }

    public void pagar() {
        
        System.out.println("asdasd");
        if (!llevobebida) {
            JOptionPane.showMessageDialog(contenedor, "no llevo bebida que extraño xd");
        }
        if (cantidadTotal > 2000) {
            JOptionPane.showMessageDialog(contenedor, "come mucho señ@r, se va a morir");
        }
        descrptcionesGlobales = "gracias por su compra\n" + " cantidad: " + cantidadTotal + "\n precio total: " + precioFinal;
        mostrarInfoCompra();

    }

    public static void main(String[] args) {
        GuiRestaurante g = new GuiRestaurante();

    }
}
