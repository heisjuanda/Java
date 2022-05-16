/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class diccionario extends JFrame implements ActionListener{
    
    Container contenedor;
    JLabel etiqueta1, etiqueta2;
    JTextField campo1, campo2;
    JButton boton1, boton2, boton3, boton4;
    manejoArchivos manejador;
    String nombreDiccionario = "";
    
    public diccionario(){
        setTitle("Diccionario Tuluá");
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        manejador = new manejoArchivos();
        
        etiqueta1 = new JLabel("Palabra español");
        etiqueta2 = new JLabel("Palabra ingles");
        
        campo1 = new JTextField(15);
        campo2 = new JTextField(15);
        campo2.setEditable(false);
        
        boton1 = new JButton("Traducir a ingles");
        boton1.addActionListener(this);
        
        boton2 = new JButton("Traducir a Tulueño");
        boton2.addActionListener(this);
        
        boton3 = new JButton("Traducir a Triana");
        boton3.addActionListener(this);
        
        boton4 = new JButton("Seleccionar diccionario");
        boton4.addActionListener(this);
        
        contenedor.add(etiqueta1);
        contenedor.add(campo1);
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(etiqueta2);
        contenedor.add(campo2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        diccionario gui = new diccionario();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String idioma = "";
        if (ae.getSource()==boton4){
            JFileChooser selector = new JFileChooser();
            int resultado = selector.showOpenDialog(this);
            if(resultado == JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog(this, "No seleccionaste archivo");
            }
            if(resultado == JFileChooser.APPROVE_OPTION){
                File archivo = selector.getSelectedFile();
                nombreDiccionario = archivo.getAbsolutePath();
            }
        }else{
            if (ae.getSource()==boton1)
                idioma = "ingles";
            else if(ae.getSource()==boton2)
                idioma = "tulueño";
            else if(ae.getSource()==boton3)
                idioma = "triana";
            String palabra = campo1.getText();
            String resultado = manejador.buscarPalabra(palabra,idioma,nombreDiccionario);
            campo2.setText(resultado);
        }
        
    }
}
