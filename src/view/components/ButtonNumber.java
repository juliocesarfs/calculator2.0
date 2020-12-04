package view.components;
import view.styles.CustomeBorder;

import javax.swing.*;
import java.awt.*;

public class ButtonNumber extends JButton {

    public static final Color backgroundColor = new Color(33, 32, 37);
    public static final Font font = new Font("Roboto", Font.BOLD, 17);

    public ButtonNumber(String number) {
        CustomeBorder customeBorder = new CustomeBorder();
        setBorder(customeBorder.getCompoundBorder());
        setForeground(Color.gray);
        setBackground(backgroundColor);
        setText(number);
        setFont(font);

        addMouseListener(null); //TO DO
        addActionListener(null); //TO DO
    }
}
