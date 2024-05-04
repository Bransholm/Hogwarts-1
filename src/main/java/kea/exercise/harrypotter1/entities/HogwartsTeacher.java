package kea.exercise.harrypotter1.entities;

import java.time.LocalDate;
import java.util.Arrays;

public class HogwartsTeacher extends Teacher implements HogwartsPerson{
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher() {
        super();
    }

    public HogwartsTeacher(String lastName, String firstName, String middleName, empType employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(lastName, firstName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
        printTeacher();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    @Override
    public String toString() {
        return "HogwartsTeacher{" +
                "house=" + house +
                ", headOfHouse=" + headOfHouse +
                '}';
    }

    // Print teacher
    public void printTeacher() {
        System.out.println("Teacher created --> Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
                ", Employment: " + getEmployment() + ", Employment Start: " + getEmploymentStart() +
                ", Employment End: " + getEmploymentEnd() + ", House: " + getHouse().getName() +
                ", Head of House: " + isHeadOfHouse());
    }
}
