package lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTasks {
    public static void main(String[] args) {
        Map<Integer, Integer> mapInt = Map.of(1, 10, 2, 22, 3, 33);
        Map<Integer, Integer> mapInt1 = new HashMap<>();
        mapInt1.put(5, null);
        mapInt1.put(6, 10);
        System.out.println(sumValuesMap(mapInt));
        System.out.println(sumValuesMap(mapInt1));
        System.out.println("========================================");
        printSymbolsAndQuantity("To be or not");
    }


    // to be or not  --> t-2  o-3 b-1 e-1 r-1 n-1 space-3
    static void printSymbolsAndQuantity(String str) {
        if (str == null || str.isEmpty())
            return;
        char[] symbols = str.toLowerCase().toCharArray();
        Map<Character, Integer> resultMap = new HashMap<>();
        for (char ch : symbols) {
            if (resultMap.containsKey(ch)){
                resultMap.put(ch, resultMap.get(ch)+1);
            }else
                resultMap.put(ch, 1);
        }
        System.out.println(resultMap);
    }

    static Integer sumValuesMap(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty())
            return null;
        List<Integer> values = new ArrayList<>(map.values());
        int sum = 0;
        for (Integer el : values) {
            if (el != null)
                sum += el;
        }
        return sum;
    }
}
