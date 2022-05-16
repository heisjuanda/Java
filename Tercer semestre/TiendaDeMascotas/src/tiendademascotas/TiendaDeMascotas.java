/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendademascotas;

import java.util.Scanner;

/**
 *
 * @author JuanDavid
 */
public class TiendaDeMascotas {

   
    double precioFinal = 0;

    Scanner sc = new Scanner(System.in);

    
    public void menu() {
        int op = 0;

        do {
            System.out.println("Ingrese una opcion\n" + "1.Comprar mascota\n" + "2.Comprar alimento\n"
                    + "3.Comprar habitad\n"+"4.Generar factura\n"+"0.Salir\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Perro perro = new Perro(Raza.Labrador, "pipe",1);
                    precioFinal+=perro.getPrecio();
                    System.out.println("Se añadió un perro a la lista");
                    break;
                case 2:
                    Alimento alimento = new Alimento(MarcaAlimento.Nupec);
                    precioFinal+=alimento.getPrecio();
                    System.out.println("Se añadió un alimento a la lista");
                    break;
                case 3:
                    Habitad habitad = new Habitad(2);
                    precioFinal+=habitad.getPrecio();
                    System.out.println("Se añadió un habitad a la lista");
                    break;
                case 4:
                    System.out.println("Gracias por su compra!!!\n"+"Precio total: "+precioFinal);
                    op=0;
                    break;
                default:
                    op = 0;
                    break;
            }

        } while (op != 0);

    }

    public static void main(String[] args) {

       TiendaDeMascotas t = new TiendaDeMascotas();
       t.menu();
        
    }

}
