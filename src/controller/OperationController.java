package controller;

import model.Operand;
import model.Operation;
import services.Calculator;

public class OperationController {

    Operand result;
    Calculator calculator;

    public OperationController() {
        this.result = new Operand(0D);
        this.calculator = new Calculator();
    }

    public Double performCalc(Operation operation) {
        return calculator.performExpression(operation);
    }

}