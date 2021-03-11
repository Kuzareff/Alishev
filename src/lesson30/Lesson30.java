package lesson30;

public class Lesson30 {
    public void runL30 () {
        float f = 123.3f;
        long l = 1231324123414L;
        int i = (int) 141231231231L;

        int x = 123;
        long xl = x; //Неявное приведение типа
        int xs = (int)xl; //Явное
        System.out.println(xs + " xs");
        System.out.println(x + " x");
        System.out.println(xl + " xl");
        System.out.println();

        double xd = 123.6;
        int yd = (int)xd;
        System.out.println(yd + " yd");

        long id2 = Math.round(xd);
        int id = (int) Math.round(xd);
        System.out.println(id + " id " + id2 + " id 2");
    }
}
