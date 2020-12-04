package view.panels;

import view.components.ButtonNumber;

import javax.swing.*;
import java.awt.*;

public class ButtonNumberPanel extends JPanel {

    public ButtonNumberPanel() {
        setBackground(Color.BLACK);

        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(4);
        gridLayout.setColumns(3);
        setLayout(gridLayout);

        ButtonNumber button7 = new ButtonNumber("7");
        add(button7);

        ButtonNumber button8 = new ButtonNumber("8");
        add(button8);

        ButtonNumber button9 = new ButtonNumber("9");
        add(button9);

        ButtonNumber button4 = new ButtonNumber("4");
        add(button4);

        ButtonNumber button5 = new ButtonNumber("5");
        add(button5);

        ButtonNumber button6 = new ButtonNumber("6");
        add(button6);

        ButtonNumber button1 = new ButtonNumber("1");
        add(button1);

        ButtonNumber button2 = new ButtonNumber("2");
        add(button2);

        ButtonNumber button3 = new ButtonNumber("3");
        add(button3);

        ButtonNumber button0 = new ButtonNumber("0");
        add(button0);

        ButtonNumber buttonDot = new ButtonNumber(".");
        add(buttonDot);

    }
}
