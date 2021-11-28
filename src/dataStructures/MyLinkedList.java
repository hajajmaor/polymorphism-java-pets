package dataStructures;

public class MyLinkedList<E> {
    public Node<E> head;

    public MyLinkedList() {
        head = null;
    }

    /**
     * add node to the end of the list
     * 
     * @param element
     */
    public void add(Node<E> element) {
        if (head == null) {
            head = element;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = element;
        }
    }
    public void add(int number){
        double rootOfNumber = Math.sqrt(number);
    }



    /**
     * add node to the end of the list
     * 
     * @param element
     */
    public void addLast(Node<E> element) {

        add(element);
    }

    /**
     * get node and add to the beginning of the list
     * 
     * @param element
     */
    public void addFirst(Node<E> element) {
        if (head == null) {
            head = element;
        } else {
            element.next = head;
            head = element;
        }
    }

    /**
     * Adds an element to the end of the list
     * 
     * @param element
     */
    public void add(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Adds an element to the end of the list
     * 
     * @param element
     */
    public void addLast(E element) {
        this.add(element);
    }

    /**
     * Adds an element to the beginning of the list
     * 
     * @param element
     */
    public void addFirst(E element) {
        Node<E> newNode = new Node<E>(element);
        newNode.next = head;
        head = newNode;
    }

    public String toString() {
        Node<E> current = head;
        String result = "";
        while (current != null) {
            result += current.data + "\n";
            current = current.next;
        }
        return result;
    }
}
