package controller;

import view.components.ButtonNumber;
import view.components.NumberTextField;

import javax.swing.*;

public class ButtonsController {

    JButton button;

    public ButtonsController(JButton button) {
        this.button = button;
    }

    public void buttonNumberAction(NumberTextField numberText) {
        if (numberText.getText().equals("0"))
            numberText.setText(button.getText());
        else
            numberText.setText(numberText.getText() + button.getText());
    }

    public void buttonOperationAction(NumberTextField numberText) {
        switch (button.getText()) {
            case "C":
                numberText.setText("0");
                break;
        }
    }
}
