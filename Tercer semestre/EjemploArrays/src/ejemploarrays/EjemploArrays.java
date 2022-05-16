/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjemploArrays {

    int arreglo[];
    
    public void leerTam(){
        String ent = JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:");
        int tam = Integer.parseInt(ent);
        arreglo = new int[tam];
    }
    
    public void imprimir(){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
    }
    
    public void leerDatos(){
        String ent = "";
        for (int i = 0; i < arreglo.length; i++) {
            ent = JOptionPane.showInputDialog("Ingrese el elemento[" + i + "]=");
            arreglo[i] = Integer.parseInt(ent);            
        }
    }
    
    public void llenar(int valor_maximo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 1 + (int)(Math.random() * valor_maximo);
        }
    }
    
    public void asignar(int valor){
        /*for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = valor;
        }*/
        Arrays.fill(arreglo, valor);
    }
    
    public void ordenar(){
        Arrays.sort(arreglo);
    }
    
    public void buscarSecuencial(){
        boolean encontrado = false;
        String ent = JOptionPane.showInputDialog("Ingrese el dato a buscar:");
        int dato = Integer.parseInt(ent);
        int pos = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == dato){
                encontrado = true;
                pos = i;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, 
                "El dato " + dato + " esta en la posición " + pos);
        }else{
           JOptionPane.showMessageDialog(null, 
                "El dato " + dato + " no existe en el arreglo"); 
        }
    }
    
    public void frecuencia(){
        String ent = JOptionPane.showInputDialog("Ingrese el dato a buscar:");
        int dato = Integer.parseInt(ent);
        int cont = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == dato) cont++;
        }
        JOptionPane.showMessageDialog(null, 
            "El dato " + dato + " esta " + cont + " veces");
    }
    
    public void buscarBinaria(){
        String ent = JOptionPane.showInputDialog("Ingrese el dato a buscar:");
        int dato = Integer.parseInt(ent);
        int pos = Arrays.binarySearch(arreglo, dato);
        if(pos < 0){
            JOptionPane.showMessageDialog(null, 
                "El dato " + dato + " no existe en el arreglo"); 
        }else{
           JOptionPane.showMessageDialog(null, 
                "El dato " + dato + " esta en la posición " + pos); 
        }
    }
    
    public void menu(){
        int opc;
        do {            
            String ent = JOptionPane.showInputDialog("1. Leer el tamaño\n" + 
                    "2. Imprimir\n" +
                    "3. Leer datos\n" +
                    "4. Llenar\n" +
                    "5. Asignar\n" +
                    "6. Ordenar\n" + 
                    "7. Busqueda lineal\n" +
                    "8. Calcular frecuencia\n" +
                    "9. Busqueda Binaria\n" + 
                    "0. Salir");
            opc = Integer.parseInt(ent);
            switch(opc){
                case 1: leerTam(); break;
                case 2: imprimir(); break;
                case 3: leerDatos(); break;
                case 4: llenar(100); break;
                case 5: asignar(-1); break;
                case 6: ordenar(); break;
                case 7: buscarSecuencial(); break;
                case 8: frecuencia(); break;
                case 9: buscarBinaria(); break;
                case 0: break;
                default:JOptionPane.showMessageDialog(null, "Entrada incorrecta");
            }
        } while (opc != 0);
    }
    
    public static void main(String[] args) {
        EjemploArrays ea = new EjemploArrays();
        ea.menu();
    }    
}
