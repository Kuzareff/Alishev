package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson36 { //Чтение из файла.
    public void runL36() throws FileNotFoundException {
        String separator = File.separator; // Переменная для того чтобы на любой ОС работал указанный путь
        File file = new File(separator + "D:" + separator + "JavaLesson" + separator + "Lesson36test.txt"); // separator служит универсальным разделителем.

        //В случае когда файл находится в проекте, путь до него можно не прописывать.

        File file1 = new File("test2");


        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
