package lesson9;

public class Break_Continue {
    public void runBC () {
        int i = 0;
        while (true) {
            if(i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Out cycle");

        System.out.println();

        for (int x = 0; x < 10; x++) {
            if (x % 2 != 0){
                continue;
            }
            System.out.println("Четные чила " + x);
        }

        System.out.println();

        for (int b = 0; b < 10; b++) {
            if (b % 2 != 0){
                break;
            }
            System.out.println("Четные чила " + b);
        }
    }
}
