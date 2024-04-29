package kea.exercise.harrypotter1.entities;


import java.util.Date;

public class YearGroup {
    private int schoolYear;
    private Date beginningOfSchoolYear;
    private Student student;

    public YearGroup() {
    }

    public YearGroup(int schoolYear, Date beginningOfSchoolYear, Student student) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.student = student;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Date getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(Date beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "YearGroup{" +
                "schoolYear=" + schoolYear +
                ", beginningOfSchoolYear=" + beginningOfSchoolYear +
                ", student=" + student +
                '}';
    }
}
