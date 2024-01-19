package ex21;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CountLettersTest {
    @Test
    public void test1() {
        assertThat(CountLetters.letterCounter(new char[][]{
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
        },'D'), is(3));
    }

    @Test
    public void test2() {
        assertThat(CountLetters.letterCounter(new char[][]
                {
                        {'D', 'E', 'Y', 'H', 'A', 'D'},
                        {'C', 'B', 'Z', 'Y', 'J', 'K'},
                        {'D', 'B', 'C', 'A', 'M', 'N'},
                        {'F', 'G', 'G', 'R', 'S', 'R'},
                        {'V', 'X', 'H', 'A', 'S', 'S'}
                }, 'H'), is(2));
    }

    @Test
    public void test3() {
        assertThat(CountLetters.letterCounter(new char[][]
                {
                        {'D', 'E', 'Y', 'H', 'A', 'D'},
                        {'C', 'B', 'Z', 'Y', 'J', 'K'},
                        {'D', 'B', 'C', 'A', 'M', 'N'},
                        {'F', 'G', 'G', 'R', 'S', 'R'},
                        {'V', 'X', 'H', 'A', 'S', 'S'}
                }, 'Z'), is(1));
    }

    @Test
    public void test4() {
        assertThat(CountLetters.letterCounter(new char[][]
                {
                        {'D', 'E', 'Y', 'H', 'A', 'D'},
                        {'C', 'B', 'Z', 'Y', 'J', 'K'},
                        {'D', 'B', 'C', 'A', 'M', 'N'},
                        {'F', 'G', 'G', 'R', 'S', 'R'},
                        {'V', 'X', 'H', 'A', 'S', 'S'}
                }, 'R'), is(2));
    }

    @Test
    public void test5() {
        assertThat(CountLetters.letterCounter(new char[][]
                {
                        {'D', 'E', 'Y', 'H', 'A', 'D'},
                        {'C', 'B', 'Z', 'Y', 'J', 'K'},
                        {'D', 'B', 'C', 'A', 'M', 'N'},
                        {'F', 'G', 'G', 'R', 'S', 'R'},
                        {'V', 'X', 'H', 'A', 'S', 'S'}
                }, 'X'), is(1));
    }

    @Test
    public void test6() {
        assertThat(CountLetters.letterCounter(new char[][]
                {
                        {'D', 'E', 'Y', 'H', 'A', 'D'},
                        {'C', 'B', 'Z', 'Y', 'J', 'K'},
                        {'D', 'B', 'C', 'A', 'M', 'N'},
                        {'F', 'G', 'G', 'R', 'S', 'R'},
                        {'V', 'X', 'H', 'A', 'S', 'S'}
                }, 'S'), is(3));
    }

}
