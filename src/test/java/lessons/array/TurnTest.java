package lessons.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {3, 5, 1, 1, 0, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 0, 1, 1, 5, 3};
        Assert.assertArrayEquals(expected, result);
    }
}