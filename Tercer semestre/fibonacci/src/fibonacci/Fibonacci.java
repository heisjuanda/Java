/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Fibonacci {  
     Scanner lee=new Scanner(System.in);
     int cant=0;
     
     
     public void leerCantidad(){
         String ent = " ";
         do {             
             ent = JOptionPane.showInputDialog("ingrese los valores");
             cant= Integer.parseInt(ent);
             
             if(cant<0){
                 JOptionPane.showMessageDialog(null, "Error, no se aceptan negativos");
             }
         } while (cant<0);
     }
     
     public void ejecucion(){
         int t1,t2,s;
         
         if(cant>2){
             t1=0;
             t2=1;
             System.out.print(t1 +" "+ t2+" ");
             for (int x = 2; x < cant; x++) {
                 s= t1+t2;
                 System.out.print(s +", " );
                 t1=t2;
                 t2=s;
             }
             
         }else{
             if(cant == 1){
                 System.out.println(0);
             }else{
                 if(cant == 2){
                     System.out.println("0, 1");
                 }
             }
         }
     }
    
    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        obj.leerCantidad();
        obj.ejecucion();
        
    }
    
}
