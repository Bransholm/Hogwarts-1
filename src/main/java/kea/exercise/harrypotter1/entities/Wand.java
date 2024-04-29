package kea.exercise.harrypotter1.entities;

public class Wand extends TeachingMaterial{
    private double lengthInInches;
    private String Wood;
    private String core;

    public Wand() {
        super();
    }

    public Wand(double lengthInInches, String wood, String core) {
        this.lengthInInches = lengthInInches;
        Wood = wood;
        this.core = core;
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getWood() {
        return Wood;
    }

    public void setWood(String wood) {
        Wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }
}
