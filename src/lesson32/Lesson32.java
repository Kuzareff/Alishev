package lesson32;

public class Lesson32 { //Восходящее и нисходящее преобразование.

   public void runL32() {

       Dog dog = new Dog();
       // Upcasting - Восходящее преобразование

       Animal animal = dog;
       animal.eat();

       //Downcasting - Нисходящее преобразование
       Dog dog2 = (Dog) animal;
       dog2.bark();

    }
}
