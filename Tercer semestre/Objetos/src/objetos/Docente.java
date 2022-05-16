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
public class Docente {
    String ape,nom;
    int id;
    Direccion direccion;
    
    public Docente(){
        ape=nom="-";
        id=0;
        direccion=new Direccion();
    }
    public void setApe(){
        ape=JOptionPane.showInputDialog("Ingrse el apellido");
    }
    public void setNombre(){
        nom=JOptionPane.showInputDialog("Ingrse el nombre");
    }
    public void setId(){
        id=Utilerias.leerEntero("Ingrese la identificacion");
    }
    public void setDir(){
        direccion.setDireccion();
        direccion.setBarrio();
        direccion.setCiudad();
        
    }
    public String toString(){
        return id+","+ape+","+nom+","+direccion;
    }
}
