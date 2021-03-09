package lesson26;

public class Lesson26 {
    public void runL26() {
        Animal animal = new Animal(1);
        Person person = new Person("Adam");
        animal.sleep();
        person.seyHello();
        animal.showInfo();
        person.showInfo();
        System.out.println();

        Info a = new Animal(1);
        Info b = new Person("Eva");
        a.showInfo();
        b.showInfo();
    }
}
