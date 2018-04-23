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
public class Osoba {

    public String imie;
    public String nazwisko;
    public String data_urodzenia;
    public String plec;

    public Osoba(String imie, String nazwisko, String data_urodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "\nImie:" + imie + "\nNazwisko" + nazwisko + "\nData urodzenia" + data_urodzenia + "\nPlec" + plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
}
