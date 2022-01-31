package lessons.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Pavlutsky";
        int age = 39;
        ArgMethod.hello(name, age);
    }
}
