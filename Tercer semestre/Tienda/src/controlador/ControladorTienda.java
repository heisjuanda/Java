/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BaseDatos.bd;
import Modelo.Producctos;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.GuiTienda;

/**
 *
 * @author JuanDavid
 */
public class ControladorTienda implements ActionListener{
    
    GuiTienda guiTienda;
    Producctos producto;
    bd BD;

    public ControladorTienda(GuiTienda guiTienda, Producctos producto) {
        this.guiTienda = guiTienda;
        this.producto = producto;
        this.guiTienda.aadir.addActionListener(this);
        BD = new bd();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       String nombre = guiTienda.cnombre.getText();
       int precio=-1;
       try{
           precio = Integer.parseInt(guiTienda.precio.getText());
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(guiTienda,e);
       }
       if(precio>0){
           String categoria = (String) guiTienda.categoria.getSelectedItem();
           System.out.println(precio+nombre+categoria);
           producto.setNombre(nombre);
           producto.setPrecioUds(precio);
           producto.setCategria(categoria);
           BD.guardar(producto);
       }
        
       
    }

   
    
    
    
}
