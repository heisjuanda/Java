/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriceslindas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Cuadrado {

   char figura[][];
   
   public void leerTam(){
       String ent = JOptionPane.showInputDialog("Ingrese la cantidad de filas:");
       int f = Integer.parseInt(ent);
       ent = JOptionPane.showInputDialog("Ingrese la cantidad de columnas:");
       int c = Integer.parseInt(ent);
       figura = new char[f][c];
   }
   
   public void imprimir(){
       for (int f = 0; f < figura.length; f++) {
           for (int c = 0; c < figura[0].length; c++) {
               System.out.print(figura[f][c] + " ");
           }
           System.out.println();
       }
   }
   
   public void asignar(){
       for (int f = 0; f < figura.length; f++) {
           for (int c = 0; c < figura[0].length; c++) {
                if(f == 0 || f == figura.length-1 || 
                        c == 0 || c == figura[0].length-1){
                    figura[f][c] = '*';
                }              
           }           
       }
   }
    
    public static void main(String[] args) {
        Cuadrado obj = new Cuadrado();
        obj.leerTam();
        obj.asignar();
        obj.imprimir();
    }
    
}

