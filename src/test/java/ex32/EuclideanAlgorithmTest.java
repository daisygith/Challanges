package ex32;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EuclideanAlgorithmTest {
    @Test
    public void test1() {
        assertEquals(2, EuclideanAlgorithm.euclidean(4, 2));
    }

    @Test
    public void test2() {
        assertEquals(5, EuclideanAlgorithm.euclidean(25, 5));
    }

    @Test
    public void test3() {
        assertEquals(8, EuclideanAlgorithm.euclidean(280, 64));
    }

    @Test
    public void test4() {
        assertEquals(3, EuclideanAlgorithm.euclidean(3, 6));
    }

    @Test
    public void test5() {
        assertEquals(4, EuclideanAlgorithm.euclidean(64, 52));
    }
}
