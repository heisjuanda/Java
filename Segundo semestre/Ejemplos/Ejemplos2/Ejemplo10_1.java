
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejemplo10_1 {
    
    String arreglo1[] = new String[5];
    String arreglo2[] = new String[5];
    
    public void leer(){
		JOptionPane.showMessageDialog(null, "Ingresar datos del array A[]");
		for(int i = 0; i < arreglo1.length; i++){
			arreglo1[i] = JOptionPane.showInputDialog("Ingrese el elemento A[" + i + "] = ");
		}
		
		JOptionPane.showMessageDialog(null, "Ingresar datos del array B[]");
		for(int i = 0; i < arreglo2.length; i++){
			arreglo2[i] = JOptionPane.showInputDialog("Ingrese el elemento B[" + i + "] = ");
		}
	}
    
    public void imprimir(String nomArray, String array[]){
		String salida = "";
		for(int i = 0; i < array.length; i++){
			salida+=nomArray + "[" + i + "] = " + array[i] + "\n";
			System.out.println(nomArray + "[" + i + "] = " + array[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
    
    public boolean iguales(String array1[], String array2[]) {
		boolean igual = true;//se asume que los arrays son iguales
		for(int i = 0; i < array1.length; i++) {
			//if(!array1[i].equals(array2[i])) {
                        if(!array1[i].equalsIgnoreCase(array2[i])) {
				igual = false;//si existe diferencia entre los valores, entonces asignar false a la variable igual
				break;//romper el bucle, ya que se encontraron dos valores diferentes 
			}
		}
		return igual;//retornar el valor asignado a la variable
	}
    
    public void info() {
		leer();
		imprimir("A", arreglo1);
		imprimir("B", arreglo2);
		boolean resul = iguales(arreglo1, arreglo2);
		
		if(resul){//es lo mismo que if(resul == true)
			JOptionPane.showMessageDialog(null, "A[] es igual a B[]");
		}else {
			JOptionPane.showMessageDialog(null, "A[] no es igual a B[]");
		}
	}
    
    public static void main(String[] args) {
        Ejemplo10_1 e10_1 = new Ejemplo10_1();
        e10_1.info();
    }
    
}
