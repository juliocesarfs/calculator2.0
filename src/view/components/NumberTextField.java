package view.components;

import controller.ButtonsController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberTextField extends JTextField {

    ButtonsController buttonController;

    public NumberTextField() {
        setBackground(new Color(47, 27, 37));
        setEnabled(false);
        setPreferredSize(new Dimension(480, 50));
        setFont(new Font(null, Font.BOLD, 20));
        setHorizontalAlignment(JTextField.RIGHT);
        setForeground(Color.gray);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setText("0");
    }
}
