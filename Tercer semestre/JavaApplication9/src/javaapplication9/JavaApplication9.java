/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class JavaApplication9 {

    
    public void menu(){
        String s= JOptionPane.showInputDialog("0.salir\n"+"1.cicloUno\n"+"2.cicloDos\n"+"3.cicloTres\n"+"4.cicloCuatro\n"+"5.cicloCinco\n"
                +"6.cicloSeis\n"+"7.cicloSiete\n"+"8.cicloOcho\n"+"9.cicloNueve\n"+"10.cicloDiez\n"+"12.cicloDoce\n"+
                "13.cicloTrece\n");
        int op=Integer.parseInt(s);
        
        do {            
            switch(op){
            case 0:;break;
            case 1: cicloUno();break;
            case 2: cicloDos();break;
            case 3: cicloTres();break;
            case 4: cicloCuatro();break;
            case 5: cicloCinco();break;
            case 6: cicloSeis();break;
            case 7: cicloSiete();break;
            case 8: fatorial(); break;
            case 9: cicloNueve();break;
            case 10: cicloDiez();break;
            case 12: cicloDoce();break;
            case 13:cicloTrece();break;
            
        }
        } while (op<0);
        
        
    }
    
    public void cicloTrece(){
          int a=0,b=0;
        do {            
            String s=JOptionPane.showInputDialog("digite la cantidad de lineas");
        a=Integer.parseInt(s);
      
        if(a<0){
            JOptionPane.showMessageDialog(null,"error");
        }
        
        } while (a<0);
        
        for (int i = 0; i < a; i++) {
           
            for (int j = 0; j < a; j++) {
          
                System.out.print("> ");
                 
            }System.out.println(" <");
            
        }
        
    }
    
    public void cicloDoce() {
        int a=0,b=0;
        do {            
            String s=JOptionPane.showInputDialog("digite el rango 1");
        a=Integer.parseInt(s);
        
         String e=JOptionPane.showInputDialog("digite el rango 2");
        b=Integer.parseInt(e);
        
        if(a>b || a<0 || b<0){
            JOptionPane.showMessageDialog(null,"error");
        }
        
        } while (a>b || a<0 || b<0);
        
        
        int q=0;
        for (int i = a; i <= b; i++) {
            q=i*i;
            if(i<b){
                System.out.print(q+", ");
            }else{
                System.out.print(q);
            }
            
        }
        
    }
    
    public void cicloNueve(){
        int j=100;
        for (int i = 1; i < 10; i=i+2) {
            System.out.print(i+", ");
            System.out.print(j+", ");
            j=j-20;
        }
        
    
        
    }
    public void cicloDiez(){
        String s=JOptionPane.showInputDialog("digite la cantidad");
        int si=Integer.parseInt(s);
        int j=-1;
        for (int i = 0; i < si; i++) {
            System.out.print(1+", ");
            System.out.print(-1+", ");
            
        }
        
       
   }
    public void cicloUno(){
        System.out.println("primer ciclo");
        String rango1=" ",rango2=" ";
        int rango=0,ran=0;
        do{
            
        
        rango1= JOptionPane.showInputDialog("digite el rango uno");
        rango = Integer.parseInt(rango1);
        rango2= JOptionPane.showInputDialog("digite el rango dos");
        ran = Integer.parseInt(rango2);
        
        if(rango<0 || ran<0 || ran<rango){
            JOptionPane.showMessageDialog(null, "error");
        }
        
       }while(rango<0 || ran<0 || ran<rango);
        
        for (rango = rango; rango <= ran; rango++) {
            System.out.print(rango + ", ");
        }
    }
    
    public void cicloDos(){
        int x=0,y=10,suma=0;
        
        for (int i = x; i < y; i++) {
            suma++;
            suma=i+suma;
            
        }
        System.out.print("la suma es igual a, " + suma);
    }
    
    public void cicloTres(){
        int x=0,y=0,suma=0;
        do{
        String dato= JOptionPane.showInputDialog("digite el número de Números a sumar");
        y=Integer.parseInt(dato);
        if(y<0){
            JOptionPane.showMessageDialog(null,"error");
        }
        
         }while(y<0);
        
        for (int i = x; i < y; i++) {
            suma++;
            suma=i+suma;
            
        }
        System.out.print("la suma es igual a, " + suma);
    }
    
    public void cicloCuatro(){
        int x=0,y=0,suma=0;
        do{
        String dato= JOptionPane.showInputDialog("digite el rango 1");
        x=Integer.parseInt(dato);
        String dato1= JOptionPane.showInputDialog("digite el rango 2");
        y=Integer.parseInt(dato1);
        if(y<0 || x<0 || x>y){
            JOptionPane.showMessageDialog(null,"error");
        }
        
         }while(y<0 || x<0 || x>y);
        
        for (x = x; x < y; x++) {
            suma++;
            suma=x+suma;
            
        }
        System.out.print("la suma es igual a, " + suma);
    }
     
    public void cicloCinco(){
        double x=0,y=0,suma=0,pares=0,impares=0;
        do{
        String dato= JOptionPane.showInputDialog("digite la cantidad de números");
        x=Integer.parseInt(dato);
       
        if(x<0){
            JOptionPane.showMessageDialog(null,"error");
        }
        
         }while(x<0);
        
        if(x%2==0){
            pares=x/2;
            impares=x/2;
            System.out.print("hay estos pares: "+pares+", y de impares: "+impares);
        }else{
        for (int i = 0; i < x; i++) {
           if(x%2 != 0){
               impares=((x/2)+0.5);
               pares=((x/2)-0.5);
           }
           
              
            
              }
            System.out.print("hay estos pares: "+(int)pares+", y de impares: "+(int)impares);
        }
       
        
    }
    public void cicloSeis(){
        int cuadrado=0,cuadra=0;
        do{
        String cua= JOptionPane.showInputDialog("digite el valor min");
        cuadrado= Integer.parseInt(cua);
        String ua= JOptionPane.showInputDialog("digite el valor max");
        cuadra= Integer.parseInt(ua);
        }while(cuadrado<2 || cuadra<0 || cuadra>50);
        
        
        for (int i = cuadrado; i < cuadra; i++) {
            for (int j = cuadrado; j < cuadra; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    public void cicloSiete(){
        int cuadrado=0,cuadra=0;
        do{
        String cua= JOptionPane.showInputDialog("digite el valor min");
        cuadrado= Integer.parseInt(cua);
        String ua= JOptionPane.showInputDialog("digite el valor max");
        cuadra= Integer.parseInt(ua);
        }while(cuadrado<2 || cuadra<0 || cuadra>50);
        
        
        for (int fila = cuadrado; fila < cuadra; fila++) {
            for (int columna = cuadrado; columna < cuadra; columna++) {
                if(fila==cuadrado || fila== cuadra-1 || columna==cuadrado || columna==cuadra-1){
                    System.out.print("* ");  
            }else{
                    System.out.print("  ");
                }
            
        }System.out.println();
                     
    }
    }
    
    public void fatorial(){
        String op= JOptionPane.showInputDialog("Digite el número");
        int numero=Integer.parseInt(op);
        int n=2,r=1;
        
        while(n<=numero){
            r*=n;
            n++;
        }System.out.print("el resultado es "+r);
    }
    
    public static void main(String[] args) {
       
        
        JavaApplication9 obj = new JavaApplication9();
        obj.menu();
        //obj.cicloUno();
        //obj.cicloDos();
        //obj.cicloTres();
        //obj.cicloCuatro();
        //obj.cicloCinco();
        //obj.cicloSeis();
        //obj.cicloSiete();
        //obj.fatorial();
    }
    
}
