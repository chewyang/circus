package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());


                continue;
            }

            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());

        }
        System.out.println("Total item value: " + total);
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
        System.out.println("Total value of animals " + calculateValue(animals));

        System.out.println(animals.length);
//        animals[2] = new Duck("Louie");
//        System.out.println(animals.length);

        //creating an arraylist of type animal
        //converts array of animals to array of type list
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));


        //using inheritance to add a new duck or goose to an animal type
        animalArrayList.add(new Duck("Goose"));
        animalArrayList.add(new Parrot("Dolly"));

        Duck louie = new Duck("Louie");
        animalArrayList.add(louie);

        //now printing this arrayList doesnt give an error
        printAnimals(animalArrayList);
        System.out.println("Number of animals: "+ animalArrayList.size());
        System.out.println("index of Louie: "+ animalArrayList.indexOf(louie)); //louie has an index of 4

        //to sort this animals need an comparator
        animalArrayList.sort(Animal.AnimalNameComparator);

        printAnimals(animalArrayList);
        System.out.println("index of Louie: "+ animalArrayList.indexOf(louie)); //louie now has an index of 3

        //removing louie
        animalArrayList.remove(louie);
        System.out.println("index of Louie: "+ animalArrayList.indexOf(louie)); //returns -1 to show that it does not exist

        //Arrays.asList, Arrays.toString, Arrays.copyOf

        //collections object - group multiple elements of some type into a single unit
            //made up of lists like arraylist, made of set like treeset
        //Map obeject - made up of hashmaps
            //HashMap<String, Point> points = new HashMap<>();
            //points.put("x1",
    }

    private static void printAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }
}
