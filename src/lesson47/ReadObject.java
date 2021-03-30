package lesson47;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject { //Класс который вычитывает из файла
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) { //Конструкция try-with-resources
            Person people = (Person) ois.readObject();
            System.out.println(people);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
