package lesson09tests;

import org.junit.jupiter.api.Test;

import static lesson09.HomeWork08_solution.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomeWork08_tests {

    @Test
    public void toCamelCaseTest(){
        String actualResult = toCamelCase(" To  be or not");
        String expectedResult = "toBeOrNot";
        assertTrue(actualResult.equals(expectedResult));
    }

    @Test
    public void toCamelCaseTest_withDot(){
        String actualResult = toCamelCase(" To  be or not.");
        String expectedResult = "toBeOrNot";
        assertTrue(actualResult.equals(expectedResult));
    }

    @Test
    public void toCamelCaseTest_null(){
        String actualResult = toCamelCase(null);
        assertNull(actualResult);
    }

    @Test
    public void toCamelCaseTest_empty(){
        String actualResult = toCamelCase("");
        assertNull(actualResult);
    }

    @Test
    public void toCamelCaseTest_spaces(){
        String actualResult = toCamelCase("     ");
        assertNull(actualResult);
    }
}
