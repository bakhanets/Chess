package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

public class MainField extends JFrame {
    public static final int FRAME_WIDTH  = 800;
    public static final int FRAME_HEIGHT = 820;

    MainField() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
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
            for (int j = 0; j < 8; j++) {
                if ((j + i) % 2 != 0)
                    g2.fillRect(100 * i, j * 100 + 20, FRAME_WIDTH / 8, FRAME_HEIGHT / 8);
            }
        }
    }
}
