package lesson17;

import lesson16.Methods;

public class MethodsAndParapetrs {

    public void runMaP() {
        Person man = new Person();
        man.setNameAndAge("Adam", 50);
        man.sayHello();
        man.speak(); //Вызываем метод speak класса Person на объект man
        int yearsMan =  man.calculateYearsToRetirement();
        System.out.println("Мне до пенсии " + yearsMan + " лет");

        System.out.println();

        Person woman = new Person();
        String w2 = "Eva";
        woman.setNameAndAge(w2, 45);
        woman.sayHello(); //Вызов метода sayHello
        woman.speak();
        int yearsWoman = woman.calculateYearsToRetirement(); //Создаем возварщаемую переменную типа метода который хотим объявить
        System.out.println("Мне до пенсии " + yearsWoman + " лет");
    }

    class Person {
        //У класса могут быть:
        //1. Данные (поля)
        //2. Действияб которые он может совершать (методы)
        String name; //Строковая переменная имя
        int age;

        void setNameAndAge (String username, int userage) {
            name = username;
            age = userage;
        }

        int calculateYearsToRetirement () { //Возрващаемый метод целочисленного значения.
            int years = 65 - age;
            return years; // функция возврата переменной метода. После return ничего не указывается.
        }

        void speak() { //Мы создали метод для всего класса и все объекты созданные от этого класса, наследуют методы, после чего можно вызвать этот метод
            //for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", мне " + age + " лет.");
            //}
        }
        void sayHello() {
            System.out.println("Hello");
        }
    }
}
