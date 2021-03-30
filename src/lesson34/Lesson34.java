package lesson34;

import java.util.ArrayList;
import java.util.List;

public class Lesson34 { //Wildcards (Generics)
    public void runL34() {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);


    }

    private static void test(List<? extends Animal> list) { //? обозначает как Wildcards
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
