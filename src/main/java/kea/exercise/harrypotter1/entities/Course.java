package kea.exercise.harrypotter1.entities;

import java.util.Arrays;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] student;
    private TeachingMaterial[] materials;

    public Course() {
    }

    public Course(Subject subject, Teacher teacher, Student[] student, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.student = student;
        this.materials = materials;
        printCourse();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial[] materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(subject.getName()).append("\n");
        sb.append("Teacher: ").append(teacher.getFirstName()).append(" ").append(teacher.getLastName()).append("\n");
        sb.append("Students: ").append(Arrays.toString(student)).append("\n");
        sb.append("Teaching Materials: ").append(Arrays.toString(materials)).append("\n");

        return sb.toString();
    }


    public void printCourse() {
        System.out.println("Course created --> " +
                "Subject: " + subject.getName() +
                ", Teacher: " + teacher.getFirstName() +
                ", Student: " + Arrays.toString(student) +
                ", Materials: " + Arrays.toString(materials)
        );
    }
}
