package lessons.calculator;

public class MathFunc {

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(1);
        int total = result1 + result2;
        int result3 = MathFunc.func1(100);
        System.out.println(total);
        System.out.println(result3);
    }
}