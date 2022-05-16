import javax.swing.JOptionPane;

public class Ejemplo3 {

	public void leerNotas(){
		String entrada = JOptionPane.showInputDialog("Ingrese la nota 1:");
		double n1 = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese la nota 2:");
		double n2 = Double.parseDouble(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese la nota final:");
		double nf = Double.parseDouble(entrada);
		
		calcularDef(n1, n2, nf);//lamado al metodo
	}	
	
	public void calcularDef(double n1, double n2, double nf){
		double def = (n1 * 0.3) + (n2 * 0.3) + (nf * 0.4);
		          mostrarNotas(def);//salida se llama
	}
	public void mostrarNotas(double def){
            JOptionPane.showMessageDialog(null, "Nota definitiva = " + def);
        }
        
	public static void main(String[] args) {
		Ejemplo3 e3 = new Ejemplo3();
		e3.leerNotas();
	}
}
