import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejemplo9 {

	int valores[] = new int[10];
	
	public void llenar(){
		for(int i = 0; i < valores.length; i++){
			valores[i] = 1 + (int)(Math.random() * 20);
		}
	}
	
	public void imprimir(){
		String salida = "";
		for(int i = 0; i < valores.length; i++){
			salida+="valores[" + i + "] = " + valores[i] + "\n";
			System.out.println("valores[" + i + "] = " + valores[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	public int getFrecuencia(int array[], int valorBuscar){
		int veces = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == valorBuscar) {
				veces++;
			}
		}
		return veces;
	}
	
	public void buscar() {
		String entrada = JOptionPane.showInputDialog("Ingrese el valor a buscar:");
		int buscar = Integer.parseInt(entrada);
		
		int cont = getFrecuencia(valores, buscar);
		JOptionPane.showMessageDialog(null, buscar + " esta " + cont + " veces.");
	}
	
	public static void main(String[] args) {
		Ejemplo9 e9 = new Ejemplo9();
		e9.llenar();
		e9.imprimir();
		e9.buscar();
	}
}
