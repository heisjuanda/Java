/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Excepciones {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        //ArrayList<Integer>lista2 = new ArrayList<>(); 

        do {
            try {
                Scanner scan = new Scanner(System.in);
                lista1.add(scan.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("dígitos plocs");
            }

        } while (lista1.size()<5);

        for (Object elemObject : lista1) {
            System.out.print(elemObject);
        }

    }

}
