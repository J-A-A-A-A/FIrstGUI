package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener {
    // canvas for other GUI widgets

    JButton button1;
    JButton button2;
    JButton button3;

    public GUI(int width, int height) {
        System.out.println("SEQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("b1");
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("b2");
        button2.setBounds(120,0, 100, 40);
        button3 = new JButton("View Graph");
        button3.setBounds(240,0, 100, 40);
        add(button1);
        button1.addActionListener(this);
        add(button2);
        button2.addActionListener(this);
        add(button3);
        button3.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("View Gr`        aph")){
            Graph myGraph = new Graph(300,300);
        }
    }

}

