package ex8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EqualityOf3ValuesTest {
    @Test
    public void test1() {
        System.out.println("Should work if no values are the same.");
        assertEquals(0, EqualityOf3Values.equal(2, 3, 4));
    }

    @Test
    public void test2() {
        System.out.println("Should work if no values are the same.");
        assertEquals(0, EqualityOf3Values.equal(1, 7, 6));
    }

    @Test
    public void test3() {
        System.out.println("Should work if no values are the same.");
        assertEquals(0, EqualityOf3Values.equal(7, 3, 4));
    }

    @Test
    public void test4() {
        System.out.println("Should work if two values are the same.");
        assertEquals(2, EqualityOf3Values.equal(3, 3, 6));
    }

    @Test
    public void test5() {
        System.out.println("Should work if two values are the same.");
        assertEquals(2, EqualityOf3Values.equal(7, 3, 7));
    }

    @Test
    public void test6() {
        System.out.println("Should work if all three values are the same.");
        assertEquals(3, EqualityOf3Values.equal(1, 1, 1));
    }

    @Test
    public void test7() {
        System.out.println("Should work if all three values are the same.");
        assertEquals(3, EqualityOf3Values.equal(7, 7, 7));
    }

    @Test
    public void test8() {
        System.out.println("Should work if all three values are the same.");
        assertEquals(3, EqualityOf3Values.equal(4, 4, 4));
    }
}
