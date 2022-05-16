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
public class Puma extends Zapato{
    
    private boolean paraDeporte;

    public Puma(boolean paraDeporte, Material material, int talla, Color color) {
        super(material, talla, color);
        this.paraDeporte = paraDeporte;
    }

    public boolean isParaDeporte() {
        return paraDeporte;
    }
    
    
    
}
