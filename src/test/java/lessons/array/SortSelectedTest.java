package lessons.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {9, 14, 1, 20, 95};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 9, 14, 20, 95};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 4, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}