import javax.swing.JOptionPane;

public class Ejemplo1 {

	public void leerEdad(){
		String entrada = JOptionPane.showInputDialog("Ingrese la edad:");
		int edad = Integer.parseInt(entrada);
		if(edad > 17){
			JOptionPane.showMessageDialog(null, "Es mayor de edad");
		}else{
			JOptionPane.showMessageDialog(null, "Es menor de edad");
		}
	}
			
	public static void main(String[] args) {
		Ejemplo1 e1 = new Ejemplo1();
		e1.leerEdad();
	}
}
