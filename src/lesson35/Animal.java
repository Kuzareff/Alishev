package lesson35;

public class Animal {

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class OtherAnimal extends Animal {
    public void eat() {
        System.out.println("OtherAnimal is eating...");
    }
}
