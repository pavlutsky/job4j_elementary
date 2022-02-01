package lessons;

public class Exercise {

    public static void main(String[] args) {
    float in = 174;
    float expected = 2;
    float out = Convertor.rubleToEuro(in);
    boolean passed = expected == out;
        System.out.println("174 rubles are 2. Test result : " + passed);
    }
}