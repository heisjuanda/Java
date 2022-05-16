/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendoando;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Aprendiendoando {
    int contadorG=0;
    String[]placa={"uno","dos","tres","cuatro","cinco"};
   int[]peso={111,222,333,444,555};
    int[]destino={1,2,3,1,2};
    int[]dia={12,11,1,4,5 };
    int[]mes={12,11,1,4,5 };
    int[]año={2020,2011,2001,2004,2005 };
    int []copia={0,0,0,0,0};
    
    public void copisa(){
        
        for (int i = 0; i < copia.length; i++) {
            copia[i]=año[i];
            
            
            
            System.out.println(copia[i] );
            
        }
        
        
    }
    
    
    public void si(){
        contadorG++;
        for (int i = 0; i < 1; i++) {
            
            
            if(destino[i]!=0 ){
                //for (int j = 0; j < 1; j++) {
                   destino[i+contadorG]=Integer.parseInt(JOptionPane.showInputDialog("digite el dato"));
                break;
               // }
            }else{
                destino[i]=Integer.parseInt(JOptionPane.showInputDialog("digite el dato"));
            }
        }
        
        for (int i = 0; i < destino.length; i++) {
            System.out.print(destino[i]+", " );
            
        }
        System.out.println( "contador magico"+contadorG);
    }
    public void menu(){
       
        int op;
          
        do {            
             op=Integer.parseInt(JOptionPane.showInputDialog(
                    "1.si\n"+
                    "2.fecha\n"+
                    "3.Copia\n"+
                    "4.Consultar los viajes por fecha y destino\n"+
                    "0.Salir\n"));
         
            switch(op){
                
                case 1:si();break;
                case 2:buscar();break;
                case 3:copisa(); break;
                case 4: break;
                default:break;
            
                
            }
            if(op<0){
                JOptionPane.showMessageDialog(null,"El valor es incorrecto", "Error", 0);
               }  
        }while(op!=0);
     
    }
    
    public void buscar(){
        int dias=Integer.parseInt(JOptionPane.showInputDialog("digite el dia"));
        int mess=Integer.parseInt(JOptionPane.showInputDialog("digite el mes"));
        int años=Integer.parseInt(JOptionPane.showInputDialog("digite el año"));
        
        for (int i = 0; i < dia.length; i++) {
            if(dia[i]==dias && mes[i]==mess && año[i]==años ){
                 //0    1       0      1         0       12
                System.out.println("se encontro lo siguente"+peso[i]+", "+placa[i] );
                break;
            }else{
                System.out.println("buscando...puede que no este");
                
            }
            
        }
        
        
    }
    
    public void fecha(){
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        
     
        Aprendiendoando obj=new Aprendiendoando();
        obj.menu();
        
 
      
       
       
    }
    
}
