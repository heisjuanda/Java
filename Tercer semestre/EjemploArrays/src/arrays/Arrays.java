/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Arrays {

    private static void fill(int[] arregl, int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void sort(int[] arregl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void binarySearch(int[] arregl, int dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int arregl[];
    
     public void leerTam(){
       String entrada= JOptionPane.showInputDialog("ingrese el tamaño del arreglo");
       int tam= Integer.parseInt(entrada);
       
       arregl= new int[tam];
     }
    
     public void imprimir(){
         for (int i = 0; i < arregl.length; i++) {
             System.out.println(arregl[i]);
         }
     }
     
     public void leerDatos(){
         
         String lec=" ",ent;
         for (int i = 0; i < arregl.length; i++) {
             ent = JOptionPane.showInputDialog("ingrese el elemento("+i+")");
             arregl[i] = Integer.parseInt(ent);
             
         }
         
     }
     
     public void llenar(int valor_max){
         for (int i = 0; i < arregl.length; i++) {
             arregl[i]=1+(int)(Math.random() * valor_max);
             
         }
         
     }
     public void asignar(int valor){
         /*for (int i = 0; i < arregl.length; i++) {
            arregl[i]= valor;
             
         }
         */
         Arrays.fill(arregl, valor);
     }
     
     public void ordenar(){
         Arrays.sort(arregl);
         
     }
     
     public void buscarSecuencial(){
         boolean encontrar=false;
         String ent= JOptionPane.showInputDialog("ingrese el dato a buscar");
         int dato= Integer.parseInt(ent);
         int posi=0;
         for (int i = 0; i < arregl.length; i++) {
            if(arregl[i]==dato){
                encontrar= true;
                posi=i;
                break;
            }
                
            
             
         }
         if(encontrar== true){
             JOptionPane.showMessageDialog(null,"el dato "+dato+" esta en"+posi);
         }else{
             JOptionPane.showMessageDialog(null,"no se encontro el dato"+dato);
         }
     }
     public void buscarBinario(){
         
         String ent= JOptionPane.showInputDialog("ingrese el dato a buscar");
         int dato= Integer.parseInt(ent);
         int pos=0;
        pos = Arrays.binarySearch(arregl,dato);
         if(pos ==-1){
             JOptionPane.showMessageDialog(null,"no existe");
         }else{
             JOptionPane.showMessageDialog(null,"esta en"+pos);
         }
         
         
     }
     public void menu(){
         int op;
         do {             
             String ent= JOptionPane.showInputDialog("1. leer el tamaño\n" + 
                     "2. imprimir\n" +"3. leer datos\n"+"4. llenar\n"+"5. asiganar\n"+"6. ordenar\n"+
                     "7. buscar secuencia\n"+"8. calcular frecuencia"+"9. buscar binario"+"0. salir\n" );
             op= Integer.parseInt(ent);
             switch(op){
                 case 1: leerTam(); break;
                 case 2: imprimir(); break;
                 case 3: leerDatos(); break;
                 case 5: asignar(-1); break;
                 case 4: llenar(100); break;
                 case 6: ordenar(); break;
                 case 7: buscarSecuencial(); break;
                 case 8: frecuencia();break;
                 case 9: buscarBinario(); break;
                 case 0: System.out.print("Adios");break;
                 
             }
         } while (op!=0);
     }
     public void frecuencia(){
        String ent= JOptionPane.showInputDialog("ingrese el dato a buscar");
         int dato= Integer.parseInt(ent);
         int cont=0;
         
         for (int i = 0; i < arregl.length; i++) {
            if(arregl[i]==dato){
                cont++;
            }
             JOptionPane.showMessageDialog(null, "el dato "+dato+"esta "+cont+" veces");
         }
        
    }
    public static void main(String[] args) {
        Arrays obj = new Arrays();
        obj.menu();
        
        
        //int edades[]=new int[50];
        //String nombre[]=new String[50];
    }
    
}
