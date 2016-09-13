package com.marpolbr;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public static final int x1NazwaDym =x1NazwaSypialnia+x2NazwaSypialnia+50;
    public static final int y1NazwaDym =y1NazwaSypialnia-20;
    public static final int x2NazwaDym =30;
    public static final int y2NazwaDym =20;

    public static final int x1NazwaRuch =250;
    public static final int y1NazwaRuch =y1NazwaDym;
    public static final int x2NazwaRuch =35;
    public static final int y2NazwaRuch =20;

    public static final int x1NazwaSymulator =450;
    public static final int y1NazwaSymulator =70;
    public static final int x2NazwaSymulator =110;
    public static final int y2NazwaSymulator =30;

    public static final int x1NazwaPozar =410;
    public static final int y1NazwaPozar =y1NazwaDym;
    public static final int x2NazwaPozar =40;
    public static final int y2NazwaPozar =20;

    public static final int x1NazwaIntruz =550;
    public static final int y1NazwaIntruz =y1NazwaDym;
    public static final int x2NazwaIntruz =45;
    public static final int y2NazwaIntruz =20;

    public static final int x1NazwaStanAktywacjiAlarmu =2;
    public static final int y1NazwaStanAktywacjiAlarmu =0;
    public static final int x2NazwaStanAktywacjiAlarmu =180;
    public static final int y2NazwaStanAktywacjiAlarmu =35;


    public TabAlarm(){
        setLayout(null);

        dodajNapis("ALARM", x1NazwaAlarm, y1NazwaAlarm, x2NazwaAlarm, y2NazwaAlarm);
        dodajNapis("SYPIALNIA", x1NazwaSypialnia, y1NazwaSypialnia, x2NazwaSypialnia, y2NazwaSypialnia);
        dodajNapis("SALON", x1NazwaSalon, y1NazwaSalon, x2NazwaSalon, y2NazwaSalon);
        dodajNapis("KUCHNIA", x1NazwaKuchnia, y1NazwaKuchnia, x2NazwaKuchnia, y2NazwaKuchnia);
        dodajNapis("PRZEDPOKOJ", x1NazwaPrzedpokoj, y1NazwaPrzedpokoj, x2NazwaPrzedpokoj, y2NazwaPrzedpokoj);
        dodajNapis("LAZIENKA", x1NazwaLazienka, y1NazwaLazienka, x2NazwaLazienka, y2NazwaLazienka);
        dodajNapis("DYM",x1NazwaDym,y1NazwaDym,x2NazwaDym,y2NazwaDym);
        dodajNapis("RUCH",x1NazwaRuch,y1NazwaRuch,x2NazwaRuch,y2NazwaRuch);
        dodajNapis("POZAR",x1NazwaPozar,y1NazwaPozar,x2NazwaPozar,y2NazwaPozar);
        dodajNapis("INTRUZ",x1NazwaIntruz,y1NazwaIntruz,x2NazwaIntruz,y2NazwaIntruz);
        dodajNapis(true,x1NazwaStanAktywacjiAlarmu,y1NazwaStanAktywacjiAlarmu,x2NazwaStanAktywacjiAlarmu,y2NazwaStanAktywacjiAlarmu);

        dodajDuzyNapis("SYMULATOR",x1NazwaSymulator,y1NazwaSymulator,x2NazwaSymulator,y2NazwaSymulator);

        //przyciski alarm
        dodajPrzyciskAlarm(true, x1NazwaAlarm + x2NazwaAlarm, y1NazwaAlarm,120,20);
        dodajPrzyciskAlarm(false,x1NazwaAlarm+x2NazwaAlarm+120,y1NazwaAlarm,120,20);

        //stan dym
        dodajStan(true,x1NazwaDym-15,y1NazwaSypialnia,60,20);
        dodajStan(true,x1NazwaDym-15,y1NazwaSalon,60,20);
        dodajStan(true,x1NazwaDym-15,y1NazwaKuchnia,60,20);
        dodajStan(true,x1NazwaDym-15,y1NazwaPrzedpokoj,60,20);
        dodajStan(true,x1NazwaDym-15,y1NazwaLazienka,60,20);

        //stan ruch
        dodajStan(true,x1NazwaRuch-14,y1NazwaSypialnia,60,20);
        dodajStan(true,x1NazwaRuch-14,y1NazwaSalon,60,20);
        dodajStan(true,x1NazwaRuch-14,y1NazwaKuchnia,60,20);
        dodajStan(true,x1NazwaRuch-14,y1NazwaPrzedpokoj,60,20);
        dodajStan(true,x1NazwaRuch-14,y1NazwaLazienka,60,20);

        //symulator pozar
        stworzCheckboxPozarIIntruz(x1NazwaPozar+10,y1NazwaSypialnia,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaPozar+10,y1NazwaSalon,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaPozar+10,y1NazwaKuchnia,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaPozar+10,y1NazwaPrzedpokoj,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaPozar+10,y1NazwaLazienka,20,20);

        //symulator intruz
        stworzCheckboxPozarIIntruz(x1NazwaIntruz+12,y1NazwaSypialnia,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaIntruz+12,y1NazwaSalon,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaIntruz+12,y1NazwaKuchnia,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaIntruz+12,y1NazwaPrzedpokoj,20,20);
        stworzCheckboxPozarIIntruz(x1NazwaIntruz+12,y1NazwaLazienka,20,20);


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


    public void dodajNapis(String napis, int x1, int y1, int x2, int y2){
        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1, y1, x2, y2);
        //nazwa.setBackground(Color.RED);
        add(nazwa);
    }

    public void dodajNapis(boolean stan, int x1, int y1, int x2, int y2){
        String napis;
        if(stan){
            napis = "ALARM AKTYWNY";
        }
        else {
            napis = "ALARM NIEAKTYWNY";
        }

        JLabel nazwa = new JLabel(napis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1,y1,x2,y2);
        nazwa.setFont(SmartHome.duzyNapis);
        if(stan){
            nazwa.setBackground(Color.GREEN);
        }
        else {
            nazwa.setBackground(Color.RED);
        }
        add(nazwa);
    }

    public void dodajStan( boolean stan, int x1, int y1, int x2, int y2){

        String napis;
        if(stan){
            napis = "GOTOWY";
        }
        else{
            napis = "WYKRYTO";
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

    public void dodajDuzyNapis(String napis, int x1, int y1, int x2, int y2){
        JLabel nazwa = new JLabel(napis);
        nazwa.setFont(SmartHome.duzyNapis);
        nazwa.setOpaque(true);
        nazwa.setBounds(x1, y1, x2, y2);
        //nazwa.setBackground(Color.RED);
        add(nazwa);
    }

    public void stworzCheckboxPozarIIntruz(int x1, int y1, int x2, int y2) {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(x1, y1, x2, y2);
        //checkBox.setBackground(Color.RED);
        add(checkBox);
    }
}
