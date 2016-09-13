package com.marpolbr;

import javax.swing.*;
import java.awt.*;

public class TabOkna extends JPanel {


    //napisy
    public static final int x1NazwaWszOkna = 2;
    public static final int y1NazwaWszOkna = 20;
    public static final int x2NazwaWszOkna = 130;
    public static final int y2NazwaWszOkna = 20;

    public static final int x1NazwaWszRolety = 2;
    public static final int y1NazwaWszRolety = 40;
    public static final int x2NazwaWszRolety = 130;
    public static final int y2NazwaWszRolety = 20;

    public static final int x1NazwaSypialnia = 2;
    public static final int y1NazwaSypialnia = y1NazwaWszOkna+80;
    public static final int x2NazwaSypialnia = 100;
    public static final int y2NazwaSypialnia = 20;

    public static final int x1NazwaLazienka = 2;
    public static final int y1NazwaLazienka = 170;
    public static final int x2NazwaLazienka = 90;
    public static final int y2NazwaLazienka = 20;

    public static final int x1NazwaSalon = 2;
    public static final int y1NazwaSalon = 250;
    public static final int x2NazwaSalon = 90;
    public static final int y2NazwaSalon = 20;

    public static final int x1NazwaKuchnia = 2;
    public static final int y1NazwaKuchnia = 340;
    public static final int x2NazwaKuchnia = 90;
    public static final int y2NazwaKuchnia = 20;

    public static final int x1NazwaStan = x2NazwaWszRolety;
    public static final int y1NazwaStan = 0;
    public static final int x2NazwaStan = 110;
    public static final int y2NazwaStan = 20;

    public static final int x1NazwaRoleta = 520;
    public static final int y1NazwaRoleta = 0;
    public static final int x2NazwaRoleta = 60;
    public static final int y2NazwaRoleta = 20;

    
    
    public TabOkna(){
        setLayout(null);

        //napisy
        dodajNapis("WSZYSTKIE OKNA",x1NazwaWszOkna,y1NazwaWszOkna,x2NazwaWszOkna,y2NazwaWszOkna);
        dodajNapis("WSZYSTKIE ROLETY",x1NazwaWszRolety,y1NazwaWszRolety,x2NazwaWszRolety,y2NazwaWszRolety);
        dodajNapis("AKTUALNY STAN",x1NazwaStan,y1NazwaStan,x2NazwaStan,y2NazwaStan);
        dodajNapis("ROLETY",x1NazwaRoleta,y1NazwaRoleta,x2NazwaRoleta,y2NazwaRoleta);
        dodajNapis("SYPIALNIA",x1NazwaSypialnia,y1NazwaSypialnia,x2NazwaSypialnia,y2NazwaSypialnia);
        dodajNapis("LAZIENKA", x1NazwaLazienka, y1NazwaLazienka, x2NazwaLazienka, y2NazwaLazienka);
        dodajNapis("SALON", x1NazwaSalon, y1NazwaSalon, x2NazwaSalon, y2NazwaSalon);
        dodajNapis("KUCHNIA", x1NazwaKuchnia, y1NazwaKuchnia, x2NazwaKuchnia, y2NazwaKuchnia);

        //stan okna
        dodajStan(true, x2NazwaWszOkna + 20, y1NazwaWszOkna, 65, 20);
        dodajStan(true, x2NazwaWszRolety + 20,y1NazwaWszRolety,65,20);

        dodajStan(1,true,x2NazwaWszRolety,y1NazwaSypialnia-20,110,20);
        dodajStan(2,false,x2NazwaWszRolety,y1NazwaSypialnia,110,20);
        dodajStan(3,false,x2NazwaWszRolety,y1NazwaSypialnia+20,110,20);

        dodajStan(1,true,x2NazwaWszRolety,y1NazwaLazienka-10,110,20);
        dodajStan(2,true,x2NazwaWszRolety,y1NazwaLazienka+10,110,20);

        dodajStan(1,true,x2NazwaWszRolety,y1NazwaSalon-30,110,20);
        dodajStan(2,true,x2NazwaWszRolety,y1NazwaSalon-10,110,20);
        dodajStan(3,true,x2NazwaWszRolety,y1NazwaSalon+10,110,20);
        dodajStan(4,true,x2NazwaWszRolety,y1NazwaSalon+30,110,20);

        dodajStan(1,true,x2NazwaWszRolety,y1NazwaKuchnia-20,110,20);
        dodajStan(2,true,x2NazwaWszRolety,y1NazwaKuchnia,110,20);
        dodajStan(3,true,x2NazwaWszRolety,y1NazwaKuchnia+20,110,20);

        //suwaki rolety
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaWszRolety,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSypialnia-20,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSypialnia,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSypialnia+20,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaLazienka-10,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaLazienka+10,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSalon-30,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSalon-10,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSalon+10,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaSalon+30,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaKuchnia-20,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaKuchnia,100,20);
        stworzSuwakOknaIRolety(x1NazwaRoleta-20,y1NazwaKuchnia+20,100,20);

