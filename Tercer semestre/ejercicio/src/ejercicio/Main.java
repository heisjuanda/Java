/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import static ejercicio.Toyota.cantidad;
import java.util.ArrayList;

/**
 *
 * @author JuanDavid
 */
public class Main {

    ArrayList<Toyota> toyotas = new ArrayList<>();
    String[] marc = {"airforce", "real", "republic"};

    public void Vehiculos(String dato) {
        Toyota t = new Toyota();

        int valor = 0;
        valor = 10000 + (int) (Math.random() * 25000);
        t.setPrecio(valor);
        valor = 0;

        t.setMarca(dato);

        toyotas.add(t);
        cantidad++;
        System.out.println(cantidad);

    }
    
    
    public void carrosInicio() {
        Toyota t = new Toyota();

        int valor = 0;
        valor = 10000 + (int) (Math.random() * 25000);
        t.setPrecio(valor);
        valor = 0;

        String marcaVe="";
        valor = (int)(Math.random()*3);
        marcaVe=marc[valor];
        t.setMarca(marcaVe);

        toyotas.add(t);
        cantidad++;
        System.out.println(cantidad);

    }
    

    public double PrecioV(String dato) {

        double precio=0;
        for (int i = 0; i < toyotas.size(); i++) {
            if(toyotas.get(i).getMarca().equals(dato)){
                precio=toyotas.get(i).getPrecio();
            }
        }
        return precio;
    }

    public void si() {

        for (int i = 0; i < toyotas.size(); i++) {
            System.out.println(toyotas.get(i).getMarca());
            System.out.println(toyotas.get(i).getPrecio());
        }

    }

    public static void main(String[] args) {
         Main m = new Main();
        for (int i = 0; i < 3; i++) {
            m.carrosInicio();
        }
       
        Gui g = new Gui();

    }
}
