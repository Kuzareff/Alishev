package lesson7;

import java.util.Scanner;

public class Input {

    public void runInput () {
        //String s = new String("Новая строка"); //Еще один способ создания строки. Обычно так создаются объекты класса.

        //Scanner /*Класс*/ scanner /* имя нового объекта */  = new /* создание */  Scanner /* Класса */ (System.in) /* Значение */ ; // Создание объекта класса сканнер со значением System.in - значающее ввод данных от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: "); //Просим пользователя ввести данные
        String s = scanner.nextLine(); //Создаем новый строковый объект с именем s который наполнит пользователь с клавиатуры
        System.out.println("Вы ввели :" + s); //Выводим введенные пользователем данные
        System.out.print("Введите число: ");//Просим пользователя ввести данные
        int x = scanner.nextInt(); //Создаем целочисленную переменную и наделяем ее данными введенными пользоателями
        System.out.println("Вы ввели :" + x);//Выводим введенные пользователем данные
    }
}