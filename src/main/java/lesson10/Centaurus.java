package lesson10;

public class Centaurus extends Human implements Horsable {
    private String color = "white";

    public Centaurus() {
    }

    public Centaurus(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null)
            this.color = color;
    }

    @Override
    public String toString() {
        return "Centaurus - " +
                "color= " + color + " " + super.toString();
    }

    @Override
    public void runFast() {
        System.out.println("Centaurus " + getName() + " run fast"+
                " use " + NUMBER_LEGS + " legs");
    }
}
