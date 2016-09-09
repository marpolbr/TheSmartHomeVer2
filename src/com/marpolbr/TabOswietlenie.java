package com.marpolbr;

import javafx.scene.control.Tab;

import javax.swing.*;
import java.awt.*;
//TODO:Zrobic zeby ikony zmianialy sie z wartoscia suwaka
public class TabOswietlenie extends JPanel {

    public static final int xPoczatekOpcji = 20;

    // Checkboxy (TODO: jako procenty?)
    public static final int wysokoscCheckboxa  = 20;
    public static final int szerokoscCheckboxa = 120;
    public static final int yPozycjaCheckboxa  = 20;
    public static final int yOdstepCheckboxa   = 50;

    JPanel[] pokoje;

    //Ikony
    public static final int xRozmiarIkony = 40;
    public static final int yRozmiarIkony = 40;
    private ImageIcon noLight;
    private ImageIcon lowLight;
    private ImageIcon mediumLight;
    private ImageIcon highLight;
    private ImageIcon maximumLight;

    //Suwaki
    public static final int dlugoscSuwaka = 300;
    public static final int minimumSuwakaNatezenia = 0;
    public static final int maximumSuwakaNatezenia = 100;
    public static final int defaultSuwakaNatezenia = 0;


    public TabOswietlenie(JPanel[] pokoje){
        this.pokoje = pokoje;
        this.setLayout(null);
        zaladujObrazyNatezenia();
        dodajListePokoiOswietlenia();


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

            stworzNatezenieSwiatla(
                    szerokoscCheckboxa+xPoczatekOpcji,
                    yPozycjaCheckboxa + yOdstepCheckboxa * i,
                    dlugoscSuwaka,
                    wysokoscCheckboxa
            );

            stworzIkoneNatezenia(
                    szerokoscCheckboxa+xPoczatekOpcji+dlugoscSuwaka,
                    yOdstepCheckboxa * i,
                    xRozmiarIkony,
                    yRozmiarIkony
            );
        }
    }

    public void stworzCheckboxa(String nazwa, int x1, int y1, int xOkno, int yOkno, JPanel pokoj) {
        JCheckBox checkBox = new JCheckBox(nazwa, false);
        checkBox.setBounds(x1, y1, xOkno, yOkno);
      //checkBox.setBackground(Color.cyan);
        add(checkBox);
        checkBox.addItemListener(new WlacznikSwiatla(pokoj));
    }

    public void stworzNatezenieSwiatla(int x1, int y1, int xOkno, int yOkno){
        JSlider suwakOswietlenia = new JSlider(minimumSuwakaNatezenia,maximumSuwakaNatezenia,defaultSuwakaNatezenia);
        suwakOswietlenia.setBounds(x1,y1,xOkno,yOkno);
      //suwakOswietlenia.setBackground(Color.RED);
        add(suwakOswietlenia);
    }

    public void stworzIkoneNatezenia(int x1, int y1, int xOkno, int yOkno){
        JLabel ikonaNatezenia = new JLabel();
        ikonaNatezenia.setIcon(noLight);
        ikonaNatezenia.setBounds(x1,y1,xOkno,yOkno);
        add(ikonaNatezenia);
    }

    //TODO: Nie dziala ladowanie obrazow z src
    public void zaladujObrazyNatezenia(){
        noLight = new ImageIcon("D:\\IdeaProjects\\TheSmartHomeVer2\\src\\images\\small icons\\no-light.png");
        lowLight = new ImageIcon("D:\\IdeaProjects\\TheSmartHomeVer2\\src\\images\\small icons\\low-light.png");
        mediumLight = new ImageIcon("D:\\IdeaProjects\\TheSmartHomeVer2\\src\\images\\small icons\\medium-light.png");
        highLight = new ImageIcon("D:\\IdeaProjects\\TheSmartHomeVer2\\src\\images\\small icons\\high-light.png");
        maximumLight = new ImageIcon("D:\\IdeaProjects\\TheSmartHomeVer2\\src\\images\\small icons\\maximum-light.png");
    }
}
