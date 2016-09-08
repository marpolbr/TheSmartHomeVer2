package com.marpolbr;

import javafx.scene.control.Tab;

import javax.swing.*;
import java.awt.*;

public class TabOswietlenie extends JPanel {

    public static final int xPoczatekOpcji = 0;

    // Checkboxy (TODO: jako procenty?)
    public static final int wysokoscCheckboxa  = 20;
    public static final int szerokoscCheckboxa = 120;
    public static final int yPozycjaCheckboxa  = 0;
    public static final int yOdstepCheckboxa   = 30;

    JPanel[] pokoje;

    //Obrazy
    private ImageIcon noLight;
    private ImageIcon lowLight;
    private ImageIcon mediumLight;
    private ImageIcon highLight;
    private ImageIcon maximumLight;

    private JSlider suwakOswietlenia;


    public TabOswietlenie(JPanel[] pokoje){
        this.pokoje = pokoje;
        this.setLayout(null);
        dodajListePokoiOswietlenia();
        ustawNatezenieSwiatla();
        zaladujObrazyNatezenia();
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

//TODO: Checkboxy umieszczone niezgodnie z pozycja absolutna, prawdopodobnie dziala Layout domyslny
    public void stworzCheckboxa(String nazwa, int x1, int y1, int xOkno, int yOkno, JPanel pokoj) {
        JCheckBox checkBox = new JCheckBox(nazwa, false);
        checkBox.setBounds(x1, y1, xOkno, yOkno);
        checkBox.setBackground(Color.cyan);
        add(checkBox);
        checkBox.addItemListener(new WlacznikSwiatla(pokoj));
    }

    public void ustawNatezenieSwiatla(){
        suwakOswietlenia = new JSlider(0,150,0);
        suwakOswietlenia.setBounds(100,100,100,100);
    }
    public void zaladujObrazyNatezenia(){
        noLight = new ImageIcon("no-light.png");
        lowLight = new ImageIcon("low-light.png");
        mediumLight = new ImageIcon("medium-light.png");
        highLight = new ImageIcon("high-light.png");
        maximumLight = new ImageIcon("maximum-light.png");
    }
}
