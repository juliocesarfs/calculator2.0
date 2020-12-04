package test;

import controller.OperationController;
import model.Operand;
import model.Operation;
import model.Operator;

public class testOperation {
    public static void main(String[] args) {
        Operation operation = new Operation();

        operation.addOperand(new Operand(4D));
        operation.addOperator(new Operator("/"));
        operation.addOperand(new Operand(2D));
        operation.addOperator(new Operator("-"));
        operation.addOperand(new Operand(2D));
        operation.addOperator(new Operator("*"));
        operation.addOperand(new Operand(2D));

        OperationController controller = new OperationController();

        Double result = controller.performExpression(operation);

        System.out.print(result);
    }
}
