/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import controlador.Controlador;
import modelo.Player;
import vista.Gui;

/**
 *
 * @author JuanDavid
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gui g = new Gui();
       g.setVisible(true);
        Player gana = new Player();
        Controlador c = new Controlador(g);
        c.LeerDatos();
    }
    
}
