package lesson06;

import lesson05.FictionBook;

public class HomeWork05_solution {
    public static void main(String[] args) {
        KidsFictionBook kidsFictionBook1 =
                new KidsFictionBook("Pinokio", "Collodi", 125, 987654321, "Farry tails", 10);
        KidsFictionBook kidsFictionBook2 =
                new KidsFictionBook("Buratino", "Tolstoy", 110, 987654326, "Farry tails", 10);
        System.out.println(kidsFictionBook1);
        System.out.println(kidsFictionBook2);
        System.out.println("===========================================");
        FictionBook fb1 = new FictionBook("FB1", "Author1", 50, 123455L, "Genre1");
        FictionBook fb2 = new FictionBook("FB2", "Author2", 60, 123456L, "Genre2");
        FictionBook fb3 = new FictionBook("FB3", "Author3", 70, 123457L, "Genre3");
        FictionBook fb4 = new FictionBook("FB4", "Author4", 80, 123458L, "Genre4");
        FictionBook fb5 = new FictionBook("FB5", "Author5", 90, 123459L, "Genre5");
        FictionBook[] arrayFB = {fb1, fb2, fb3, fb4, fb5, null};
        printArray(arrayFB);
        printArray(null);
        printArray(new FictionBook[]{});
        System.out.println("===========================================");
        System.out.println("--> " + numberOfPage(arrayFB));
        System.out.println("--> " + numberOfPage(null));
    }

    static Long numberOfPage(FictionBook[] array) {   //long -->  Long  (null)
        if (array == null) {
            System.out.println("array is null");
            return null;
        }
        long result = 0;
        for (FictionBook book : array) {
            if (book != null)                 // null.getPages()
                result += book.getPages();   // result = result + book.getPages()
        }
        return result;
    }

    static void printArray(FictionBook[] array) {
        if (array == null) {
            System.out.println("array is null");
            return;
        }
        for (FictionBook book : array) {
            if (book != null)
                System.out.println(book.toString());   //null.toString()
        }
    }
}

