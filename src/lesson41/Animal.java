package lesson41;

public abstract class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
    public abstract void makeSound(); //Все абстрактные методы абсстрактного класса должны быть реализованы у наследников
}
