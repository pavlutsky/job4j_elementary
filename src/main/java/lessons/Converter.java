package lessons;

public class Converter {
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
    }
}
