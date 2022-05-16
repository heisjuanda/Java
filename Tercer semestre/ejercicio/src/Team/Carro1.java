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
public class Carro1 extends Vehicle {

    public Carro1() {
        super();
        precio = 250000;
        nombre = "Mazda";
        cantidad = 1;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getC() {
        return cantidad;
    }

    public void comprar() {
        cantidad++;
    }

    public void crear(ArrayList<Carro1> C) {
        double precio = 0;
        String nombre = "";

        precio = Integer.parseInt(JOptionPane.showInputDialog("digite el precio"));
        nombre = JOptionPane.showInputDialog("digite el nombre");
        setPrecio(precio);
        setNombre(nombre);
        C.add(this);

        for (int i = 0; i < C.size(); i++) {
            System.out.println(C.get(i).getNombre());
            System.out.println(C.get(i).getPrecio());
        }
    }

    public static void main(String[] args) {
        ArrayList<Carro1> carros = new ArrayList<Carro1>();
        Carro1 c = new Carro1();
        c.crear(carros);
    }

}
