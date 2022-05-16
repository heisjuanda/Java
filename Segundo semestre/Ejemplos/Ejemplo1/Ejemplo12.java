import javax.swing.JOptionPane;

public class Ejemplo12 {
	int A[][] = new int[3][5];
	
	public void llenarMatriz(){
		//Llenar la matriz A
		for(int f = 0; f < A.length; f++){
			for(int c = 0; c < A[0].length; c++){
				A[f][c] = 1 + (int)(Math.random() * 100);
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
	
	public int sumaFila(int matriz[][], int filaSumar) {
		int sum = 0;
		for(int c = 0; c < matriz[0].length; c++){
			sum+=matriz[filaSumar][c];
		}		
		return sum;
	}
	
	public int sumaColumna(int matriz[][], int colSumar) {
		int sum = 0;
		for(int f = 0; f < matriz.length; f++){
			sum+=matriz[f][colSumar];
		}
		return sum;
	}
	
	public void leerIndicadores() {
		String entrada = JOptionPane.showInputDialog("Ingrese el indice de la fila a sumar:");
		int indiceFila = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese el indice de la columna a sumar:");
		int indiceCol = Integer.parseInt(entrada);
		
		int sumaF = sumaFila(A, indiceFila);
		int sumaC = sumaColumna(A, indiceCol);
		JOptionPane.showMessageDialog(null, 
				"La suma de los elementos de la fila " + indiceFila + " es = " + sumaF + "\n" + 
				"La suma de los elementos de la columna " + indiceCol + " es = " + sumaC);		
	}
	
	public void procesos() {
		llenarMatriz();
		imprimirMatriz("A", A);
		leerIndicadores();
	}
	
	public static void main(String[] args) {
		Ejemplo12 e12 = new Ejemplo12();
		e12.procesos();
	}
}
