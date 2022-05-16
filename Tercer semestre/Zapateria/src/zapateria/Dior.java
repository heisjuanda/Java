/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

/**
 *
 * @author JuanDavid
 */
public class Dior extends Zapato{
    
    private boolean sonUnRobo;

    public Dior(boolean sonUnRobo, Material material, int talla, Color color) {
        super(material, talla, color);
        this.sonUnRobo = sonUnRobo;
    }

    public boolean isSonUnRobo() {
        return sonUnRobo;
    }
    
    
    
}
