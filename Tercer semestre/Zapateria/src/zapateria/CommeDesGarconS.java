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
public class CommeDesGarconS extends Zapato{
    
    private int paresFabricados;

    public CommeDesGarconS(int paresFabricados, Material material, int talla, Color color) {
        super(material, talla, color);
        this.paresFabricados = paresFabricados;
    }

    public int getParesFabricados() {
        return paresFabricados;
    }
    
    
    
}
