package lesson10;

public class ChildCentaurus extends Child implements Horsable{

    public ChildCentaurus(String name, int age, String parentsName) {
        super(name, age, parentsName);
    }

    @Override
    public void runFast() {
        System.out.println("Child centaurus " + getName() +
                " his parents + "+ getParentsName() + " run fast until 10 km/ch"+
                " use " + NUMBER_LEGS + " legs");
    }

    @Override
    public void eatGrass() {
        Horsable.super.eatGrass();
        System.out.println("Child centaurus " + getName()
        + "eat fresh grass only");
    }
}
