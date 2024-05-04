package kea.exercise.harrypotter1.entities;

public class HogwartsStudent extends Student{
    private House house;
    private boolean prefect;
    private String teams;

    public HogwartsStudent() {
        super();
    }

    public HogwartsStudent(String lastName, String firstName, String middleName, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String teams) {
        super(lastName, firstName, middleName, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
        printStudent();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "house=" + house +
                ", prefect=" + prefect +
                ", teams='" + teams + '\'' +
                '}';
    }

    // Method to print the student
    public void printStudent() {
        System.out.println("Student created --> Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
                ", Enrollment Year: " + getEnrollmentYear() + ", Graduation Year: " + getGraduationYear() +
                ", Graduated: " + isGraduated() + ", House: " + getHouse().getName() +
                ", Prefect: " + isPrefect() + ", Teams: " + getTeams());

    }
}
