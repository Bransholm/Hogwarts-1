package kea.exercise.harrypotter1.entities;

public class Ingredient extends TeachingMaterial{
    private String name;
    private double amount;
    private String unit;

    public Ingredient() {
        super();
    }

    public Ingredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        printIngredient();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }

    private void printIngredient() {
        System.out.println("Ingredient created --> Name: " + name + ", Amount: " + amount + ", Unit: " + unit);
    }
}
