package com.marpolbr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    JPanel pokojASypialnia;
    JPanel pokojBLazienka;
    JPanel pokojCSalon;
    JPanel pokojDPrzedpokoj;
    JPanel pokojEKuchnia;

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

        // Widok mieszkania (rysowanie domu - JPanel Okna Symulacji)
        HomeDrawing rzutDomu = new HomeDrawing();
        add(rzutDomu);
        rzutDomu.setLayout(null);
        rzutDomu.setBounds(0, 30, xRozmiarOkna / 2, yRozmiarOkna);
        rzutDomu.setBackground(kolorTla);

        //TODO:Dodano rzutDomu.setLayout(null) setBounds oraz setBorder do pokoi. Umiescic to w klasie Pokoj
        pokojASypialnia = dodajPokoj(pokojASypialnia, rzutDomu);
        pokojASypialnia.setBounds(HomeDrawing.x1Sypialnia, HomeDrawing.y1Sypialnia, HomeDrawing.x2Sypialnia, HomeDrawing.y2Sypialnia);
        pokojASypialnia.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pokojBLazienka = dodajPokoj(pokojBLazienka, rzutDomu);
        pokojBLazienka.setBounds(HomeDrawing.x1Lazienka, HomeDrawing.y1Lazienka, HomeDrawing.x2Lazienka, HomeDrawing.y2Lazienka);
        pokojBLazienka.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pokojCSalon = dodajPokoj(pokojCSalon, rzutDomu);
        pokojCSalon.setBounds(HomeDrawing.x1Salon, HomeDrawing.y1Salon, HomeDrawing.x2Salon, HomeDrawing.y2Salon);
        pokojCSalon.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pokojDPrzedpokoj = dodajPokoj(pokojDPrzedpokoj, rzutDomu);
        pokojDPrzedpokoj.setBounds(HomeDrawing.x1Przedpokoj, HomeDrawing.y1Przedpokoj, HomeDrawing.x2Przedpokoj, HomeDrawing.y2Przedpokoj);
        pokojDPrzedpokoj.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pokojEKuchnia = dodajPokoj(pokojEKuchnia, rzutDomu);
        pokojEKuchnia.setBounds(HomeDrawing.x1Kuchnia, HomeDrawing.y1Kuchnia, HomeDrawing.x2Kuchnia, HomeDrawing.y2Kuchnia);
        pokojEKuchnia.setBorder(BorderFactory.createLineBorder(Color.BLACK));



        // Dodanie zakladek
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(653,40,639,573);
        JPanel[] pokoje = {pokojASypialnia, pokojBLazienka, pokojCSalon, pokojDPrzedpokoj, pokojEKuchnia};
        tabbedPane.addTab( "Oswietlenie", new TabOswietlenie(pokoje));
        tabbedPane.addTab( "Temperatura",new TabTemperatura());
        tabbedPane.addTab( "Okna", new TabOkna() ); //tabbedPane.addTab( "Okna", new JPanel() );
        tabbedPane.addTab( "Alarm", new TabAlarm() );
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
