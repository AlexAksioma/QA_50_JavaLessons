package lesson10tests;
import org.junit.jupiter.api.Test;

import static lesson10.Homework09.*;
import static org.junit.jupiter.api.Assertions.*;

public class Homework09_tests {
    //String removeDigits(String input)
    //  a-z  !@@#$ фффф 0-9 "" ''   valid
    // null, "" , "    "            invalid
    //  abc123 qwe567 !@8#
    //===============================
    //  "a"    maxInt-1
    //  max length input = 10^5  (10^5, 10^5+1)  100000
    @Test
    public void removeDigitsPositiveTest(){
//        String str = createStr((int)Math.pow(10, 5));
//        System.out.println(str);
        assertTrue(removeDigits("abc123 qwe567 !@8#").equals("abc qwe !@#"));
    }

    @Test
    public void removeDigitsNegativeTests(){
        System.out.println("before first");
        assertNull(removeDigits(null), "input null");
        System.out.println("between first and second");
        assertNull(removeDigits("qwerty"), "input empty");
        System.out.println("between second and third");
        assertNull(removeDigits("   "), "input spaces");
        System.out.println("after third");
    }





    private String createStr(int length){
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append('a');
        }
        return stringBuilder.toString();
    }
}
