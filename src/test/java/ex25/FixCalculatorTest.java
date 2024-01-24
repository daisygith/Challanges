package ex25;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FixCalculatorTest {
    @Test
    public void test01() {
        assertEquals(6, FixCalculator.basicCalculator(2, "+", 4));
    }

    @Test
    public void test02() {
        assertEquals(6, FixCalculator.basicCalculator(12, "-", 6));
    }

    @Test
    public void test03() {
        assertEquals(9, FixCalculator.basicCalculator(18, "/", 2));
    }

    @Test
    public void test04() {
        assertEquals(24, FixCalculator.basicCalculator(6, "*", 4));
    }

    @Test
    public void test05() {
        assertEquals(null, FixCalculator.basicCalculator(2, "/", 0));
    }

    @Test
    public void test06() {
        assertEquals(null, FixCalculator.basicCalculator(2, "x", 4));
    }

    @Test
    public void test07() {
        assertEquals(null, FixCalculator.basicCalculator(2, "o", 4));
    }

    @Test
    public void test08() {
        assertEquals(10, FixCalculator.basicCalculator(12, "-", 2));
    }

    @Test
    public void test09() {
        assertEquals(34, FixCalculator.basicCalculator(17, "*", 2));
    }

    @Test
    public void test10() {
        assertEquals(4, FixCalculator.basicCalculator(17, "-", 13));
    }
}
