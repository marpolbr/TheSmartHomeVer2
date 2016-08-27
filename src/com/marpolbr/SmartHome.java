package com.marpolbr;

import org.w3c.dom.css.Rect;

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
    public static final Color kolorHomeOptions = new Color(130, 100, 84);

    // Napisy
    public static final Font duzyNapis = new Font("Serif",Font.BOLD,16);

    // Wymiary
    public static final int xRozmiarOkna   = 1300;
    public static final int xSrodekEkranu  = xRozmiarOkna/2;


    // Jpanele
    JPanel pokojA;
    JPanel pokojB;
    JPanel pokojC;
    JPanel pokojD;
    JPanel pokojE;

    // Tabsy
    private	JTabbedPane tabbedPane;

    public SmartHome(){
        initUI();
    }

    public final void initUI(){
        setLayout(null);

        // Ustawienie przyciskÛw
        dodajInformacje();
        dodajStart();

        // Widok mieszkania (rysowanie domu)
        HomeDrawing home1 = new HomeDrawing();
        add(home1);
        home1.setBounds(0,30,648,700);
        home1.setBackground(kolorTla);

        pokojA = dodajPokoj(pokojA, home1);
        pokojB = dodajPokoj(pokojB, home1);
        pokojC = dodajPokoj(pokojC, home1);
        pokojD = dodajPokoj(pokojD, home1);
        pokojE = dodajPokoj(pokojE, home1);


        //NAZWY OKIEN - PO DODANIU èLE FUNKCJONUJE LAYOUT
        JLabel oknoSym = new JLabel("OKNO SYMULACJI");
        add(oknoSym);
        oknoSym.setFont(duzyNapis);
        oknoSym.setBounds(270,0,150,30);
        oknoSym.setBackground(kolorOkien);
        oknoSym.setOpaque(true); //moøliwoúÊ ustawienie koloru, domyúlnie jest transparentny

        JLabel oknoUst = new JLabel("USTAWIENIA");
        add(oknoUst);
        oknoUst.setFont(duzyNapis);
        oknoUst.setBounds(950,0,110,30);
        oknoUst.setBackground(kolorOkien);
        oknoUst.setOpaque(true);

        //Podzia≥ okna
        PodzielOkna podziel = new PodzielOkna();
        add(podziel);
        podziel.setBounds(650,0,2,700);
        //HomeOptions
        HomeOptions opt1 = new HomeOptions();
        add(opt1);
        opt1.setBounds(652,615,650,70);
        opt1.setBackground(kolorHomeOptions);

        //utworzenie ramki
        setTitle("Aplikacja dom inteligentny");
        setSize(1300, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dodanie zakladek
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(700,100,500,500);
        JPanel[] pokoje = {pokojA, pokojB ,pokojC, pokojD, pokojE};
        tabbedPane.addTab( "TabOswietlenie", new TabOswietlenie(pokoje) );
        tabbedPane.addTab( "Page 2", new JPanel() );
        tabbedPane.addTab( "Page 3", new JPanel() );
        add(tabbedPane, BorderLayout.CENTER);
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
}
