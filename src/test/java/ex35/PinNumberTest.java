package ex35;

import org.junit.Test;

import static org.junit.Assert.*;

public class PinNumberTest {
    @Test
    public void test01() {
        assertTrue(PinNumber.validate("544466"));
    }

    @Test
    public void test02() {
        assertEquals(true, PinNumber.validate("121317"));
    }

    @Test
    public void test03() {
        assertFalse(PinNumber.validate("4512a5"));
    }

    @Test
    public void test04() {
        assertTrue(PinNumber.validate("123456"));
    }

    @Test
    public void test05() {
        assertFalse(PinNumber.validate(""));
    }

    @Test
    public void test06() {
        assertEquals(false, PinNumber.validate("21904"));
    }

    @Test
    public void test07() {
        assertFalse(PinNumber.validate(" 9451"));
    }

    @Test
    public void test08() {
        assertTrue(PinNumber.validate("213132"));
    }

    @Test
    public void test09() {
        assertFalse(PinNumber.validate(" 4520"));
    }

    @Test
    public void test10() {
        assertEquals(false, PinNumber.validate("15632 "));
    }

    @Test
    public void test11() {
        assertTrue(PinNumber.validate("000000"));
    }
    @Test
    public void test12() {
        assertTrue(PinNumber.validate("1234"));
    }
}
