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
public class Docente {
    String ape, nom;
    int id;
    Direccion dir;
    
    public Docente(){
        ape = nom = "-";
        id = 0;
        dir = new Direccion();
    }
    public void setApe(){
        ape = JOptionPane.showInputDialog("Ingrese el apellido");
    }
    public void setNom(){
        nom = JOptionPane.showInputDialog("Ingrese el nombre");
    }
    public void setId(){
        id = Utilerias.leerEntero("Ingrese la identificación");
    }
    public void setDir(){
        dir.setDir();
        dir.setBarrio();
        dir.setCiudad();
        dir.setEstrato();
    }
    public String toString(){
        return id + " - " + ape + ", " + nom + "\n" + dir;
    }
}
