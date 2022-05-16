/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Modelo.Producctos;
import controlador.ControladorTienda;
import vista.GuiTienda;

/**
 *
 * @author JuanDavid
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiTienda g = new GuiTienda();
        Producctos p = new Producctos();
        ControladorTienda c = new ControladorTienda(g, p);
        g.setVisible(true);
    }
    
}
