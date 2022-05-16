/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author JuanDavid
 */
public class Mamiferos extends Animal{
    
    private int edadLactancia;
    private boolean siSonManada;
    
    
    public Mamiferos(int edad, int numeroPatas, String zonaHsabitad, int edadLactancia, boolean siSonManada){
        super(edad,numeroPatas,zonaHsabitad);
        this.edadLactancia = edadLactancia;
        this.siSonManada = siSonManada;
    }
    
    
}
