package ex24;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DigitsCountTest {
    @Test
    public void test01() {
        assertEquals(4, DigitsCount.count(4666));
    }

    @Test
    public void test02() {
        assertEquals(3, DigitsCount.count(544));
    }

    @Test
    public void test03() {
        assertEquals(1, DigitsCount.count(0));
    }

    @Test
    public void test04() {
        assertEquals(3, DigitsCount.count(318));
    }

    @Test
    public void test05() {
        assertEquals(5, DigitsCount.count(-92563));
    }

    @Test
    public void test06() {
        assertEquals(6, DigitsCount.count(314890));
    }

    @Test
    public void test07() {
        assertEquals(6, DigitsCount.count(654321));
    }

    @Test
    public void test08() {
        assertEquals(6, DigitsCount.count(638476));
    }

    @Test
    public void test09() {
        assertEquals(5, DigitsCount.count(12345));
    }

    @Test
    public void test10() {
        assertEquals(7, DigitsCount.count(1289396));
    }

    @Test
    public void test11() {
        assertEquals(7, DigitsCount.count(-1232323));
    }

    @Test
    public void test12() {
        assertEquals(8, DigitsCount.count(12839393));
    }

    @Test
    public void test13() {
        assertEquals(9, DigitsCount.count(-231273683));
    }
}
