package lesson26;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void seyHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + this.name);
    }
}
