package kea.exercise.harrypotter1.entities;

import java.time.LocalDate;
import java.util.Date;

public class Teacher extends Person {
    private empType employment;
    private Date employmentStart;
    private  Date employmentEnd;

    public Teacher() {
        super();
    }

    public Teacher(String lastName, String firstName, String middleName, empType employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(lastName, firstName, middleName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public empType getEmployment() {
        return employment;
    }

    public void setEmployment(empType employment) {
        this.employment = employment;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employment=" + employment +
                ", employmentStart=" + employmentStart +
                ", employmentEnd=" + employmentEnd +
                '}';
    }
}
