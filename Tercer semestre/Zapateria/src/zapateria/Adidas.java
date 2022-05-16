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
public class Adidas extends Zapato{
    
    private boolean deColección;

    public Adidas(boolean deColección, Material material, int talla, Color color) {
        super(material, talla, color);
        this.deColección = deColección;
    }

    public boolean isDeColección() {
        return deColección;
    }
    
    
    
    
}
