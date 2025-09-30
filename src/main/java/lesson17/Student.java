package lesson17;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private int age;
    private double averageGrade;

    public Student() {
    }

    public Student(String name, String lastName, int age, double averageGrade) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name)
                && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int result = age - student.age;
        if (result != 0)
            return result;
        result = lastName.compareTo(student.lastName);
        if(result != 0)
            return result;
        return name.compareTo(student.name);
    }
}
