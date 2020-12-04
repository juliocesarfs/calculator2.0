package view.components;
import controller.ButtonsController;
import view.styles.CustomeBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNumber extends JButton implements ActionListener {

    public static final Color backgroundColor = new Color(33, 32, 37);
    public static final Font font = new Font("Roboto", Font.BOLD, 17);
    public NumberTextField numberText;

    public ButtonNumber(String number, NumberTextField numberText) {
        this.numberText = numberText;
        CustomeBorder customeBorder = new CustomeBorder();
        setBorder(customeBorder.getCompoundBorder());
        setForeground(Color.gray);
        setBackground(backgroundColor);
        setText(number);
        setFont(font);

        addActionListener(this); //TO DO
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonsController buttonController = new ButtonsController(this);
        buttonController.buttonNumberAction(this.numberText);
    }
}
