package kea.exercise.harrypotter1.entities;

import java.util.Date;

public class HogwartsTeacher extends Teacher implements HogwartsPerson{
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher() {
        super();
    }

    public HogwartsTeacher(String lastName, String firstName, String middleName, empType employment, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(lastName, firstName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
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
                '}' + super.toString();
    }
}
