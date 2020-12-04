package view.panels;

import view.components.NumberTextField;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    public ButtonsPanel(NumberTextField textField) {
        setBackground(Color.BLACK);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        ButtonNumberPanel buttonNumberPanel = new ButtonNumberPanel(textField);
        add(buttonNumberPanel);

        ButtonOperationPanel buttonOperationPanel = new ButtonOperationPanel(textField);
        add(buttonOperationPanel);
    }
}
