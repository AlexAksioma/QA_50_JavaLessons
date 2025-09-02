package lesson11;

import lesson10.Human;

public class Mermaid extends Human implements Swimable, Comparable<Mermaid>{

    public Mermaid() {
    }

    public Mermaid(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Mermaid " + super.toString();
    }

    @Override
    public void swim() {
        System.out.println(getName()+" swims in the ocean");
    }

    @Override
    public void breathUnderWater() {
        System.out.println(getName()+ " age " +getAge() +
                " breath under water");
    }

    @Override
    public int compareTo(Mermaid another) {
        return Integer.compare(getAge(), another.getAge());
    }
}
