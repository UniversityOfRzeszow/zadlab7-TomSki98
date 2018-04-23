/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad3;

/**
 *
 * @author Tomasz
 */
public class Poduszkowiec implements Woda, Ziemia{

    @Override
    public void plynie() {
        System.out.println("Plyne");
        
    }

    @Override
    public void jedzie() {
        System.out.println("Jade");
    }

}
