package ex33;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;
public class BinarySearchTest {
    @Test
    public void test1() {
        assertThat(BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0, 9, 7), is(true));
    }

    @Test
    public void test2() {
        assertThat(BinarySearch.binarySearch(new int[]{3, 6, 14, 15, 17, 18, 22, 43, 55, 66}, 0, 9, 19), is(false));
    }

    @Test
    public void test3() {
        assertThat(BinarySearch.binarySearch(new int[]{4, 8, 12, 16, 20, 24, 28, 32, 36, 40}, 0, 9, 32), is(true));
    }

    @Test
    public void test4() {
        assertThat(BinarySearch.binarySearch(new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30},0, 9, 31), is(false));
    }

    @Test
    public void test5() {
        assertThat(BinarySearch.binarySearch(new int[]{20, 1067, 5032, 10005, 20333, 36798, 45234, 55555, 64123, 99999}, 0, 9, 64123), is(true));
    }
}
