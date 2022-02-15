package lessons.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Max Pleskov";
        names[1] = "Roman Pavlutsky";
        names[2] = "Alexandr Stepanov";
        names[3] = "Dmitry Lazarev";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
