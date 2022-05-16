/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo1;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class menu {
    
     private void cuadroNoRelleno() {
      int n;
      String ent=JOptionPane.showInputDialog("ingrese valor de n");
      n=Integer.parseInt(ent);
      
      for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if(fila==0 || fila== n-1 || columna==0 || columna==n-1){
                    System.out.print("* ");  
            }else{
                    System.out.print("  ");
                }
            
        }System.out.println();
                     }
              
    }

    private void cuadroRelleno() {
        int n;
        String ent=JOptionPane.showInputDialog("ingrese el valor de n");
        n=Integer.parseInt(ent);
        
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
       
    }
    
    public void menu(){
        int op=0;
        String ent=" ";
        do {            
            ent= JOptionPane.showInputDialog("menu de opciones\n\n"+
                                             "1. cuadro relleno\n"+
                                             "2. cuadro no relleno\n"+
                                             "0. salir\n"+
                                             "selecione opción");
                                                     
        op=Integer.parseInt(ent);
        
        switch(op){
            case 1: cuadroRelleno();break;
            case 2: cuadroNoRelleno();break;
            case 0: JOptionPane.showMessageDialog(null,"saliendo","ok",JOptionPane.INFORMATION_MESSAGE);break;
            default: JOptionPane.showMessageDialog(null, "error","error",0);
        }
        
        } while (op!=0);
    }
    
    public static void main(String[] args) {
        menu obj=new menu();
        obj.menu();
    }

   
    
}
