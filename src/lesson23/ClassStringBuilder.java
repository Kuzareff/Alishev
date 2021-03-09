package lesson23;

import java.util.Locale;

public class ClassStringBuilder {
    //StringBuilder muteble unmuteble

    public void runSB () {
//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String All = string1+string2+string3;
//        System.out.println(All);
    StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.toString());
//        stringBuilder.append(" my");
//        stringBuilder.append(" friend");
//        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my").append(" friend");
        System.out.println(stringBuilder.toString());

        System.out.printf("This is a string, %s \n", "NICE"); //%s вставляет строку //Также можно написать \n для переноса строки в printf
        System.out.printf("This is a string, %d \n", 555); //%d вставляет зачение
        System.out.printf("String %10d \n", 555); //%10d вставляет число символов при выводе и позволяет выравнивать структуру
        System.out.printf("String %10d \n", 5555); //%d вставляет зачение
        System.out.printf("String %10d \n", 55555); //%d вставляет зачение
        System.out.printf("String %10d \n", 555555555); //%d вставляет зачение
        System.out.printf("String %-10d \n", 555); //%10d вставляет число символов при выводе и позволяет выравнивать структуру
        System.out.printf("String %-10d \n", 5555); //%d вставляет зачение
        System.out.printf("String %-10d \n", 55555); //%d вставляет зачение
        System.out.printf("String %-10d \n", 555555555); //%d вставляет зачение
        System.out.printf("String %d \n", 555); //%10d вставляет число символов при выводе и позволяет выравнивать структуру
        System.out.printf("String %d \n", 5555); //%d вставляет зачение
        System.out.printf("String %d \n", 55555); //%d вставляет зачение
        System.out.printf("String %d \n", 555555555); //%d вставляет зачение
        System.out.printf("String %.2f \n", 2.234); //%d вставляет зачение
        System.out.printf("String %.2f \n", 3.5754674); //%d вставляет зачение
        System.out.printf("String %.2f \n", 4.6577); //%d вставляет зачение
        System.out.printf("String %.2f \n", 5.5467748); //%d вставляет зачение

    }
}
