package lesson17;

import java.util.HashSet;
import java.util.TreeSet;

public class StudentSet {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", "Ivanov", 22, 7.7);
        Student student2 = new Student("Alex", "Alekseev", 18, 9.0);
        Student student3 = new Student("Masha", "Petrova", 21, 7.0);
        Student student4 = new Student("Petr", "Petrov", 22, 5.7);
        Student student5 = new Student("Ivan", "Ivanov", 22, 7.7);
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        System.out.println(studentHashSet);
        TreeSet<Student> students = new TreeSet<>(studentHashSet);
        System.out.println(students);
        TreeSet<Student> studentsByGrade = new TreeSet<>(new ComparatorByGrade());
        studentsByGrade.addAll(students);
        System.out.println(studentsByGrade);
    }
}
