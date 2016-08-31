package com.marpolbr;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class WlacznikSwiatla implements ItemListener {
    private JPanel pokoj;
    private Color aktualnyKolor;

    public WlacznikSwiatla(JPanel pokoj) {
        this.pokoj = pokoj;
    }


    @Override
    public void itemStateChanged(ItemEvent e){
        int status = e.getStateChange();
        wlacz(status == ItemEvent.SELECTED);
//        pokoj.wlaczSwiatlo(status == ItemEvent.SELECTED);
    }

//    to powinno byc w klasie Pokoj
    public void wlacz(boolean czyWlaczone) {
        // kolor = (if cos tam) ? jezeli true : jezeli false
        aktualnyKolor = czyWlaczone ? Color.YELLOW : Color.RED;
        pokoj.setBackground(aktualnyKolor);
    }
}
