/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad2;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

/**
 *
 * @author Tomasz
 */
public class Punkt3D extends Punkt2D {

    private double z;

    public Punkt3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D() {
    }

    @Override
    public String toString() {
        return ("(" + super.getX() + ", " + super.getY() + ", " + z + ")");
    }

    @Override
    public Punkt3D Losowanie() {
        Random generator = new Random();
        setX(generator.nextInt(10) - 5);
        setY(generator.nextInt(10) - 5);
        this.z = generator.nextInt(10) - 5;
        return new Punkt3D(z, super.getX(), super.getY());
    }
}
