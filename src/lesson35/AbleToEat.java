package lesson35;

public interface AbleToEat {
    default void eat() {
        System.out.println("Eat");
    }
}
