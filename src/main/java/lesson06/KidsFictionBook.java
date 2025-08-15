package lesson06;

import lesson05.FictionBook;

public class KidsFictionBook extends FictionBook {
    private int age = 1;

    public KidsFictionBook() {
    }

    public KidsFictionBook(String title, String author, int pages,
                           long isbn, String genre, int age) {
        super(title, author, pages, isbn, genre);
//        if (age < 1)
//            this.age = age;
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1)
            this.age = age;
    }

    @Override
    public String toString() {
        return "KidsFictionBook{" +
                "age=" + age +
                "} " + super.toString();
    }


}
