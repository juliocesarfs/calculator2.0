package view.components;

import view.styles.CustomeBorder;

import javax.swing.*;
import java.awt.*;

public class ButtonOperation extends JButton {

    public static final Color backgroundColor = new Color(33, 32, 37);
    public static final Font font = new Font("Roboto", Font.BOLD, 17);

    public ButtonOperation(String operator) {
        CustomeBorder customeBorder = new CustomeBorder();
        setBorder(customeBorder.getCompoundBorder());
        setForeground(Color.yellow);
        setBackground(backgroundColor);
        setText(operator);
        setFont(font);

        addMouseListener(null); //TO DO
    }
}
