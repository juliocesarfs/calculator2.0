package view.components;

import javax.swing.*;
import java.awt.*;

public class NumberTextField extends JTextField {

    public NumberTextField() {
        setBackground(new Color(47, 27, 37));
        setEnabled(false);
        setPreferredSize(new Dimension(480, 50));
        setFont(new Font(null, Font.BOLD, 20));
        setHorizontalAlignment(JTextField.RIGHT);
        setForeground(Color.gray);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }
}
