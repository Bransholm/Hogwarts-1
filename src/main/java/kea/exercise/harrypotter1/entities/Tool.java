package kea.exercise.harrypotter1.entities;

public class Tool extends TeachingMaterial{
    private String name;
    private String description;

    public Tool() {
        super();
    }

    public Tool(String name, String description) {
        this.name = name;
        this.description = description;
        printTool();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    private void printTool() {
        System.out.println("Tool created --> Name: " + name + ", Description: " + description);
    }
}
