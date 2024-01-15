package ex6;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvenienceStoreTest {
    @Test
    public void test1() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 2, 100, 0, 0 }, 14.11), false);
    }

    @Test
    public void test2() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 0, 0, 20, 5 }, 0.75), true);
    }

    @Test
    public void test3() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 30, 40, 20, 5 }, 12.55), true);
    }

    @Test
    public void test4() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 10, 0, 0, 50 }, 13.85), false);
    }

    @Test
    public void test5() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 1, 0, 5, 219 }, 19.99), false);
    }

    @Test
    public void test6() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 1, 0, 2555, 219 }, 127.75), true);
    }

    @Test
    public void test7() {
        assertEquals(ConvenienceStore.changeEnough(new int[] { 1, 335, 0, 219 }, 35.21), true);
    }
}
