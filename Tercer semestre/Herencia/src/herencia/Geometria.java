/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author JuanDavid
 */
public class Geometria {
    public static void main(String[] args) {
        /*Circulo circulo = new Circulo(5);
        System.out.println(circulo.getArea());
        Cilindro cilindro = new Cilindro(4, 7);
        System.out.println(cilindro.getArea());*/
        //array de circulos
        Circulo lista[] = new Cilindro[4];
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(11);
        Circulo circulo3 = new Circulo(23);
        Cilindro cilindro = new Cilindro(7, 7);
        lista[0] = circulo1;
        lista[1] = circulo2;
        lista[2] = circulo3;
        lista[3] = cilindro;
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getArea());
        }
      // Circulo circulo1 = new Circulo(4);
      // Circulo circulo2 = new Cilindro(4,4);
                
    }
}
