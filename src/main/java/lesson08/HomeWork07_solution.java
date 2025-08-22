package lesson08;

import lesson07.StringTasks;

import static lesson07.StringTasks.*;

public class HomeWork07_solution {
    public static void main(String[] args) {
//        System.out.println(isVowel('A'));
//        System.out.println(isVowel('i'));
//        System.out.println(isVowel('X'));
//        System.out.println(isVowel('1'));
//        System.out.println(isVowel('!'));
//        System.out.println(isVowel(' '));
//        System.out.println(isVowelsStr("eEioO"));
//        System.out.println(isVowelsStr("eEiXoO "));
//        System.out.println(isVowelsStr("    "));
//        System.out.println(isVowelsStr(null));
//        System.out.println(isVowelsStr(""));
        StringTasks.isDigit('1');
        isDigit('q');
//        System.out.println(replaceDigits("qw1er2 4", "@@"));
//        System.out.println(replaceDigits("   ", "@@"));
//        System.out.println(replaceDigits("qw1er2 4", null));
//        System.out.println(replaceDigits(null, "@"));
        System.out.println(returnLengthOfLongestWord("To be or not to be case"));
        String str = "     ";
        System.out.println(str.trim().isEmpty());
        System.out.println(str.isBlank());
    }

    //To be or not to be case    text.trim().isEmpty()
    public static Integer returnLengthOfLongestWord(String text){
        if(text == null || text.isBlank() || text.length() > Math.pow(10, 5)) //10^5
            return null;
        String[] words = text.trim().split(" ");
        String longest = "";
        for (String word : words){
            if(word.length() > longest.length()){//To(2) > ""(0)   not(3) > To(2)  case(3)
                longest = word;                  //To    -->  not   --> case
                System.out.println("longest --> "+ longest);
            }
        }
        return longest.length();
    }

    static String replaceDigits(String str, String replacement){
        if(str == null || replacement == null || str.isBlank())
            return null;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(StringTasks.isDigit(ch)){
                str = str.replace(Character.toString(ch), replacement);
            }
        }
        return str;
    }

    public static Boolean isVowelsStr(String str){
        if(str == null || str.isBlank())
            return null;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!isVowel(ch))   //isVowel(ch) == false
                return false;
        }
        return true;
    }

    private static boolean isVowel(char ch){
        String str = "aeiou";  //AEIOU
        String chStr = Character.toString(ch).toLowerCase();
        if(str.contains(chStr))
            return true;
        else
            return false;
    }
}
