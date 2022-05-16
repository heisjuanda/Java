import javax.swing.JOptionPane;

public class Ejemplo2 {

    
    public void leerEdad(){
		String entrada = JOptionPane.showInputDialog("Ingrese la edad:");
		int edad = Integer.parseInt(entrada);//10
		esMayorEdad(edad);//lamado al metodo
                System.out.println("leerEdad = " + edad);//?
	}	
	
	
	public void esMayorEdad(int edad){//10
            edad*=10;//100
            System.out.println("esMayorEdad = " + edad);
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
