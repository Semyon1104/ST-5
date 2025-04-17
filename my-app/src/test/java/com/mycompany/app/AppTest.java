package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private static final double DELTA = 0.0001;

    @Test
    public void testCalcPerfectSquare() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcDecimalNumber() {
        Sqrt sqrt = new Sqrt(2.25);
        assertEquals(1.5, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSmallNumber() {
        Sqrt sqrt = new Sqrt(0.0001);
        assertEquals(0.01, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcForOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcForZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testAverageMethod() {
        Sqrt sqrt = new Sqrt(0.0); // arg не используется
        assertEquals(2.5, sqrt.average(2.0, 3.0), DELTA);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), DELTA);
    }

    @Test
    public void testGoodMethod() {
        Sqrt sqrt = new Sqrt(9.0);
        assertTrue(sqrt.good(3.0, 9.0));
        assertFalse(sqrt.good(2.999, 9.0));
    }

    @Test
    public void testImproveMethod() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(2.25, sqrt.improve(2.0, 5.0), DELTA); // Теперь корректно
    }

    @Test
    public void testIterMethod() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.iter(3.0, 9.0), DELTA);
    }

    @Test
    public void testCalcIrrationalNumber() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA);
    }
}