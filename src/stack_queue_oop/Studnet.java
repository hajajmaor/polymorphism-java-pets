package stack_queue_oop;

public class Studnet extends Person {
    private double grade;

    public Studnet(String name, double grade) {
        super(name);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + "Studnet [grade=" + grade + "]";
    }

}
