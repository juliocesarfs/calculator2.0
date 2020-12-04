package services;

import model.Operand;

public class Division extends Calculator{

    @Override
    public Double calculation(Operand op1, Operand op2) {
        return op1.getValue() / op2.getValue();
    }
}
