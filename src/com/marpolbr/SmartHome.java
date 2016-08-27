package com.marpolbr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * Created by Marcin on 2016-08-26.
 */

public class SmartHome extends JFrame implements ItemListener {
    public SmartHome(){
        initUI();
    }

    public final void initUI(){
        setLayout(null); //ustawienie Layouta jako absolutne pozycjonowanie
        // NIE MOØNA USTAWIC setLayout bo znika wtedy rysowanie
        //DZIALA jak siÍ ustawi setBounds na home1


        JButton przyciskInfo = new JButton("INFORMACJE");
        przyciskInfo.setBounds(1170, 625, 110, 40);
        przyciskInfo.setToolTipText("Info o zakladce");
        add(przyciskInfo);

        przyciskInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "Przycisk 'INFORMACJE' zawierac bedzie informacje dotyczace zakladki " +
                        "w ktorej uzytkownik aktualnie sie znajduje");
            }
        });

        //Przycisk START
        JButton przyciskStart = new JButton("START");
        przyciskStart.setBounds(670,625,110,40);
        przyciskStart.setToolTipText("Start symulacji");
        add(przyciskStart);

        //OSWIETLENIE
        JLabel napisOswietlenie = new JLabel("OSWIETLENIE");
        add(napisOswietlenie);
        napisOswietlenie.setFont(new Font("Serif",Font.BOLD,16));
        napisOswietlenie.setBounds(700,200,110,30);
        napisOswietlenie.setBackground(new Color(231, 223, 114));
        napisOswietlenie.setOpaque(true);

        JCheckBox oswSypialnia = new JCheckBox("SYPIALNIA",false);
        oswSypialnia.setBounds(700,250,100,20);
        add(oswSypialnia);
        JCheckBox oswLazienka = new JCheckBox("LAZIENKA");
        oswLazienka.setBounds(700,280,100,20);
        add(oswLazienka);
        JCheckBox oswSalon = new JCheckBox("SALON");
        oswSalon.setBounds(700,310,100,20);
        add(oswSalon);
        JCheckBox oswPrzedpokoj = new JCheckBox("PRZEDPOKOJ");
        oswPrzedpokoj.setBounds(700,340,110,20);
        add(oswPrzedpokoj);
        JCheckBox oswKuchnia = new JCheckBox("KUCHNIA");
        oswKuchnia.setBounds(700,370,100,20);
        add(oswKuchnia);

        oswSypialnia.addItemListener(this);
        //oswLazienka.addActionListener(this);
       // oswSalon.addActionListener(this);
        //oswPrzedpokoj.addActionListener(this);
       // oswKuchnia.addActionListener(this);


        //rysowanie domu
        HomeDrawing home1 = new HomeDrawing();
        add(home1);
        home1.setBounds(0,30,648,700);
        home1.setBackground(new Color(143, 225, 231));

        //NAZWY OKIEN - PO DODANIU èLE FUNKCJONUJE LAYOUT
        JLabel oknoSym = new JLabel("OKNO SYMULACJI");
        add(oknoSym);
        oknoSym.setFont(new Font("Serif",Font.BOLD,16));
        oknoSym.setBounds(270,0,150,30);
        oknoSym.setBackground(new Color(231, 223, 114));
        oknoSym.setOpaque(true); //moøliwoúÊ ustawienie koloru, domyúlnie jest transparentny

        JLabel oknoUst = new JLabel("USTAWIENIA");
        add(oknoUst);
        oknoUst.setFont(new Font("Serif",Font.BOLD,16));
        oknoUst.setBounds(950,0,110,30);
        oknoUst.setBackground(new Color(231, 223, 114));
        oknoUst.setOpaque(true);

        //Podzia≥ okna
        PodzielOkna podziel = new PodzielOkna();
        add(podziel);
        podziel.setBounds(650,0,2,700);
        //HomeOptions
        HomeOptions opt1 = new HomeOptions();
        add(opt1);
        opt1.setBounds(652,615,650,70);
        opt1.setBackground(new Color(130, 100, 84));

        //utworzenie ramki
        setTitle("Aplikacja dom inteligentny");
        setSize(1300, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//JESZVZE POZMIENIAC ZEBY ZROBIC WIELE ACTION LISTENEROW
    @Override
    public void itemStateChanged(ItemEvent e){

        int sel = e.getStateChange();

        if (sel==ItemEvent.SELECTED) {
//ZLE
            //setTitle("Aplikacja dom inteligentny");
            UstOswietlenia swiatloSypialnia = new UstOswietlenia();
            add(swiatloSypialnia);
            swiatloSypialnia.setBounds(42,72,306,220);
            HomeDrawing nazwaSyp = new HomeDrawing();
            add(nazwaSyp);
            nazwaSyp.setBounds(0,30,648,700);


        } else {

            //setTitle("");
        }
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SmartHome ex = new SmartHome();
                ex.setVisible(true);
            }
        });
    }
}
