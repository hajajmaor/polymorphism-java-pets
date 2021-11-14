package animals;

public class Cat extends Animal {
    public Cat(String name, int day, int month, int year) {
        super(name, day, month, year);
    }

    @Override
    public int calculateAge() {
        return super.calculateAge() * 2;
    }

    public void animalSound() {
        System.out.println("The cat says: Maoooo");
    }
}