package lesson08;

import static lesson07.StringTasks.isDigit;
import static lesson08.HomeWork07_solution.*;

public class StringBuilderTasks {
    public static void main(String[] args) {
        //System.out.println(isPalindromeStrBuilder("anna"));
        //System.out.println(isPalindromeStrBuilder("annaa"));
        long start1 = System.currentTimeMillis();
        System.out.println("start1 --> " + start1);
        replaceDigitsStrBuilder("111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                +"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                +"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                +"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111", "&&&&&");
        long end1 = System.currentTimeMillis();
        System.out.println("result1 = "+ (end1-start1) );

        long start2 = System.currentTimeMillis();
        System.out.println("start2 --> " + start2);
        replaceDigits("111111111111111111111111111111111111111111111111111111" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                +"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                +"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                +"1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111", "&&&&&");
        long end2 = System.currentTimeMillis();
        System.out.println("result2 = "+ (end2-start2) );
    }

    static String replaceDigitsStrBuilder(String str, String replacement) {
        if (str == null || replacement == null || str.isBlank())
            return null;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if (isDigit(ch))
                stringBuilder.replace(i, i + 1, replacement);
        }
        return stringBuilder.toString();
    }

    static boolean isPalindromeStrBuilder(String word) {
        if (word == null || word.isBlank())
            return false;
        StringBuilder stringBuilder = new StringBuilder(word);
        return word.equals(stringBuilder.reverse().toString());
    }
}
