package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private Student [] iDNumber;
    private int n;
    private JPanel left, right;
    private JTextField textField;
    private JLabel result;
    private JButton search, sort;
    public App(){
        super("Студенты");
        n = 10;
        iDNumber = new Student[n];
        for (int i = 0; i < n; i++) {
            iDNumber[i] = new Student();
        }
        setLayout(new GridLayout(1, 2));
        left = new JPanel(new GridLayout(n, 1));
        right = new JPanel(new GridLayout(4, 1));
        sort = new JButton("Сортировка");
        textField = new JTextField();
        search = new JButton("Искать");
        result = new JLabel();
        update();
        add(left);
        right.add(sort);
        right.add(textField);
        right.add(search);
        right.add(result);
        add(right);
        sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TestStudent.sort(iDNumber);
                update();
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Student student = TestStudent.getByName(textField.getText(), iDNumber);
                    result.setText(student.getName() + " " + student.getAverage_mark());
                } catch (StudentNotFoundException ex) {

                    result.setText(ex.getMessage());
                }

            }
        });
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void update(){
        left.removeAll();
        left.setVisible(false);
        for (int i = 0; i < n; i++){
            left.add(new JLabel(iDNumber[i].getName() + " " + iDNumber[i].getAverage_mark()));
        }
        left.setVisible(true);
    }
}
