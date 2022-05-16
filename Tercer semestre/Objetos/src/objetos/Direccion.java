/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Direccion {
    String direccion,barrio,ciudad;
    int estrato;
    public Direccion(){
        direccion=barrio=ciudad=".";
        estrato=0;
    }
    
    public void setDireccion(){
        direccion=JOptionPane.showInputDialog("ingrese la direccion");
        
                
    }
    public void setCiudad(){
     ciudad=JOptionPane.showInputDialog("ingrese la ciudad");   
    }
    public void setBarrio(){
        barrio=JOptionPane.showInputDialog("ingrese el barrio");
    }
    public String toString(){
        
        return direccion+"-"+barrio+"-"+ciudad+"-"+estrato;
    }
      
   
    
}
