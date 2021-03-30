package lesson41;

public class Lesson41 { //Абстрактные классы.
    public void runL41() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
    }
}


//Интерфейс это свойства объекта и можно имплементировать колько угодно интерфейсов
//Абстрактный класс, является родителем и оболочнокой наследника.

