/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrdecision;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstrDecision {

    byte entero_byte;
    short entero_short;
    int entero;
    long entero_largo;
    float real_float;
    double real;
    String cadena;
    Scanner sc = new Scanner(System.in);//crear un mecanismo de lectura por la consola
    
    public void leer_entero_byte(){
        System.out.print("Ingrese un valor byte: ");
        entero_byte = sc.nextByte();
        System.out.println(entero_byte);
        byte resul = (byte) (entero_byte * 2);
        System.out.println(entero_byte + " multiplicado por 2 = " + resul);
    }
    
    public void leerShort(){
        System.out.print("Ingrese un valor short:      ");
        entero_short = sc.nextShort();
        System.out.println(entero_short);
        short resul = (short) (entero_short / 10);
        System.out.println(entero_short + "/ 10 = " + resul);
    }
    
    public static void main(String[] args) {
        EstrDecision obj = new EstrDecision();
        //obj.leer_entero_byte();
        obj.leerShort();
        System.out.println(obj.entero_short);
    }
    
}
