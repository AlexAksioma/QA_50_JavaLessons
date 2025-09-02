package lesson10;


public interface Horsable {

    void runFast();

    int NUMBER_LEGS = 4;

    default void eatGrass(){
        System.out.println("eating green grass");
    }
}
