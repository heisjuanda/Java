/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BasesDeDatos.bdProducto;
import Modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.guiTienda;

/**
 *
 * @author User
 */
public class ControladorTienda implements ActionListener{
    
    guiTienda gui;
    Producto producto;
    bdProducto bd;

    public ControladorTienda(guiTienda gui, Producto producto) {
        this.gui = gui;
        this.producto = producto;
        this.gui.jButton2.addActionListener(this);
        bd = new bdProducto();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombre = gui.campoNombre.getText();
        int precio = -1;
        try{
            precio = Integer.parseInt(gui.campoPrecio.getText());
        }catch(NumberFormatException expcetion){
            JOptionPane.showMessageDialog(gui, "Inserta un número valido");
        }
        if(precio>0){
            String categoria = (String)gui.comboCategoria.getSelectedItem();
            System.out.println(nombre + precio + categoria);
            producto.setNombre(nombre);
            producto.setPrecio_por_unidad(precio);
            producto.setCategoria(categoria);
            bd.guardarProducto(producto);
        }
         
    }
    
    
}
