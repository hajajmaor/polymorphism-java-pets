package encapsulation;

public class Person {
    private String name;
    private int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void doSomething() {
        System.out.println("Person - I'm doing something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Maor", 27, "Ort");
        p1.doSomething();
    }
}
