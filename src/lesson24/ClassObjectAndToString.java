package lesson24;

public class ClassObjectAndToString {

    public void runCOATS () {
        Human human1 = new Human("Adam", 30);
        System.out.println(human1);

    }
}
class Human {
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

}

