package view;

import javax.swing.*;

public class Window extends JFrame{
    public Window(String title) {
        super(title);
        setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        setSize(480, 450);
        setResizable(false);


        getContentPane().add(new MenuCalculator());
        setVisible(true);
    }
}
