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
public class Casio extends Zapato{
    
    private boolean incluyeCalculadora;

    public Casio(boolean incluyeCalculadora, Material material, int talla, Color color) {
        super(material, talla, color);
        this.incluyeCalculadora = incluyeCalculadora;
    }

    public boolean isIncluyeCalculadora() {
        return incluyeCalculadora;
    }
    
    
    
    
}
