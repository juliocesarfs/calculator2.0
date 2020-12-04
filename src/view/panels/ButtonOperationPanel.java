package view.panels;

import view.components.ButtonOperation;

import javax.swing.*;
import java.awt.*;

public class ButtonOperationPanel extends JPanel {

    public ButtonOperationPanel() {
        setBackground(Color.BLACK);
        setLayout(new GridLayout(6, 1));

        ButtonOperation buttonClear = new ButtonOperation("C");
        add(buttonClear);

        ButtonOperation buttonMulti = new ButtonOperation("x");
        add(buttonMulti);

        ButtonOperation buttonDiv = new ButtonOperation("÷");
        add(buttonDiv);

        ButtonOperation buttonSub = new ButtonOperation("-");
        add(buttonSub);

        ButtonOperation buttonSum = new ButtonOperation("+");
        add(buttonSum);
    }
}
