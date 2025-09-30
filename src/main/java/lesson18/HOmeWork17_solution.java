package lesson18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HOmeWork17_solution {
    //    1. int uniqueCharacters(String str)
//
//    2. String uniqueCharacters(String str)
//    axbcabcd --> axbcd
//
//    3*. find common letters from strings
//    commonLetters(String ... str)
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("To be or not"));
        System.out.println(returnUniqueCharacters("To be or not"));
        System.out.println(returnUniqueCharacters_v1("To be or not"));
        System.out.println(returnUniqueCharacters_v2("To be or not"));
        System.out.println(commonLetters(null, "", "string", null, "str1", "", "str2", "tr"));
        //System.out.println(commonLetters());
    }

    static Set<String> commonLetters(String... strings) {
        if (strings == null || strings.length == 0)
            return null;
        Set<String> resultSet = new HashSet<>();
        int start = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && !strings[i].isEmpty()) {
                resultSet.addAll(Arrays.asList(strings[i].split("")));
                start = i;
                break;
            }
        }
        System.out.println(resultSet);
        for (int i = start + 1; i < strings.length; i++) {
            if (strings[i] != null && !strings[i].isEmpty()) {
                resultSet.retainAll(Arrays.asList(strings[i].split("")));
                System.out.println(resultSet);
            }
        }
        return resultSet;
    }


    static int uniqueCharacters(String str) {  // unique letters
        if (str == null || str.isEmpty())
            return -1;
        Set<Character> letters = new HashSet<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) //!!!!!
                letters.add(ch);
        }
        return letters.size();
    }

    //axbcabcd  --> ["a"] ["x"] ....
    static String returnUniqueCharacters(String str) {
        if (str == null || str.isEmpty())
            return null;
        String[] characters = str.split("");
        System.out.println(Arrays.toString(characters));
        Set<String> setStr = new LinkedHashSet<>(Arrays.asList(characters));
        System.out.println(setStr);
        String result = setStr.toString().replace(", ", "");
        System.out.println(result);
        return result.substring(1, result.length() - 1);
    }

    static String returnUniqueCharacters_v1(String str) {
        if (str == null || str.isEmpty())
            return null;
        Set<Character> setChar = new LinkedHashSet<>();
        for (char ch : str.toCharArray())
            setChar.add(ch);
        StringBuilder result = new StringBuilder();
        for (char ch : setChar)
            result.append(ch);
        return result.toString();
    }

    static String returnUniqueCharacters_v2(String str) {
        if (str == null || str.isEmpty())
            return null;
        Set<Character> setChar = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (setChar.add(ch))
                result.append(ch);
        }
        return result.toString();
    }


}
