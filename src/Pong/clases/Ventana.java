/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.clases;

/**
 *
 * @author  Mati
 */
import Pong.control.EngineGraphics;
import javax.swing.*;


public class Ventana extends JFrame {

    Tablero canvas;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("Pong by Matias Casasco");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero();
        add(canvas);

        addKeyListener(new Teclado());
        new EngineGraphics(canvas).start();
    }

}
