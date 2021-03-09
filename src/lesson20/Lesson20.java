package lesson20;

import java.util.Scanner;

public class Lesson20 {
    public void runLes () {
        Human human1 = new Human();
        Human human2 = new Human("Adam");
        Human human3 = new Human("Eva", 18);
        human1.getInfo();
        human2.getInfo();
        human3.getInfo();
    }
}
class Human {
    private String name;
    private int age;

    public Human () {
        this.name = "Имя1";
        this.age = 20;
    }
    public Human (String name) {
        this.name = name;
    }
    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo () {
        System.out.println(name + " " + age);
    }
}
