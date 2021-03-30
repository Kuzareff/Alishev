package lesson45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson45 { //Класс и методы записи объектов в файл
    public void runL45() {
        Person person1 = new Person(1, "Adam");
        Person person2 = new Person(1, "Adam");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //Создаем файл для помещения в него объекта
            ObjectOutputStream oos = new ObjectOutputStream(fos); //Для записи объекта в файл, необходимо создать файл ----^

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
