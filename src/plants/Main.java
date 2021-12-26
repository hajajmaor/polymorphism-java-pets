package plants;

public class Main {
    public static void main(String[] args) {
        Plant p1 = new Plant("Rose");
        Plant f1 = new Fruit("Apple", "Rosaceae", "green", true);
        Fruit f2 = new Fruit("Orange", "Citrus × sinensis", "Orange", true);
        p1.fooMethod();
        f1.fooMethod();
        p1.barmethod();
        f1.barMethod();
        System.out.println(p1);
        System.out.println(f1);
    }
}
