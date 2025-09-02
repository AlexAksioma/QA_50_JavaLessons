package lesson11;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id = 100;
    private String name = "John";
    private LocalDate birth;
    private int age;

    public Person() {
    }

    public Person(int id, String name, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.age = LocalDate.now().getYear() - birth.getYear();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", age=" + age;
    }

    @Override  //obj1.equals(obj2)
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age
                && Objects.equals(name, person.name)
                && Objects.equals(birth, person.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birth, age);
    }

    @Override
    public int compareTo(Person anotherPerson) {
        String name1 = name;
        String anotherName = anotherPerson.name;
        int result = name1.compareTo(anotherName);
        if (result != 0)
            return result;
        result = id - anotherPerson.id;
        if (result != 0)
            return result;
        result = anotherPerson.age - age;
        return result;
    }
    /*
    @Override
    public int compareTo(Person anotherPerson) {
        String name1 = name;
        String anotherName = anotherPerson.name;
        int result = name1.compareTo(anotherName);
        if(result != 0)
            return result;
        else //Ivan == Ivan
            return id - anotherPerson.id;
    }

    /*
    @Override  //name.compareTo()
    public int compareTo(Person anotherPerson) {
        String name1 = name;
        String anotherName = anotherPerson.name;
        return name1.compareTo(anotherName);
    }
    */


    /*
    @Override  //person.compareTp(anotherPerson)
    public int compareTo(Person anotherPerson) {
        int result = anotherPerson.age - age;
        //result < 0 --> person < anotherPerson
        //result > 0 --> person > anotherPerson
        //result = 0 --> person == anotherPerson
        return result;
    }
    age  30, 26, 25 ....
     */
}
