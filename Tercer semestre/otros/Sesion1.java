/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion1;

import javax.swing.JOptionPane;

/**
 *
 * @author jpabl
 */
public class Sesion1 {
    public static void main(String[] args) {
        /*int anio = 18, nro2 = 20;
        String nroCedula = "1234";
        char letra = '4';
        int nro = letra;
        System.out.println(letra);
        System.out.println(nro);
        
        if((anio = 20) == nro2) {
            System.out.println("Felicitaciones !!");
            if(letra == 4){
                System.out.println("Letra !!");
            }else {
                System.out.println("Caso Contrario #2");
            }
        }else{
            System.out.println("Caso contrario #1");
        }
        
        boolean estado = true;
        if(!estado){
            System.out.println("sdfsdmskm");
        }
        */
        JOptionPane.showMessageDialog(null, 
                "\t\tBienvenidos a mi Calculadora !! \n"
                + "1. Sumar \n" 
                + "2. Restar. \n"
                + "3. Multiplicar. \n"
                + "4. Dividir. \n\n", "CALCULADORA",JOptionPane.ERROR_MESSAGE);
        
        String opcion = JOptionPane.showInputDialog(null, "\t\tBienvenidos a mi Calculadora !! \n"
                + "1. Sumar \n" 
                + "2. Restar. \n"
                + "3. Multiplicar. \n"
                + "4. Dividir. \n\n"
                + "Digite su opcion: \n","CALCULADORA",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Su opcion es: " + opcion);
    }
    
   
}
