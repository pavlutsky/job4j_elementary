package lessons.calculator;

import static lessons.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivDiv(double first, double second) {
        return sum(first, second)
                / div(first, second);
    }

    public static double diffSumDiv(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

    public static double sumDiffMultiplySumDiv(double first, double second) {
        return diff(first, second)
                + multiply(first, second)
                + sum(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDivDiv(45, 15));
        System.out.println("Результат расчета равен: " + diffSumDiv(60, 20));
        System.out.println("Результат расчета равен: " + sumDiffMultiplySumDiv(80, 20));
    }
}
