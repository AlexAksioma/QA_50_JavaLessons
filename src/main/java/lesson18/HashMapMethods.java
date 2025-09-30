package lesson18;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Sunday", 100);
        map1.put("Monday", 300);
        map1.put(null, 0);
        System.out.println(map1.put("Tuesday", 1000));
        System.out.println(map1.put("Tuesday", -33));
        System.out.println(map1);
        Map<Integer, Double> map2 = new HashMap<>();
        map2.put(10, 33.33);

        Map<Boolean, String> boolMap = new HashMap<>(32);
        boolMap.put(null, "Ivan");
        boolMap.put(true, "Vasya");
        boolMap.put(false, "Ivan");
        System.out.println(boolMap);

        System.out.println(boolMap.size());
        boolMap.clear();
        System.out.println(boolMap.size());
        System.out.println("=======================");
        System.out.println(map1);
        System.out.println(map1.containsKey("Sunday"));
        System.out.println(map1.containsValue(-999));
        System.out.println(boolMap.isEmpty());
        String key = "Wednesday";
        map1.put(key.toLowerCase(), -777);
        System.out.println(map1);
        System.out.println(map1.remove(null));
        System.out.println(map1.remove("str"));
        System.out.println(map1);
        System.out.println("=======================");
        Set<String> setStr = map1.keySet();
        System.out.println(setStr);
        List<Integer> listInt = new ArrayList<>(map1.values());
        System.out.println(listInt);
        System.out.println("=======================");
        System.out.println(map1.get("Monday"));
        System.out.println(map1.get("key"));
        System.out.println(map1.getOrDefault("Monday", 1));
        System.out.println(map1.getOrDefault("not key", 1));
        System.out.println("=======================");
        printMap(map1);
        printMap(map2);
    }

    static void printMap1(Map<String, Integer> map){
        if(map == null || map.isEmpty()){
            System.out.println("map is null or empty");
            return;
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
    }

    static <K,V> void printMap(Map<K, V> map){
        if(map == null || map.isEmpty()){
            System.out.println("map is null or empty");
            return;
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
