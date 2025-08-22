package lesson08;

import lesson05.FictionBook;

public class StringBuilderMethods {
    //https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        //[0] [1]  .... [15]   str  [s][t][r] [] ...[]
        StringBuilder builder2 = new StringBuilder(100);
        String str = "Hello";
        StringBuilder builder3 = new StringBuilder(str);
        //H e l l o ....  capacity = 16 + 5
        System.out.println(builder3.length());
        System.out.println(builder3.capacity());

        System.out.println("before -->"+builder3);
        builder3.append(123).append(false).append(33.99).append("string");
        System.out.println("after --> " +builder3);

        String str1 = "Hello";
        System.out.println(str1 + "str1" + Integer.toString(123));
        System.out.println(str1);

        builder3.insert(10, true).insert(15, "  ");
        FictionBook fictionBook = new FictionBook("Vii", "Gogol", 300, 987654L, "horror");
        System.out.println(builder3);
        builder3.append(fictionBook);
        System.out.println(builder3);

        System.out.println("============================");
        StringBuilder builder = new StringBuilder("Hello my friend!");
        System.out.println(builder.toString());
        builder.replace(1, 5 , "ELLO1111");  //until end index  --> 1-4
        System.out.println(builder);
        builder.delete(5,9);
        System.out.println(builder);
        String sub = builder.substring(5);  //return String!!!!
        System.out.println(sub);
        System.out.println(builder);
        System.out.println(builder.reverse());  //anna    -->  anna

    }


}
