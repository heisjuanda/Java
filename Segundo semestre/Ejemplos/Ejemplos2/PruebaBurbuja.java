/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class PruebaBurbuja {
    
    int arreglo[] = new int[50000];
    
    public void ale(){
        for (int i = 0; i < arreglo.length; i++) {
           arreglo[i] = 1 + (int)(Math.random() * 10000); 
        }
    }
    
    public void burbuja(){//4, 5, 10 aux = 4
        int i, j, aux;
        long cantInter = 0;
        long cantAsig = 0;
        long cantComp = 0;
        long t_ini = System.currentTimeMillis();
        
        cantAsig++;
        cantComp++;//i < arreglo.length - 1
        for (i = 0; i < arreglo.length - 1; i++) {
            cantAsig++;
            cantComp++;//j < arreglo.length - i - 1
            for (j = 0; j < arreglo.length - i - 1; j++) {
                cantComp++;//arreglo[j + 1] < arreglo[j]
                if (arreglo[j + 1] < arreglo[j]) {
                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                    cantInter++;
                    cantAsig+=3;
                }
                cantAsig++;//j++
            }
            cantAsig++;//i++
        }
        
        long t_fin = System.currentTimeMillis();
        long tiempo = t_fin - t_ini;
        System.out.println("Tiempo de ejecución = " + tiempo);
        System.out.println("Cant de intercambios = " + cantInter);
        System.out.println("Cant de asignaciones = " + cantAsig);
        System.out.println("Cant de comparaciones = " + cantComp);
    }
    
    public void imprimir(){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
    }
    
    public static void main(String[] args) {
        PruebaBurbuja pb = new PruebaBurbuja();
        pb.ale();
        //pb.imprimir();
        pb.burbuja();
        //pb.imprimir();
    }
    
}
