
public class Ejemplo6 {

	public double getMayor() {
		double num1 = (Math.random() * 10);
		System.out.println(num1);
		
		double num2 = (Math.random() * 10);
		System.out.println(num2);
		
		double num3 = (Math.random() * 10);
		System.out.println(num3);
		
		double mayor = Math.max(num1, Math.max(num2, num3));
		return mayor;
	}
	
	public static void main(String[] args) {
		Ejemplo6 e6 = new Ejemplo6();
		double mayor = e6.getMayor();
		System.out.println("El mayor es: " + mayor);
	}
}
