package animals;

import java.time.LocalDate;

public class Animal {
    String name;
    int day, month, year;

    public Animal(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        int todaySum = today.getYear() * 365 + today.getMonthValue() * 30 + today.getDayOfMonth();
        int mine = this.year * 365 + this.month * 30 + this.day;
        return (todaySum - mine) / 365;

    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    @Override
    public String toString() {
        return "Animal: " + this.name + " age: " + this.calculateAge();
    }
}
