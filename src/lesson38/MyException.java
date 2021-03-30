package lesson38;

import java.util.Scanner;

public class MyException extends Exception { //Создвем свой Exception
    public MyException (String description) {
        super(description);
    }
}
