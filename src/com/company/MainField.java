package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

public class MainField extends JFrame {
    MainField() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 820);
        setResizable(false);
        setVisible(true);

        getContentPane().setBackground(new Color(230, 186, 153));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(125, 59, 10));

        for (int i = 0; i < 8; i++) {
            Line2D lineVertical = new Line2D.Float(100 * i, 0, 100 * i, 820);
            g2.draw(lineVertical);

            Line2D lineHorizontal = new Line2D.Float(0, 100 * i+20, 800, 100 * i + 20);
            g2.draw(lineHorizontal);

            for (int j = 0; j < 8; j++) {
                if ((j + i) % 2 != 0)
                    g2.fillRect(100 * i, j * 100 + 20, 800 / 8, 820 / 8);
            }
        }
    }
}
