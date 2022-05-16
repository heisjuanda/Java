/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package     ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjemploMenu {
    
    public void cuadradoRelleno() {
        //System.out.println("cuadrado relleno");
        int n;
        String ent = JOptionPane.showInputDialog("Ingrese el valor del lado:");
        n = Integer.parseInt(ent);
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public void cuadradoNoRelleno(){
        //System.out.println("cuadrado no relleno");
        int n;
        String ent = JOptionPane.showInputDialog("Ingrese el valor del lado:");
        n = Integer.parseInt(ent);
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                if(fila == 0 || fila == n-1 || col == 0 || col == n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public void menu(){
        int opc;
        do {            
            String ent = JOptionPane.showInputDialog("Menu de opciones\n\n" + 
                    "1. Cuadrado relleno\n" + 
                    "2. Cuadrado no relleno\n" + 
                    "0. Salir\n" + 
                    "Seleccione una opción:");
            opc = Integer.parseInt(ent);
            switch(opc){
                case 1: cuadradoRelleno(); break;
                case 2: cuadradoNoRelleno(); break;
                case 0: JOptionPane.showMessageDialog(null, "Saliendo de la aplicación.");break;
                default: JOptionPane.showMessageDialog(null, "Error de opción", "Error", 0);
            }
        } while (opc != 0);
    }
    
    public static void main(String[] args) {
        EjemploMenu em = new EjemploMenu();
        em.menu();
    }

    private static class String {

        public String() {
        }
    }
}
