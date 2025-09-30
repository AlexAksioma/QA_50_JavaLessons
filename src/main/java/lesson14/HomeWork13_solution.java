package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork13_solution {
    public static void main(String[] args) {
        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(10.5f);
        floatList.add(0.5f);
        floatList.add(101.5f);
        floatList.add(10.555f);
        floatList.add(null);
        floatList.add(1, 133.33f);
        floatList.add(4, 22.22f);
        System.out.println(floatList);
        List<Boolean> boolList = new ArrayList<>(30);
        //ArrayList<Boolean> boolList1 = List.of(boolList, true, false, true, false);
        addElementToBoolList(boolList, 10);
        System.out.println(boolList);
        List<Integer> listInt1 = createListInt(20);
        System.out.println(listInt1);
        System.out.println("============================");
        System.out.println(deleteRepetitiveElements(boolList, true));
        System.out.println("============================");
        System.out.println(floatList);
        floatList.removeIf(el -> el == null);   //   Float el; if el == null then remove el;
        System.out.println(floatList);
        floatList.removeIf(el -> el < 11.f && el > 10.f);
        System.out.println(floatList);
    }

    static List<Boolean> deleteRepetitiveElements(List<Boolean> list, Boolean deleteElement) {
        if (list == null || list.isEmpty())
            return null;
        List<Boolean> result = new ArrayList<>();
        for (Boolean el : list) {
            if (el != deleteElement)
                result.add(el);
        }
        return result;
    }

    private static void addElementToBoolList(List<Boolean> list, int number) {
        for (int i = 0; i < number; i++) {
            list.add(true);
            list.add(false);
        }
    }

    static List<Integer> createListInt(int size) {
        if (size <= 0)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int element = new Random().nextInt(1000);
            result.add(element);
        }
        return result;
    }
}
