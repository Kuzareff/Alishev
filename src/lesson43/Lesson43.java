package lesson43;

public class Lesson43 { //Вложенные классы.
    public void runL43 () {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}
