/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template filen, choose Tools | Templates
 * and open the templante in the editor.
 */
package controlador;

import basedatos.BaseDatosTiendaDeporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Productos;
import vista.GuiTiendaDeportes;

/**
 *
 * @author JuanDavid
 */
public class ControladorTiendaDeportes implements ActionListener {

    GuiTiendaDeportes tiendaDeporte;
    Productos productosTiendaDeporte;
    BaseDatosTiendaDeporte baseDatosTiendaDeporte = new BaseDatosTiendaDeporte();

    public ControladorTiendaDeportes(GuiTiendaDeportes tiendaDeporte, Productos productosTiendaDeporte) {
        this.tiendaDeporte = tiendaDeporte;
        this.productosTiendaDeporte = productosTiendaDeporte;
        this.tiendaDeporte.añadir.addActionListener(this);
        this.tiendaDeporte.eliminar.addActionListener(this);
        this.tiendaDeporte.consultar.addActionListener(this);
        this.tiendaDeporte.actualizar.addActionListener(this);
    }

    public void Consola(int num) {

        String ID = "";
        String nombre = "";
        double precio = 0;
        String tipoDeporte = "";

        Scanner scan = new Scanner(System.in);
        String tipos[] = {"tennis", "futbol", "baloncesto", "baseball"};

        System.out.println("digita la id");
        ID = scan.nextLine();
        System.out.println("digita el nombre");
        nombre = scan.nextLine();

        System.out.println("digita el precio");
        precio = scan.nextInt();

        System.out.println("escoge el tipo de deporte\n" + "1. tennis\n"
                + "2.futbol\n" + "3.baloncesto\n" + "4.baseball\n");
        int a = scan.nextInt();
        tipoDeporte = tipos[a];

        productosTiendaDeporte.setNombre(nombre);
        productosTiendaDeporte.setPrecio(precio);
        productosTiendaDeporte.setTipoDeporte(tipoDeporte);
        productosTiendaDeporte.setId(ID);

        if (num == 2) {
            baseDatosTiendaDeporte.insertar(productosTiendaDeporte);
        }
        if (num == 3) {
            baseDatosTiendaDeporte.eliminar(productosTiendaDeporte);
        }
        if (num == 4) {
            baseDatosTiendaDeporte.actualizar(productosTiendaDeporte);
        }
        if (num == 5) {
            baseDatosTiendaDeporte.consultar();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String nombreP = tiendaDeporte.cNombre.getText();
        String IDp = tiendaDeporte.cID.getText();

        double preciop = 0;
        try {
            preciop = Integer.parseInt(tiendaDeporte.cPrecio.getText());
            while (preciop < 0) {
                JOptionPane.showMessageDialog(tiendaDeporte, "El valor del producto esta muy raro, de otro mejor");
                double b = Integer.parseInt(JOptionPane.showInputDialog("Digite nuevo valor:"));
                preciop = b;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(tiendaDeporte, e);
        }

        String deportep = (String) tiendaDeporte.cDeporte.getSelectedItem();

        productosTiendaDeporte.setNombre(nombreP);
        productosTiendaDeporte.setPrecio(preciop);
        productosTiendaDeporte.setTipoDeporte(deportep);
        productosTiendaDeporte.setId(IDp);

        if (ae.getSource() == tiendaDeporte.añadir) {
            baseDatosTiendaDeporte.insertar(productosTiendaDeporte);
        }
        if (ae.getSource() == tiendaDeporte.eliminar) {
            baseDatosTiendaDeporte.eliminar(productosTiendaDeporte);
        }
        if (ae.getSource() == tiendaDeporte.actualizar) {
            baseDatosTiendaDeporte.actualizar(productosTiendaDeporte);
        }
        if (ae.getSource() == tiendaDeporte.consultar) {
            baseDatosTiendaDeporte.consultar();
        }

    }

}
