package lesson13;

public class MultidimensionalArrays {
    public void runMA () {
        int [] number = {1,2,3}; //Одномерный массив линейного типа
        System.out.println(number[2]);
        System.out.println();
        int [][] matrice = {{1,2},
                            {4,5,6,7,8,9},
                            {12,13,80}};
        System.out.println(matrice[2][2]); //Первое число [] отвечает за строки, второе число в [] отвечает за столбец
        System.out.println(matrice[1][0]); //4
        System.out.println();
        String [][] strings = new String[2][3]; //Массив строк на 2 строки и 3 столбца == 6 слов
        strings[0][0] = "строка 1 столбец 1";
        strings[0][1] = "строка 1 столбец 2";
        strings[0][2] = "строка 1 столбец 3";
        strings[1][0] = "строка 2 столбец 1";
        strings[1][1] = "строка 2 столбец 2";
        strings[1][2] = "строка 2 столбец 3";
        System.out.println(strings[0][0]);
        System.out.println();

        //Для вывода массива на экран
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