        //przyciski OTWORZ
        dodajPrzyciskOkno(true,250,y1NazwaWszOkna,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaWszRolety,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSypialnia-20,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSypialnia,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSypialnia+20,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaLazienka-10,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaLazienka+10,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSalon-30,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSalon-10,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSalon+10,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaSalon+30,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaKuchnia-20,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaKuchnia,90,20);
        dodajPrzyciskOkno(true,250,y1NazwaKuchnia+20,90,20);

        //przyciski zamknij
        dodajPrzyciskOkno(false,340,y1NazwaWszOkna,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaWszRolety,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSypialnia-20,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSypialnia,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSypialnia+20,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaLazienka-10,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaLazienka+10,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSalon-30,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSalon-10,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSalon+10,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaSalon+30,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaKuchnia-20,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaKuchnia,90,20);
        dodajPrzyciskOkno(false,340,y1NazwaKuchnia+20,90,20);


    }

    public void dodajNapis(String napis, int x1, int y1, int x2, int y2){
        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1,y1,x2,y2);
        //nazwa.setBackground(Color.RED);
        add(nazwa);
    }

    public void dodajStan(int nrOkna, boolean stan, int x1, int y1, int x2, int y2){

        String napis;
        if(stan){
            napis = nrOkna+ "OKNO OTWARTE";
        }
        else{
            napis = nrOkna+ "OKNO ZAMKNIETE";
        }

        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1,y1,x2,y2);

        if(stan){
            nazwa.setBackground(Color.GREEN);
        }
        else{
            nazwa.setBackground(Color.RED);
        }
        add(nazwa);
    }
    public void dodajStan( boolean stan, int x1, int y1, int x2, int y2){

        String napis;
        if(stan){
            napis = "OTWARTE";
        }
        else{
            napis = "ZAMKNIETE";
        }

        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1,y1,x2,y2);

        if(stan){
            nazwa.setBackground(Color.GREEN);
        }
        else{
            nazwa.setBackground(Color.RED);
        }
        add(nazwa);
    }

    public void stworzSuwakOknaIRolety(int x1, int y1, int x2, int y2){
        JSlider suwakOknaIRolety = new JSlider(0,100,0);
        suwakOknaIRolety.setBounds(x1, y1, x2, y2);
        //suwakOknaIRolety.setBackground(Color.RED);
        add(suwakOknaIRolety);
    }

    public void dodajPrzyciskOkno(boolean stan, int x1, int y1, int x2, int y2){
        String napis;
        if(stan){
            napis = "OTWORZ";
        }
        else {
            napis = "ZAMKNIJ";
        }
        JButton przyciskOkno = new JButton(napis);
        przyciskOkno.setOpaque(true);
        przyciskOkno.setBounds(x1,y1,x2,y2);
        add(przyciskOkno);
    }

}
