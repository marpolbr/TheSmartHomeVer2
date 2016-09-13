package com.marpolbr;

import javax.swing.*;


public class TabTemperatura extends JPanel {

    //napisy
    public static final int x1NazwaDom = 2;
    public static final int y1NazwaDom = 40;
    public static final int x2NazwaDom = 90;
    public static final int y2NazwaDom = 20;

    public static final int x1NazwaSypialnia = 2;
    public static final int y1NazwaSypialnia = 120;
    public static final int x2NazwaSypialnia = 90;
    public static final int y2NazwaSypialnia = 20;

    public static final int x1NazwaSalon = 2;
    public static final int y1NazwaSalon = 190;
    public static final int x2NazwaSalon = 90;
    public static final int y2NazwaSalon = 20;

    public static final int x1NazwaKuchnia = 2;
    public static final int y1NazwaKuchnia = 260;
    public static final int x2NazwaKuchnia = 90;
    public static final int y2NazwaKuchnia = 20;

    public static final int x1NazwaPrzedpokoj = 2;
    public static final int y1NazwaPrzedpokoj = 330;
    public static final int x2NazwaPrzedpokoj = 90;
    public static final int y2NazwaPrzedpokoj = 20;

    public static final int x1NazwaLazienka = 2;
    public static final int y1NazwaLazienka = 400;
    public static final int x2NazwaLazienka = 90;
    public static final int y2NazwaLazienka = 20;

    public static final int x1NazwaTemp = 210;
    public static final int y1NazwaTemp = 0;
    public static final int x2NazwaTemp = 90;
    public static final int y2NazwaTemp = 20;

    public static final int x1NazwaAktualna = 250;
    public static final int y1NazwaAktualna = y2NazwaTemp;
    public static final int x2NazwaAktualna = 65;
    public static final int y2NazwaAktualna = 20;

    public static final int x1NazwaZadana = 190;
    public static final int y1NazwaZadana = y2NazwaTemp;
    public static final int x2NazwaZadana = 50;
    public static final int y2NazwaZadana = 20;

    public static final int x1NazwaGrzejnik = x1NazwaAktualna+x2NazwaAktualna;
    public static final int y1NazwaGrzejnik = 0;
    public static final int x2NazwaGrzejnik = 60;
    public static final int y2NazwaGrzejnik = 20;

    public static final int x1NazwaKlima = x1NazwaGrzejnik+x2NazwaGrzejnik;
    public static final int y1NazwaKlima = 0;
    public static final int x2NazwaKlima = 90;
    public static final int y2NazwaKlima = 20;

    public static final int x1NazwaWilgotnosc = x1NazwaKlima+x2NazwaKlima+5;
    public static final int y1NazwaWilgotnosc = 0;
    public static final int x2NazwaWilgotnosc = 80;
    public static final int y2NazwaWilgotnosc = 20;

    public static final int x1NazwaWent = x1NazwaWilgotnosc+x2NazwaWilgotnosc+5;
    public static final int y1nazwaWent = 0;
    public static final int x2NazwaWent = 80;
    public static final int y2NazwaWent = 20;

    //suwaki
    public static final int minimumSuwakaTemperatury = 16;
    public static final int maximumSuwakaTemperatury = 28;
    public static final int defaultSuwakaTemperatury = 22;

    public static final int podzialkaGlownaSuwakaTemperatury = 3;
    public static final int podzialkaDrobnaSuwakaTemperatury = 1;
    public static final int dlugoscSuwakaTemperatury = 100;
    public static final int wysokoscSuwakaTemperatury = 50;


