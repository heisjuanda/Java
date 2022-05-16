import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejemplo7 {

	int valores[] = new int[10];
	
	public void llenar(){
		for(int i = 0; i < valores.length; i++){
			valores[i] = 1 + (int)(Math.random() * 100);
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
	
	public int[] getMenorayorSuma(){
		int datos[] = new int[2];
		Arrays.sort(valores);//ordenar ascendentemente el array con el metodo sort() de la clase Arrays
		datos[0] = valores[0];//almacenar el menor
		datos[1] = valores[valores.length - 1];//ir a la ultima posicion del array y obtener el mayor, 
												//para almacenarlo en el array datos[]
		return datos;//retornar el array datos[]
	}
	
	public void mostrarInfo(){
		int menorYMayor[] = getMenorayorSuma();
		JOptionPane.showMessageDialog(null, 
				"Menor valor: " + menorYMayor[0] + "\n" + 
				"Mayor valor: " + menorYMayor[1]);
	}
	
	public static void main(String[] args) {
		Ejemplo7 e7 = new Ejemplo7();
		e7.llenar();
		e7.imprimir();
		e7.mostrarInfo();
	}
}
