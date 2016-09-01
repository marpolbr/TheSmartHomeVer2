package com.marpolbr;

import javax.swing.*;
import java.awt.*;

public class HomeDrawing extends JPanel {

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

        int x2,y2;
        x2=18;
        y2=20;
        home.setStroke(new BasicStroke(4));
        home.setColor(Color.BLACK);
        home.drawRect(40,40,560/x2*10,560/y2*8);
        home.drawRect(40+560/x2*10,40,560/x2*8,560/y2*8);
        home.drawRect(40,40+560/y2*8,560/x2*8,560/y2*12);
        home.drawRect(40+560/x2*8,40+560 / y2 * 8, 560 / x2 * 4, 560 / y2 * 12);
        home.drawRect(40+560/x2*12,40+560/y2*8,560/x2*6,560/y2*12);

        //NAZWY POKOI
        setLayout(null);
        nazwaPokoju("SALON",145,500,45,20);
        nazwaPokoju("PRZEDPOKOJ", 310, 500, 80, 20);
        nazwaPokoju("KUCHNIA",475,500,60,20);
        nazwaPokoju("LAZIENKA",450,200,60,20);
        nazwaPokoju("SYPIALNIA",165,200,65,20);

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
