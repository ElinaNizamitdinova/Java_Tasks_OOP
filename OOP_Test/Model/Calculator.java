package javaTasks.OOP_Test.Model;

public class Calculator {
    private double result;

    public double addition(double numberA, double numberB) {
        result = numberA + numberB;
        return result;
    }

    public double multiplication(double numberA, double numberB) {
        result = numberA * numberB;
        return result;
    }
    public double division(double numberA, double numberB) {
        if (numberB != 0) {
            result = numberA / numberB;
            return result;
        } else {
            throw new ArithmeticException("Недопустимое действие, деление на 0 невозможно произвести");
        }
    }

}
