package lesson8;

import java.util.Scanner;

public class DoWhile {
    public void runDoWhile () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5");
        int value = scanner.nextInt();
        while (value != 5) {
            System.out.println("Enter 5");
            value = scanner.nextInt();
        }
        System.out.println("You enter 5");

        int value2;
        do {
            System.out.println("Enter 6");
            value2 = scanner.nextInt();
        }   while (value2 != 6);
        System.out.println("You enter 6");
    }
}
