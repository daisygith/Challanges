package ex14;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
    @Test
    public void test1() {
        assertEquals("Nope!", 5, VowelCounter.getCount("Celebration"));
    }

    @Test
    public void test2() {
        assertEquals("Nope!", 1, VowelCounter.getCount("Palm"));
    }

    @Test
    public void test3() {
        assertEquals("Nope!", 4, VowelCounter.getCount("Prediction"));
    }

    @Test
    public void test4() {
        assertEquals("Nope!", 3, VowelCounter.getCount("Suite"));
    }

    @Test
    public void test5() {
        assertEquals("Nope!", 3, VowelCounter.getCount("Quote"));
    }

    @Test
    public void test6() {
        assertEquals("Nope!", 3, VowelCounter.getCount("Portrait"));
    }

    @Test
    public void test7() {
        assertEquals("Nope!", 2, VowelCounter.getCount("Steam"));
    }

    @Test
    public void test8() {
        assertEquals("Nope!", 2, VowelCounter.getCount("Tape"));
    }

    @Test
    public void test9() {
        assertEquals("Nope!", 3, VowelCounter.getCount("Nightmare"));
    }

    @Test
    public void test10() {
        assertEquals("Nope!", 4, VowelCounter.getCount("Convention"));
    }
}
