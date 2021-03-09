package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClassArrays {

    public void runArrays () throws IOException {
        int number = 10; //[10]
        int[] numbers = new int[5]; // numbers ->(ссылается на) [массив] ССылочный тип данных
        //System.out.println(numbers[0]); // 0 1 2 3 4
        //Массив можно наполнять вручную:
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
        //Можно на полнять через цикл for()
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println();
        //Также можно создавать массив если заранее известны данные которые мы хотим внести
        int[] numbers1 = {9, 8, 7, 6, 5};
        for (int i = 0; i < numbers1.length; i++) { //Цыкл вывода всего массива на экран
            System.out.println(numbers1[i]);
        }
//Создание массива с рукописным заполнением.
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером с size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }
}
