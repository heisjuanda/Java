/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author JuanDavid
 */
public class Perro extends Cnino implements InterfazDelMamifero, mejorAmigoHombre  {

    @Override
    public int edadAmantar() {
        return 0;
    }

    @Override
    public String formaReproduccion() {
        return "pegandose";
    }

    @Override
    public String clima() {
        return "clima caliente";
    }

    @Override
    public boolean haceCaso() {
        return true;
    }

    @Override
    public String formaSaludar() {
        return "mueve la cola";
    }

}
