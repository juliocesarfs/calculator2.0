package model;

public class Operand {
    private Double value;

    public Operand(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Operando [valor=" + value + "]";
    }
}
