package com.github.surzia.factory.codec.shape;

import javax.swing.*;
import java.awt.*;

/**
 * 画矩形
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        JFrame frame = new JFrame();
        Swing swing = new Swing();
        frame.setVisible(true);
        frame.setBounds(700, 200, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(swing);
    }

    static class Swing extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(180, 180, 100, 50);
        }
    }
}
