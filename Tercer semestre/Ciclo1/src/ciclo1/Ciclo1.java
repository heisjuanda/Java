/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author JuanDavid
 */

public class Ciclo1 {
 Scanner lee=new Scanner(System.in);

    public void Ciclo() {
    int z=0;    
        System.out.println("diga el número z");
    z=lee.nextInt();
        for(int i=0;i<=z;i+=2){
            System.out.println(i);
                
            }
        }
    
    
    
    public void Ciclo2(){
     int x=0;
     int i=0;
        System.out.println("diga el número x");
     x=(int) lee.nextDouble();
        while (i<=x) {
            System.out.println(i);
            i+=2;
        }
    }
    
    public void Ciclo3() {
        double x=0;
        do {            
            if(x==3){
                System.out.println(x+"sisi");
            }else{
                System.out.println(x);
            }
        } while (x<=5);
    }
    
    public void Ciclo4(){
        int n=0,par=0,impar=0,dato=0;
        
        
        do {            
            System.out.println("ingree dato n");
             n=lee.nextInt();
             if(n<0){
                 System.out.println("no puede ser negativo");
             }
        } while (n<0);
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el dato"+(i+1));
            dato=lee.nextInt();
            if(dato%2==0){
                par++;
            }else{
                impar++;
            }
            
        }
        double q=0,w=0;
        q=(double)(par*100)/n;
        w=(double)(impar*100)/n;
        DecimalFormat formato=new DecimalFormat("###.###");
        String q_forma=formato.format(q);
        String w_forma=formato.format(w);
        System.out.println("hay este número de números pares "+par+" y su porcentaje es "+q_forma+"%");
        System.out.println("hay esta cantidad de impares"+impar+" y su porcentaje es "+w_forma+"%");           
          
    }
    
    public static void main(String[] args) {
       Scanner lee=new Scanner(System.in);
       Ciclo1 obj=new Ciclo1();
       //obj.Ciclo();
        System.out.println("-----------------------------");
       //obj.Ciclo2();
        System.out.println("-----------------------------");
       //obj.Ciclo3();
       System.out.println("-----------------------------");
       obj.Ciclo4();
    }
    
}
