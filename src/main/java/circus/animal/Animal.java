package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();

    //create an comparator object for sorting the arraylist of type Animal
    public static Comparator<Animal> AnimalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {

            return a1.name.toLowerCase().compareTo(a2.name.toLowerCase());

        }
    };

}
