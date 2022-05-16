/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallere;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavidMoreno-202059997
 * @author JuanCamiloMeneses-2020
 */



public class Ordenamiento {

    
        int[] arr1/*=new int[10000]*/; //int[] arra=new int[10000];   
        int[] arr2/*=new int[50000]*/; //int[] arrb=new int[50000]; 
        //int size=arr1.length;
       // int[] arr3=new int[100000];int[] arrc=new int[100000];  
        //int[] arr4=new int[500000]; int[] arrd=new int[500000];  
        //int[] arr5=new int[1000000]; int[] arre=new int[1000000];
       

public static void shell(int A[]) {

    long cantInter = 0;
        long cantAsig = 0;
        long cantComp = 0;
        long t_ini = System.currentTimeMillis();
    
    
        int salto, aux, i;
        boolean cambios;

          cantAsig++;
        cantComp++;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
              cantAsig++;
            cantComp++;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                
                
                   cantAsig++;
                cantComp++;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                      
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cantInter++;
                         cantInter++;
                         cantAsig++;
                         cantAsig++;
                         
                         
                        cambios = true;              // y se marca como cambio.
                    }
                    cantAsig++;
                    cantComp++;
                }
            }
        }
        
        long t_fin = System.currentTimeMillis();
        long tiempo = t_fin - t_ini;
        System.out.println("Tiempo de ejecución = " + tiempo);
        System.out.println("Cant de intercambios = " + cantInter);
        System.out.println("Cant de asignaciones = " + cantAsig);
        System.out.println("Cant de comparaciones = " + cantComp);
        
        
        
}




        
void countSort(int array[], int size) {
    long cantInter = 0;
        long cantAsig = 0;
        long cantComp = 0;
        long t_ini = System.currentTimeMillis();
        
        
         cantComp++;
    int[] output = new int[size + 1];

    // Find the largest element of the array
    int max = array[0];
    cantAsig+=3;
    cantComp++;
    for (int i = 1; i < size; i++) {
        cantComp++;
      if (array[i] > max)
        max = array[i];
      cantAsig++;
    }cantAsig++;
    int[] count = new int[max + 1];

    // Initialize count array with all zeros.
    cantAsig+=2;
    cantComp++;
    for (int i = 0; i < max; ++i) {
      count[i] = 0;
      cantAsig++;
    }cantAsig++;

    // Store the count of each element
    cantAsig++;
    cantComp++;
    for (int i = 0; i < size; i++) {
      count[array[i]]++;
    }cantAsig++;

    // Store the cummulative count of each array
    cantAsig++;
    cantComp++;
    for (int i = 1; i <= max; i++) {
      count[i] += count[i - 1];
      cantAsig++;
    }cantAsig++;

    // Find the index of each element of the original array in count array, and
    // place the elements in output array
    cantAsig++;
    cantComp++;
    for (int i = size - 1; i >= 0; i--) {
      output[count[array[i]] - 1] = array[i];
      count[array[i]]--;
      cantAsig+=2;
    }cantAsig++;

    // Copy the sorted elements into original array
    cantAsig++;
    cantComp++;
    for (int i = 0; i < size; i++) {
      array[i] = output[i];
      cantAsig++;
      cantInter++;
    }cantAsig++;

        long t_fin = System.currentTimeMillis();
        long tiempo = t_fin - t_ini;
        System.out.println("Tiempo de ejecución = " + tiempo);
        System.out.println("Cant de intercambios = " + cantInter);
        System.out.println("Cant de asignaciones = " + cantAsig);
        System.out.println("Cant de comparaciones = " + cantComp);
    
  }

        
        

        
public static void insertionSort(int array[]) {  
        int aux;
        long cantInter = 0;
        long cantAsig = 0;
        long cantComp = 0;
        long t_ini = System.currentTimeMillis();

        cantAsig+=2;
        cantComp++;
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            cantAsig+=2;
            cantComp++;
            cantComp++;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
                cantAsig+=2;
            }
            array[i+1] = key;
            cantInter++;
            cantAsig++;

        }cantAsig++;

        long t_fin = System.currentTimeMillis();
        long tiempo = t_fin - t_ini;
        System.out.println("Tiempo de ejecución = " + tiempo);
        System.out.println("Cant de intercambios = " + cantInter);
        System.out.println("Cant de asignaciones = " + cantAsig);
        System.out.println("Cant de comparaciones = " + cantComp);
    }


    public void copia(int array[],int array2[]){
       for (int i = 0; i < array.length; i++) {
        array[i]=array2[i];
       
        
    }
    
    
}

    
    public void menu(){
        int op;
          
        do {            
             op=Integer.parseInt(JOptionPane.showInputDialog(
                    "1.ingresar datos\n"+
                    
                    "0.Salir\n"));
         
            switch(op){
                
                case 1:
                    int elig=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño del array\n"+
                            "1. 10.000\n"+
                            "2. 50.000\n"+
                            "3. 100.000\n"+
                            "4. 500.000\n"+
                            "5. 1.000.000\n"));
                    switch(elig){
                        case 1:arr1=new int[10000];aleatorio(arr1);arr2=new int[10000]; insertionSort(arr1);countSort(arr1, 10000);     shell(arr1);break;
                        case 2:arr1=new int[50000];aleatorio(arr1);arr2=new int[50000]; insertionSort(arr1);countSort(arr1, 50000); shell(arr1)        ;break;
                        case 3:arr1=new int[100000];aleatorio(arr1);arr2=new int[100000]; insertionSort(arr1);countSort(arr1, 100000);  shell(arr1)     ;break;
                        case 4:arr1=new int[500000];aleatorio(arr1);arr2=new int[500000]; insertionSort(arr1);countSort(arr1, 500000); shell(arr1)      ;break;
                        case 5:arr1=new int[1000000];aleatorio(arr1);arr2=new int[1000000]; insertionSort(arr1);countSort(arr1, 1000000); shell(arr1)    ;break;
                    }
                    
                    
                    ;break;
                case 0: break;
                default:break;
            
                
            }
            if(op<0){
                JOptionPane.showMessageDialog(null,"El valor es incorrecto", "Error", 0);
               }  
        }while(op!=0);
        
    
         }
    
    public void aleatorio(int array[] ){
        for (int i = 0; i < array.length; i++) {
           array[i] = 1 + (int)(Math.random() * 10000); 
         
        }
         //System.out.println(array );
    }
         


    public static void main(String a[]){    
       
        //se llena de datos
        Ordenamiento obj=new Ordenamiento();
        obj.menu();
 
      
        
        
        
    }    
}    
    

