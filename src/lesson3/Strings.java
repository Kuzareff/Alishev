package lesson3;

public class Strings {

    public void runStrings () {
        int x = 5;
        String s = "Hello"; //String является классом - а классы пишуться с большой буквы
        String space = " ";
        String name = "Bob";
        System.out.println("Строка 7 - 9: " + s + space + name + " - Конкатенация переменных"); //Слияние/склеивание/ или конкатенация строк через оператор "+"
        System.out.println("Строка 11: " + "Hello" + " " + "John" + " - Конкатенация строк"); // Также можно использовать просто строки
        System.out.println("Строка 6 и 12: " + "My number is " + x + " - Конкатенация строки и переменной типа int"); //Через оператор + можно склеивать строки и переменные
    }
}