    public TabTemperatura(){
        setLayout(null);

        dodajNapis("DOM", x1NazwaDom, y1NazwaDom, x2NazwaDom, y2NazwaDom);
        dodajNapis("SYPIALNIA", x1NazwaSypialnia, y1NazwaSypialnia, x2NazwaSypialnia, y2NazwaSypialnia);
        dodajNapis("SALON", x1NazwaSalon, y1NazwaSalon, x2NazwaSalon, y2NazwaSalon);
        dodajNapis("KUCHNIA", x1NazwaKuchnia, y1NazwaKuchnia, x2NazwaKuchnia, y2NazwaKuchnia);
        dodajNapis("PRZEDPOKOJ", x1NazwaPrzedpokoj, y1NazwaPrzedpokoj, x2NazwaPrzedpokoj, y2NazwaPrzedpokoj);
        dodajNapis("LAZIENKA", x1NazwaLazienka, y1NazwaLazienka, x2NazwaLazienka, y2NazwaLazienka);
        dodajNapis("TEMPERATURA", x1NazwaTemp, y1NazwaTemp, x2NazwaTemp, y2NazwaTemp);
        dodajNapis("AKTUALNA", x1NazwaAktualna, y1NazwaAktualna, x2NazwaAktualna, y2NazwaAktualna);
        dodajNapis("ZADANA", x1NazwaZadana, y1NazwaZadana, x2NazwaZadana, y2NazwaZadana);
        dodajNapis("GRZEJNIK", x1NazwaGrzejnik, y1NazwaGrzejnik, x2NazwaGrzejnik, y2NazwaGrzejnik);
        dodajNapis("KLIMATYZACJA", x1NazwaKlima, y1NazwaKlima, x2NazwaKlima, y2NazwaKlima);
        dodajNapis("WILGOTNOSC", x1NazwaWilgotnosc, y1NazwaWilgotnosc, x2NazwaWilgotnosc, y2NazwaWilgotnosc);
        dodajNapis("WENTYLACJA", x1NazwaWent, y1nazwaWent, x2NazwaWent, y2NazwaWent);

        stworzSuwakTemperatury(x2NazwaDom,y1NazwaDom,dlugoscSuwakaTemperatury,wysokoscSuwakaTemperatury);
        stworzSuwakTemperatury(x2NazwaSypialnia,y1NazwaSypialnia,dlugoscSuwakaTemperatury,wysokoscSuwakaTemperatury);
        stworzSuwakTemperatury(x2NazwaSalon,y1NazwaSalon,dlugoscSuwakaTemperatury,wysokoscSuwakaTemperatury);
        stworzSuwakTemperatury(x2NazwaKuchnia,y1NazwaKuchnia,dlugoscSuwakaTemperatury,wysokoscSuwakaTemperatury);
        stworzSuwakTemperatury(x2NazwaPrzedpokoj,y1NazwaPrzedpokoj,dlugoscSuwakaTemperatury,wysokoscSuwakaTemperatury);
        stworzSuwakTemperatury(x2NazwaLazienka,y1NazwaLazienka,dlugoscSuwakaTemperatury,wysokoscSuwakaTemperatury);

        //temperatura zadana
        dodajJednostkeTemperatury(22,x2NazwaDom+dlugoscSuwakaTemperatury+5,y1NazwaDom,40,y2NazwaDom);
        dodajJednostkeTemperatury(22,x2NazwaSypialnia+dlugoscSuwakaTemperatury+5,y1NazwaSypialnia,40,y2NazwaSypialnia);
        dodajJednostkeTemperatury(22,x2NazwaSalon+dlugoscSuwakaTemperatury+5,y1NazwaSalon,40,y2NazwaSalon);
        dodajJednostkeTemperatury(22,x2NazwaKuchnia+dlugoscSuwakaTemperatury+5,y1NazwaKuchnia,40,y2NazwaKuchnia);
        dodajJednostkeTemperatury(22,x2NazwaPrzedpokoj+dlugoscSuwakaTemperatury+5,y1NazwaPrzedpokoj,40,y2NazwaPrzedpokoj);
        dodajJednostkeTemperatury(22,x2NazwaLazienka+dlugoscSuwakaTemperatury+5,y1NazwaLazienka,40,y2NazwaLazienka);

        //temperatura aktualna
        dodajJednostkeTemperatury(20,x1NazwaAktualna+10,y1NazwaDom,40,y2NazwaDom);
        dodajJednostkeTemperatury(21,x1NazwaAktualna+10,y1NazwaSypialnia,40,y2NazwaSypialnia);
        dodajJednostkeTemperatury(20,x1NazwaAktualna+10,y1NazwaSalon,40,y2NazwaSalon);
        dodajJednostkeTemperatury(19,x1NazwaAktualna+10,y1NazwaKuchnia,40,y2NazwaKuchnia);
        dodajJednostkeTemperatury(18,x1NazwaAktualna+10,y1NazwaPrzedpokoj,40,y2NazwaPrzedpokoj);
        dodajJednostkeTemperatury(22,x1NazwaAktualna+10,y1NazwaLazienka,40,y2NazwaLazienka);

        //grzejnik
        stworzCheckboxGrzejnik(x1NazwaGrzejnik+20,y1NazwaDom,20,y2NazwaDom);
        stworzCheckboxGrzejnik(x1NazwaGrzejnik+20,y1NazwaSypialnia,20,y2NazwaSypialnia);
        stworzCheckboxGrzejnik(x1NazwaGrzejnik+20,y1NazwaSalon,20,y2NazwaSalon);
        stworzCheckboxGrzejnik(x1NazwaGrzejnik+20,y1NazwaKuchnia,20,y2NazwaKuchnia);
        stworzCheckboxGrzejnik(x1NazwaGrzejnik+20,y1NazwaPrzedpokoj,20,y2NazwaPrzedpokoj);
        stworzCheckboxGrzejnik(x1NazwaGrzejnik+20,y1NazwaLazienka,20,y2NazwaLazienka);

        //klimatyzacja
        stworzCheckboxKlimatyzacja(x1NazwaKlima + 30, y1NazwaDom, 20, y2NazwaDom);
        stworzCheckboxKlimatyzacja(x1NazwaKlima + 30, y1NazwaSypialnia, 20, y2NazwaSypialnia);
        stworzCheckboxKlimatyzacja(x1NazwaKlima+30, y1NazwaSalon, 20, y2NazwaSalon);
        stworzCheckboxKlimatyzacja(x1NazwaKlima+30, y1NazwaKuchnia, 20, y2NazwaKuchnia);
        stworzCheckboxKlimatyzacja(x1NazwaKlima+30, y1NazwaPrzedpokoj, 20, y2NazwaPrzedpokoj);
        stworzCheckboxKlimatyzacja(x1NazwaKlima+30, y1NazwaLazienka, 20, y2NazwaLazienka);

        //wilgotnosc
        dodajJednostkeWilgotnosci(55,x1NazwaWilgotnosc+25,y1NazwaDom,30,y2NazwaDom);
        dodajJednostkeWilgotnosci(49,x1NazwaWilgotnosc+25,y1NazwaSypialnia,30,y2NazwaSypialnia);
        dodajJednostkeWilgotnosci(51,x1NazwaWilgotnosc+25,y1NazwaSalon,30,y2NazwaSalon);
        dodajJednostkeWilgotnosci(55,x1NazwaWilgotnosc+25,y1NazwaKuchnia,30,y2NazwaKuchnia);
        dodajJednostkeWilgotnosci(52,x1NazwaWilgotnosc+25,y1NazwaPrzedpokoj,30,y2NazwaPrzedpokoj);
        dodajJednostkeWilgotnosci(70,x1NazwaWilgotnosc+25,y1NazwaLazienka,30,y2NazwaLazienka);

        //wentylacja
        stworzCheckboxWentylacja(x1NazwaWent + 30, y1NazwaDom, 20, y2NazwaDom);
        stworzCheckboxWentylacja(x1NazwaWent + 30, y1NazwaSypialnia, 20, y2NazwaSypialnia);
        stworzCheckboxWentylacja(x1NazwaWent + 30, y1NazwaSalon, 20, y2NazwaSalon);
        stworzCheckboxWentylacja(x1NazwaWent + 30, y1NazwaKuchnia, 20, y2NazwaKuchnia);
        stworzCheckboxWentylacja(x1NazwaWent + 30, y1NazwaPrzedpokoj, 20, y2NazwaPrzedpokoj);
        stworzCheckboxWentylacja(x1NazwaWent + 30, y1NazwaLazienka, 20, y2NazwaLazienka);
    }

