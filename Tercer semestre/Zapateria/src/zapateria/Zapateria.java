/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author JuanDavid
 */
public class Zapateria {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        /*String n= new String("asjdiasncxoiaekajscn");
        Random nAleatorio= new Random();
        byte letra = (byte)nAleatorio.nextInt(n.length()-1);
        for (int i = 0; i < 10; i++) {
             System.out.print(n.charAt(letra));
        }*/
        int aleatorio = 1;
        int paresR = 5;
        aleatorio = (int) (Math.random() * 3);

        String modeloNike = "";
        String[] modelo = {"airforce", "one", "republic"};
        modeloNike = modelo[aleatorio];

        aleatorio = 10;
        aleatorio = (int) (Math.random() * 45);
        Nike nike = new Nike(modeloNike, Material.Caucho, aleatorio, Color.Rojo);

        aleatorio = (int) (Math.random() * 45);
        Adidas adidas = new Adidas(true, Material.Corcho, aleatorio, Color.Verde);

        aleatorio = (int) (Math.random() * 45);
        paresR = (int) (Math.random() * 4500);
        CommeDesGarconS commeDesGarsons = new CommeDesGarconS(paresR, Material.Textil, aleatorio, Color.Amarillo);

        aleatorio = (int) (Math.random() * 45);
        Jordan jordan = new Jordan(true, Material.Cuero, aleatorio, Color.Negro);

        aleatorio = (int) (Math.random() * 45);
        Puma puma = new Puma(false, Material.Textil, aleatorio, Color.Verde);

        aleatorio = (int) (Math.random() * 45);
        paresR = (int) (Math.random() * 451);
        Supreme supreme = new Supreme(paresR, Material.Cuero, aleatorio, Color.Rojo);

        aleatorio = (int) (Math.random() * 45);
        Lacoste lacoste = new Lacoste(true, Material.Caucho, aleatorio, Color.Cafe);

        aleatorio = (int) (Math.random() * 45);
        Dior dior = new Dior(true, Material.Textil, aleatorio, Color.Blanco);

        aleatorio = (int) (Math.random() * 45);
        Vans vans = new Vans(false, Material.Textil, aleatorio, Color.Rojo);

        aleatorio = (int) (Math.random() * 45);
        Casio casio = new Casio(true, Material.Textil, aleatorio, Color.Blanco);
        aleatorio = (int) (Math.random() * 45);

        //Zapato [] zapatos = {nike,adidas,commeDesGarsons,jordan,puma,supreme,lacoste,dior,vans,casio}; 
        //System.out.println(Arrays.toString(Color.values()));
        System.out.println("modelo: " + nike.getModelo() + " color: " + nike.getColor() + " material: " + nike.getMaterial() + " talla:" + nike.getTalla());
        System.out.println("");
        System.out.println("de colección: " + adidas.isDeColección() + " color: " + adidas.getColor() + " material: " + adidas.getMaterial() + " talla:" + adidas.getTalla());
        System.out.println("");
        System.out.println("número de pares fabricados: " + commeDesGarsons.getParesFabricados() + " color: " + commeDesGarsons.getColor() + " material: " + commeDesGarsons.getMaterial() + " talla:" + commeDesGarsons.getTalla());
        System.out.println("");
        System.out.println("hechos por travis?: " + jordan.isHechosPorTravisScott() + " color: " + jordan.getColor() + " material: " + jordan.getMaterial() + " talla:" + jordan.getTalla());
        System.out.println("");
        System.out.println("son de deporte?: " + puma.isParaDeporte() + " color: " + puma.getColor() + " material: " + puma.getMaterial() + " talla:" + puma.getTalla());
        System.out.println("");
        System.out.println("pares por temporada: " + supreme.getNumeroDeTemporada() + " color: " + supreme.getColor() + " material: " + supreme.getMaterial() + " talla:" + supreme.getTalla());
        System.out.println("");
        System.out.println("son de francia?: " + lacoste.isDeFrancia() + " color: " + lacoste.getColor() + " material: " + lacoste.getMaterial() + " talla:" + lacoste.getTalla());
        System.out.println("");
        System.out.println("precio desorvitado?: " + dior.isSonUnRobo() + " color: " + dior.getColor() + " material: " + dior.getMaterial() + " talla:" + dior.getTalla());
        System.out.println("");
        System.out.println("son para skaters?: " + vans.isParaSkaters() + " color: " + vans.getColor() + " material: " + vans.getMaterial() + " talla:" + vans.getTalla());
        System.out.println("");
        System.out.println("tienen calculadora?: " + casio.isIncluyeCalculadora() + " color: " + casio.getColor() + " material: " + casio.getMaterial() + " talla:" + casio.getTalla());

    }

}
