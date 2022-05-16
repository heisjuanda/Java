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
public class Supreme extends Zapato{
    
    private int numeroDeTemporada;

    public Supreme(int numeroDeTemporada, Material material, int talla, Color color) {
        super(material, talla, color);
        this.numeroDeTemporada = numeroDeTemporada;
    }

    public int getNumeroDeTemporada() {
        return numeroDeTemporada;
    }
    
    
    
}
