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
public class Estudiante {

    //declaración de los atributos
    String ape, nom;
    int codEstudiantil;
    int codPlan;
    private double parcial1, parcial2, parcialFinal, def;
    //String dir, ciudad, barrio, estrato;//dato compuesto y que representa la dirección de residencia
    Direccion dir;
    
    //definicion de los metodos constructores
    public Estudiante(){//constructor por defecto
        ape = nom = "-";
        codEstudiantil = codPlan = 0;
        parcial1 = parcial2 = parcialFinal = def = 0.0;
        dir = new Direccion();
    }
             
    //definicion de los metodos (comportamiento)
    public void setApe(){
        ape = JOptionPane.showInputDialog("Ingrese el apellido:");
    }
    public String getApe(){
        return ape;
    }
    public void setNom(){
        nom = JOptionPane.showInputDialog("Ingrese el nombre:");
    }
    public String getNom(){
        return nom;
    }
    public void setCodEstudiantil(){        
        codEstudiantil = Utilerias.leerEntero("Ingrese el codigo estudiantil:");
    }
    public int getCodEstudiantil(){
        return codEstudiantil;
    }
    public void setCodPlan(){
        codPlan = Utilerias.leerEntero("Ingrese el codigo del plan:");
    }
    public int getCodPlan(){
        return codPlan;
    } 
    public void setNotas(){
        parcial1 = Utilerias.leerDouble("Ingrese el parcial 1:");
        parcial2 = Utilerias.leerDouble("Ingrese el parcial 2:");
        parcialFinal = Utilerias.leerDouble("Ingrese el parcial final:");
    }
    public void calcDef(){
        def = (parcial1*0.3) + (parcial2*0.3) + (parcialFinal*0.4);
    }
    public double getDef(){
        return def;
    }  
    public String toString(){
        return ape + ", " + nom + " " + def + "\n" + dir;
    }
    public void setDir(){
        dir.setDir();
        dir.setBarrio();
        dir.setEstrato();
        dir.setCiudad();
    }
    public String getDir(){
        return dir.toString();
    }
    
}
