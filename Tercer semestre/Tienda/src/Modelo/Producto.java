/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Producto {
    
    private String nombre;
    private int precio_por_unidad;
    private String categoria;

    public Producto(String nombre, int precio_por_unidad, String categoria) {
        this.nombre = nombre;
        this.precio_por_unidad = precio_por_unidad;
        this.categoria = categoria;
    }
    
    public Producto(){
    
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio_por_unidad
     */
    public int getPrecio_por_unidad() {
        return precio_por_unidad;
    }

    /**
     * @param precio_por_unidad the precio_por_unidad to set
     */
    public void setPrecio_por_unidad(int precio_por_unidad) {
        this.precio_por_unidad = precio_por_unidad;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
