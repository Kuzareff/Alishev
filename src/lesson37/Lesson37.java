package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Lesson37 { //Исключения (часть 1). Обработка исключений.
    public void runL37() {
        File file = new File("test2");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace(); //Можно указать свою резолюцию по ошибке
            System.out.println("Все хуйня! Давай по новой...");
        }
    }
}
