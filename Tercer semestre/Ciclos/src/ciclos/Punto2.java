/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto2 {
    
    int n;//cantidad de numeros a ingresar
    int contPares, contImpares;
    Scanner sc =  new Scanner(System.in);
    
    public void leerN(){
        do {            
            System.out.println("Ingrese el valor de N:");
            n = sc.nextInt();
            if(n < 0){
                System.out.println("Error. N debe ser positivo");
            }
        } while (n < 0);
    }
    
    public void leerDatosFor(){
        int dato;
        contPares = 0;
        contImpares = 0;
        for (int x = 0; x < n; x++) {
            System.out.println("Ingrese el dato # " + (x+1));
            dato = sc.nextInt();
            if(dato % 2 == 0) contPares++;
            else contImpares++;
        }
    }
    
    public void leerDatosWhile(){
        int dato;
        contPares = 0;
        contImpares = 0;
        int x = 0;
        while (x < n) {            
            System.out.println("Ingrese el dato # " + (x+1));
            dato = sc.nextInt();
            if(dato % 2 == 0) contPares++;
            else contImpares++;
            x++;
        }
    }
    
    public void salida(){
        double porcPares, porcImpares;
        /*5 -> 100%
          3 -> ?
        */
        porcPares = (double)(contPares * 100) / (double)n;
        porcImpares = (double)(contImpares * 100) / (double)n;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("Cantidad de numeros leidos: " + n);
        System.out.println("Cant de pares: " + contPares + " " + f.format(porcPares));
        System.out.println("Cant de impares: " + contImpares + " " + f.format(porcImpares));
    }
    
    public static void main(String[] args) {
        Punto2 p2 = new Punto2();
        p2.leerN();
        //p2.leerDatosFor();
        p2.leerDatosWhile();
        p2.salida();
    }
}
