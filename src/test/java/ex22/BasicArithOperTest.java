package ex22;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicArithOperTest {
    @Test
    public void test01() {
        assertEquals(3, BasicArithOper.operation("1", "2", "add"));
    }

    @Test
    public void test02() {
        assertEquals(-19, BasicArithOper.operation("1", "-20", "add"));
    }

    @Test
    public void test03() {
        assertEquals(-2147483648, BasicArithOper.operation("9", "0", "divide"));
    }

    @Test
    public void test04() {
        assertEquals(100, BasicArithOper.operation("10", "10", "multiply"));
    }

    @Test
    public void test05() {
        assertEquals(100, BasicArithOper.operation("-10", "-10", "multiply"));
    }

    @Test
    public void test06() {
        assertEquals(0, BasicArithOper.operation("10", "10", "subtract"));
    }

    @Test
    public void test07() {
        assertEquals(0, BasicArithOper.operation("0", "0", "subtract"));
    }

    @Test
    public void test08() {
        assertEquals(0, BasicArithOper.operation("0", "1", "divide"));
    }

    @Test
    public void test09() {
        assertEquals(0, BasicArithOper.operation("0", "25415", "divide"));
    }

    @Test
    public void test10() {
        assertEquals(1, BasicArithOper.operation("4", "3", "divide"));
    }

    @Test
    public void test11() {
        assertEquals(5, BasicArithOper.operation("21", "4", "divide"));
    }

    @Test
    public void test12() {
        assertEquals(4, BasicArithOper.operation("13", "3", "divide"));
    }
}
