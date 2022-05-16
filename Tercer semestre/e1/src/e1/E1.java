/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    boolean a=false;
        int n1=0,n2=0,n3=0,n4=0,n5=0,k=0;
        int[] array= new int[5];
    
      public void meter(){
          
        n1=10;//Integer.parseInt(JOptionPane.showInputDialog("ingrese un número1"));
        n2=15;//Integer.parseInt(JOptionPane.showInputDialog("ingrese un número2"));
        n3=3;//Integer.parseInt(JOptionPane.showInputDialog("ingrese un número3"));
        n4=7;//Integer.parseInt(JOptionPane.showInputDialog("ingrese un número4"));
        n5=1;//Integer.parseInt(JOptionPane.showInputDialog("ingrese un número5"));
        k=Integer.parseInt(JOptionPane.showInputDialog("ingrese k"));
        array[0]=n1;
        array[1]=n2;
        array[2]=n3;
        array[3]=n4;
        array[4]=n5;
        
        }
     public void aasd(){
         System.out.println(a);
     }
      
      public boolean siOno(){
          int p=0;
          for (int i = 1; i < array.length; i++) {
              p=array[i-i]+array[i];
              if(p==k){
                  a=true;
                  //System.out.println("verdad");
                  break;
              }else{
                  k=0;
                  a=false;
              }
          }
           System.out.println(a);
          return  a;
      }
      
      
      public void a(){
          if(a=true){
                          System.out.println("verdad");
                      }else{
                          System.out.println("falso");
                      }
      }
      
      public void menu(){
          int op=0;
          do {              
              op=Integer.parseInt(JOptionPane.showInputDialog("digite una opción\n"+"1.meter datos\n"+"2.resultado\n"+"0.salir"));
              switch(op){
                  case 1:
                      meter();
                      break;
                  case 2:
                      siOno();
                      break;
                  default:
                      op=0;
                      break;
              
                  
                  
          }
          } while (op!=0);
          
      }
      public static void main(String[] args) {
 
          E1 obj = new E1();
          obj.menu();
         // obj.a();
          
          
    }
}
