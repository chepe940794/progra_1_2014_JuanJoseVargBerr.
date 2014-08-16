/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopuntos;

import java.util.Random;

/**
 *
 * @author juan jose
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {

        Random o = new Random();

        double r;
        r = o.nextDouble();
        this.x = r;
        r = o.nextDouble();
        this.y = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia ( Punto p) {
return ( Math . sqrt ((this. x - p. getX ()) * (this. x - p. getX ())
+ (this.y - p. getY ()) * (this.y - p. getY ())));
    }
}
