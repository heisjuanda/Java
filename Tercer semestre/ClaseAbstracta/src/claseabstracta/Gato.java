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
public class Gato implements InterfazDelMamifero{

    @Override
    public int edadAmantar() {
        return 0;
    }

    @Override
    public String formaReproduccion() {
        return "en el techo";
    }

    @Override
    public String clima() {
        return "clima frio";
    }
    
}
