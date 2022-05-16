import javax.swing.JOptionPane;

public class Ejemplo2 {

	public void leerEdad(){
		String entrada = JOptionPane.showInputDialog("Ingrese la edad:");
		int edad = Integer.parseInt(entrada);
		esMayorEdad(edad);//lamado al metodo
	}	
	
	
	public void esMayorEdad(int edad){
		if(edad > 17){
			JOptionPane.showMessageDialog(null, "Es mayor de edad");
		}else{
			JOptionPane.showMessageDialog(null, "Es menor de edad");
		}
	}
	
	public static void main(String[] args) {
		Ejemplo2 e2 = new Ejemplo2();
		e2.leerEdad();
	}
}
