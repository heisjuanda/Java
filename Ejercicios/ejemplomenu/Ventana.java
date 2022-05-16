/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomenu;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Ventana extends JFrame {

    MenuPrincipal mp;
    JPanelVentana1 v1;

    public Ventana() {
        super("<<< Menu principal >>>");
        setSize(700, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);

        mp = new MenuPrincipal(this);
        add(mp);
        
        v1 = new JPanelVentana1(this);
        add(v1);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

}
