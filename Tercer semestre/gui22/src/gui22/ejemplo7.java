/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui22;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JuanDavid
 */
public class ejemplo7 extends JFrame {

    Container contenedor;
    BorderLayout layout = new BorderLayout(20,20);
    
    public static void main(String[] args) {
        ejemplo7 e = new ejemplo7();
    }

    public ejemplo7() {
        contenedor = getContentPane();
        contenedor.setLayout(layout);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        
        JButton boton1 = new JButton("1");
        panel.add(boton1);
        
        JButton boton2 = new JButton("2");
        panel.add(boton1);
        
        JButton boton3 = new JButton("1");
        panel.add(boton1);
        
        JButton boton4 = new JButton("2");
        panel.add(boton1);
        
        JPanel panel2 = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JButton boton5 = new JButton("2");
        panel2.add(boton5);
        
        
        
       contenedor.add(panel,BorderLayout.EAST);
        contenedor.add(panel2,BorderLayout.SOUTH);
        
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    


   

   
}



