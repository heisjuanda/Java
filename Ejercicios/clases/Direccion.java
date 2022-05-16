/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Direccion {
    
    String dir, ciudad, barrio;
    int estrato;
    
    public Direccion(){
        dir = ciudad = barrio = "-";
        estrato = 0;
    }
    public void setDir(){
        dir = JOptionPane.showInputDialog("Ingrese la dirección:");
    }
    public void setCiudad(){
        ciudad = JOptionPane.showInputDialog("Ingrese la ciudad:");
    }
    public void setBarrio(){
        barrio = JOptionPane.showInputDialog("Ingrese la barrio:");
    }
    public void setEstrato(){
        estrato = Utilerias.leerEstrato();
    }
    public String toString(){
        return dir + " - " + barrio + ", " + ciudad + " " + estrato;
    }
    
}
