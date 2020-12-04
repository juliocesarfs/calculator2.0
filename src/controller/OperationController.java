package controller;

import model.Operand;
import model.Operation;
import model.Operator;
import services.Calculator;
import services.Sum;

import java.util.List;

public class OperationController {

    Operand result;
    Calculator calculator;

    public OperationController() {
        this.result = new Operand(0D);
        this.calculator = new Calculator();
    }

    public Double performExpression(Operation operation) {
        int i;

        Operand operand;
        Operand operand2;

        List<Operator> operators = operation.getOperators();
        List<Operand> operands = operation.getOperands();

        while (operators.size() > 0) {

            i = checkOperator(operators, "/");

            if (i == 0)
                i = checkOperator(operators, "*");

            operand = operands.get(i);
            operand2 = operands.get(i + 1);

            Operator operator = operators.get(i);
            calculator.setOperator(operator.getOperator());

            this.result = new Operand(calculator.calculation(operand, operand2));

            operands.remove(i > 0 ? i + 1 : 1);
            operands.remove(i);

            operation.addOperandAt(result, i);
            operators.remove(i);
        }

        return operands.get(0).getValue();
    }

    private int checkOperator(List<Operator> operators, String operator) {
        int i;

        for (i = 0; i < operators.size(); i++) {
            if (operators.get(i).getOperator().equals(operator))
                return i;
        }
        return 0;
    }
}