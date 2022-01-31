package lessons;

public class Calculator {
        public static void plus(int first, int second) {
            int result = first + second;
            System.out.println(result);
        }

        public static void minus(int first, int second) {
            int result = first - second;
            System.out.println(result);
        }

        public static void div(int first, int second) {
            int result = first / second;
            System.out.println(result);
        }

        public static void time(int first, int second) {
            int result = first * second;
            System.out.println(result);
        }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
        Calculator.minus(100, 500);
        Calculator.minus(4, 2);
        Calculator.minus(3, 5);
        Calculator.div(100, 500);
        Calculator.div(4, 2);
        Calculator.div(3, 5);
        Calculator.time(100, 500);
        Calculator.time(4, 2);
        Calculator.time(3, 5);
    }
    }
