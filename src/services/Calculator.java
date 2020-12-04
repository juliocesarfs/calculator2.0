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
            setOperator(operator.getOperator());

            this.result = new Operand(calculation(operand, operand2));

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

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
