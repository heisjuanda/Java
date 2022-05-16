/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeportiva;

import controlador.ControladorTiendaDeportes;
import javax.swing.JOptionPane;
import modelo.Productos;
import vista.GuiTiendaDeportes;

/**
 *
 * @author JuanDavid
 */
public class TiendaDeportiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiTiendaDeportes g = new GuiTiendaDeportes();
        g.setVisible(true);
        Productos p = new Productos();
        ControladorTiendaDeportes c = new ControladorTiendaDeportes(g, p);
        
        
    }
    
}
