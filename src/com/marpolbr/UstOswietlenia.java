package com.marpolbr;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

/**
 * Created by Marcin on 2016-08-27.
 */
//ZLE
public class UstOswietlenia extends JPanel {
    private void doDrawing(Graphics g) {

        Graphics2D home = (Graphics2D) g;

        home.setColor(Color.YELLOW);
        home.fillRect(0, 0, 306, 220);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
