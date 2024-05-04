package kea.exercise.harrypotter1.data;

import kea.exercise.harrypotter1.entities.*;
import java.time.LocalDate;

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

        //Create Students
        HogwartsStudent harry = new HogwartsStudent("Potter", "Harry", "James", 1991, 1998, false, Gryffindor, false, "Quidditch");
        HogwartsStudent ron = new HogwartsStudent("Weasley", "Ron", "Bilius", 1991, 1998, false, Gryffindor, false, "Quidditch");
        HogwartsStudent hermione = new HogwartsStudent("Granger", "Hermione", "", 1991, 1998, false, Gryffindor, false, "Gobstones");
        HogwartsStudent luna = new HogwartsStudent("Lovegood", "Luna", "", 1991, 1998, false, Ravenclaw, false, "D.A.");
        HogwartsStudent cho = new HogwartsStudent("Chang", "Cho", "", 1991, 1998, false, Ravenclaw, false, "Quidditch");
        HogwartsStudent padma = new HogwartsStudent("Patil", "Padma", "", 1991, 1998, false, Ravenclaw, false, "Chess");
        HogwartsStudent draco = new HogwartsStudent("Malfoy", "Draco", "Lucius", 1991, 1998, false, Slytherin, false, "Quidditch");
        HogwartsStudent pansy = new HogwartsStudent("Parkinson", "Pansy", "", 1991, 1998, false, Slytherin, false, "Gobstones");
        HogwartsStudent blaise = new HogwartsStudent("Zabini", "Blaise", "", 1991, 1998, false, Slytherin, false, "Dueling");
        HogwartsStudent cedric = new HogwartsStudent("Diggory", "Cedric", "", 1991, 1998, false, Hufflepuff, false, "Quidditch");
        HogwartsStudent hannah = new HogwartsStudent("Abbott", "Hannah", "", 1991, 1998, false, Hufflepuff, false, "D.A.");
        HogwartsStudent justin = new HogwartsStudent("Finch-Fletchley", "Justin", "", 1991, 1998, false, Hufflepuff, false, "Gobstones");

        //Create HogwartsTeacher Horace Slughorn
        HogwartsTeacher horace = new HogwartsTeacher("Slughorn", "Horace", "", empType.professor, LocalDate.of(2001, 9, 1), null, Slytherin, false);

        //Create Potions Course
        new Course(Potions, horace, new Student[]{harry, ron, hermione, luna, cho, padma, draco, pansy, blaise, cedric, hannah, justin}, new TeachingMaterial[]{potionsTextBook, cauldron, silverKnife, unicornHair, dragonBlood, fluxweed, knotgrass, powderedBicornHorn, slicedMandrakeRoot});













    }
}
