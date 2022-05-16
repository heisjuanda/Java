/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallere;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavidMoreno-202059997
 * @author JuanCamiloMeneses-202059944
 */
public class TallerE {

    int contadorMagico=0;
    Scanner sc= new Scanner(System.in);
    String[] placa= new String[50];
    int[]peso=new int[50];
    int[]destino=new int[50];
    int[]dia=new int[50];
    int[]mes=new int[50];
    int[]año=new int[50];
    
    
    
    public void menu(){
        int op;
          
        do {            
             op=Integer.parseInt(JOptionPane.showInputDialog(
                    "1.Ingresar datos del pesaje\n"+
                    "2.Mostrar cantidad de viajes y el peso totales\n"+
                    "3.Mostrar cantidad de los tres destinos y el peso promedio de los tres\n"+
                    "4.Consultar los viajes por fecha y destino\n"+
                    "0.Salir\n"));
         
            switch(op){
                
                case 1:leer();break;
                case 2:viajesTotalesYPeso(viajesss(),pesoss());break;
                case 3:destinosYProm(cantbuena(),cantbogo(),cantbarra(), pesoprom(viajesss(), pesoss()) ); break;
                case 4:buscar(); break;
                default:break;
            
                
            }
            if(op<0){
                JOptionPane.showMessageDialog(null,"El valor es incorrecto", "Error", 0);
               }  
        }while(op!=0);
        
    
         }
         
    
    public void leer(){
       contadorMagico++;//1
       
       
       if(contadorMagico<50){

        
        for (int i = 0; i < 1; i++) {

            
        if(placa[i]!=null ){
                placa[contadorMagico-1]=JOptionPane.showInputDialog("Digite el numero de la placa");
            
            
            

        }else{
             placa[i]=JOptionPane.showInputDialog("Digite el numero de la placa");
        }
            

        
        if(peso[i]!=0 ){
            peso[contadorMagico-1]=Integer.parseInt(JOptionPane.showInputDialog("Digite el peso en toneladas"));
        }else{
            peso[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el peso en toneladas"));
        }
        
        
        int dias;
        
        do {            
            dias=Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
            if(dia[i]!=0 ){
                if(dias<=31){
                    dia[contadorMagico-1]=dias;
               
                dia[contadorMagico-1]=dias;
                       
            }else{
                JOptionPane.showConfirmDialog(null, "Error de tamaño","error",0);
            }
            }else{
                if(dias<=31){
                    dia[i]=dias;
               
                dia[i]=dias;
                       
            }else{
                JOptionPane.showConfirmDialog(null, "Error de tamaño","error",0);
            }
                 }
            
        }while(dias>31);
        
        
       int meses;
        do {            
            meses=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
            if(mes[i]!=0){
               if(meses<=12){
                mes[contadorMagico-1]=meses;
                        
            }else{
                JOptionPane.showConfirmDialog(null, "Error de tamaño","error",0);
            } 
            }else{
                if(meses<=12){
                mes[i]=meses;
                        
            }else{
                JOptionPane.showConfirmDialog(null, "Error de tamaño","error",0);
            }
            }
            
        } while(meses>12);
        
        
        
       int años;
        do {            
            años=Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
            if(año[i]!=0 ){
                            if(años>=1999){
                año[contadorMagico-1]=años;
                        
            }else{
                JOptionPane.showConfirmDialog(null, "Error de tamaño","error",0);
            }
            }else{
                            if(años>=1999){
                año[i]=años;
                       
            }else{
                JOptionPane.showConfirmDialog(null, "Error de tamaño","error",0);
            }
            }

            
            
        } while(años<1999);
       
         int destini;
       do{            
            destini=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de destino\n"+
                "1.Buenaventura\n"+
                "2.Bogotá\n"+
                "3.Barranquilla\n"));
            
            switch(destini){
                case 1: 
                if(destino[i]!=0 ){
                    destino[contadorMagico-1]=1;
                }else{
                    destino[i]=1;
                }
                
                ;
                break;
                
                
                
                case 2: 
                    if(destino[i]!=0 ){
                    destino[contadorMagico-1]=2;
                }else{
                    destino[i]=2;
                }
                
                ;
                    
                    
                    ;break;
                
                
                
                
                case 3: 
                    if(destino[i]!=0 ){
                    destino[contadorMagico-1]=3;
                }else{
                    destino[i]=3;
                }
                
                ;
                    
                    ;break;
                
                
                
                default:break;
            }
            if(destini>3 || destini<0){
                JOptionPane.showMessageDialog(null,"El valor es incorrecto", "Error", 0);
               }  
            
        }while(destini>3 || destini<0);

    }
          

        /*
        for (int i = 0; i < placa.length; i++) {
            System.out.print(placa[i]+", " );
            
        }System.out.println("placa end");
        for (int i = 0; i < peso.length; i++) {
            System.out.print(peso[i]+", " );
            
        }System.out.println("peso end");
        for (int i = 0; i < dia.length; i++) {
            System.out.print(dia[i]+", " );
            
        }System.out.println("dia end");
        for (int i = 0; i < mes.length; i++) {
            System.out.print(mes[i]+", " );
            
        }System.out.println("mes end");
        for (int i = 0; i < año.length; i++) {
            System.out.print(año[i]+", " );
            
        }System.out.println("año end");
        for (int i = 0; i < destino.length; i++) {
            System.out.print(destino[i]+", " );
            
        }System.out.println("destino end");
        */
        
    }else{
           JOptionPane.showMessageDialog(null, "Base de datos llena", "Error", 0);
       }
}
    public void buscar(){
        int dias=0,mess=0,años=0,destinos=0;
         dias=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
        mess=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        años=Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
        destinos=Integer.parseInt(JOptionPane.showInputDialog("Digite el destino"));
         if(dias<32 && mess<13 && años>1999 && (destinos==1 || destinos==2 || destinos==3 )){
                   
  
              for (int i = 0; i <50; i++) {
            if(dia[i]==dias && mes[i]==mess && año[i]==años && destino[i]==destinos ){
                System.out.println("Se encontro lo siguente"+"peso en toneladas: "+peso[i]+", "+"placa: "+placa[i] );
                JOptionPane.showInputDialog("Se encontro lo siguente"+"peso en toneladas: "+peso[i]+", "+"placa: "+placa[i]);
                break;
            }else{
                System.out.println("Buscando...Puede que no se encuentre\n");
                if(i==49){
                    System.out.println("No se encontro");
                }
                
                
            }
        }

        
         }else{
            System.out.println("Datos erroneos");
            JOptionPane.showConfirmDialog(null, "Error de datos", "error", 0);
        }
        
        
      
        
        
    }

    public void viajesTotalesYPeso(int sum,int conta){
          System.out.print("La cantidad de viajes totales es: "+sum+".\n");
          JOptionPane.showConfirmDialog(null,"La cantidad de viajes totales es "+sum );
          System.out.println("La cantidad de peso total es: "+conta+".\n");
           JOptionPane.showConfirmDialog(null,"La cantidad de peso total es "+conta );
   
    }
    public int viajesss(){
        int conta=0;
        
        for (int i = 0; i < destino.length; i++) {
            if(destino[i] == 1 || destino[i] == 2 || destino[i] == 3){
                conta++;
                
            }
        }
        
		return conta;
    }
    
    public void destinosYProm(int cantbuena,int canbogo,int canbarra,int pesoprom){
        System.out.println("La cantidad de viajes a buenaventura es de "+cantbuena );
        JOptionPane.showConfirmDialog(null, "La cantidad de viajes a buenaventura es de "+cantbuena);
        System.out.println("La cantidad de viajes a bogota es de"+canbogo);
        JOptionPane.showConfirmDialog(null, "La cantidad de viajes a bogota es de "+canbogo);
        System.out.println("La cantidad de viajes a barranquilla es de"+canbarra);
        JOptionPane.showConfirmDialog(null, "La cantidad de viajes a barranquilla es de "+canbarra);
        System.out.println("El peso promedio es de "+pesoprom);
        JOptionPane.showConfirmDialog(null, "El peso promedio general: "+pesoprom);
        
    }
    public int pesoprom(int conta,int sum){
       int pesoprom=0;
        
       pesoprom=(sum)/conta;
       
       
       
      return pesoprom;
    }
 
    public int cantbuena(){
        int buenaventura=0;
        for (int i = 0; i < destino.length; i++) {
                        if(destino[i]==1){
                            buenaventura++;
                        }
                            
                        
            
        }
        
        return buenaventura;
    }
    public int cantbogo(){
        int bogota=0;
        for (int i = 0; i < destino.length; i++) {
             
                        if(destino[i]==2){
                            bogota++;
                        }
            
        }
        
        return bogota;
    }
    public int cantbarra(){
        int barranquilla=0;
        for (int i = 0; i < destino.length; i++) {
             
                        if(destino[i]==3){
                            barranquilla++;
                        }
            
        }
        
        return barranquilla;
    }
    
    public int pesoss(){
        int sum=0;
        for(int i = 0; i < peso.length; i++){
			sum+=peso[i];
		}
        return sum;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TallerE obj=new TallerE();
        obj.menu();
    }
    
}
