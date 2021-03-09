package lesson6;

public class If {
    public void runIf () {
        int myInt = 15;
        if (myInt < 10) { //цикл проверки условий схожий с while , for. Так же есть скобки условий и скобки тело цикла.
            System.out.println("Yes");
        }   else if (myInt > 20) { //Но добавляется еще дополнительные поля проверки
            System.out.println("No");
        }   else { //И еще одно поле проверки
            System.out.println("иначе");
        }
    }
}