    public void dodajNapis(String napis, int x1, int y1, int x2, int y2){
        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1,y1,x2,y2);
        //nazwaTabTemp.setBackground(Color.RED);
        add(nazwa);
    }

    public void stworzSuwakTemperatury(int x1, int y1, int xOkno, int yOkno){
        JSlider suwakTemperatury = new JSlider(minimumSuwakaTemperatury,maximumSuwakaTemperatury,defaultSuwakaTemperatury);
        suwakTemperatury.setBounds(x1, y1, xOkno, yOkno);
        //suwakTemperatury.setBackground(Color.RED);
        suwakTemperatury.setPaintLabels(true);
        suwakTemperatury.setMinorTickSpacing(podzialkaDrobnaSuwakaTemperatury);
        suwakTemperatury.setMajorTickSpacing(podzialkaGlownaSuwakaTemperatury);
        suwakTemperatury.setPaintTicks(true);
        add(suwakTemperatury);
    }

    public void dodajJednostkeTemperatury(int wartoscSuwaka,int x1,int y1,int x2, int y2){
        JLabel jednostkaTemperatury = new JLabel(wartoscSuwaka + " ^C");
        jednostkaTemperatury.setOpaque(true);
        jednostkaTemperatury.setBounds(x1, y1, x2, y2);
        //jednostkaTemperatury.setBackground(Color.RED);
        add(jednostkaTemperatury);
    }

    public void stworzCheckboxGrzejnik(int x1, int y1, int x2, int y2) {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(x1, y1, x2, y2);
       // checkBox.setBackground(Color.RED);
        add(checkBox);
    }

    public void stworzCheckboxKlimatyzacja(int x1, int y1, int x2, int y2) {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(x1, y1, x2, y2);
        //checkBox.setBackground(Color.RED);
        add(checkBox);
    }

    public void dodajJednostkeWilgotnosci(int wartoscWilgotnosci,int x1,int y1,int x2, int y2){
        JLabel jednostkaWilgotnosci = new JLabel(wartoscWilgotnosci + " %");
        jednostkaWilgotnosci.setOpaque(true);
        jednostkaWilgotnosci.setBounds(x1, y1, x2, y2);
        //jednostkaWilgotnosci.setBackground(Color.RED);
        add(jednostkaWilgotnosci);
    }

    public void stworzCheckboxWentylacja(int x1, int y1, int x2, int y2) {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(x1, y1, x2, y2);
       // checkBox.setBackground(Color.RED);
        add(checkBox);
    }
}
