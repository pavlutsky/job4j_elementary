package lessons;

public class Convertor {
    public static float rubleToEuro(float value) {
        return value / 87;
    }

    public static float rubleToDollar(float value) {
        return value / 78;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(174);
        System.out.println("174 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(117);
        System.out.println("117 rubles are " + dollar + " dollars.");
        float in = 174;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("174 rubles are 2. Test result : " + passed);
    }
}
