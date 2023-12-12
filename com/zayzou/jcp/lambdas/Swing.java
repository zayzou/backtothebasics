package com.zayzou.jcp.lambdas;

import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame {

    private JCheckBox cb1, cb2;
    private JButton btn;

    public Swing() {
        setTitle("Hey Swing");
        setSize(400, 100);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        cb1 = new JCheckBox();
        container.add(cb1);
        cb1.addActionListener(ee -> System.out.println("event " + ee.getActionCommand()));


        cb2 = new JCheckBox();
        container.add(cb2);
        cb2.addActionListener(ee -> System.out.println("event " + ee.getActionCommand()));

        btn = new JButton();
        btn.setText("Hey Java");
        container.add(btn);
        btn.addActionListener(ee -> System.out.println("état : " + cb1.isSelected() + " " + cb2.isSelected()));
    }

    public static void main(String[] args) {
        Swing fenetre = new Swing();
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
