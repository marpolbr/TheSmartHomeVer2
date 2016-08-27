package com.marpolbr;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Marcin on 2016-08-27.
 */
public class PodzielOkna extends JPanel {
    private void doDrawing(Graphics g){

        Graphics2D liniaDzielaca = (Graphics2D) g;

        liniaDzielaca.setColor(Color.BLACK);
        liniaDzielaca.setStroke(new BasicStroke(2));
        liniaDzielaca.drawLine(0,0,0,700);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }
}
