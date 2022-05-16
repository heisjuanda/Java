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
public class Zapato {
    
    private Material material;
    private int talla;
    private Color color;

    public Zapato(Material material, int talla,Color color) {
        this.material = material;
        this.talla = talla;
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public int getTalla() {
        return talla;
    }

    public Color getColor() {
        return color;
    }
    
    

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}
