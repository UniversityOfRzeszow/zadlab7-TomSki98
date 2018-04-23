/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad;

/**
 *
 * @author Tomasz
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student stu = new Student(17, "Dzienne", "Informatyka", 2015, "Tomasz", "Skiba", "7 Marzec", "Mezczyzna");
        Wykladowca wyk = new Wykladowca(217, "Profesor", "Algebra", "profALG@ur.edu.pl","Mariusz", "Nowak","30 lipca", "Mezczyzna");
        System.out.println(stu);
        System.out.println(wyk);
    }
    
}
