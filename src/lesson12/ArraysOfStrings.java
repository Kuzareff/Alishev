package lesson12;

public class ArraysOfStrings {

    public void runAOS () {
        int [] arrays = new int[5];
        arrays[0] = 10;
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println();
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
//      Цикл for each.
//      for /* Указываем цикл*/ (String /*Указываем тип данных в цикле */ string /* Имя переменной */ : strings /* Наш массив с которым хотим работать  */ ) {
        for (String x : strings) {
            System.out.println(x); // выводим на экран уже новую переменную цикла for each
        }
        System.out.println();

        int [] numbers1 = {1,2,3}; //Новый массив с уже заданными параметрами индекс 0 - 1, индекс 1 - 2, индекс 2 - 3.
        int sum = 0; //Переменная sum которая будет складывать все значения массива
        for(int u : numbers1) { // Цикл for each с новой переменной u
            sum = sum + u; // Переменная sum = 0 + u в первом проходе == 1, sum = 1 + u во втором проходе уже 2, sum = 3 + u в третьем порходе == 3; Цикл закончен
          }
        System.out.println(sum); //Выводим коненчое значение sum равное 6.
        //Цикл for each позволяет быстро последовательно пройтись по всему циклу. Итерация за итерацией.
        System.out.println();

        int value = 0;
        String s; //При неизвестном количестве символов мы не выделяем память, s является ссылкой на объект которому будет присвоена s. По умолчанию s == null;


    }
}
