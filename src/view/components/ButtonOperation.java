package view.components;

import controller.ButtonsController;
import view.styles.CustomeBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOperation extends JButton implements ActionListener {

    public static final Color backgroundColor = new Color(33, 32, 37);
    public static final Font font = new Font("Roboto", Font.BOLD, 17);
    NumberTextField numberText;

    public ButtonOperation(String operator, NumberTextField numberText) {
        this.numberText = numberText;
        CustomeBorder customeBorder = new CustomeBorder();
        setBorder(customeBorder.getCompoundBorder());
        setForeground(Color.yellow);
        setBackground(backgroundColor);
        setText(operator);
        setFont(font);

        addMouseListener(null); //TO DO
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonsController buttonsController = new ButtonsController(this);
        buttonsController.buttonOperationAction(this.numberText);
    }


}
