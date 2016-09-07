package com.marpolbr;

import javax.swing.*;
import java.awt.*;

public class HomeDrawing extends JPanel {

    //Wspolrzedne pokoi - rysowanie
    public static final int x2=18;
    public static final int y2=20;

    public static final int x1Sypialnia = 40;
    public static final int y1Sypialnia = 40;
    public static final int x2Sypialnia = 560/x2*10;
    public static final int y2Sypialnia = 560/y2*8;

    public static final int x1Lazienka = x1Sypialnia + x2Sypialnia;
    public static final int y1Lazienka = y1Sypialnia;
    public static final int x2Lazienka = 560/x2*8;
    public static final int y2Lazienka = y2Sypialnia;

    public static final int x1Salon = x1Sypialnia;
    public static final int y1Salon = y1Sypialnia + y2Sypialnia;
    public static final int x2Salon = x2Lazienka;
    public static final int y2Salon = 560/y2*12;

    public static final int x1Przedpokoj = x1Sypialnia + x2Salon;
    public static final int y1Przedpokoj = y1Salon;
    public static final int x2Przedpokoj = 560 / x2 * 4;
    public static final int y2Przedpokoj = y2Salon;

    public static final int x1Kuchnia = x1Sypialnia +560/x2*12;
    public static final int y1Kuchnia = y1Przedpokoj;
    public static final int x2Kuchnia = 560/x2*6;
    public static final int y2Kuchnia = y2Salon;

    //wspolrzedne nazw pokoi
    public static final int wysokoscNazwaPokoju      = 20;
    public static final int yGornePolozenieNazwPokoi = 200;
    public static final int yDolnePolozenieNazwPokoi = 500;
    public static final int dlugoscNazwySalon        = 42;
    public static final int dlugoscNazwyPrzedpokoj   = 80;
    public static final int dlugoscNazwyKuchnia      = 56;
    public static final int dlugoscNazwyLazienka     = 59;
    public static final int dlugoscNazwySypialnia    = 63;



    private Rectangle pokojA = new Rectangle();
    //TODO: to samo dla kolejnych pokoi

    public Rectangle getPokojA() {
        return pokojA;
    }

    public void setPokojA(Rectangle pokojA) {
        this.pokojA = pokojA;
    }

    private void doDrawing(Graphics g){

        Graphics2D home = (Graphics2D) g;

        home.setStroke(new BasicStroke(4));
        home.setColor(Color.BLACK);
        home.drawRect(x1Sypialnia, y1Sypialnia, x2Sypialnia, y2Sypialnia);
        home.drawRect(x1Lazienka, y1Lazienka, x2Lazienka, y2Lazienka);
        home.drawRect(x1Salon, y1Salon, x2Salon, y2Salon);
        home.drawRect(x1Przedpokoj, y1Przedpokoj, x2Przedpokoj, y2Przedpokoj);
        home.drawRect(x1Kuchnia, y1Kuchnia, x2Kuchnia, y2Kuchnia);

        //NAZWY POKOI
        setLayout(null);

        nazwaPokoju("SYPIALNIA",(x1Sypialnia+x2Sypialnia/2)- g.getFontMetrics().stringWidth("SYPIALNIA")/2,yGornePolozenieNazwPokoi,dlugoscNazwySypialnia,wysokoscNazwaPokoju);
        nazwaPokoju("LAZIENKA",(x1Lazienka+x2Lazienka/2)- g.getFontMetrics().stringWidth("LAZIENKA")/2,yGornePolozenieNazwPokoi,dlugoscNazwyLazienka,wysokoscNazwaPokoju);
        nazwaPokoju("SALON",(x1Salon+x2Salon/2)- g.getFontMetrics().stringWidth("SALON")/2,yDolnePolozenieNazwPokoi,dlugoscNazwySalon,wysokoscNazwaPokoju);
        nazwaPokoju("PRZEDPOKOJ", (x1Przedpokoj+x2Przedpokoj/2)- g.getFontMetrics().stringWidth("PRZEDPOKOJ")/2, yDolnePolozenieNazwPokoi, dlugoscNazwyPrzedpokoj, wysokoscNazwaPokoju);
        nazwaPokoju("KUCHNIA",(x1Kuchnia+x2Kuchnia/2)- g.getFontMetrics().stringWidth("KUCHNIA")/2,yDolnePolozenieNazwPokoi,dlugoscNazwyKuchnia,wysokoscNazwaPokoju);


    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }


    // metoda do dodawania nazw pokoi
    public void nazwaPokoju(String napis, int x1, int y1, int x2,int y2){
        JLabel nazwaPokoju = new JLabel(napis);
        add(nazwaPokoju);
        nazwaPokoju.setFont(new Font("Serif", Font.BOLD, 12));
        nazwaPokoju.setBounds(x1,y1,x2,y2);
        //nazwaPokoju.setBackground(new Color(143, 225, 231));
        nazwaPokoju.setOpaque(true);
    }


}
