package lesson29;

public class Lesson29 {

    public void runL29 () {
        Animal animal = new Dog(); //Позднее связываение.

        Animal animal1 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal1);
        test(dog);
        test(cat);


    }

    public void test (Animal animal) {
        animal.eat();
    }
}
