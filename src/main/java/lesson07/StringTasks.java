package lesson07;

import java.util.Arrays;

import static lesson07.HomeWork06_solution.*;

public class StringTasks {
    public static void main(String[] args) {
        String str = "To be or not to be";
        System.out.println(numberWordsInStr(str));
        System.out.println(isSentencePalindrome("  Was it a Cat I Saw "));
        System.out.println(isSentencePalindromeUseHW("  Was it a Cat I Saw "));
        System.out.println(replaceDigit("Im QA 2 Engineer1", "!"));
    }

    static String replaceDigit(String str, String replacement){
        if(str == null || replacement == null
                || str.isEmpty() || replacement.isEmpty())
            return null;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isDigit(ch))
                str = str.replace(Character.toString(ch), replacement);
        }
        return str;
    }

    public static boolean isDigit(char ch){
        String digits = "0123456789";
        String chStr = Character.toString(ch);
        if(digits.contains(chStr))
            return true;
        return false;
    }

    static int numberWordsInStr(String text){
        if(text == null || text.isBlank())
            return -1;
        //return text.split(" ").length;
        String[] array = text.split(" ");
        System.out.println(Arrays.toString(array));
        return array.length;
    }

    static Boolean isSentencePalindromeUseHW(String sentence){
        if (sentence == null || sentence.isBlank()) {
            System.err.println("str is null or empty");
            return null;
        }
        sentence = sentence.trim().replace(" ", "").toLowerCase();
        //return HomeWork06_solution.isPalindrome(sentence);
        return isPalindrome(sentence);
    }

    static Boolean isSentencePalindrome(String sentence) {  //   Was it a Cat I Saw
        if (sentence == null || sentence.isBlank()) {
            System.err.println("str is null or empty");
            return null;
        }
        sentence = sentence.trim().replace(" ", "").toLowerCase();
        System.out.println(sentence);
        for (int i = 0, j = sentence.length() - 1; i < sentence.length() / 2 && j > sentence.length() / 2; i++, j--) {
            char ch1 = sentence.charAt(i);
            char ch2 = sentence.charAt(j);
            if(ch1 != ch2)
                return false;
        }
        return true;
    }
}
