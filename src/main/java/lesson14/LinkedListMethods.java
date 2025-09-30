package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        //   el1 <-> el2 <-> el3 .....   linked   el1 <-> new <-> el2 <-> el3
        //   [el1] [el2] [el3]           array   [el1] [new] --> el2 el3
        linkedList.add(100);
        linkedList.add(101);
        linkedList.add(null);
        linkedList.add(101);
        linkedList.add(1003);
        System.out.println(linkedList);
        List<Integer> list1 = new LinkedList<>(linkedList);
        System.out.println(list1);
        list1.addAll(linkedList);
        System.out.println(list1);
        list1.addAll(6, linkedList);
        System.out.println(list1);
        linkedList.clear();
        System.out.println(linkedList);
        //============================
        System.out.println(list1.get(3));
        System.out.println(list1.getFirst()); //list1.get(0)
        System.out.println(list1.getLast());  //list1.get(list1.size()-1)
        //==============================
        System.out.println(list1.indexOf(101));
        System.out.println(list1.lastIndexOf(101));
        System.out.println(list1.indexOf(555));
        //==============================
        System.out.println("============================");
        System.out.println(list1);
        System.out.println(list1.remove(1));  //remove(index) --> element
        System.out.println(list1);
        System.out.println(list1.remove(null));  //remove(element) --> true/false
        System.out.println(list1);
        list1.removeIf(i -> i == null);   // null == 100
        list1.removeIf(element -> element == 100);
        System.out.println(list1);
        list1.removeFirst();
        list1.removeLast();
        System.out.println(list1);
        //====================================
        list1.sort(null);
        System.out.println(list1);
        list1.add(null);
        list1.add(null);
        System.out.println(list1);
        list1.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println(list1);
        list1.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(list1);
    }
}
