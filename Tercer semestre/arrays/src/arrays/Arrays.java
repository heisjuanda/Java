/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */


public class Arrays {
Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    
    
   public void menu(){
  
  
   int op; 
    do{
    op=Integer.parseInt(JOptionPane.showInputDialog("1.practica\n"+
            "2.char\n"+"3.mejor\n"+"4.cinco\n"+"0.salir\n"));
    
    switch(op){
        case 0:break;
        case 1: practica(); break;
        case 2:mejorChar();break;
        case 3:mejor();break;
        case 4:cinco();break;
        
    }
    }while(op!=0);
    
    
    
    
}
   public void mejorChar(){
      int elementos; 
      elementos=Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de arreglos"));
       
      char[] array=new char[elementos];
       System.out.println("digite los elementos");
       
       for (int i = 0; i < elementos; i++) {
           System.out.println("digite un caracter"+"{"+i+" }");
           array[i]=sc.next().charAt(0);
       }
       System.out.println("el arrays es");
       
       for (int i = 0; i < elementos; i++) {
           System.out.print("{"+i+"}"+array[i]+", ");
       }
   }
   
   
   public void mejor(){
       
       String yo[]={"juan","sofia","laura","moreno"};
       
       for (int i = 0; i < yo.length; i++) {
           System.out.println(yo[i]);
           
       }
       
       for(String i: yo){
           System.out.println(i);
       }
       
       int elementos=0;
       elementos=Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));
       
       String array[]=new String[elementos];
       
       for (int i = 0; i < elementos; i++) {
           System.out.println("digite el primer elemento");
           array[i]=sc.next();
       }
       
       for (int i = 0; i < elementos; i++) {
           System.out.print(array[i]);
       }
       
       
       
       
   }
   public void cinco(){
       int cantidad=0;
       cantidad=Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos"));
       double [] numeros=new double[cantidad];
       
       for (int i = 0; i < cantidad; i++) {
           System.out.println("digite el dato número "+(i+1));
           numeros[i]=sc.nextDouble();
       }
      for(double i:numeros){
          System.out.print(i+", ");
      }
       System.out.println("");
       
       
       System.out.println("al reves");
       
       
       for (int i = cantidad; i >= 0; i--) {
           System.out.print(numeros[i]+", ");
       }
           
       }
       public void practica(){
        int hola[]= new int[3];
        int si[]= {1,2,4,5};
     
        hola[0]=1;
        hola[1]=3;
        hola[2]=12;
        
        System.out.println("con while");
        int e=0;
        while (e<4) {            
            System.out.println(si[e]);
            e++;
        }
        
        System.out.println("con for");
        for (int i = 0; i < 3; i++) {
            System.out.println(hola[i]);
            
        }
                
        
    }
    
   
    
     public static void main(String[] args){
        Arrays obj=new Arrays();
        obj.menu();
}
   }
   
   
    
     

