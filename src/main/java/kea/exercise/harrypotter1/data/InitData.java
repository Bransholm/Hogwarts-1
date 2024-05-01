package kea.exercise.harrypotter1.data;

import kea.exercise.harrypotter1.entities.*;

public class InitData {

    public static void initData() {

        //Create subjects
        Subject Potions = new Subject("Potions", 6, false);

        //Create Houses
        House Gryffindor = new House("Gryffindor", "Godric Gryffindor", "Red and Gold");
        House Ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", "Blue and Bronze");
        House Slytherin = new House("Slytherin", "Salazar Slytherin", "Green and Silver");
        House Hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", "Yellow and Black");

        //Create Textbooks
        TextBook potionsTextBook = new TextBook("Advanced Potion-Making", "Libatius Borage", "Merge Books", 1946);

        //Create Tools
        Tool cauldron = new Tool("Cauldron", "Pewter");
        Tool silverKnife = new Tool("Silver Knife", "For potion making");

        // Create Ingredients
        Ingredient unicornHair = new Ingredient("Unicorn Hair", 1.5, "strand");
        Ingredient dragonBlood = new Ingredient("Dragon Blood", 2, "flask");
        Ingredient fluxweed = new Ingredient("Fluxweed", 0.5, "bunch");
        Ingredient knotgrass = new Ingredient("Knotgrass", 1, "handful");
        Ingredient powderedBicornHorn = new Ingredient("Powdered Bicorn Horn", 0.25, "pinch");
        Ingredient slicedMandrakeRoot = new Ingredient("Sliced Mandrake Root", 0.75, "slice");






    }
}
