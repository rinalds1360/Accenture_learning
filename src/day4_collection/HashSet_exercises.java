package day4_collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_exercises {
    public static void main(String[] args){
        System.out.println();
        System.out.println("exercise 1:");
        HashSet<String> plants = new HashSet<>();
        plants.add("palm");
        plants.add("rose");
        plants.add("tulip");
        plants.add("oak");
        plants.add("pine tree");
        System.out.println(plants);

        System.out.println();
        System.out.println("exercise 2:");
        for (String plant : plants) {
            System.out.println(plant);
        }

        System.out.println();
        System.out.println("exercise 3:");
        System.out.println(plants.size());

        System.out.println();
        System.out.println("exercise 4:");
        //plants.clear();
        System.out.println(plants);

        System.out.println();
        System.out.println("exercise 5:");
        System.out.println("Is HashMap empty? - " + plants.isEmpty());

        System.out.println();
        System.out.println("exercise 8:");
        TreeSet<String> t_set = new TreeSet<>(plants);
        System.out.println(t_set);

        System.out.println();
        System.out.println("exercise 11:");
        HashSet<String> otherPlants= new HashSet<>();
        otherPlants.add("tree");
        otherPlants.add("oak");
        otherPlants.add("palm");
        otherPlants.add("flower");
        for (String otherPlant : otherPlants) {
            if (plants.contains(otherPlant)) {
                System.out.println(otherPlant);
            }
        }
    }
}
