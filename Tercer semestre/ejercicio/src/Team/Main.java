/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Main {

    //Carro1[] c = new Carro1[carro.getC()];
    double[] precios = {100000, 200000, 500000};
    String[] marcas = {"lambo", "ferrari", "mazda"};
    ArrayList<Carro1> carros = new ArrayList<Carro1>();

    public void crearCarro() {

        Carro1 carro = new Carro1();
/*
        int i = 0;
        double p = 0;
        String m = "";

        i = (int) (Math.random() * 3);
        m = marcas[i];
        i = 0;
        i = (int) (Math.random() * 3);
        p = precios[i];

        carro.setNombre(m);
        carro.setPrecio(p);*/

        carros.add(carro);
    }

    public double Datos(String dato) {
        double pre = 0;
        for (int i = 0; i < carros.size(); i++) {
            if (dato.equals(carros.get(i).getNombre())) {
                pre = carros.get(i).getPrecio();
            }else{
                JOptionPane.showMessageDialog(null, "No encontrado");
            }

        }
        return pre;
    }

    public void imprimir() {
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i).getNombre());
            System.out.println(carros.get(i).getPrecio());
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Interfaz k = new Interfaz();
        //k.crearCarro();
        /*for (int i = 0; i < 5; i++) {
           
        }*/
        
        
        
    }

}
