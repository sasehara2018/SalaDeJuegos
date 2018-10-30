/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong.clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Mati
 */
public class Raqueta {

    private int x, y;
    static final int ANCHO = 10, ALTO = 40;

    public Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }

    public void moverR1(Rectangle limites) {
        if (Teclado.w && y > limites.getMinY()) {
            y--;
        }
        if (Teclado.s && y < limites.getMaxY()-ALTO) {
            y++;
        }
    }

    public void moverR2(Rectangle limites) {
        if (Teclado.up && y > limites.getMinY()) {
            y--;
        }
        if (Teclado.down && y < limites.getMaxY()-ALTO) {
            y++;
        }
    }
}
