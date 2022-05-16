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
public class Nike extends Zapato{
    
    private String modelo;

    public Nike(String modelo, Material material, int talla, Color color) {
        super(material, talla, color);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
    
}
