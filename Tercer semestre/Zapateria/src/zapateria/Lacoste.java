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
public class Lacoste extends Zapato{
    
    private boolean deFrancia;

    public Lacoste(boolean deFrancia, Material material, int talla, Color color) {
        super(material, talla, color);
        this.deFrancia = deFrancia;
    }

    public boolean isDeFrancia() {
        return deFrancia;
    }
    
    
    
}
