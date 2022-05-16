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
public class Vans extends Zapato{
    
    private boolean paraSkaters;

    public Vans(boolean paraSkaters, Material material, int talla, Color color) {
        super(material, talla, color);
        this.paraSkaters = paraSkaters;
    }

    public boolean isParaSkaters() {
        return paraSkaters;
    }
    
    
    
}
