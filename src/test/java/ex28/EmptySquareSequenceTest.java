package ex28;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmptySquareSequenceTest {
    @Test
    public void test1() {
    assertEquals(24, EmptySquareSequence.emptySq(3));
    }

    @Test
    public void test2() {
        assertEquals(0, EmptySquareSequence.emptySq(1));
    }

    @Test
    public void test3() {
        assertEquals(2808, EmptySquareSequence.emptySq(27));
    }

    @Test
    public void test4() {
        assertEquals(24, EmptySquareSequence.emptySq(3));
    }

    @Test
    public void test5() {
        System.out.println("Even though the box is unexisting, the amount of empty squares is also 0.");
        assertEquals(0, EmptySquareSequence.emptySq(0));
    }

    @Test
    public void test6() {
        assertEquals(360, EmptySquareSequence.emptySq(10));
    }

    @Test
    public void test7() {
        assertEquals(1368, EmptySquareSequence.emptySq(19));
    }

    @Test
    public void test8() {
        assertEquals(14160, EmptySquareSequence.emptySq(60));
    }

    @Test
    public void test9() {
        assertEquals(168, EmptySquareSequence.emptySq(7));
    }

}
