package view;

import view.panels.ButtonsPanel;
import view.panels.NumberTextFieldPanel;

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    NumberTextFieldPanel numberPanel;
    ButtonsPanel buttonsPanel;

    public Screen() {
        setLayout(new BorderLayout());
        setBackground(Color.black);

        numberPanel = new NumberTextFieldPanel();
        add("North", numberPanel);

        buttonsPanel = new ButtonsPanel(numberPanel.getNumberText());
        add("Center", buttonsPanel);
    }
}
