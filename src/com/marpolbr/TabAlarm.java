package com.marpolbr;


import javax.swing.*;
import java.awt.*;

public class TabAlarm extends JPanel {

    //napisy
    public static final int x1NazwaAlarm = 2;
    public static final int y1NazwaAlarm = 40;
    public static final int x2NazwaAlarm = 90;
    public static final int y2NazwaAlarm = 20;

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

    public static final int x1NazwaDym =0;
    public static final int y1NazwaDym =0;
    public static final int x2NazwaDym =0;
    public static final int y2NazwaDym =0;

    public static final int x1NazwaRuch =0;
    public static final int y1NazwaRuch =0;
    public static final int x2NazwaRuch =0;
    public static final int y2NazwaRuch =0;

    public static final int x1NazwaSymulator =0;
    public static final int y1NazwaSymulator =0;
    public static final int x2NazwaSymulator =0;
    public static final int y2NazwaSymulator =0;

    public static final int x1NazwaPozar =0;
    public static final int y1NazwaPozar =0;
    public static final int x2NazwaPozar =0;
    public static final int y2NazwaPozar =0;

    public static final int x1NazwaIntruz =0;
    public static final int y1NazwaIntruz =0;
    public static final int x2NazwaIntruz =0;
    public static final int y2NazwaIntruz =0;

    public static final int x1NazwaStanAktywacjiAlarmu =0;
    public static final int y1NazwaStanAktywacjiAlarmu =0;
    public static final int x2NazwaStanAktywacjiAlarmu =0;
    public static final int y2NazwaStanAktywacjiAlarmu =0;


    public TabAlarm(){
        setLayout(null);

        dodajNapis("ALARM", x1NazwaAlarm, y1NazwaAlarm, x2NazwaAlarm, y2NazwaAlarm);
        dodajNapis("SYPIALNIA", x1NazwaSypialnia, y1NazwaSypialnia, x2NazwaSypialnia, y2NazwaSypialnia);
        dodajNapis("SALON", x1NazwaSalon, y1NazwaSalon, x2NazwaSalon, y2NazwaSalon);
        dodajNapis("KUCHNIA", x1NazwaKuchnia, y1NazwaKuchnia, x2NazwaKuchnia, y2NazwaKuchnia);
        dodajNapis("PRZEDPOKOJ", x1NazwaPrzedpokoj, y1NazwaPrzedpokoj, x2NazwaPrzedpokoj, y2NazwaPrzedpokoj);
        dodajNapis("LAZIENKA", x1NazwaLazienka, y1NazwaLazienka, x2NazwaLazienka, y2NazwaLazienka);

        //przyciski alarm
        dodajPrzyciskAlarm(true,x1NazwaAlarm+x2NazwaAlarm,y1NazwaAlarm,120,20);
        dodajPrzyciskAlarm(false,x1NazwaAlarm+x2NazwaAlarm+120,y1NazwaAlarm,120,20);


    }

    public void dodajNapis(String napis, int x1, int y1, int x2, int y2){
        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1,y1,x2,y2);
        nazwa.setBackground(Color.RED);
        add(nazwa);
    }


    public void dodajPrzyciskAlarm(boolean stan, int x1, int y1, int x2, int y2){
        String napis;
        if(stan){
            napis = "AKTYWUJ";
        }
        else {
            napis = "DEZAKTYWUJ";
        }
        JButton przyciskAlarm = new JButton(napis);
        przyciskAlarm.setOpaque(true);
        przyciskAlarm.setBounds(x1, y1, x2, y2);
        add(przyciskAlarm);
    }
}
