package view.panels;

import view.components.ButtonNumber;
import view.components.NumberTextField;

import javax.swing.*;
import java.awt.*;

public class ButtonNumberPanel extends JPanel {
    public NumberTextField numberText;
    public ButtonNumber button7;

    public ButtonNumberPanel(NumberTextField numberText) {
        this.numberText = numberText;
        setBackground(Color.BLACK);

        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(4);
        gridLayout.setColumns(3);
        setLayout(gridLayout);

        button7 = new ButtonNumber("7", this.numberText);
        add(button7);

        ButtonNumber button8 = new ButtonNumber("8", this.numberText);
        add(button8);

        ButtonNumber button9 = new ButtonNumber("9", this.numberText);
        add(button9);

        ButtonNumber button4 = new ButtonNumber("4", this.numberText);
        add(button4);

        ButtonNumber button5 = new ButtonNumber("5", this.numberText);
        add(button5);

        ButtonNumber button6 = new ButtonNumber("6", this.numberText);
        add(button6);

        ButtonNumber button1 = new ButtonNumber("1", this.numberText);
        add(button1);

        ButtonNumber button2 = new ButtonNumber("2", this.numberText);
        add(button2);

        ButtonNumber button3 = new ButtonNumber("3", this.numberText);
        add(button3);

        ButtonNumber button0 = new ButtonNumber("0", this.numberText);
        add(button0);

        ButtonNumber buttonDot = new ButtonNumber(".", this.numberText);
        add(buttonDot);

    }
}
