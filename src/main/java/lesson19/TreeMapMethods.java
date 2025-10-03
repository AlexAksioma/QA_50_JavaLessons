package lesson19;

import lesson17.ComparatorByGrade;
import lesson17.Student;

import java.util.*;

public class TreeMapMethods {
    public static void main(String[] args) {
        //Map<Integer, String> treeMap1 = new TreeMap<>();
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(22, "Ivan");
        treeMap1.put(20, "Dasha");
        treeMap1.put(33, "Ivan");
        treeMap1.put(11, null);
        System.out.println(treeMap1);
        //SortedMap
        System.out.println(treeMap1.firstKey());
        System.out.println(treeMap1.lastKey());
        System.out.println(treeMap1.headMap(33));
        System.out.println(treeMap1.headMap(33));
        System.out.println(treeMap1.tailMap(22));
        System.out.println(treeMap1.subMap(22,33));
        //NavigableMap
        System.out.println(treeMap1.firstEntry());  //Entry --> Key, Value
        System.out.println(treeMap1.lastEntry());
        //hashMap  LinkedHashMap  TreeMap
        for (Map.Entry<Integer, String> item : treeMap1.entrySet()){
            System.out.println("item --> " + item);
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
        System.out.println("=======================");
        System.out.println(treeMap1);
        System.out.println(treeMap1.ceilingEntry(21));  //>=
        System.out.println(treeMap1.ceilingKey(21));
        System.out.println(treeMap1.floorEntry(21));   //<=
        System.out.println(treeMap1.floorKey(21));
        System.out.println(treeMap1.lowerKey(22));
        System.out.println(treeMap1.higherKey(22));
        System.out.println(treeMap1.headMap(33, true));
        System.out.println(treeMap1.headMap(33, false));
        System.out.println("=======================");
        TreeMap<Student, String> studentTreeMap = new TreeMap<>(new ComparatorByGrade());
        Student student1 = new Student("Bob", "Ivanov", 22, 7.7);
        Student student2 = new Student("Alex", "Alekseev", 18, 9.0);
        Student student3 = new Student("Masha", "Petrova", 21, 7.0);
        Student student4 = new Student("Petr", "Petrov", 22, 5.7);
        Student student5 = new Student("Ivan", "Ivanov", 22, 7.7);
        studentTreeMap.put(student1, "Gr.10");
        studentTreeMap.put(student2, "Gr.12");
        studentTreeMap.put(student3, "Gr.10");
        studentTreeMap.put(student4, "Gr.12");
        studentTreeMap.put(student5, "Gr.11");
        System.out.println(studentTreeMap);
        printEntryMap(studentTreeMap);
        System.out.println(firstAlphaBetWord("to be, or? not    to be!"));
        charFrequencySort("zxxc cccc abc abc abcdef");
    }

    public static <K, V> void printEntryMap(Map<K, V> map){
        for (Map.Entry<K, V> item : map.entrySet())
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue());
    }

    //to be, or? not    to be!
    static String firstAlphaBetWord(String text){
        if(text == null || text.isBlank())
            return null;
        TreeSet<String> wordsSet = new TreeSet<>();
        String[] words = text.trim().toLowerCase().split("\\W+");  //,   !   .
        for (String el: words){
            wordsSet.add(el);
        }
        return wordsSet.getFirst();
     }

    static void charFrequencySort(String str) {
        if (str == null || str.isEmpty())
            return;
        char[] symbols = str.toLowerCase().toCharArray();
        TreeMap<Character, Integer> resultMap = new TreeMap<>();
        for (char ch : symbols) {
//            if (resultMap.containsKey(ch)){
//                resultMap.put(ch, resultMap.get(ch)+1);
//            }else
//                resultMap.put(ch, 1);
            resultMap.put(ch, resultMap.getOrDefault(ch, 0)+1);
        }
        System.out.println(resultMap);
    }
}
