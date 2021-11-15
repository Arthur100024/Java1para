package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main{

    JFrame frame = new JFrame("Khachatryan_pr4"); // рамка

    JButton milan = new JButton("AC Milan"); // кнопка
    JButton madrid = new JButton("Real Madrid"); // кнопка

    //счётчики
    int milan_count = 0;
    int madrid_count = 0;


    JLabel Result = new JLabel("Result: 0 X 0");
    JLabel Last_Scorer = new JLabel("Last Scorer: N/A");
    Label Winner = new Label("Winner: DRAW");

    Font font1 = new Font("Times new roman",Font.BOLD,20);
    Font font2 = new Font("Serif",Font.BOLD,20);

    public Main() {
        // установка размеров рамки
        frame.setSize(240, 240);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // установка шрифтов, созданных ранее
        milan.setFont(font1);
        madrid.setFont(font1);
        Result.setFont(font1);
        Last_Scorer.setFont(font1);
        Winner.setFont(font2);

        // комбинация, благодяра которой кнопка становится красивей
        milan.setBorderPainted(false);
        milan.setFocusPainted(false);

        // фон и передний план
        milan.setBackground(Color.RED);
        milan.setForeground(Color.BLACK);

        // комбинация, благодяра которой кнопка становится красивей
        madrid.setBorderPainted(false);
        madrid.setFocusPainted(false);

        // фон и передний план
        madrid.setBackground(Color.WHITE);
        madrid.setForeground(Color.decode("0x03009c"));

        // добавляем виджеты
        frame.add(milan);
        frame.add(madrid);
        frame.add(Result);
        frame.add(Last_Scorer);
        frame.add(Winner);

        // функционал кнопок

        milan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                milan_count++;
                Result.setText("Result: " + milan_count + " X " + madrid_count);
                Last_Scorer.setText("Last Scorer: AC Milan");
                if(milan_count == madrid_count)
                    Winner.setText("Winner: DRAW");
                else if(milan_count > madrid_count)
                    Winner.setText("Winner: AC Milan");
                else
                    Winner.setText("Winner: Real Madrid");
            }
        });

        madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                madrid_count++;
                Result.setText("Result: " + milan_count + " X " + madrid_count);
                Last_Scorer.setText("Last Scorer: Real Madrid");
                if(milan_count == madrid_count)
                    Winner.setText("Winner: DRAW");
                else if(milan_count > madrid_count)
                    Winner.setText("Winner: AC Milan");
                else
                    Winner.setText("Winner: Real Madrid");
            }
        });

    }

    public static void main(String[]args) {

        new Main().frame.setVisible(true);
    }
}
