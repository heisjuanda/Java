/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Convertir implements ConvertirPeso {

    public static void main(String[] args) {

        Convertir c = new Convertir();
        //System.out.println(c.KilosAGramo() + " gramos");
        //System.out.println(c.OnzaAGramo()+" gramos");
        //System.out.println(c.LibraAOnza()+" onzas");
        //System.out.println(c.ToneladaALibra() + " libras");
    }

    @Override
    public double KilosAGramo(double kilo) {

        double valorTotal = 0;// kilo = 0;
        //kilo = Integer.parseInt(JOptionPane.showInputDialog("Digite la contidad de kilos"));

        valorTotal = kilo / 1000;

        return valorTotal;
    }

    @Override
    public double OnzaAGramo(double onza) {
        double valorTotal = 0; //onza = 0;
        //onza = Integer.parseInt(JOptionPane.showInputDialog("Digite la contidad de onzas"));

        valorTotal = onza * 28.35;
        return valorTotal;
    }

    @Override
    public double LibraAOnza(double libra) {
        double valorTotal = 0;// libra = 0;
        //libra = Integer.parseInt(JOptionPane.showInputDialog("Digite la contidad de libras"));

        valorTotal = libra * 16;
        return valorTotal;
    }

    @Override
    public double ToneladaALibra(double tonelada) {
        double valorTotal = 0;// tonelada = 0;
        // tonelada = Integer.parseInt(JOptionPane.showInputDialog("Digite la contidad de toneladas"));

        valorTotal = tonelada * 2000;
        return valorTotal;
    }

}
