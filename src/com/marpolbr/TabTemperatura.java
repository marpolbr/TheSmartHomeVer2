package com.marpolbr;

import javax.swing.*;
import java.awt.*;


public class TabTemperatura extends JPanel {

    //napisy
    public static final int x1NazwaDom = 5;
    public static final int y1NazwaDom = 20;
    public static final int x2NazwaDom = 90;
    public static final int y2NazwaDom = 20;

    public static final int x1NazwaSypialnia = 5;
    public static final int y1NazwaSypialnia = 100;
    public static final int x2NazwaSypialnia = 90;
    public static final int y2NazwaSypialnia = 20;

    public static final int x1NazwaSalon = 5;
    public static final int y1NazwaSalon = 150;
    public static final int x2NazwaSalon = 90;
    public static final int y2NazwaSalon = 20;

    public static final int x1NazwaKuchnia = 5;
    public static final int y1NazwaKuchnia = 200;
    public static final int x2NazwaKuchnia = 90;
    public static final int y2NazwaKuchnia = 20;

    public static final int x1NazwaPrzedpokoj = 5;
    public static final int y1NazwaPrzedpokoj = 250;
    public static final int x2NazwaPrzedpokoj = 90;
    public static final int y2NazwaPrzedpokoj = 20;

    public static final int x1NazwaLazienka = 5;
    public static final int y1NazwaLazienka = 300;
    public static final int x2NazwaLazienka = 90;
    public static final int y2NazwaLazienka = 20;

    public static final int x1NazwaTemp = 0;
    public static final int y1NazwaTemp = 0;
    public static final int x2NazwaTemp = 90;
    public static final int y2NazwaTemp = 20;

    public static final int x1NazwaAktualna = 0;
    public static final int y1NazwaAktualna = 0;
    public static final int x2NazwaAktualna = 90;
    public static final int y2NazwaAktualna = 20;

    public static final int x1NazwaZadana = 0;
    public static final int y1NazwaZadana = 0;
    public static final int x2NazwaZadana = 90;
    public static final int y2NazwaZadana = 20;

    public static final int x1NazwaGrzejnik = 0;
    public static final int y1NazwaGrzejnik = 0;
    public static final int x2NazwaGrzejnik = 90;
    public static final int y2NazwaGrzejnik = 20;

    public static final int x1NazwaKlima = 150;
    public static final int y1NazwaKlima = 50;
    public static final int x2NazwaKlima = 90;
    public static final int y2NazwaKlima = 20;

    public static final int x1NazwaWilgotnosc = 0;
    public static final int y1NazwaWilgotnosc = 0;
    public static final int x2NazwaWilgotnosc = 90;
    public static final int y2NazwaWilgotnosc = 20;

    public static final int x1NazwaWent = 0;
    public static final int y1nazwaWent = 0;
    public static final int x2NazwaWent = 90;
    public static final int y2NazwaWent = 20;


    public TabTemperatura(){
        setLayout(null);
        dodajNazweTabTemp("DOM",x1NazwaDom,y1NazwaDom,x2NazwaDom,y2NazwaDom);
        dodajNazweTabTemp("SYPIALNIA",x1NazwaSypialnia,y1NazwaSypialnia,x2NazwaSypialnia,y2NazwaSypialnia);
        dodajNazweTabTemp("SALON",x1NazwaSalon,y1NazwaSalon,x2NazwaSalon,y2NazwaSalon);
        dodajNazweTabTemp("KUCHNIA",x1NazwaKuchnia,y1NazwaKuchnia,x2NazwaKuchnia,y2NazwaKuchnia);
        dodajNazweTabTemp("PRZEDPOKOJ",x1NazwaPrzedpokoj,y1NazwaPrzedpokoj,x2NazwaPrzedpokoj,y2NazwaPrzedpokoj);
        dodajNazweTabTemp("LAZIENKA",x1NazwaLazienka,y1NazwaLazienka,x2NazwaLazienka,y2NazwaLazienka);
        dodajNazweTabTemp("TEMPERATURA",x1NazwaTemp,y1NazwaTemp,x2NazwaTemp,y2NazwaTemp);
        dodajNazweTabTemp("AKTUALNA",x1NazwaAktualna,y1NazwaAktualna,x2NazwaAktualna,y2NazwaAktualna);
        dodajNazweTabTemp("ZADANA",x1NazwaZadana,y1NazwaZadana,x2NazwaZadana,y2NazwaZadana);
        dodajNazweTabTemp("GRZEJNIK",x1NazwaGrzejnik,y1NazwaGrzejnik,x2NazwaGrzejnik,y2NazwaGrzejnik);
        dodajNazweTabTemp("KLIMATYZACJA",x1NazwaKlima,y1NazwaKlima,x2NazwaKlima,y2NazwaKlima);
        dodajNazweTabTemp("WILGOTNOSC",x1NazwaWilgotnosc,y1NazwaWilgotnosc,x2NazwaWilgotnosc,y2NazwaWilgotnosc);
        dodajNazweTabTemp("WENTYLACJA",x1NazwaWent,y1nazwaWent,x2NazwaWent,y2NazwaWent);

    }

    public void dodajNazweTabTemp(String napis,int x1,int y1,int x2, int y2){
        JLabel nazwaTabTemp = new JLabel(napis);
        nazwaTabTemp.setOpaque(true);
        nazwaTabTemp.setBounds(x1,y1,x2,y2);
        nazwaTabTemp.setBackground(Color.RED);
        add(nazwaTabTemp);
    }

}
