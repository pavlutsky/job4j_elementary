package lessons.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int length = array.length / 2;
        double l = Math.floor(length);
        int s = (int) l;
        int temp = array[s];
        array[s] = array[s - 1];
        array[s - 1] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}