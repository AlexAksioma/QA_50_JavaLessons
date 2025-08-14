package lesson05;

public class ComputerMain {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        System.out.println(comp1.toString());
        Computer comp2 = new Computer("Lenovo", 8, "i6", 512);
        Computer comp3 =
                new Computer("Vivo", -150, null, -33);
        System.out.println(comp2);
        System.out.println(comp3);
    }
}
