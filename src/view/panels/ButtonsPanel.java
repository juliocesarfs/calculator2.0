package view.panels;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    public ButtonsPanel() {
        setBackground(Color.BLACK);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        ButtonNumberPanel buttonNumberPanel = new ButtonNumberPanel();
        add(buttonNumberPanel);

        ButtonOperationPanel buttonOperationPanel = new ButtonOperationPanel();
        add(buttonOperationPanel);
    }
}
