package lesson22;

public class LessonFinal {
    public void runLF () {
        final int X = 10; // переменные метода можно объявлять прямо в методе таким образом
        System.out.println(X);
    }
}

class Test {
    public final int CONSTANT = 0; //Для этого мы инициализируем Константу прямо при ее создании

//    public Test(int CONSTANT) { Конструктор тоже можно не создавать что бы экономить память!
//        this.CONSTANT = CONSTANT;
//    }
//    public void setCONSTANT(int x) { Сеттер не работает с константами
//        this.CONSTANT = x;
}