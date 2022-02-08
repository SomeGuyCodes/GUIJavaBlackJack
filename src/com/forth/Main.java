package com.forth;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



public class Main extends JFrame {

    private ImageIcon img;
    private JLabel imglabel;


    public Main() {
        setLayout(new FlowLayout());

        img = new ImageIcon(getClass().getResource("Table.jpg"));
        //adding the label for the above Icon
        imglabel = new JLabel("this is the image");
        imglabel.setIcon(img);
        add(imglabel);
    }

    public static void main(String[] args) {


        Main app = new Main();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
        app.setTitle("Java BLACKJACK");
    }

}