package lessons.array;

public class Turn {

    public static int[] back(int[] array) {
        if (array.length <= 3) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        } else {
            for (int i = 0; i < array.length / 2; i++) {
                    int temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                }
            }
        return array;
    }
    }