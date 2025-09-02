package lesson10;

public abstract class Human {
    private String name = "John Dou";
    private int age = 1;

    public Human() {
    }

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1 && age < 120)
            this.age = age;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age;
    }
}
