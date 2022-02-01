package lessons.calculator;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return lessons.math.MathFunction.sum(first, second)
        + lessons.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
