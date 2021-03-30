package lesson42;


public class Lesson42 { //Метод equals() и String Pool.
    public void runL42() {
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//        Animal animal1 = new Animal(1);
//        Animal animal2 = new Animal(1);
//
//        System.out.println(animal1.equals(animal2));
        String string1 = "Hello";  // string1 --> {Hello}
        String string2 = "Hello";  // string2 ------^     Это называется String Pool

        System.out.println(string1 == string2);
        System.out.println();

        String a = "hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));


    }
}
