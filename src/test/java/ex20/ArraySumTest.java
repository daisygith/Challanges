package ex20;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ArraySumTest {
    @Test
    public void test1() {
        assertThat(ArraySum.sum(new int[]{1, 2, 3, 4}), is(10));
    }

    @Test
    public void test2() {
        assertThat(ArraySum.sum(new int[]{-1, -1, -1}), is(-3));
    }

    @Test
    public void test3() {
        assertThat(ArraySum.sum(new int[]{1}), is(1));
    }

    @Test
    public void test4() {
        assertThat(ArraySum.sum(new int[]{}), is(0));
    }
}
