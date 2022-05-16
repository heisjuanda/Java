/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo1;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author JuanDavid
 */
public class p3 {
 Scanner lee=new Scanner(System.in);   
 int n=0,suma=0;   
 
 
    public void leerN(){
        String entrada=" ";
        boolean error=false;
        
        do{
        entrada=JOptionPane.showInputDialog("ingrese la cantidad de terminos a sumar");
        
            try {
                n=Integer.parseInt(entrada);
            } catch (Exception e) {
                error=true;
                JOptionPane.showMessageDialog(null, "se necesita un número", "error", JOptionPane.ERROR_MESSAGE);
            }
        }while(error==true);            
            
        
        
        
    }
    
    public void fos(){
    suma=0;
        for (int i = 1; i <= n; i++) {
            suma+=i;//suma=suma+i;
        }
    }
    public void sWhile(){
    suma=0;
    int i=1;
        while (i<=n) {            
            suma+=i;
            i++;
        }
        
        
    }
    public void salida(){
        JOptionPane.showMessageDialog(null, "sumatoria desde 1 hasta el "+n+" es ="+suma);
    }
    
    
    public static void main(String[] args) {
        p3 obj=new p3();
        obj.leerN();
        obj.fos();
        //obj.sWhile();
        obj.salida();
    }
}
