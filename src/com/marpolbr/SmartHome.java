package com.marpolbr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class SmartHome extends JFrame {
    // Kolory
    public static final Color kolorOkien       = new Color(231, 223, 114);
    public static final Color kolorTla         = new Color(143, 225, 231);

    // Napisy
    public static final Font duzyNapis        = new Font("Serif",Font.BOLD,16);
    public static final int wysokoscDuzyNapis = 30;
    public static final int yDuzyNapis        = 0;

    // Wymiary
    public static final int xRozmiarOkna   = 1300;
    public static final int xSrodekEkranu  = xRozmiarOkna/2;
    public static final int yRozmiarOkna   = 700;
    public static final int ySrodekEkranu  = xRozmiarOkna/2;

    //Nazwy okien
    public static final String nazwaAplikacji          = "Aplikacja dom inteligentny";
    public static final String nazwaPierwszegoOkna     = "OKNO SYMULACJI";
    public static final int dlugoscNazwyPierwszegoOkna = 145;
    public static final String nazwaDrugiegoOkna       = "USTAWIENIA";
    public static final int dlugoscNazwyDrugiegoOkna   = 105;


    // Jpanele
    JPanel pokojA;
    JPanel pokojB;
    JPanel pokojC;
    JPanel pokojD;
    JPanel pokojE;

    // Zakladki
    private	JTabbedPane tabbedPane;

    public SmartHome(){
        initUI();
    }

    public final void initUI(){
        setLayout(null);

        // Ustawienie przycisków
        dodajInformacje();
        dodajStart();

        //Nazwy okien
        dodajNazwyOkien(nazwaPierwszegoOkna,(xSrodekEkranu/2-dlugoscNazwyPierwszegoOkna/2), dlugoscNazwyPierwszegoOkna);
        dodajNazwyOkien(nazwaDrugiegoOkna,(xRozmiarOkna-xSrodekEkranu/2-dlugoscNazwyDrugiegoOkna/2), dlugoscNazwyDrugiegoOkna);

        // Widok mieszkania (rysowanie domu)
        HomeDrawing rzutDomu = new HomeDrawing();
        add(rzutDomu);
        rzutDomu.setBounds(0, 30, xRozmiarOkna / 2, yRozmiarOkna);
        rzutDomu.setBackground(kolorTla);

        pokojA = dodajPokoj(pokojA, rzutDomu);
        pokojB = dodajPokoj(pokojB, rzutDomu);
        pokojC = dodajPokoj(pokojC, rzutDomu);
        pokojD = dodajPokoj(pokojD, rzutDomu);
        pokojE = dodajPokoj(pokojE, rzutDomu);




        // Dodanie zakladek
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(653,40,639,573);
        JPanel[] pokoje = {pokojA, pokojB ,pokojC, pokojD, pokojE};
        tabbedPane.addTab( "Oswietlenie", new TabOswietlenie(pokoje));
        tabbedPane.addTab( "Temperatura",new TabTemperatura());
        tabbedPane.addTab( "Okna", new JPanel() );
        tabbedPane.addTab( "Alarm", new JPanel() );
        add(tabbedPane);

        //utworzenie ramki
        setTitle(nazwaAplikacji);
        setSize(xRozmiarOkna, yRozmiarOkna);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    public void dodajInformacje() {
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
    }

    public void dodajStart() {
        JButton przyciskStart = new JButton("START");
        przyciskStart.setBounds(670,625,110,40);
        przyciskStart.setToolTipText("Start symulacji");
        add(przyciskStart);
    }

    public JPanel dodajPokoj(JPanel pokoj, JPanel dom){
        pokoj = new JPanel();
        pokoj.setBackground(Color.RED);
        dom.add(pokoj);
        return pokoj;
    }

    public void dodajNazwyOkien(String nazwa, int x1, int x2){
        JLabel nazwaOkna = new JLabel(nazwa);
        nazwaOkna.setFont(duzyNapis);
        nazwaOkna.setBounds(x1, yDuzyNapis, x2, wysokoscDuzyNapis);
      //nazwaOkna.setBackground(kolorOkien);
        nazwaOkna.setOpaque(true); //mo¿liwoœæ ustawienia koloru, domyœlnie jest transparentny
        add(nazwaOkna);
    }

}
