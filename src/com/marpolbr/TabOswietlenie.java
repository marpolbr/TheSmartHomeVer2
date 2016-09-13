package com.marpolbr;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

//TODO:Zrobic zeby ikony zmianialy sie z wartoscia suwaka
public class TabOswietlenie extends JPanel {

    public static final int xPoczatekOpcji = 20;

    // Checkboxy (TODO: jako procenty?)
    public static final int wysokoscCheckboxa  = 20;
    public static final int szerokoscCheckboxa = 120;
    public static final int yPozycjaCheckboxa  = 40;
    public static final int yOdstepCheckboxa   = 70;

    JPanel[] pokoje;

    //Suwaki
    public static final int dlugoscSuwaka = 300;
    public static final int wysokoscSuwaka = 50;
    public static final int minimumSuwakaNatezenia = 0;
    public static final int maximumSuwakaNatezenia = 100;
    public static final int defaultSuwakaNatezenia = 0;
    public static final int podzialkaDrobna = 2;
    public static final int podzialkaGlowna = 20;

    //Ikony
    public static final int xRozmiarIkony = 40;
    public static final int yRozmiarIkony = 40;
    public static final int xPozycjaIkonyNatezeniaSwiatla = szerokoscCheckboxa + xPoczatekOpcji + dlugoscSuwaka + 10;
    private ImageIcon noLight;
    private ImageIcon lowLight;
    private ImageIcon mediumLight;
    private ImageIcon highLight;
    private ImageIcon maximumLight;

    public TabOswietlenie(JPanel[] pokoje){
        this.pokoje = pokoje;
        this.setLayout(null);
        zaladujObrazyNatezenia();
        dodajListePokoiOswietlenia();
//------------------------------------------------------------------------------------------------------
        //TEST do zmiany ikonek //TODO: Umiescic wszystko w ZmieniaczIkonOswietlenia
        JSlider suwak = new JSlider(0,255,0);
        suwak.setBounds(200,400,200,50);
        //suwak.setBackground(Color.RED);
        suwak.setOpaque(true);
        suwak.setMajorTickSpacing(50);
        suwak.setMinorTickSpacing(2);
        suwak.setPaintLabels(true);
        suwak.setPaintTicks(true);
        //add(suwak);
        JLabel ikonaTestowa = new JLabel();
        ikonaTestowa.setIcon(noLight);
        ikonaTestowa.setBounds(400, 400, 200, 50);
        //add(ikonaTestowa);

        suwak.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider zrodlo = (JSlider) e.getSource();
                suwak.setBackground(new Color(255,255,255-zrodlo.getValue()));
            }
        });

        suwak.addChangeListener((ChangeEvent event) -> {
            int wartoscSuwaka = suwak.getValue();

            if (wartoscSuwaka == 0) {
                ikonaTestowa.setIcon(noLight);
            } else if (wartoscSuwaka > 0 && wartoscSuwaka <= 85) {
                ikonaTestowa.setIcon(lowLight);
            } else if (wartoscSuwaka > 85 && wartoscSuwaka <= 170) {
                ikonaTestowa.setIcon(mediumLight);
            } else if (wartoscSuwaka > 170 && wartoscSuwaka <= 254) {
                ikonaTestowa.setIcon(highLight);
            }else {
                ikonaTestowa.setIcon(maximumLight);
            }
        });
//---------------------------------------------------------------------------------------------------------
        JLabel nazwaCzujnikRuchu = new JLabel("CZUJNIK RUCHU");
        nazwaCzujnikRuchu.setOpaque(true);
        nazwaCzujnikRuchu.setBounds(510,0,100,20);
        //nazwaCzujnikRuchu.setBackground(Color.RED);
        add(nazwaCzujnikRuchu);

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

            stworzSuwakNatezeniaSwiatla(
                    szerokoscCheckboxa + xPoczatekOpcji,
                    yPozycjaCheckboxa + yOdstepCheckboxa * i,
                    dlugoscSuwaka,
                    wysokoscSuwaka
            );

            stworzIkoneNatezeniaSwiatla(
                    xPozycjaIkonyNatezeniaSwiatla,
                    yPozycjaCheckboxa + yOdstepCheckboxa * i,
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

    public void stworzSuwakNatezeniaSwiatla(int x1, int y1, int xOkno, int yOkno){
        JSlider suwakOswietlenia = new JSlider(minimumSuwakaNatezenia,maximumSuwakaNatezenia,defaultSuwakaNatezenia);
        suwakOswietlenia.setBounds(x1,y1,xOkno,yOkno);
      //suwakOswietlenia.setBackground(Color.RED);
        suwakOswietlenia.setPaintLabels(true);
        suwakOswietlenia.setMinorTickSpacing(podzialkaDrobna);
        suwakOswietlenia.setMajorTickSpacing(podzialkaGlowna);
        suwakOswietlenia.setPaintTicks(true);
        add(suwakOswietlenia);
        suwakOswietlenia.addChangeListener(new ZmieniaczIkonOswietlenia());
    }

    public void stworzIkoneNatezeniaSwiatla(int x1, int y1, int xOkno, int yOkno){
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
