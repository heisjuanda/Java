/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1arrys;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Taller1arrys {
 
    Scanner sc = new Scanner(System.in);
    public void menu(){
        String a= JOptionPane.showInputDialog("0.salir\n"+"1.\n"+"2.practica\n"+"3.\n");
        int op=Integer.parseInt(a);
        
        do {            
            switch(op){
                case 1: uno();break;
                case 2:;break;
                case 0: String j=JOptionPane.showInputDialog("gracias"); ;break;
                
                
            }
        } while (op!=0);
    }
  
    public void uno(){
        int n=0;
        
        do {            
            String s=JOptionPane.showInputDialog("digite la cantidad del arreglo");
            n=Integer.parseInt(s);
            if(n<0){
                JOptionPane.showInputDialog("error, el número debe ser positivo");
            }
            if(n==0){
                String j=JOptionPane.showInputDialog("gracias");
            }
            
        } while (n<0);
        
        
        int []a= new int[n];
        System.out.println("digite los elementos del arreglo");
        
        for (int i = 0; i < n; i++) {
            System.out.println("digite un número");
            a[i] = sc.nextInt();
        }
        
        System.out.print("son ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+", ");
        }
    }
    
   
    
    
    public static void main(String[] args) {
       Taller1arrys obj= new Taller1arrys();
       obj.menu();
    }
    
}
