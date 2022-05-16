/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JuanDavid
 */
public class Player {

    int partida;

    public Player(int partida) {
        this.partida = partida;
    }

    public Player() {
        partida = 0;
    }

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

}
