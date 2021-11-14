import animals.Animal;
import dataStructures.MyLinkedList;

public class Branch {
    String name;
    String address;
    MyLinkedList<Animal> animals;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
        this.animals = new MyLinkedList<Animal>();
    }

    public String toString() {
        return "Branch: " + this.name + " " + this.address + "\nanimals:\n " + this.animals.toString();
    }
}
