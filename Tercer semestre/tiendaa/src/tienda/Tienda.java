/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Modelo.Producto;
import controlador.ControladorTienda;
import vista.guiTienda;

/**
 *
 * @author User
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guiTienda gui = new guiTienda();
        Producto producto = new Producto();
        ControladorTienda controlador = new ControladorTienda(gui,producto);
        gui.setVisible(true);
    }
    
}
