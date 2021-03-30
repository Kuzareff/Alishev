package lesson47;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson47 { //Сериализация (часть 3). Сериализация и Конструкция try-with-resources.
    public void runL47() {
        Person people = new Person(1, "Adam");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){ //Конструкция try-with-resources
                oos.writeObject(people); // Второй и более легкий
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
