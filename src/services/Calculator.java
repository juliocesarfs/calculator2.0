package services;

import model.Operand;
import model.Operation;
import model.Operator;

import java.util.List;

public class Calculator {

    private Operand result;
    private String operator;

    public Calculator() {
        this.operator = "";
    }

    public Calculator(String operator) {
        this.operator = operator;

    }

    public Double calculation(Operand op1, Operand op2) {
        Sum sum = new Sum();
        Multiplication multiplication = new Multiplication();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();

        switch (this.operator) {
            case "+" -> this.result = new Operand(sum.calculation(op1, op2));
            case "-" -> this.result = new Operand(subtraction.calculation(op1, op2));
            case "/" -> this.result = new Operand(division.calculation(op1, op2));
            case "*" -> this.result = new Operand(multiplication.calculation(op1, op2));
        }

        return this.result.getValue();
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
