package lesson15;

import lesson14.ClassesAndObjects;

public class ClassesAndObjectsTwo {

    public void runCAOT() {
        Person man = new Person();
        man.name = "Adam";
        man.age = 50;
        man.speak(); //Вызываем метод speak класса Person на объект man
        Person woman = new Person();
        woman.name = "Eva";
        woman.age = 50;
        woman.sayHello();
    }

    class Person {
        //У класса могут быть:
        //1. Данные (поля)
        //2. Действияб которые он может совершать (методы)
        String name; //Строковая переменная имя
        int age;

        void speak() { //Мы создали метод для всего класса и все объекты созданные от этого класса, наследуют методы, после чего можно вызвать этот метод
            for (int i = 0; i < 3; i++) {
                System.out.println("My name is " + name + ", мне " + age + " лет.");
            }
        }
        void sayHello() {
            System.out.println("Hello");
        }
    }
}
