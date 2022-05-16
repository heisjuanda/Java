/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Utilerias {
    
    public static int leerEntero(String mensaje){
        String ent = JOptionPane.showInputDialog(mensaje);
        int valor = Integer.parseInt(ent);
        return valor;
    }
    
    public static double leerDouble(String mensaje){
        String ent = JOptionPane.showInputDialog(mensaje);
        double valor = Double.parseDouble(ent);
        return valor;
    }
    
    public static int leerEstrato(){
        String datos[] = {"1", "2", "3", "4", "5", "6"};
                         //0    1    2    3    4    5
        int estrato = JOptionPane.showOptionDialog(null, 
                "Seleccione el estrato", 
                "Selección", 
                0, JOptionPane.QUESTION_MESSAGE, null, datos, datos[0]);
        return estrato+1;        
    }
    
    public static int leerEstrato_2(){
        String datos[] = {"1", "2", "3", "4", "5", "6"};
        String opcion = (String)JOptionPane.showInputDialog(null,
                "Seleccione el estrato", 
                "Selección",
                JOptionPane.QUESTION_MESSAGE,
                null,
                datos, 
                datos[0]);
        int est = Integer.parseInt(opcion);
        return est;
    }
    
}
