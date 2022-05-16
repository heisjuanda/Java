/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Punto3 {
    
    int n;
    int suma;
    
    public void leerN(){
        String entrada = "";
        boolean error = false;
        do {            
            error = false;
            entrada = JOptionPane.showInputDialog(
                    "Ingrese la cantidad de terminos a sumar");//"5.3"
            try {
                n = Integer.parseInt(entrada);//5
            } catch (Exception e) {
                error = true;
                JOptionPane.showMessageDialog(null, "Error de entrada", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (error == true);        
    }
    
    public void serieFor(){
        suma = 0;
        for (int i = 1; i <= n; i++)
            suma+=i;//suma = suma + i;      
    }
    
    public void serieWhile(){
        suma = 0;
        int i = 1;
        while (i <= n) {            
            suma+=i;//suma = suma + i;
            i++;
        }
    }
    
    public void salida(){
        JOptionPane.showMessageDialog(null, 
            "La sumatoria desde el 1 hasta el " + n + " = " + suma);
    }
    
    public static void main(String[] args) {
        Punto3 p3 = new Punto3();
        p3.leerN();
        //p3.serieFor();
        p3.serieWhile();
        p3.salida();
    }
}
