package lesson21;

public class LessonStatic {
    public void runLS() {
        Human human1 = new Human("Adam", 30);
        Human human2 = new Human("Zmei", 1000);
        human1.getAllField();
        human2.getAllField();
        human1.setName("Eva");
        Human.description = "Hello";
        Human.getDescription();
        human1.getAllField();
        human2.getAllField();
        Human.description = "Bad";
        human1.getAllField();
        human2.getAllField();
        human1.getCountPeople();
        human2.getCountPeople();
    }
}
class Human {
    private String name; //нестатические переменные не мегоут быть вызваны в статических методах
    private int age;
    private static int countPeople;


    public static String description; //Строковая статическая переменная, может работать как со статическим так и не  со статическим методом.

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
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
    public static void getDescription () {
        System.out.println(description);
    }
    public void getAllField () {
        System.out.println(name + " " + age + " " + description);
    }
    public void getCountPeople () {
        System.out.println("Number of people is: " + countPeople);
    }
}

