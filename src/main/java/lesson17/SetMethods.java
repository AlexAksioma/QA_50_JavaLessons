package lesson17;

import java.util.*;

public class SetMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> setInt = new HashSet<>();
        HashSet<Character> setChar = new HashSet<>(144);
        HashSet<String> strSet = new HashSet<>(144, 0.5f);
        HashSet<Integer> setInt1 = new HashSet<>(list);

        setChar.add('a');  //true
        setChar.add('a');  //false
        char ch = '1';
        Character ch1 = ch;
        setChar.add(ch1);
        System.out.println(setChar);
        System.out.println("first --> " + firstRepeatedChar("abc abc"));
        //==========================
        setChar.isEmpty();
        setChar.contains('A'); //false
        setChar.contains('a'); //true
        //==========================
        System.out.println(setChar.remove('1'));
        System.out.println(setChar.remove('1'));
        System.out.println(setChar);
        setChar.clear();
        System.out.println(setChar);
        //==========================
        Collections.addAll(setInt, 1, 4, 7, 88, 99);
        System.out.println(setInt);
        System.out.println(setInt.add(null));
        System.out.println(setInt.add(null));
        System.out.println(setInt);
        //==========================
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Bob");
        stringSet.add("Ivan");
        stringSet.add("Petr");
        stringSet.add("Olga");
        stringSet.add(null);
        stringSet.add(null);
        System.out.println(stringSet);
        //==========================
        Set<String> stringSet1 = new LinkedHashSet<>();
        stringSet1.add("Bob");
        stringSet1.add("Ivan");
        stringSet1.add("Petr");
        stringSet1.add("Masha");
        System.out.println(stringSet1);
        System.out.println(stringSet.containsAll(stringSet1));
        //==========================
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        Collections.addAll(integerTreeSet, 1, 7, 2, 8, 44, -2, 0);
        System.out.println(integerTreeSet);
        //integerTreeSet.add(null);  error
        TreeSet<Integer> integerTreeSet1 = new TreeSet<>(Comparator.reverseOrder());
        //TreeSet<Integer> integerTreeSet1 = new TreeSet<>(Collections.reverseOrder());
        integerTreeSet1.addAll(integerTreeSet);
        System.out.println(integerTreeSet1);
        TreeSet<Integer> integerTreeSet2 = new TreeSet<>();
        Collections.addAll(integerTreeSet2, 11, 7, 22, 8, 44, -2, 0);
        System.out.println(integerTreeSet2);
        integerTreeSet1.addAll(integerTreeSet2);
        System.out.println(integerTreeSet1);
    }

    // To be Or not to be   -->   to be or not to be  --> [t][0][ ][b] ... [e]
    static Character firstRepeatedChar(String str) {
        if (str == null || str.isEmpty())
            return null;
        char[] arrayChar = str.toLowerCase().toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch : arrayChar) {
            if (!set.add(ch))   //set.add(ch) == false
                return ch;
        }
        return null;
    }
}
