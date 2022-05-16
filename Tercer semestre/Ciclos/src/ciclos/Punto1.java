/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto1 {
   
    int n;
    Scanner sc = new Scanner(System.in);
    
    public void leerN(){
        System.out.println("Ingrese el valor de N:");
        n = sc.nextInt();//5
    }
    
    public void serieFor(){
        int par = 2;
        for (int i = 0; i < n; i++) {
            System.out.println(par);
            par+=2;
        }
    }
    
    public void serieWhile(){
        int par = 2;
        int i = 0;
        while (i < n) {            
            System.out.println(par);
            par+=2;
            i++;
        }
    }
    
    public static void main(String[] args) {
        Punto1 p1 = new Punto1();
        p1.leerN();
        p1.serieFor();
        System.out.println("-------------------");
        p1.serieWhile();
    }    
}
