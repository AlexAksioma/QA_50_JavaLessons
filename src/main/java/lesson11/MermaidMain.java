package lesson11;

import java.util.Arrays;

public class MermaidMain {
    public static void main(String[] args) {
        Mermaid mermaid1 = new Mermaid("Ariel", 18);
        Mermaid mermaid2 = new Mermaid("Ariel", 22);
        Mermaid mermaid3 = new Mermaid("Ariel", 33);
        Mermaid mermaid4 = new Mermaid("Ariel", 3);
        mermaid1.swim();
        mermaid1.breathUnderWater();
        //System.out.println(interleave("abc", "12345"));
        //System.out.println(interleave_v2("abc", "12345"));
        Mermaid[] array = {mermaid2, mermaid4, mermaid3, mermaid1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    //abcdegh  12345 --> a1b2c3d4e5    a1b2c3+45
    static String interleave(String str1, String str2) {
        if (str1 == null || str2 == null
                || str1.isEmpty() || str2.isEmpty()
                || str1.length() > Math.pow(10, 5) || str2.length() > Math.pow(10, 5))
            return null;
        StringBuilder stringBuilder = new StringBuilder(str1.length() + str2.length());
        int max = Math.max(str1.length(), str2.length());
        for (int i = 0; i < max; i++) {
            if(i < str1.length())
                stringBuilder.append(str1.charAt(i));
            if(i < str2.length())
                stringBuilder.append(str2.charAt(i));
        }
        return stringBuilder.toString();
    }

    static String interleave_v2(String str1, String str2) {
        if (str1 == null || str2 == null
                || str1.isEmpty() || str2.isEmpty()
                || str1.length() > Math.pow(10, 5) || str2.length() > Math.pow(10, 5))
            return null;
        StringBuilder stringBuilder = new StringBuilder(str1.length() + str2.length());
        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            stringBuilder.append(str1.charAt(i)).append(str2.charAt(i));
        }
        System.out.println(stringBuilder);
        String tail = "";
        if(str1.length() > str2.length())
            tail = str1.substring(str2.length());
        else if (str2.length() > str1.length()) {
            tail = str2.substring(str1.length());
        }
        return stringBuilder.append(tail).toString();
    }
}
