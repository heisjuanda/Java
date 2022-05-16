/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Matriz {

    Scanner sc= new Scanner(System.in);
    
        int notas[][],fil,colim;
        int matriz[][]= {{1,2,3},{1,2,4},{1,2,4}};//rellenado uno mismo
        int array[];
    
    public void menu(){
          
        int op; 
        
        do {       
        String af=JOptionPane.showInputDialog("0.salir\n"+"1.uno\n"+"2.frecuencia\n"+"3.orden\n"+
                "4.mayor menor\n");
        op=Integer.parseInt(af);
   
                   
            switch(op){
                case 0:break;
                case 1:uno(); break;
                case 2:frecuencia();  break;
                case 3: orden();break;
                case 4: menorYmayor(); break;
            }
           
        } while (op!=0);
        
        }
                
    public void menorYmayor(){
        int matr[][]={{1,2,3 },{2,2,2 } };
        int menor=0,mayor=0;
        
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                if(matr[i][j]< menor){
                    menor = matr[i][j];
                }
                if(matr[i][j]> mayor){
                    mayor = matr[i][j];
                }
                
            }
            
        }JOptionPane.showMessageDialog(null,"el menor = "+menor);
            JOptionPane.showMessageDialog(null,"el mayor = "+mayor);
        
    }    
    
    public void orden(){
        
        
        fil=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas"));
        colim=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas"));
        
        notas=new int[fil][colim];
        array=new int[fil*colim];
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                array[i] = notas[i][j];
                i++;
                
                
                
                
                
            }
            
        }
        
    }
        
    public void uno(){
       
        System.out.println("matriz hecha");
        int notas[][],fil,colim;
        int matriz[][]= {{1,2,3},{1,2,4},{1,2,4}};//rellenado uno mismo
        
        fil=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas"));
        colim=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas"));
        
        notas=new int[fil][colim];
        
        //notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j]);
                
            }
            System.out.println("");
        }
        System.out.println("digite la matriz");
        //notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                
                notas[i][j]= Integer.parseInt(JOptionPane.showInputDialog("matriz["+i+"]["+j+"]"));
            }
            System.out.println("");
        }
        
        //aleatorio
        System.out.println("aleatorio");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j]= 1+(int)(Math.random()*100);
                System.out.print(notas[i][j]);
            }
            System.out.println("");
        }
        
        
        System.out.println("la matriz es");
         for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colim; j++) {
                System.out.print(notas[i][j]);
                
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        System.out.println("");
        //matriz hecha por mi
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                
            }
            System.out.println("");
        }
        
      int dato=Integer.parseInt(JOptionPane.showInputDialog("igrese dato a buscar"));
      boolean existe=false;
      
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                if(notas[i][j] == dato){
                    existe= true;
                    JOptionPane.showMessageDialog(null, "se encontro"+dato+" en["+i+"]["+j+"]");
                    i= notas.length;
                    break;
                }
                
            }
            
        }if(!existe){//existe==false
            JOptionPane.showMessageDialog(null,"no se encontro");
        }
       
        
        
        
        
    }
    public void frecuencia(){
        
        int matric[][]={{1,2,3 },{2,2,2 } };
                
       
           int dato=Integer.parseInt(JOptionPane.showInputDialog("igrese dato a buscar"));
           int frec=0;
           
           for (int i = 0; i < matric.length; i++) {
               for (int j = 0; j < matric[0].length; j++) {
                  if(matric[i][j] == dato) frec++;
                   
               }
            
        }JOptionPane.showMessageDialog(null, "el "+dato+" esta"+ frec);
            
        }
   
    public static void main(String[] args) {
        
        Matriz obj = new Matriz();
        obj.menu();
        
    }
    
}
