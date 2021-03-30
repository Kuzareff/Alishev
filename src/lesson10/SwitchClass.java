package lesson10;

import java.util.Scanner;

public class SwitchClass {

    public void runSC () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 2,3,4,5,6: //Инетресная штука. Можно написать через запятую несколько значений подходящих под параметр
                System.out.println("Ты в саду");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Тебе 18");
                break;
            default:
                System.out.println("Not found");
        }


    }
}
