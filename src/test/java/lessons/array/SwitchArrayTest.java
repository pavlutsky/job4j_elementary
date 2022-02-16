package lessons.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwapCenterToCenterMinus1next1() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int length = input.length / 2;
        double s = Math.floor(length);
        int source = (int) s;
        int dest = source - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapCenterToCenterMinus1() {
        int[] input = {1, 2, 3, 4, 5};
        int length = input.length / 2;
        double s = Math.floor(length);
        int source = (int) s;
        int dest = source - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}