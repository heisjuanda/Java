/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCalculadora;
import controlador.Operaciones;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class CalculadoraVistaGUISuma extends JFrame implements CalculadoraVista{
    
    Container contenedor;
    JTextField campoNumero1;
    JTextField campoNumero2;
    JTextField campoResultado;
    JLabel etiqueta1, etiqueta2, etiqueta3;
    JButton sumar;
    
    public CalculadoraVistaGUISuma(){
        contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(3,2));
        campoNumero1 = new JTextField(10);
        campoNumero2 = new JTextField(10);
        campoResultado = new JTextField(10);
        campoResultado.setEditable(false);
        etiqueta1 = new JLabel("Número 1");
        etiqueta2 = new JLabel("Número 2");
        etiqueta3 = new JLabel("Resultado");
        sumar = new JButton("Sumar");
        contenedor.add(etiqueta1);
        contenedor.add(campoNumero1);
        contenedor.add(etiqueta2);
        contenedor.add(campoNumero2);
        contenedor.add(sumar);
        contenedor.add(campoResultado);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
    }

    @Override
    public String getNumero1() {
        return campoNumero1.getText();
    }

    @Override
    public String getNumero2() {
        return campoNumero2.getText();
    }

    @Override
    public void setResultado(String resultado) {
        campoResultado.setText(resultado);
    }

    @Override
    public void iniciar(ControladorCalculadora controlador) {
        controlador.setOperacion(Operaciones.SUMA);
        sumar.addActionListener(controlador);
        setVisible(true);
    }
    
}
