package ex42;

import org.junit.Test;

import static org.junit.Assert.*;

public class inputFactorialTest {
    @Test
    public void test1(){
        assertTrue(inputFactorial.isFactorial(2));
    }
    @Test
    public void test2(){
        assertFalse(inputFactorial.isFactorial(16));
    }
    @Test
    public void test3(){
        assertTrue(inputFactorial.isFactorial(24));
    }
    @Test
    public void test4(){
        assertFalse(inputFactorial.isFactorial(36));
    }
    @Test
    public void test5(){
        assertTrue(inputFactorial.isFactorial(120));
    }
    @Test
    public void test6(){
        assertFalse(inputFactorial.isFactorial(721));
    }
}
