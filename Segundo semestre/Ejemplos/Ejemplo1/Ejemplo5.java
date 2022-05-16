import java.util.Calendar;

import javax.swing.JOptionPane;

public class Ejemplo5 {

	public String getFecha() {
		String fecha = "";
		Calendar cal = Calendar.getInstance();//obtener una instancia del calendario del sistema
		int dia = cal.get(Calendar.DATE);
		int mes = cal.get(Calendar.MONTH) + 1;//Para Java los meses comienza cero, es decir Enero es 0, Febrero 1, .... Diciembre 11
		int year = cal.get(Calendar.YEAR);
		
		if(dia < 10) fecha+="0" + dia + "/";
		else fecha+=dia + "/";
		
		if(mes < 10) fecha+="0" + mes + "/";
		else fecha+=mes + "/";
		
		fecha+=year;
		
		return fecha;		
	}
	
	public static void main(String[] args) {
		Ejemplo5 e5 = new Ejemplo5();
		String fechaActual = e5.getFecha();
		JOptionPane.showMessageDialog(null, "Hoy es: " + fechaActual);
	}
}
