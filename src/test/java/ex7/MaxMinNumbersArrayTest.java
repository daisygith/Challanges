package ex7;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MaxMinNumbersArrayTest {
    @Test
    public void test1() {
        assertThat(MaxMinNumbersArray.differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}), is(90));
    }

    @Test
    public void test2() {
        assertThat(MaxMinNumbersArray.differenceMaxMin(new int[]{-70, 43, 34, 54, 22}), is(124));
    }
    @Test
    public void test3() {
        assertThat(MaxMinNumbersArray.differenceMaxMin(new int[]{-95, 13, 29, -1, 88, 15, 99}), is(194));
    }


}
