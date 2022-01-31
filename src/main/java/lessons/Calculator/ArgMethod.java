package lessons.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Roman Pavlutsky";
        ArgMethod.hello(name);
    }
}
