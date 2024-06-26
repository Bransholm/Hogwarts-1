package kea.exercise.harrypotter1.entities;

public class House {
    private String name;
    private  String founder;
    private String colors;

    public House() {
    }

    public House(String name, String founder, String colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
        printHouse();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", founder='" + founder + '\'' +
                ", colors='" + colors + '\'' +
                '}';
    }

    private void printHouse() {
        System.out.println("House created --> Name: " + name + ", Founder: " + founder + ", Colors: " + colors);
    }
}
