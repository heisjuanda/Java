/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpreparcial;

import modelo.Hueso;
import vista.GuiGame;
import controlador.Controlador;

/**
 *
 * @author JuanDavid
 */
public class TallerPreParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        GuiGame g = new GuiGame();
        g.setVisible(true);
        Hueso h = new Hueso();
        Controlador c = new Controlador(g);
    }

}
