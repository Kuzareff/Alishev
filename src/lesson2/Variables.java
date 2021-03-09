package lesson2;

public class Variables {

    public void runVariables () {
        int myInt = 557;
        System.out.println("Строка 6: " + myInt + " - тип целочисленных данных");
        short myShort = 3266;
        System.out.println("Строка 8: " + myShort + " - тип целочисленных данных объемом 16 бит");
        long myLong = 23423425;
        System.out.println("Строка 10: " + myLong + " - тип целочисленных данных самым большим объемом");
        double myDouble = 234.234;
        System.out.println("Строка 12: " + myDouble + " - тип дробного числа но с небольшым значением");
        float myFloat = 234.3463466f;
        System.out.println("Строка 14: " + myFloat + " - тип дробного числа но с большим значением и вконце необходимо ставить f");
        char myChar = 1989;
        System.out.println("Строка 16: " + myChar + " - тип переменной символьного типа");
        boolean b = true;
        System.out.println("Строка 18: " + b + " - булевое значение имеет два значения ложь и правда true/false");
    }
}
