
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    public void onlyDog() {
        System.out.println("function that can be callon only from a Dog pointer");
    }
}
