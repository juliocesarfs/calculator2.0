package view.panels;

import view.components.ButtonOperation;
import view.components.NumberTextField;

import javax.swing.*;
import java.awt.*;

public class ButtonOperationPanel extends JPanel {
    public NumberTextField numberText;

    public ButtonOperationPanel(NumberTextField numberText) {
        this.numberText = numberText;
        setBackground(Color.BLACK);
        setLayout(new GridLayout(6, 1));

        ButtonOperation buttonClear = new ButtonOperation("C", this.numberText);
        add(buttonClear);

        ButtonOperation buttonMulti = new ButtonOperation("x", this.numberText);
        add(buttonMulti);

        ButtonOperation buttonDiv = new ButtonOperation("÷", this.numberText);
        add(buttonDiv);

        ButtonOperation buttonSub = new ButtonOperation("-", this.numberText);
        add(buttonSub);

        ButtonOperation buttonSum = new ButtonOperation("+", this.numberText);
        add(buttonSum);

        ButtonOperation buttonEqual = new ButtonOperation("=", this.numberText);
        add(buttonEqual);
    }
}
