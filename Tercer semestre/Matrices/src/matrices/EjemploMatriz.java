/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjemploMatriz {
    
    int mat[][];
    int arreglo[];
        
    public void leerTam(){
        String ent = JOptionPane.showInputDialog("Ingrese la cantidad de filas:");
        int f = Integer.parseInt(ent);
        ent = JOptionPane.showInputDialog("Ingrese la cantidad de columnas:");
        int c = Integer.parseInt(ent);
        
        mat = new int[f][c];
        arreglo = new int[f*c];
    }
    
    public void imprimir(){
        int canC = mat[0].length;
        String salida = "";
        
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < canC; c++) {
                System.out.print(mat[f][c] + " "); 
                salida+=mat[f][c] + " ";
            }
            System.out.println();
            salida+="\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    
    public void leerMat(){
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                String ent = JOptionPane.showInputDialog(
                        "Ingrese el elemento [" + f + "][" + c + "] = ");
                mat[f][c] = Integer.parseInt(ent);
            }            
        }
    }
    
    public void llenar(){
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[f][c] = 1 + (int)(Math.random() * 100);
            }
        }
    }
    
    public void fill(int valor){
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[f][c] = valor;
            }
        }
    }
    
    public void sumar(){
        int sum = 0;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                sum+=mat[f][c];
            }
        }
        JOptionPane.showMessageDialog(null, sum);
    }
    
    public void sumaFila(){
        String ent = JOptionPane.showInputDialog("Ingrese la fila a sumar");
        int filaSumar = Integer.parseInt(ent);
        int suma = 0;
        for (int c = 0; c < mat[0].length; c++) {
            suma+=mat[filaSumar][c];
        }
        JOptionPane.showMessageDialog(null, suma);
    }
    
    public void sumaCol(){
        String ent = JOptionPane.showInputDialog("Ingrese la columna a sumar");
        int colSumar = Integer.parseInt(ent)-1;
        int suma = 0;
        for (int f = 0; f < mat.length; f++) {
            suma+=mat[f][colSumar];
        }
        JOptionPane.showMessageDialog(null, suma);
    }
    
    public void buscar(){
        String ent = JOptionPane.showInputDialog("Ingrese el dato a buscar");
        int dato = Integer.parseInt(ent);
        boolean existe = false;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                if(mat[f][c] == dato){
                    existe = true;
                    JOptionPane.showMessageDialog(null, 
                        "El dato " + dato + " esta en [" + f + "][" + c + "]");
                    f = mat.length;
                    break;
                }                
            }            
        }
        if(!existe){//if(existe == false)
            JOptionPane.showMessageDialog(null, "el dato " + dato + " no existe");
        }
    }
    
    public void frecuencia(){
        String ent = JOptionPane.showInputDialog("Ingrese el dato a buscar");
        int dato = Integer.parseInt(ent);
        int frec = 0;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                if(mat[f][c] == dato) frec++;
            }            
        }
        JOptionPane.showMessageDialog(null, 
                "El dato " + dato + " esta " + frec + " veces");
    }
    
    public void aArreglo(){//pasar los elementos de la matriz al arreglo
        int i = 0;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                arreglo[i] = mat[f][c];
                i++;
            }            
        }
    }
    
    public void aMatriz(){//pasar los elementos del arreglo a la matriz
        int i = 0;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[f][c] = arreglo[i];
                i++;
            }            
        }
    }
    
    public void ordenar(){
        aArreglo();
        Arrays.sort(arreglo);
        aMatriz();
    }
    
    public void calcMenor(){
        int menor = mat[0][0];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                if(mat[f][c] < menor) menor = mat[f][c];
            }
        }
        JOptionPane.showMessageDialog(null, "El menor = " + menor);
    }
    
    public void calcMayor(){
        int mayor = mat[0][0];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[0].length; c++) {
                if(mat[f][c] > mayor) mayor = mat[f][c];
            }
        }
        JOptionPane.showMessageDialog(null, "El mayor = " + mayor);
    }
    
    public void menu(){
        int opc;
        do {            
            String ent = JOptionPane.showInputDialog(
                "1. Leer tamaño\n" + 
                "2. Imprimir\n" + 
                "3. Leer la matriz\n" +   
                "4. Llenar\n" +       
                "5. Llenar con valor x defecto\n" + 
                "6. Sumatoria\n" +  
                "7. Sumar fila\n" +
                "8. Sumar columna\n" +   
                "9. Buscar\n" +    
                "10.Frecuencia\n" + 
                "11.Ordenar\n" +     
                "12.Calcular menor\n" + 
                "13.Calcular mayor\n" +         
                "0. Salir");//" 1 "
            ent = ent.trim();//"1"
            opc = Integer.parseInt(ent);
            switch(opc){
                case 1: leerTam(); break;
                case 2: imprimir(); break;
                case 3: leerMat(); break;
                case 4: llenar(); break;
                case 5: ent = JOptionPane.showInputDialog("Ingrese el valor por defecto");
                        int valor = Integer.parseInt(ent);
                        fill(valor); break;
                case 6: sumar(); break;
                case 7: sumaFila(); break;
                case 8: sumaCol(); break;
                case 9: buscar(); break;
                case 10:frecuencia();break;
                case 11:ordenar(); break;
                case 12:calcMenor(); break;
                case 13:calcMayor(); break;
                case 0: break;
                default: JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        } while (opc != 0);
    }
    
    public static void main(String[] args) {
        EjemploMatriz em = new EjemploMatriz();
        em.menu();
    }
}
