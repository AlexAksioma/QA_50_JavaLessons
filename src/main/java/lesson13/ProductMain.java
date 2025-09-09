package lesson13;

import java.util.Arrays;
import java.util.Comparator;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 75643482L, "kg", 3.90, 15);
        Product product2 = new Product("Orange", 27443482L, "kg", 4.90, 12);
        Product product3 = new Product("Watermelon", 89063482L, "kg", 5.90, 2);
        Product product4 = new Product("Milk", 98043482L, "liter", 9.90, 3);
        Product product5 = new Product("Potato", 87643482L, "kg", 2.90, 15);
        Product product5_1 = new Product("Potato", 87643482L, "gr", 235.90, 400);
        Product[] products = {product1, product2, product5, product4, product3, product5_1};
        //Integer[] intArray = {1,6,8,90,-33,66,55};
        // printArray(intArray);
        printArray(products);
        Arrays.sort(products);
        System.out.println("=========================");
        printArray(products);
        System.out.println("=========================");
        productsSort(products, new ProductComparatorByPrice());
        printArray(products);
        System.out.println("=========================");
        productsSort(products, new ProductComparatorByPrice().reversed());
        printArray(products);
        System.out.println("=========================");
        productsSort(products, new ProductComparatorByQuantityReversePrice());
        printArray(products);
        System.out.println("=========================");
        productsSort(products, new ProductComparatorNameCodeReverse());
        printArray(products);
    }

    static void productsSort(Product[] products, Comparator<Product> comparator) {
        if (products != null)
            Arrays.sort(products, comparator);
    }

    public static <T> void printArray(T[] array) {
        if (array != null)
            for (T element : array)
                System.out.println(element);
    }
}
