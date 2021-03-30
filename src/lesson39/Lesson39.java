package lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson39 { //Исключения (часть 3). Checked и Unchecked исключения.
    public void runL39() {
        // Checked Exception - Compile time exception
        // Unchecked Exception - Runtime exception


// Checked Exception - Compile time exception - Такие исключения должны быть обработаны.
        File file = new File("sdf");
        try {
            Scanner scanner = new Scanner(file); //Exception который необходимо обработать
        } catch (FileNotFoundException e) {
            System.out.println("Обработали ошибку и что то пошло не так!");;
        }

// Unchecked Exception - Runtime exception - Такие исключения должны быть исправлены в коде. Это критическая ошибка.
//        int a = 1 / 0; - делить на 0 нельзя
//        String name = null; - длинны у данной переменной нет
//        name.length();
//        int [] arr = new int[2]; - Ошибка длинны массива. В котором всего 2 значения, а мы пытаемся вывести 3-е.
//        System.out.println(arr[2]);
    }
}
