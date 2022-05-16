/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui22;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JuanDavid
 */
public class ejemplo6 extends JFrame {

    Container contenedor;
    GridLayout layout = new GridLayout(20,20);
    
    public static void main(String[] args) {
        ejemplo6 e = new ejemplo6();
    }

    public ejemplo6() {
        contenedor = getContentPane();
        contenedor.setLayout(layout);
        
        
        JButton boton1 = new JButton("1");
        contenedor.add(boton1);
        
        JButton boton2 = new JButton("2");
        contenedor.add(boton1);
        
        JButton boton3 = new JButton("3");
        contenedor.add(boton1);
        
        JButton boton4 = new JButton("4");
        contenedor.add(boton1);
        
        JButton boton5 = new JButton("5");
        contenedor.add(boton1);
        
        JButton boton6 = new JButton("6");
        contenedor.add(boton1);
        
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    


   

   
}



