import javax.swing.JOptionPane;

public class Ejemplo11 {
	int A[][] = new int[2][2];
	int B[][] = new int[2][3];
	int array[];
	
	public void llenarMatrices(){
		//Llenar la matriz A
		for(int f = 0; f < A.length; f++){
			for(int c = 0; c < A[0].length; c++){
				A[f][c] = 1 + (int)(Math.random() * 100);
			}
		}
		
		//Llenar la matriz B
		for(int f = 0; f < B.length; f++){
			for(int c = 0; c < B[0].length; c++){
				B[f][c] = 1 + (int)(Math.random() * 100);
			}
		}
	}
	
	public void imprimirMatriz(String nomMatriz, int mat[][]){
		String salida = "";
		for(int f = 0; f < mat.length; f++){
			for(int c = 0; c < mat[0].length; c++){
				salida+=nomMatriz + "[" + f + "][" + c + "] = " + mat[f][c] + " - ";
				System.out.print(nomMatriz + "[" + f + "][" + c + "] = " + mat[f][c] + " - ");
			}
			salida+="\n";
			System.out.println();			
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	public void llenarArray() {
		int canElementosA = A.length * A[0].length;//calcular la cantidad de elementos de la matriz A
		int canElementosB = B.length * B[0].length;//calcular la cantidad de elementos de la matriz B
		array = new int[canElementosA + canElementosB];//asignar el tamaño al array
		int indice = 0;
		
		//recorrer la matriz A, y llenar el array
		for(int f = 0; f < A.length; f++){
			for(int c = 0; c < A[0].length; c++){
				array[indice] = A[f][c];
				indice++;
			}
		}
		
		//recorrer la matriz B, y llenar el array
		for(int f = 0; f < B.length; f++){
			for(int c = 0; c < B[0].length; c++){
				array[indice] = B[f][c];
				indice++;
			}
		}
	}
	
	public void imprimirArray(String nomArray, int array[]){
		String salida = "";
		for(int i = 0; i < array.length; i++){
			salida+=nomArray + "[" + i + "] = " + array[i] + "\n";
			System.out.println(nomArray + "[" + i + "] = " + array[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	public void procesos() {
		llenarMatrices();
		imprimirMatriz("A", A);
		imprimirMatriz("B", B);
		llenarArray();
		imprimirArray("array", array);
	}
	
	public static void main(String[] args) {
		Ejemplo11 e11 = new Ejemplo11();
		e11.procesos();
	}
}
