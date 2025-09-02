package lesson10;

public class InterfacesMain {
    public static void main(String[] args) {
        Child child1= new Child("Petr", 10, "Petrov");
        System.out.println(child1);

        Centaurus centaurus1 = new Centaurus("Vasya", 40, "three color");
        System.out.println(centaurus1);
        centaurus1.runFast();
        centaurus1.eatGrass();

        ChildCentaurus childCentaurus = new ChildCentaurus("Oleg" , 12, "Sidodrov");
        childCentaurus.runFast();
        centaurus1.eatGrass();
    }
}
