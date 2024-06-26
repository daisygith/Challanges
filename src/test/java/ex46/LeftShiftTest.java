package ex46;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LeftShiftTest {
    @Test
    public void test01() {
        assertEquals(20, LeftShift.shiftToLeft(5, 2));
    }

    @Test
    public void test02() {
        assertEquals(80, LeftShift.shiftToLeft(10, 3));
    }

    @Test
    public void test03() {
        assertEquals(-128, LeftShift.shiftToLeft(-32, 2));
    }

    @Test
    public void test04() {
        assertEquals(-192, LeftShift.shiftToLeft(-6, 5));
    }

    @Test
    public void test05() {
        assertEquals(192, LeftShift.shiftToLeft(12, 4));
    }

    @Test
    public void test06() {
        assertEquals(2944, LeftShift.shiftToLeft(46, 6));
    }

    @Test
    public void test07() {
        assertEquals(57, LeftShift.shiftToLeft(57, 0));
    }

    @Test
    public void test08() {
        assertEquals(158, LeftShift.shiftToLeft(79, 1));
    }

}
