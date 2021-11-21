import animals.*;
import dataStructures.*;

public class Branch {
    String name;
    String address;
    MyLinkedList<Animal> animals;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
        this.animals = new MyLinkedList<Animal>();
    }

    public int countType(String className) {
        Node<Animal> temp = this.animals.head;
        int count = 0;
        while (temp != null) {
            switch (className.toLowerCase()) {
            case "dog":
                if (temp.data instanceof Dog) {
                    count++;
                }
                temp = temp.next;

                break;
            case "cat":
                if (temp.data instanceof Cat) {
                    count++;
                }
                temp = temp.next;

                break;
            default:
                return 0;
            }

        }
        return count;
    }

    public String toString() {
        return "Branch: " + this.name + " " + this.address + "\nanimals:\n " + this.animals.toString();
    }
}
