/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamelitamatrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Practicamelitamatrices {

    int fila,columna;
    int matriz[][];
    Scanner sc=new Scanner(System.in);
    
    
    public void menu(){
        int op;
        do {       
            
            op=Integer.parseInt(JOptionPane.showInputDialog("1.uno\n"+
                    "0.cerrar\n"+"2.simétrica\n"+""));
            switch(op){
                case 0: break;
                case 1:numeroUno(); break;
                case 2:simétrica(); break;
                
                
            }
            
            
        } while(op != 0);
    }
    
    public void numeroUno(){
        
        do {            
           fila=Integer.parseInt(JOptionPane.showInputDialog("digite las filas"));
           columna=Integer.parseInt(JOptionPane.showInputDialog("digite las columnas"));
           matriz=new int [fila][columna]; 
           
        } while (fila<0 || columna<0);
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("matriz["+i+"]["+j+"]"));
              
                
            }System.out.print("");
        }
        
       
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                
            }System.out.println("");
            
        }
        
        
        
    }
    
    public void simétrica(){
        boolean simétrica=true;
            
        if(fila==columna){
            System.out.print("es cuadrada");
            
            int i=0,j=0;
            while (i<fila && simétrica==true) {
                while (j<i && simétrica==true) {                    
                    if(matriz[i][j]!=matriz[j][i]  ){
                      simétrica=false;
                      JOptionPane.showMessageDialog(null, "no es simétrica");
                }else{
                        JOptionPane.showMessageDialog(null, "es simétrica también");
                    
                    }
                    
             j++;   
            }
                i++;
 
            
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "no es siétrica");
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
      Practicamelitamatrices obj = new Practicamelitamatrices();
      obj.menu();
    }
    
}
