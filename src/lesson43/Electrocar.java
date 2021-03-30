package lesson43;

public class Electrocar {
    private int id;

    ////////// 1 ////////
    private class Motor { //вложенный нестатический класс
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    ///////// 2 /////////
    public static class Battery { //Статически вложенный класс
        public void charge() {
            System.out.println("Battary is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        class SomeClass {
            public void someMethod () {

            }

        }

        System.out.println("Electrocar " + id + " is starting...");
    }
}
