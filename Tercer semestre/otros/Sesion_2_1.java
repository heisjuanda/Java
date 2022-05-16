/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion2;

import javax.swing.JOptionPane;

/**
 *
 * @author jpabl
 */
public class Sesion_2_1 {
    
    public static void main(String[] args) {
        /*
         Mostrar un menú con 5 opciones y una para salir del programa. Las opciones deben ejecutar una tarea creada
         por el programador. 
        */
        
        //int nro = 0;
        boolean salir = false;
        do {  
            String opcion = JOptionPane.showInputDialog(null, 
                    "\t\tBienvenido al ejercicio practico \n\n"
                    + "1. Verificar String. \n"
                    + "2. Convertidor de unidades. \n"
                    + "3. Operaciones. \n"
                    + "4. Cuenta Bancaria. \n"
                    + "5. -------------- \n"
                    + "6. Salir. \n\n"        
                    + "\tPor favor digite una opcion: \n",
                    "MENU !!",JOptionPane.INFORMATION_MESSAGE);
            
            //System.out.println("Mensaje -> " + opcion);            
            switch(opcion){
                case "1": { // Verificar String
                    String info = JOptionPane.showInputDialog(null, 
                            "Por favor digite su nombre, edad y lugar de nacimiento"
                            + " separados por comas. \n\n"
                            + "0. Volver al menu principal. \n\n");
                    //System.out.println(info);
                                 
                   String nombre = "", edad = "", nacimiento = "";
                    if(!info.equalsIgnoreCase("0")){
                        info += ",";                       
                        int i=0, inicio = 0, contador = 1;
                        do {
                            String aux = "";
                            if(info.charAt(i) ==  ','){                                
                                aux = info.substring(inicio, i);
                                inicio = i+1;
                                System.out.println(aux);
                                switch(contador){
                                    case 1: nombre = aux; break;
                                    case 2: edad = aux; break;
                                    case 3: nacimiento = aux; break;
                                }
                                contador++;
                            }
                            i++;
                        }while(i < info.length());
                        
                        JOptionPane.showMessageDialog(null, "Su informacion: \n"
                        + "Nombre completo: " + nombre
                        + "\nEdad: " + edad
                        + "\nNacimiento: " + nacimiento);
                    }
                        
                    //juan pablo millan holguin,19,bogota
                    break;
                }
                case "2": {
                    
                    break;
                }
                case "3": {
                    break;
                }
                case "4": {
                    break;
                }
                case "5": {
                   break;
                }
                case "6": { // Salir
                    //nro = 6;
                    salir = true;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Error ! Por favor digita"
                    + " una opcion valida", "ERROR !!", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }while(!salir); //(nro != 6);    
        /* 
        int i=1;
        do {
            System.out.println("#: " + i);
            i++;
        }while(i <= 10);
        System.out.println(i);
        */
    }      
}
