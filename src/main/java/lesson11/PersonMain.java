package lesson11;

import java.time.LocalDate;
import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person(123, "Ivan", LocalDate.of(2000, 10, 25));
        Person person1_1 = new Person(123, "Ivan", LocalDate.of(1990, 10, 25));
        Person person2 = new Person(345, "Petr", LocalDate.of(1995, 1, 2));
        Person person3 = new Person(4567, "Ivan", LocalDate.of(2011, 6, 25));
        Person person4 = new Person(678, "Sveta", LocalDate.of(1999, 12, 23));
        Person person5 = new Person(765, "Oleg", LocalDate.of(2000, 10, 25));
        //System.out.println(person1);
        Person[] people = {person2, person1, person4, person3, person5, person1_1};
        System.out.println(getPersonIndex(people, person1));
        System.out.println(getPersonIndex(people, person1_1));
        int[] arrayInt = {1,3,6,3,4,1,9};
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        printArray(people);
        System.out.println("===============================");
        Arrays.sort(people);
        printArray(people);
    }

    static void printArray(Person[] people){
        for (Person p : people)
            System.out.println(p);
    }

    static int getPersonIndex(Person[] people, Person element){
        for (int i = 0; i < people.length; i++) {
            if(people[i].equals(element))
                return i;
        }
        return -1;
    }
}
