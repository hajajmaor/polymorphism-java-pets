package encapsulation;

public class Teacher extends Person {
    private float hourlyWage;

    public Teacher(String name, int age, String address, float hourlyWage) {
        super(name, age, address);
        this.hourlyWage = hourlyWage;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString() {
        return "Teacher{" + "hourlyWage=" + hourlyWage + ", name='" + getName() + '\'' + ", age=" + getAge()
                + ", address='" + address + '\'' + '}';
    }
}
