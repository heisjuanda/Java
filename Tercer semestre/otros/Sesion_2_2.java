/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jpabl
 */
public class Sesion_2_2 {
    public static void main(String[] args) {
        // while                
        /* Siempre evalua la codicion inicialmente para determinar 
        si entra al bucle */
        /*
        int i = 1;
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero inicial: \n"));
        while(i <= 10){ 
            if(nro % 2 != 0) {
                System.out.println("# " + nro);
                i++;
            }
            System.out.println("Mensaje");
            nro++;
        }        
        System.out.println("Variable i: " + i);
        */
        
        // do while
        /*
            Asegura que al menos una vez se va a ejecutar
        */
        /*
        char letra = 'a';        
        do {
            System.out.println("# " + letra);
            letra++;
        }while(letra <= 'z');
        
        System.out.println("variable i: " + letra);
        */
        
        /*
        Tomar una cadena de String  y  si el string es de 4 
        caracteres o mas, censurar la palabra con *. 
        (Ejemplo: oso --> no se censura, juan --> ****)
        */
        
        Scanner lectura = new Scanner(System.in);
        String valor = lectura.nextLine();
        
        if(valor.length() <= 3) System.out.println("La cadena mantiene original -->" + valor);
        else {
            int i=1;
            String aux = "";
            //System.out.println("La cadena censurada es: ");
            while(i <= valor.length()){
                //System.out.print("*");
                aux += "*";
                i++;
            }
            
            do {
                aux += "*";
                i++;
            }while(i <= valor.length());
            System.out.println("La cadena censurada es: " + aux);
            
            
        }                        
    }
}
