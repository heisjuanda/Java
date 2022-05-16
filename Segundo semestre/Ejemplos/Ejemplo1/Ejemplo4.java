import javax.swing.JOptionPane;

public class Ejemplo4 {

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
	
	public int calcularSuma(){
		int suma = 0;
		for(int i = 0; i < valores.length; i++){
			suma+=valores[i];
		}
		return suma;//retorna el valor de suma
	}
	
	public void mostrarSuma(){
		int sum = calcularSuma();//llamar al metodo calcularSuma()
		JOptionPane.showMessageDialog(null, 
				"La sumatoria de los elementos es: " + sum);
	}
	
	public static void main(String[] args) {
		Ejemplo4 e4 = new Ejemplo4();
		e4.llenar();
		e4.imprimir();
		e4.mostrarSuma();
	}
}
