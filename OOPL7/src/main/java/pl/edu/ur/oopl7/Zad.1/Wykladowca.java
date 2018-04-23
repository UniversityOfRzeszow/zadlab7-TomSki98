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
public class Wykladowca extends Osoba{
    
    private int nr_sali;
    private String stopien;
    private String nazwa_przedmiotu;
    private String adres_email;
    
    public Wykladowca(int nr_sali, String stopien, String nazwa_przedmiotu,String adres_email,
            String imie,String nazwisko,String data_urodzenia,String plec){
        super(imie,nazwisko,data_urodzenia,plec);
        this.nr_sali=nr_sali;
        this.stopien=stopien;
        this.nazwa_przedmiotu=nazwa_przedmiotu;
        this.adres_email=adres_email;
            }
    @Override
     public String toString(){
        return "!Wykladowca!" + super.toString() + "\nNr sali: " + nr_sali +
                "\nStopien: " + stopien + "\nPrzedmiot: " + nazwa_przedmiotu + "E-mail:"+adres_email;
     }

    public int getNr_sali() {
        return nr_sali;
    }

    public void setNr_sali(int nr_sali) {
        this.nr_sali = nr_sali;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
    }

    public String getNazwa_przedmiotu() {
        return nazwa_przedmiotu;
    }

    public void setNazwa_przedmiotu(String nazwa_przedmiotu) {
        this.nazwa_przedmiotu = nazwa_przedmiotu;
    }

    public String getAdres_email() {
        return adres_email;
    }

    public void setAdres_email(String adres_email) {
        this.adres_email = adres_email;
    }
     
}
