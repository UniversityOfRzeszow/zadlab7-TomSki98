/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad2;

/**
 *
 * @author Tomasz
 */
import java.util.Random;

public class Punkt2D {

    private double x;
    private double y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(double X, double Y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }

    public Punkt2D Losowanie() {
        Random generator = new Random();
        this.x = generator.nextInt(10) - 5;
        this.y = generator.nextInt(10) - 5;
        return new Punkt2D(x, y);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}

