package kea.exercise.harrypotter1.entities;

public class Subject {
    private String name;
    private int schoolYear;
    private boolean elective;

    public Subject() {
    }

    public Subject(String name, int schoolYear, boolean elective) {
        this.name = name;
        this.schoolYear = schoolYear;
        this.elective = elective;
        printSubject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public boolean isElective() {
        return elective;
    }

    public void setElective(boolean elective) {
        this.elective = elective;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", schoolYear=" + schoolYear +
                ", elective=" + elective +
                '}';
    }

    private void printSubject() {
        System.out.println("Subject created. Name: " + name + ", School Year: " + schoolYear + ", Elective: " + elective);
    }
}
