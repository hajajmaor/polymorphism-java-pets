package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Maor", 27, "Ort");
        // The method doSomething() from the type Person is not visibleJava(67108965)
        // p1.doSomething();
        System.out.println(p1);
    }
}
