import javax.swing.JOptionPane;

public class Ejemplo10 {
	int A[] = new int[5];
	int B[] = new int[5];
	
	public void leer(){
		JOptionPane.showMessageDialog(null, "Ingresar datos del array A[]");
		for(int i = 0; i < A.length; i++){
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento A[" + i + "] = "));
		}
		
		JOptionPane.showMessageDialog(null, "Ingresar datos del array B[]");
		for(int i = 0; i < B.length; i++){
			B[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento B[" + i + "] = "));
		}
	}
	
	public void imprimir(String nomArray, int array[]){
		String salida = "";
		for(int i = 0; i < array.length; i++){
			salida+=nomArray + "[" + i + "] = " + array[i] + "\n";
			System.out.println(nomArray + "[" + i + "] = " + array[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	public boolean iguales(int array1[], int array2[]) {
		boolean igual = true;//se asume que los arrays son iguales
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				igual = false;//si existe diferencia entre los valores, entonces asignar false a la variable igual
				break;//romper el bucle, ya que se encontraron dos valores diferentes 
			}
		}
		return igual;//retornar el valor asignado a la variable
	}
	
	public void info() {
		leer();
		imprimir("A", A);
		imprimir("B", B);
		boolean resul = iguales(A, B);
		
		if(resul){//es lo mismo que if(resul == true)
			JOptionPane.showMessageDialog(null, "A[] es igual a B[]");
		}else {
			JOptionPane.showMessageDialog(null, "A[] no es igual a B[]");
		}
	}
			
	public static void main(String[] args) {
		Ejemplo10 e10 = new Ejemplo10();
		e10.info();
	}
}
