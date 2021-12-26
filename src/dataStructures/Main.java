package dataStructures;

public class Main {
    public static Node reverseLinkedListRec(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node rest = reverseLinkedListRec(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }

    public static void bottle(char tav, int n) {
        if (n % 2 != 1) {
            System.out.println("Error");
            return;
        }
        if (n == 1) {
            System.out.print(tav);
            return;
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(tav);
        // }
        if (n > 1) {
            System.out.println();
            System.out.print(" ");
        }
        bottle(tav, n - 2);
    }

    public static void main(String[] args) {
        bottle('@', 7);
        // Node head = new Node<Integer>(1);
        // Node node2 = new Node<Integer>(2);
        // Node node3 = new Node<Integer>(3);
        // Node node4 = new Node<Integer>(4);
        // Node node5 = new Node<Integer>(5);
        // head.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        // node4.next = node5;
        // // System.out.println(head);
        // // System.out.println(reverseLinkedList(head));

        // System.out.println(reverseLinkedListRec(head));
        // System.out.println();
    }
}
