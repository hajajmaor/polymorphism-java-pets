package stack_queue_oop;

import java.util.Stack;

/**
 * Lecterer
 */
public class Lecterer extends Person {
    private double hourlyWage;
    Stack<String> courses;

    public Lecterer(String name, double hourlyWage, Stack<String> courses) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.courses = courses;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public Stack<String> getCourses() {
        return courses;
    }

    public void setCourses(Stack<String> courses) {
        this.courses = courses;
    }

    public boolean isAboveRequired(double requiredWage) {
        return this.hourlyWage >= requiredWage;
    }

    @Override
    public String toString() {
        return super.toString() + "Lecterer [courses=" + courses + ", hourlyWage=" + hourlyWage + "]";
    }

}