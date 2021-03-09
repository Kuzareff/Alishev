package lesson14;

public class ClassesAndObjects {
    public void runCAO () {
        Person man = new Person();
        man.name = "Adam";
        man.age = 50;
        System.out.println("My name is " + man.name + ", мне " + man.age + " лет.");
        Person woman = new Person();
        woman.name = "Eva";
        woman.age = 50;
        System.out.println("My name is " + woman.name + ", мне " + woman.age + " лет.");
    }

    class Person {
        //У класса могут быть:
        //1. Данные (поля)
        //2. Действияб которые он может совершать (методы)
        private String name; //Строковая переменная имя
        private int age;
    }
}
