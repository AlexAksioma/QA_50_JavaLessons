package lesson09tests;

import org.junit.jupiter.api.Test;

import static lesson09.Calculator.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    @Test
    public void test1(){
        assertTrue(1==1);
    }

    @Test
    public void test2(){
        assertTrue(1==3);
    }

    @Test
    public void test3(){
        assertFalse(1==3);  //false
    }

    @Test
    public void sumPositiveTest(){
        int result = sum(33, -44);
        //System.out.println(result);
        assertEquals(-11, result);
    }

    @Test
    public void sumNegativeTest_maxInt(){
        // -2147483648   2147483647  -->
        int result = sum(2147483647, 2147483647);
        long actual = 2147483647L + 2147483647;
        assertEquals(actual, (long) result);
    }

    @Test
    public void sumNegativeTest_minInt(){
        // -2147483648   2147483647  -->
        int result = sum(-2147483648, Integer.MIN_VALUE);
        long actual = -2147483648L + Integer.MIN_VALUE;
        assertEquals(actual, (long) result);
    }



    @Test
    public void sumPositiveTest_v1(){
        int result = sum(33, -44);
        assertEquals(100, result);
    }

    @Test
    public void sumPositiveTest_v2(){
        int result = sum(33, -44);
        assertEquals(0, result);
    }
}
