package lesson07;

import java.util.Arrays;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "To be or not to be";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.replace("be", "BE"));
        System.out.println(str.replace('o', '1'));
        System.out.println(str.replace("o", "1"));
        System.out.println(str.replace(" ", ""));
        System.out.println("===============================");
        System.out.println(str.charAt(0));  //--> T
        System.out.println(str.indexOf('b'));
        System.out.println(str.indexOf("not"));
        System.out.println(str.indexOf("be", 10));
        System.out.println(str.toLowerCase().lastIndexOf("to"));
        System.out.println(str.toLowerCase().lastIndexOf("to", 10));
        System.out.println("===============================");
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("===============================");
        String str1 = "To be or not to be";
        String[] words = str1.split(" ");
        System.out.println(Arrays.toString(words));;
        String[] words1 = str1.split("not");
        System.out.println(Arrays.toString(words1));
        System.out.println("===============================");
        String str2 = "  Hello my friend     ";
        System.out.println(str2.trim());
        System.out.println("===============================");
        String str3 = "To be or not to be";
        System.out.println(str3.substring(10));
        System.out.println(str3.substring(9, 12));
        System.out.println("===============================");
        String name1 = "Ivan";
        String name2 = "Dasha";
        String name3 = "Petr";
        String result = String.join(":", name3, name1, name2);
        System.out.println(result);
    }


}
