import javax.swing.JOptionPane;

public class Ejemplo8 {
	
	public void leerDatos(){
		String entrada = JOptionPane.showInputDialog("Ingrese el 1er numero:");
		int n1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese el 2do numero:");
		int n2 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese el 3er numero:");
		int n3 = Integer.parseInt(entrada);
		
		salida(n1, n2, n3);
	}
	
	public void salida(int num1, int num2, int num3) {
		int menor = getMenor(num1, num2, num3);
		JOptionPane.showMessageDialog(null, "El menor es: " + menor);
	}
	
	public int getMenor(int num1, int num2, int num3) {				
		int menor = Math.min(num1, Math.max(num2, num3));
		return menor;
	}
	
	public static void main(String[] args) {
		Ejemplo8 e8 = new Ejemplo8();
		e8.leerDatos();
	}
}
