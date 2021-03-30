package lesson49;

public class Lesson49 { //Рекурския - вызов метода в теле самого метода
    public void runL49() {
//        counter(3);
        System.out.println(fac(4));
    }
    // counter(3) --> counter(2) --> counter(1) --> return; Так как в условии if которое стоит перед выводом результата стоит == 0.
    //Если условие поставить после sout, то и 0 будет выведен в консоль.
    //Рекурксия в данном случае заменяет цикл.
//    private static void counter(int n){
//       if (n == 0)
//           return;
//
//        System.out.println(n);
//        counter(n - 1); //3, 2, 1

    //Факториал - это
    // (факториал числа)4! = 4 * 3 * 2 * 1
    // 10! = 10 * 9 * 8 * ...... * 1

    //При рекурсии, умножение происходит от меньшего числа.

    //4 * 6 = 24
    //3 * 2 = 6
    //2 * 1 = 2
    //fac(1) = return 1;
    private static int fac (int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);

    }
}
