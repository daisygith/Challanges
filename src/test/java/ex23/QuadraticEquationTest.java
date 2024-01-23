package ex23;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void test1() {
        assertEquals(1, QuadraticEquation.quadraticEquation(1, 2, -3));
    }

    @Test
    public void test2() {
        assertEquals(3, QuadraticEquation.quadraticEquation(2, -7, 3));
    }

    @Test
    public void test3() {
        assertEquals(14, QuadraticEquation.quadraticEquation(1, -12, -28));
    }
}
