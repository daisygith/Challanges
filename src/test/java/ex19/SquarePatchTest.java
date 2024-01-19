package ex19;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SquarePatchTest {
    @Test
    public void test1() {
        assertThat(SquarePatch.squarePatch(3), is(new int[][] {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        }));
    }

    @Test
    public void test2() {
        assertThat(SquarePatch.squarePatch(2), is(new int[][] {
                {2, 2},
                {2, 2}
        }));
    }

    @Test
    public void test3() {
        assertThat(SquarePatch.squarePatch(4), is(new int[][] {
                {4, 4, 4, 4},
                {4, 4, 4, 4},
                {4, 4, 4, 4},
                {4, 4, 4, 4}
        }));
    }

    @Test
    public void test4() {
        assertThat(SquarePatch.squarePatch(6), is(new int[][] {
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6}
        }));
    }

    @Test
    public void test5() {
        assertThat(SquarePatch.squarePatch(5), is(new int[][] {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5}
        }));
    }

    @Test
    public void test6() {
        assertThat(SquarePatch.squarePatch(1), is(new int[][]{{1}}));
    }

    @Test
    public void test7() {
        assertThat(SquarePatch.squarePatch(0), is(new int[][]{}));
    }
}
