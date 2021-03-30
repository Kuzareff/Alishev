package lesson44;
import java.io.*;

public class Lesson44 { //Запись в файл.
    public void runL44 ()  throws Exception {
        File file = new File("test2");
        PrintWriter writer = new PrintWriter(file); //Запись текстового типа возможна через PrintWriter


        writer.println("TestLesson44"); //Записываем данные
        writer.println("TestLesson44_1");

        writer.close(); //Обязательно закрываем поток
    }
}
