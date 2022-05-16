/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import objetos.Utilerias;
import objetos.Direccion;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Objetos {//estudiantes

    //declarar atributos de la clase (modelo)
    String nombre,apellido;
    int codigo,codigoPlan;
    private double parcial1,parcial2,parcialFinal,definitiva;//datos importantes protegidos 
    //String direccion,barrio,ciudad,estrato;//datos compuestos=direccion de residencia de estudiante
    
    //definir constrictores
    public Objetos(){//constructor por defecto de la clase
        apellido=nombre="Nulo";
        codigo=codigoPlan=0;
        parcial1=parcial2=parcialFinal=definitiva=0.0;
        
    }
    
    
    //definicion de los metodos(comportamiento)
    //por cada atributo definido se crea dos metodos para ella
    //1)INGRESAR DATOS 2)VER LA INFO ALMACENADA AHI
    public void setApellido(){
       apellido=JOptionPane.showInputDialog("Digite el apellido");   
    }
    public String getApellido(){
        return apellido;
    }
    public void setNombre(){
        nombre=JOptionPane.showInputDialog("Digite el nombre");
    }
    public String getNombre(){
        return nombre;
    }
    public void setCodigo(){
     codigo= Utilerias.leerEntero("Ingerese el codigo estudiantil");
        //codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo estudiantil"));
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigoPlan(){
     codigoPlan=Utilerias.leerEntero("digite el codigo del plan");
      //codigoPlan=Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del plan"));
    }
    public int getCodigoPlan(){
        return codigoPlan;
    }
    public void setNotas(){
        parcial1=Utilerias.LeerDouble("digite el parcial 1");
        parcial2=Utilerias.LeerDouble("digire el parcial 2");
        parcialFinal=Utilerias.LeerDouble("digite el parcial final");
        
    }
    public void calcularDef(){
      definitiva=parcial1*0.3+(parcial2*0.3)+(parcialFinal*0.4) ;
    }
    public double getDef(){
        return definitiva;
    }
    public String toString(){
        return apellido+", "+nombre+", "+definitiva;
    }
    public void setDireccion(){
       setDireccion();
       
    }
    //public String getDir(){
      //  return direccion.toString;
    //}
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
}
