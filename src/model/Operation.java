package model;

import java.util.ArrayList;
import java.util.List;

public class Operation {

    private List<Operand> operands;
    private List<Operator> operators;

    public Operation() {
        this.operands = new ArrayList<>();
        this.operators = new ArrayList<>();
    }

    public List<Operand> getOperands() {
        return operands;
    }


    public List<Operator> getOperators() {
        return operators;
    }

    public void addOperand(Operand operand) {
        this.operands.add(operand);
    }

    public void addOperandAt(Operand operand, int i) {
        this.operands.add(i, operand);
    }

    public void addOperator(Operator operator) {
        this.operators.add(operator);
    }

    public void addOperatorAt(Operator operator, int i) {
        this.operators.add(i, operator);
    }
}
