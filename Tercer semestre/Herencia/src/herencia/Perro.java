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
public class Perro extends Mamiferos{

    private String formaOrina;
    private String ladran;
    private String comoDuermen;
    
    public Perro(int edad, int numeroPatas, String zonaHabitad, int edadLactancia, boolean siSonManada,String formaOrina,String ladran,String comoDuermen) {
        super(edad, numeroPatas, zonaHabitad, edadLactancia, siSonManada);
        this.comoDuermen=comoDuermen;
        this.formaOrina=formaOrina;
        this.ladran=ladran;
    }
    public void procedencia(){
        if(getZonaHabitad().equals("brazil")){//con protectec las clases hijas pueden usar todo de los padres 
        
    }
        reproducen();
    }
    
    public void caminar(){
        System.out.println("contentos");
    }
    
    public void caminar(double kilometros){//sobrecarga de métodos
        System.out.println("contentos "+kilometros);
    }
    
}
