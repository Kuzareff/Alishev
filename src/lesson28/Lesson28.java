package lesson28;

import lesson28.Packet1.Person;

public class Lesson28 extends Person { // Класс может быть публичный или default. Но один класс в одном файле должен быть public.
    //Как правило это первый класс.

    public void runLes28 () {
        //public - публичный модификатор и доступен по всей программе
        //private - приватный модификатор который доступен только в классе
        //default - модификатро доступа по умолчанию и доступен в рамках одного пакета
        //protected - доступен в пределах одного пакета и наследовании класса всем подклассам на территории всей программы

        Person person = new Person();
        person.name = "Adam";

//        Person person1 = new Person();
//        person1.name1 = "Adam1"; //ТОлько в пакете, так как name1 с модификатором default
        name2 = "Adam2";
        System.out.println(name2);
    }
}
