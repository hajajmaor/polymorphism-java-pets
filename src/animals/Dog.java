package animals;

public class Dog extends Animal {
    public Dog(String name, int day, int month, int year) {
        super(name, day, month, year);
    }

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    @Override
    public int calculateAge() {
        return super.calculateAge() * 7;
    }

    public void onlyDog() {
        System.out.println("function that can be callon only from a Dog pointer");
    }
}
