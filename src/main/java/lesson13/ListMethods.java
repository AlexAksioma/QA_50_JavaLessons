package lesson13;

import java.util.ArrayList;

public class ListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        //[22][55][2][-1][]  ... []   size=10
        listInt.add(22);
        listInt.add(55);
        listInt.add(2);
        System.out.println(listInt);
        System.out.println(listInt.size());
        listInt.add(2, 100);
        System.out.println(listInt);
        System.out.println(listInt.size());
        listInt.add(4, 555); // = list.add
        // 0 <= index <= size
        System.out.println(listInt);
        System.out.println(listInt.size());
        System.out.println("========================");
        ArrayList<String> names = new ArrayList<>(20);
        names.add("Ivan");
        names.add("Petr");
        names.add("Olga");
        names.add("Ivan");
        System.out.println(names);
        names.add(null);
        names.add(null);
        System.out.println(names + ":" + names.size());
        System.out.println(names.isEmpty());  //true --> name.size = 0
        ArrayList<Boolean> bollList = new ArrayList<>();
        System.out.println("========================");
        System.out.println(bollList+":"+bollList.size());
        System.out.println("========================");
        System.out.println(names + ":" + names.size());
        System.out.println(names.get(2));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.remove(2);
        System.out.println(names + ":" + names.size());
        System.out.println(names.remove("Ivan"));
        System.out.println(names + ":" + names.size());
        System.out.println(names.remove("Max"));
        System.out.println(names + ":" + names.size());
        System.out.println(names.contains("Max"));
        System.out.println(names.contains(null));
        System.out.println("====================================");
        Product product1 = new Product("Apple", 75643482L, "kg", 3.90, 15);
        Product product2 = new Product("Orange", 27443482L, "kg", 4.90, 12);
        Product product3 = new Product("Watermelon", 89063482L, "kg", 5.90, 2);
        Product product4 = new Product("Milk", 98043482L, "liter", 9.90, 3);
        Product product5 = new Product("Potato", 87643482L, "kg", 2.90, 15);
        Product product5_1 = new Product("Potato", 87643482L, "gr", 235.90, 400);
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        System.out.println(productArrayList);
        productArrayList.remove(product2);
        System.out.println(productArrayList);
    }
}
