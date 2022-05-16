/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Player;
import parcial2.BaseDeDatos;
import parcial2.Ex;
import vista.Gui;

/**
 *
 * @author JuanDavid
 */
public class Controlador implements ActionListener {

    Gui g;
    BaseDeDatos BD;
    Player player1;
    Player player2;
    int jugador1;
    int jugador2;

    public Controlador(Gui g) {
        this.g = g;
        this.BD = new BaseDeDatos();
        this.player1 = new Player();
        this.player2 = new Player();
        this.jugador1 = 0;
        this.jugador2 = 0;
        this.g.bg.addActionListener(this);
    }

    public void Random() throws Ex {

        jugador1 = jugador1 - Integer.parseInt(g.uno.getText());
        jugador2 = jugador2 - Integer.parseInt(g.seis.getText());
        int random = 0;
        random = (int) (1 * Math.random() * 100);
        if (random == 0) {
            random++;
        }
        g.uno.setText(random + "");

        random = 0;
        random = (int) (1 * Math.random() * 100);
        if (random == 0) {
            random++;
        }
        g.seis.setText(random + "");

        jugador1 = Integer.parseInt(g.uno.getText()) + jugador1;

        jugador2 = Integer.parseInt(g.seis.getText()) + jugador2;

        if (player1.getPartida() == 1) {
            if (jugador1 > jugador2) {
                g.PuntosGanador.setText("player 1");
                BD.insertar("Jugador1");
            }
            if (jugador2 > jugador1) {

                BD.insertar("Empate");
                g.PuntosGanador.setText("empate");
                throw new Ex("Que raro un empate");
            }

        }
        if (player2.getPartida() == 1) {
            if (jugador2 > jugador1) {
                BD.insertar("Jugador2");
                g.PuntosGanador.setText("player 2");
            }
            if (jugador1 > jugador2) {
                BD.insertar("Empate");
                g.PuntosGanador.setText("empate");
                throw new Ex("Que raro un empate");
            }

        }
        if (player2.getPartida() == player1.getPartida()) {
            if (jugador1 == jugador2) {
                g.PuntosGanador.setText("empate");
                BD.insertar("Empate");
                throw new Ex("Que raro un empate");
            }
            if (jugador1 > jugador2) {
                g.PuntosGanador.setText("player 1");
                BD.insertar("player 1");
            } else {
                g.PuntosGanador.setText("player 2");
                BD.insertar("player 2");
            }
        }

    }

    public void LeerDatos() {
        String paraMostrar = "";
        int datos[] = new int[10];
        int i = 0;

        try {
            FileReader f = new FileReader("texto.txt");
            BufferedReader b = new BufferedReader(f);
            String lineaActual = "";

            while ((lineaActual = b.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(lineaActual, ",");
                while (tokens.hasMoreTokens()) {
                    paraMostrar = tokens.nextToken();
                    datos[i] = Integer.parseInt(paraMostrar);
                    i++;
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        } catch (NoSuchElementException ex) {
            System.out.println("Error " + ex);
        }

        Thread hilo = new Thread() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < datos.length; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    g.barraP.setValue(i);
                    a = datos[i];
                    if (0 == i) {
                        g.uno.setText(a + "");
                        jugador1 += a;
                    }
                    if (1 == i) {
                        g.dos.setText(a + "");
                        jugador1 += a;
                    }
                    if (2 == i) {
                        g.tres.setText(a + "");
                        jugador1 += a;
                    }
                    if (3 == i) {
                        g.cuatro.setText(a + "");
                        jugador1 += a;
                    }
                    if (4 == i) {
                        g.cinco.setText(a + "");
                        jugador1 += a;
                    }
                    if (5 == i) {
                        g.seis.setText(a + "");
                        jugador2 += a;
                    }
                    if (6 == i) {
                        g.siete.setText(a + "");
                        jugador2 += a;
                    }
                    if (7 == i) {
                        g.ocho1.setText(a + "");
                        jugador2 += a;
                    }
                    if (8 == i) {
                        g.nueve1.setText(a + "");
                        jugador2 += a;
                    }
                    if (9 == i) {
                        g.diez.setText(a + "");
                        jugador2 += a;

                        if (jugador1 > jugador2) {

                            g.PuntosGanador.setText("player 1");
                            player1.setPartida(1);
                        }
                        if (jugador2 > jugador1) {
                            g.PuntosGanador.setText("Player 2");
                            player2.setPartida(1);
                        }
                        if (jugador1 == jugador2) {
                            g.PuntosGanador.setText("Empate");
                            player1.setPartida(0);
                            player2.setPartida(0);
                        }

                    }

                }
            }
        };
        hilo.start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (g.barraP.getValue() == 9) {
            if (ae.getSource() == g.bg) {
                try {
                    Random();
                } catch (Ex ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}
