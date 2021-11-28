package plants;

public class Plant {
    String name;

    public Plant(String name) {
        this.name = name;
    }

    public void fooMethod() {
        System.out.println("Plant : I'm foo");
    }

    public void barmethod() {
        System.out.println("Plant : I'm bar");
    }

    @Override
    public String toString() {
        return "Plant [name=" + name + "]";
    }

}
