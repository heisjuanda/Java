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
public class Jordan extends Zapato{
    
    private boolean hechosPorTravisScott;

    public Jordan(boolean hechosPorTravisScott, Material material, int talla, Color color) {
        super(material, talla, color);
        this.hechosPorTravisScott = hechosPorTravisScott;
    }

    public boolean isHechosPorTravisScott() {
        return hechosPorTravisScott;
    }
    
    
    
}
