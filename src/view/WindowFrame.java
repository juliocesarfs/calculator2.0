package view;

import javax.swing.*;

public class WindowFrame extends JFrame {
    public WindowFrame(String title) {
        super(title);
        setDefaultCloseOperation(WindowFrame.EXIT_ON_CLOSE);
        setSize(480, 450);
        setResizable(false);


        getContentPane().add(new Screen());
        setVisible(true);
    }
}
