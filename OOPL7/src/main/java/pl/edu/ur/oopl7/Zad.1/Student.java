/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.Zad;

import pl.edu.ur.oopl7.Zad.Osoba;

/**
 *
 * @author Tomasz
 */
public class Student extends Osoba {

    private int nr_indeksu;
    private String typ_studiow;
    private String kierunek;
    private int rok_studiow;

    public Student(int nr_indeksu, String typ_studiow, String kierunek,
            int rok_studiow,String imie,String nazwisko,String data_urodzenia,String plec) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiow = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }

    @Override
    public String toString() {
        return "!Student!" + super.toString() + "\nNumer indeksu: " + nr_indeksu
                + "\nTyp studiow: " + typ_studiow + "\nKierunek: " + kierunek
                + "\nRok studiow: " + rok_studiow + "\n\n";
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getTyp_studiow() {
        return typ_studiow;
    }

    public void setTyp_studiow(String typ_studiow) {
        this.typ_studiow = typ_studiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }
}
