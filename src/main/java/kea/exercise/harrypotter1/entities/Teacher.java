package kea.exercise.harrypotter1.entities;

import java.util.Date;

public class Teacher extends Person {
    private empType employment;
    private Date employmentStart;
    private Date employmentEnd;

    public Teacher() {
        super();
    }

    public Teacher(String lastName, String firstName, String middleName, empType employment, Date employmentStart, Date employmentEnd) {
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

    public Date getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }

    public Date getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd) {
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
