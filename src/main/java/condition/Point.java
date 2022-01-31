package condition;

public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(1, 10, 12, 0);
        System.out.println("result (1, 10) to (12, 0) " + result1);
        double result2 = Point.distance(11, 10, 2, 0);
        System.out.println("result (11, 10) to (2, 0) " + result2);
        double result3 = Point.distance(15, 50, 1, 10);
        System.out.println("result (15, 50) to (1, 10) " + result3);
    }
}
