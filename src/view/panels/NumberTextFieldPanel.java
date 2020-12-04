package view.panels;

import view.components.NumberTextField;

import javax.swing.*;
import java.awt.*;

public class NumberTextFieldPanel extends JPanel {
    private final NumberTextField numberText;

    public NumberTextFieldPanel() {
        setLayout(new FlowLayout());
        setBackground(Color.BLACK);
        setBorder(null);
        this.numberText = new NumberTextField();
        add(numberText);
    }

    public NumberTextField getNumberText() {
        return numberText;
    }

}
