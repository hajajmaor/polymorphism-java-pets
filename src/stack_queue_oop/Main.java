package stack_queue_oop;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of elements: ");
        final int amount = sc.nextInt();
        Queue<Lecterer> q = new LinkedList<Lecterer>();
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter a name");
            String name = sc.next();
            System.out.println("enter hourlyWage");
            double hourlyWage = sc.nextDouble();
            Stack<String> courses = new Stack<String>();
            System.out.println("enter course name: '' empty to stop");
            // sc.nextLine();
            String courseName = sc.next();
            while (!courseName.equals("")) {
                courses.add(courseName);
                System.out.println("enter course name: '' empty to stop");
                // sc.nextLine();
                courseName = sc.next();
            }
            q.add(new Lecterer(name, hourlyWage, courses));
        }
        for (int i = 0; i < amount; i++) {
            if (q.peek().isAboveRequired(100)) {
                System.out.println(q.peek());
            }
            q.add(q.poll());
        }
        sc.close();
    }
}
