package lesson1;

import lesson10.SwitchClass;
import lesson11.ClassArrays;
import lesson12.ArraysOfStrings;
import lesson13.MultidimensionalArrays;
import lesson14.ClassesAndObjects;
import lesson15.ClassesAndObjectsTwo;
import lesson16.Methods;
import lesson17.MethodsAndParapetrs;
import lesson18.Incapsulation;
import lesson19.ThisClass;
import lesson2.Variables;
import lesson20.Lesson20;
import lesson21.LessonStatic;
import lesson22.LessonFinal;
import lesson23.ClassStringBuilder;
import lesson24.ClassObjectAndToString;
import lesson25.Lesson25;
import lesson26.Lesson26;
import lesson27.Lesson27;
import lesson28.Lesson28;
import lesson29.Lesson29;
import lesson3.Strings;
import lesson30.Lesson30;
import lesson31.Lesson31;
import lesson32.Lesson32;
import lesson33.Lesson33;
import lesson34.Lesson34;
import lesson35.Lesson35;
import lesson36.Lesson36;
import lesson37.Lesson37;
import lesson38.Lesson38;
import lesson38.MyException;
import lesson39.Lesson39;
import lesson4.WhileLoops;
import lesson40.Lesson40;
import lesson41.Lesson41;
import lesson42.Lesson42;
import lesson43.Lesson43;
import lesson44.Lesson44;
import lesson45.Lesson45;
import lesson46.Lesson46;
import lesson47.Lesson47;
import lesson48.Lesson48;
import lesson49.Lesson49;
import lesson5.ForLoop;
import lesson6.If;
import lesson7.Input;
import lesson8.DoWhile;
import lesson9.Break_Continue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) throws IOException, MyException, Exception {


////************************************************* lesson 1 *********************************************************
//        System.out.println("Hello World");  //- вывод первой строки
////************************************************* lesson 2 *********************************************************
//        Variables variables = new Variables();
//        variables.runVariables();
////************************************************* lesson 3 *********************************************************
//        Strings strings = new Strings();
//        strings.runStrings();
////************************************************* lesson 4 *********************************************************
//        WhileLoops whileLoops = new WhileLoops();
//        whileLoops.runWhileLoops();
////************************************************* lesson 5 *********************************************************
//        ForLoop forLoop = new ForLoop();
//        forLoop.runForLoop();
////************************************************* lesson 6 *********************************************************
//        If ifclass = new If();
//        ifclass.runIf();
////************************************************* lesson 7 *********************************************************
//        Input input = new Input();
//        input.runInput();
////************************************************* lesson 8 *********************************************************
//        DoWhile doWhile = new DoWhile();
//        doWhile.runDoWhile();
////************************************************* lesson 9 *********************************************************
//        Break_Continue bc = new Break_Continue();
//        bc.runBC();
////************************************************* lesson 10 ********************************************************
//        SwitchClass sc = new SwitchClass();
//        sc.runSC();
////************************************************* lesson 11 ********************************************************
//        ClassArrays classArrays = new ClassArrays();
//        classArrays.runArrays();
////************************************************* lesson 12 ********************************************************
//        ArraysOfStrings arraysOfStrings = new ArraysOfStrings();
//        arraysOfStrings.runAOS();
////************************************************* lesson 13 ********************************************************
//        MultidimensionalArrays ma = new MultidimensionalArrays();
//        ma.runMA();
////************************************************* lesson 14 ********************************************************
//        ClassesAndObjects cao = new ClassesAndObjects();
//        cao.runCAO();
////************************************************* lesson 15 ********************************************************
//        ClassesAndObjectsTwo caot = new ClassesAndObjectsTwo();
//        caot.runCAOT();
////************************************************* lesson 16 ********************************************************
//        Methods m = new Methods();
//        m.runM();
////************************************************* lesson 17 ********************************************************
//        MethodsAndParapetrs MaP = new MethodsAndParapetrs();
//        MaP.runMaP();
////************************************************* lesson 18 ********************************************************
//        Incapsulation incapsulation = new Incapsulation();
//        incapsulation.runI();
////************************************************* lesson 19 ********************************************************
//        ThisClass tc = new ThisClass();
//        tc.runTC();
////************************************************* lesson 20 ********************************************************
//        Lesson20 lesson20 = new Lesson20();
//        lesson20.runLes();
////************************************************* lesson 21 ********************************************************
//        LessonStatic lessonStatic = new LessonStatic();
//        lessonStatic.runLS();
////************************************************* lesson 22 ********************************************************
//        LessonFinal lessonFinal = new LessonFinal();
//        lessonFinal.runLF();
////************************************************* lesson 23 ********************************************************
//        ClassStringBuilder classStringBuilder = new ClassStringBuilder();
//        classStringBuilder.runSB();
////************************************************* lesson 24 ********************************************************
//        ClassObjectAndToString coats = new ClassObjectAndToString();
//        coats.runCOATS();
////************************************************* lesson 25 ********************************************************
//        Lesson25 lesson25 = new Lesson25();
//        lesson25.runLes();
////************************************************* lesson 26 ********************************************************
//        Lesson26 lesson26 = new Lesson26();
//        lesson26.runL26();
////************************************************* lesson 27 ********************************************************
//        Lesson27 lesson27 = new Lesson27();
//        lesson27.runLes27();
////************************************************* lesson 28 ********************************************************
//        Lesson28 lesson28 = new Lesson28();
//        lesson28.runLes28();
////************************************************* lesson 29 ********************************************************
//        Lesson29 lesson29 = new Lesson29();
//        lesson29.runL29();
////************************************************* lesson 30 ********************************************************
//        Lesson30 lesson30 = new Lesson30(); //Приведение примитивных типов данных.
//        lesson30.runL30();
////************************************************* lesson 31 ********************************************************
//        Lesson31 lesson31 = new Lesson31(); //Обертки примитивных типов данных
//        lesson31.runL31();
////************************************************* lesson 32 ********************************************************
//        Lesson32 lesson32 = new Lesson32(); //Восходящее и нисходящее преобразование.
//        lesson32.runL32();
////************************************************* lesson 33 ********************************************************
//        Lesson33 lesson33 = new Lesson33(); //Введение в параметризацию. (Generics)
//        lesson33.runL33();
////************************************************* lesson 34 ********************************************************
//        Lesson34 lesson34 = new Lesson34(); //Wildcards (Generics)
//        lesson34.runL34();
////************************************************* lesson 35 ********************************************************
//        Lesson35 lesson35 = new Lesson35(); //Анонимные классы
//        lesson35.runL35();
////************************************************* lesson 36 ********************************************************
//        Lesson36 lesson36 = new Lesson36(); //Чтение из файла
//        lesson36.runL36();
////************************************************* lesson 37 ********************************************************
//        Lesson37 lesson37 = new Lesson37(); //Исключения (часть 1). Обработка исключений.
//        lesson37.runL37();
////************************************************* lesson 38 ********************************************************
//        Lesson38 lesson38 = new Lesson38(); //Исключения (часть 2). Выбрасывание исключений.
//        lesson38.runL38();
////************************************************* lesson 39 ********************************************************
//        Lesson39 lesson39 = new Lesson39(); //Исключения (часть 3). Checked и Unchecked исключения.
//        lesson39.runL39();
////************************************************* lesson 40 ********************************************************
//        Lesson40 lesson40 = new Lesson40(); //Исключения (часть 4).
//        try {
//            lesson40.runL40();
//        } catch (ParseException | IOException | IllegalAccessException e) { //Мульти catch
//            e.printStackTrace();
//        }
////************************************************* lesson 41 ********************************************************
//        Lesson41 lesson41 = new Lesson41(); //Абстрактные классы.
//        lesson41.runL41();
////************************************************* lesson 42 ********************************************************
//        Lesson42 lesson42 = new Lesson42(); //Метод equals() и String Pool.
//        lesson42.runL42();
////************************************************* lesson 43 ********************************************************
//        Lesson43 lesson43 = new Lesson43(); //Вложенные классы.
//        lesson43.runL43();
////************************************************* lesson 44 ********************************************************
//        Lesson44 lesson44 = new Lesson44(); //Запись в файл.
//        lesson44.runL44();
////************************************************* lesson 45 ********************************************************
//        Lesson45 lesson45 = new Lesson45();
//        lesson45.runL45();
////************************************************* lesson 46 ********************************************************
//        Lesson46 lesson46 = new Lesson46(); //Сериализация (часть 2). Сериализация массивов.
//        lesson46.runL46();
////************************************************* lesson 47 ********************************************************
//        Lesson47 lesson47 = new Lesson47(); //Сериализация (часть 3). Сериализация и Конструкция try-with-resources.
//        lesson47.runL47();
////************************************************* lesson 48 ********************************************************
//        Lesson48 lesson48 = new Lesson48(); //Enum
//        lesson48.runL48();
////************************************************* lesson 49 ********************************************************
        Lesson49 lesson49 = new Lesson49(); // Рекурсия
        lesson49.runL49();

    }
}
