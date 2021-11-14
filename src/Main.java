
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        Dog realDog = new Dog();

        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();

        // why this is working???
        realDog.onlyDog();
    }
}
