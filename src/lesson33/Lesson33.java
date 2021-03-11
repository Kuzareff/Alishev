package lesson33;

import java.util.*;

public class Lesson33 { //Введение в параметризацию. (Generics)
    public void runL33 () {

        //////////////// Java 5 /////////////////
        List animals = new ArrayList<>();
        animals.add("Cat"); //0
        animals.add("Dog"); //1
        animals.add("Frog");//2

        String animal = (String) animals.get(1); //Downcasting
        System.out.println(animal);

        /////////////// Generic /////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat"); //0
        animals2.add("Dog"); //1
        animals2.add("Frog");//2

        String animal2 = animals2.get(1);

        /////////////// Java 7 //////////////////
        List<String> animals3 = new ArrayList<>(); //Можно не указывать в леваой части приведенный тип.



    }
}
