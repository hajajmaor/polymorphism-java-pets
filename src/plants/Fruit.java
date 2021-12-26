package plants;

public class Fruit extends Plant {
    String family;
    String color;
    boolean hasShell; // יש קליפה?

    public Fruit(String name, String family, String color, boolean hasShell) {
        super(name);
        this.family = family;
        this.color = color;
        this.hasShell = hasShell;
    }

    public void barMethod() {
        System.out.println("Plant : I'm bar");
    }

    public void fooMethod() {
        System.out.println("Fruit : I'm Foo");
    }

    @Override
    public String toString() {
        return super.toString() + " Fruit [color=" + color + ", family=" + family + ", hasShell=" + hasShell + "]";
    }

}