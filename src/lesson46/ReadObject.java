package lesson46;

import lesson45.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject { //Класс который вычитывает из файла
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            int personCount = ois.readInt(); ----- Первый способ
//            Person [] people = new Person[personCount];
            Person [] people = (Person[]) ois.readObject(); // Второй и более легкий
//            for(int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }


            System.out.println(Arrays.toString(people));
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
