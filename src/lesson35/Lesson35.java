package lesson35;

public class Lesson35 { //Анонимные классы

    public void runL35() {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal1.eat();
    }
}
