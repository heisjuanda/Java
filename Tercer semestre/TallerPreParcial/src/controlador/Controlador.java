/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import modelo.Hueso;
import tallerpreparcial.BD;
import vista.GuiGame;

/**
 *
 * @author JuanDavid
 */
public class Controlador implements ActionListener {

    GuiGame g;
    BD baseD = new BD();
    Hueso hueso1;
    Hueso hueso2;
    Hueso hueso3;
    int oportunidades;
    int puntos;
    int huesosoEncontrdos;

    public Controlador(GuiGame g) throws InterruptedException {
        this.oportunidades = 3;
        this.puntos = 0;
        this.huesosoEncontrdos = 0;
        this.g = g;
        this.hueso1 = new Hueso();
        this.hueso2 = new Hueso();
        this.hueso3 = new Hueso();
        this.g.reinicio.addActionListener(this);
        this.g.b1.addActionListener(this);
        this.g.b2.addActionListener(this);
        this.g.b3.addActionListener(this);
        this.g.b4.addActionListener(this);
        this.g.b5.addActionListener(this);
        this.g.b6.addActionListener(this);
        this.g.b7.addActionListener(this);
        this.g.b8.addActionListener(this);
        this.g.b9.addActionListener(this);
        this.g.b10.addActionListener(this);
        this.g.b11.addActionListener(this);
        this.g.b12.addActionListener(this);
        this.g.b13.addActionListener(this);
        this.g.b14.addActionListener(this);
        this.g.b15.addActionListener(this);
        this.g.b16.addActionListener(this);
        reinicio();
    }

    /*Timer timer = new Timer(600, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        }
        
    });*/
    @Override
    public void actionPerformed(ActionEvent ae) {

        //timer.start();
        if (g.progresoB.getValue() < 60) {

            if (oportunidades != 0) {

                if (ae.getSource() == g.b1) {
                    if (baseD.consultar("b1")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        oportunidades--;
                        baseD.eliminar("b1");
                        huesosoEncontrdos++;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b2) {
                    if (baseD.consultar("b2")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b2");
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b3) {
                    if (baseD.consultar("b3")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b3");
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b4) {
                    if (baseD.consultar("b4")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b4");
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste ");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b5) {
                    if (baseD.consultar("b5")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b5");
                        oportunidades--;
                        huesosoEncontrdos++;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b6) {
                    if (baseD.consultar("b6")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b6");
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b7) {
                    if (baseD.consultar("b7")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        huesosoEncontrdos++;
                        baseD.eliminar("b7");
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b8) {
                    if (baseD.consultar("b8")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        huesosoEncontrdos++;
                        baseD.eliminar("b8");
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b9) {
                    if (baseD.consultar("b9")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b9");
                        oportunidades--;
                        huesosoEncontrdos++;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b10) {
                    if (baseD.consultar("b10")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        huesosoEncontrdos++;
                        baseD.eliminar("b10");
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b11) {
                    if (baseD.consultar("b11")) {
                        baseD.eliminar("b11");
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b12) {
                    if (baseD.consultar("b12")) {
                        baseD.eliminar("b12");
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        oportunidades--;
                        huesosoEncontrdos++;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b13) {
                    if (baseD.consultar("b13")) {
                        baseD.eliminar("b13");
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b14) {
                    if (baseD.consultar("b14")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b14");
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b15) {
                    if (baseD.consultar("b15")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b15");
                        oportunidades--;
                        huesosoEncontrdos++;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }
                if (ae.getSource() == g.b16) {
                    if (baseD.consultar("b16")) {
                        JOptionPane.showMessageDialog(g, "Un hueso hallado");
                        puntos = puntos + 1000;
                        baseD.eliminar("b16");
                        huesosoEncontrdos++;
                        oportunidades--;
                    } else {
                        JOptionPane.showMessageDialog(g, "Fallaste");
                        oportunidades--;
                    }
                }

                g.HuesosHallados.setText(huesosoEncontrdos + "");
                g.Puntaje.setText(puntos + "");
                g.Oportunidadesss.setText(oportunidades + "");

            } else {
                JOptionPane.showMessageDialog(g, "Ya gastaste todas tus oportunidades");

                if (huesosoEncontrdos > 0) {
                    JOptionPane.showMessageDialog(g, "Felicidades, ganaste al encontrar " + huesosoEncontrdos + " huesos" + " \npuntos: " + puntos);
                } else {
                    JOptionPane.showMessageDialog(g, ":(, perdiste al encontrar " + huesosoEncontrdos + " \npuntos: " + puntos);
                }
                oportunidades = -1;
            }
            if (ae.getSource() == g.reinicio) {

                try {
                    reinicio();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(g, "Te quedaste sin tiempo, encontraste: " + huesosoEncontrdos + " \npuntos: " + puntos);

            if (ae.getSource() == g.reinicio) {

                try {
                    reinicio();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public void reinicio() throws InterruptedException {
        // timer.restart();
        Thread hilo = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    g.progresoB.setValue(i);
                }
            }
        };
       
        hilo.start();

        baseD.eliminar(hueso1.getUbicacion());
        baseD.eliminar(hueso2.getUbicacion());
        baseD.eliminar(hueso3.getUbicacion());

        huesosoEncontrdos = 0;
        g.HuesosHallados.setText(huesosoEncontrdos + "");
        puntos = 0;
        g.Puntaje.setText(puntos + "");
        oportunidades = 3;
        g.Oportunidadesss.setText(oportunidades + "");

        int random = 0;
        random = (int) (1 * Math.random() * 16);
        if (random == 0) {
            random++;
        }
        hueso1.setUbicacion("b" + random);
        random = 0;
        random = (int) (1 * Math.random() * 16);
        if (random == 0) {
            random++;
        }
        hueso2.setUbicacion("b" + random);
        while (hueso1.getUbicacion().equals(hueso2.getUbicacion())) {
            random = (int) (1 * Math.random() * 16);
            hueso2.setUbicacion("b" + random);
        }
        random = 0;
        random = (int) (1 * Math.random() * 16);
        if (random == 0) {
            random++;
        }
        hueso3.setUbicacion("b" + random);
        while (hueso1.getUbicacion().equals(hueso3.getUbicacion()) || hueso2.getUbicacion().equals(hueso3.getUbicacion())) {
            random = (int) (1 * Math.random() * 16);
            hueso3.setUbicacion("b" + random);
        }

        baseD.insertar(hueso1);
        baseD.insertar(hueso2);
        baseD.insertar(hueso3);

    }

}
