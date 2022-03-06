package lessons.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00T20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01T210Then9dot22() {
        double expected = 9.22;
        Point a = new Point(0, 1);
        Point b = new Point(2, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when155T2110Then7dot81() {
        double expected = 7.81;
        Point a = new Point(15, 5);
        Point b = new Point(21, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}