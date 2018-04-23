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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt2D[] array3D = new Punkt3D[100];
        Punkt2D pkt2d = new Punkt2D();
        Punkt3D pkt3d = new Punkt3D();

        for (int i = 0; i < 100; i++) {
            array2D[i] = pkt2d.Losowanie();
            array3D[i] = pkt3d.Losowanie();
            if (array2D[i].getX() == array3D[i].getX()) {
                if (array2D[i].getY() == array3D[i].getY()) {
                    System.out.println((i + 1) + ". " + array2D[i] + " " + array3D[i]);
                }
            }
        }

    }

}
