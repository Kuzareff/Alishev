package lesson19;

import org.w3c.dom.html.HTMLDOMImplementation;

public class ThisClass {
    public void runTC () {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Adam");
        human1.getInfo();
        Human human2 = new Human("Eva", 18);
        human2.getInfo();
    }
    class Human {
        String name;
        int age;

        public Human () {
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void getInfo () {
            System.out.println(name + "," + age);
        }
    }
}
