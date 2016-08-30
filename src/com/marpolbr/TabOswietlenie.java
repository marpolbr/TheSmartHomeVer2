package com.marpolbr;

import javafx.scene.control.Tab;

import javax.swing.*;

public class TabOswietlenie extends JPanel {

    public static final int xPoczatekOpcji = SmartHome.xSrodekEkranu + 50;

    // Checkboxy (TODO: jako procenty?)
    public static final int wysokoscCheckboxa  = 20;
    public static final int szerokoscCheckboxa = 120;
    public static final int yPozycjaCheckboxa  = 250;
    public static final int yOdstepCheckboxa   = 30;

    JPanel[] pokoje;

    public TabOswietlenie(JPanel[] pokoje){
        this.pokoje = pokoje;
        dodajOswietlenie();
        dodajListePokoiOswietlenia();
    }

    public void dodajOswietlenie() {
        JLabel napisOswietlenie = new JLabel("OSWIETLENIE");
        add(napisOswietlenie);
        napisOswietlenie.setFont(SmartHome.duzyNapis);
        napisOswietlenie.setBounds(700,200,110,30);
        napisOswietlenie.setBackground(SmartHome.kolorOkien);
        napisOswietlenie.setOpaque(true);
    }

    public void dodajListePokoiOswietlenia() {
        String[] nazwyCheckboxa = {"SYPIALNIA", "LAZIENKA" ,"SALON", "PRZEDPOKOJ", "KUCHNIA"};

        for(int i = 0; i < nazwyCheckboxa.length; i++) {
            stworzCheckboxa(
                    nazwyCheckboxa[i],
                    xPoczatekOpcji,
                    yPozycjaCheckboxa + yOdstepCheckboxa * i,
                    szerokoscCheckboxa,
                    wysokoscCheckboxa,
                    pokoje[i]);
        }
    }
//TODO: Napis OSWIETLENIE oraz checkboxy umieszczone niezgodnie z pozycja absolutna, prawdopodobnie dziala Layout domyslny
    public void stworzCheckboxa(String nazwa, int x1, int y1, int xOkno, int yOkno, JPanel pokoj) {
        JCheckBox checkBox = new JCheckBox(nazwa, false);
        checkBox.setBounds(x1, y1, xOkno, yOkno);
        add(checkBox);
        checkBox.addItemListener(new WlacznikSwiatla(pokoj));
    }
}
