package lesson38;

import java.io.IOException;
import java.util.Scanner;

public class Lesson38 { //Исключения (часть 2). Выбрасывание исключений.
    public void runL38() throws MyException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           int x = Integer.parseInt(scanner.nextLine());

           if(x != 0) {
                   throw new MyException("Ввел не 0");
          }
       }
   }
}
