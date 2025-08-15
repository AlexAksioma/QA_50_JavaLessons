package lesson06;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(multiply(10, 5));
        System.out.println(multiply(10, 3, 4));
        System.out.println(multiply(10.5, 3.5));
        System.out.println(multiply("123", "22"));
        int[] array = {1,2,3,4,5};
        int[] array1 = {1,2,3,4,5};
        System.out.println(multiply(array));
        System.out.println("====================================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(array, array1));
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;  //a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static int multiply(String a, String b) { //"123" "11"
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        return a1 * b1;
    }

    static int multiply(int a, String b) {
        int b1 = Integer.parseInt(b);
        return a * b1;
    }

    static int multiply(String b, int a) {
        int b1 = Integer.parseInt(b);
        return a * b1;
    }

    static int multiply(int[] array){
        int result = 1;
        for (int i = 0; i < array.length; i++){
            result *= array[i];  //result = result * array[i]
        }
        return result;
    }



}
