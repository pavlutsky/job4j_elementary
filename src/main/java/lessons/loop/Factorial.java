package lessons.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int i;
        for (i = 0; i <= n; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result = result * i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(10));
        System.out.println(calc(8));
        System.out.println(calc(0));
    }
}