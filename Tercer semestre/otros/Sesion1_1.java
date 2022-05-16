/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jpabl
 */
public class Sesion1_1 {
    
   
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("\tPor favor digite su calificacion: ");
        float calificacion = entrada.nextFloat(); 
        
        if(calificacion >= 0 && calificacion <= 5){
            if(calificacion >= 3.0) System.out.println("El estudiante Aprobo !! ");            
            else if(calificacion >= 2.0) System.out.println("El estudiante Habilita");            
            else System.out.println("El estudiante Reprobo ");
        }else System.out.println("Error al ingresar la calificacion");
        */
               
        
        float calificacion = Float.parseFloat(JOptionPane.showInputDialog("\tPor favor digite su calificacion"));
        
        if(calificacion >= 0 && calificacion <= 5){
            if(calificacion >= 3.0) JOptionPane.showMessageDialog(null,"El estudiante Aprobo !! ");            
            else if(calificacion >= 2.0) JOptionPane.showMessageDialog(null,"El estudiante Habilita");            
            else JOptionPane.showMessageDialog(null,"El estudiante Reprobo ");
        }else JOptionPane.showMessageDialog(null,"Error al ingresar la calificacion", "ERROR",0);
    }
}
