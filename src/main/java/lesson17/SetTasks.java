package lesson17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetTasks {
    public static void main(String[] args) {
        System.out.println(numberUniqueWords(" To be or not to be  "));
        System.out.println(numberNotUniqueWords(" To be or not to be  "));
        System.out.println("=================================");
        System.out.println(commonWords("To be or not", "to be Cat to be dog"));
        System.out.println("=================================");
        printStr("str1", "str2", "str3", "str4");
    }

    static void printStr(String ...strings){
        for (String str : strings){
            System.out.println(str);
        }
    }

    //  To be or not to be --> 4
    static Integer numberUniqueWords(String text){
        if(text == null || text.isBlank())
            return -1;
        System.out.println(text);
        String[] words = text.trim().toUpperCase().split(" ");
        System.out.println(Arrays.toString(words));
        List<String> list = Arrays.asList(words);
        System.out.println(list);
        HashSet<String> set = new HashSet<>(list);
        //HashSet<String> set = new HashSet<>(Arrays.asList(text.trim().toUpperCase().split(" ")));
        System.out.println(set);
        return set.size();
        //return new HashSet<>(Arrays.asList(text.trim().toUpperCase().split(" "))).size();
    }

    //  To be or not to be --> 2
    static Integer numberNotUniqueWords(String text){
        if(text == null || text.isBlank())
            return -1;
        String[] words = text.trim().toUpperCase().split(" ");
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        return words.length - set.size();
    }

    //To be or not   --  to be Cat to be dog --> to be
    static HashSet<String> commonWords(String str1, String str2){
        if(str1 == null || str2 == null || str1.isBlank() || str2.isBlank())
            return null;
        HashSet<String> set1 = new HashSet<>(Arrays.asList(str1.toUpperCase().split(" ")));
        System.out.println(set1);
        HashSet<String> set2 = new HashSet<>(Arrays.asList(str2.toUpperCase().split(" ")));
        System.out.println(set2);
        set1.retainAll(set2);
        return set1;
    }
}
