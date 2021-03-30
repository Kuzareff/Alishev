package lesson46;

import lesson45.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson46 { //Сериализация (часть 2). Сериализация массивов.
    public void runL46() {
        Person [] people = {new Person(1, "Adam"), new Person(2, "Eva"), new Person(3, "Zmei")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //Создаем файл для помещения в него объекта
            ObjectOutputStream oos = new ObjectOutputStream(fos); //Для записи объекта в файл, необходимо создать файл ----^

//            oos.writeInt(people.length); ------ Первый способ
                oos.writeObject(people); // Второй и более легкий
//            for(Person person : people) {
//                oos.writeObject(person);
//            }

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
