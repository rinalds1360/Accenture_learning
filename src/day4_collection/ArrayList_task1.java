package day4_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// includes tasks - 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19
public class ArrayList_task1 {
    public static void main(String[] args){
        ArrayList<String> Colors = new ArrayList<>();
        ArrayList<String> Colors_copy = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Blue");
        Colors.add("Pink");
        Colors.add("Purple");
        Colors_copy.add("");
        Colors_copy.add("");
        Colors_copy.add("");
        Colors_copy.add("");
        Colors.add(0,"Black");
        for (String color : Colors) {
            System.out.println(color);
        }

        System.out.println();
        System.out.println(Colors.get(2));

        System.out.println();
        Colors.remove(2);
        Colors.add(2,"White");
        System.out.println(Colors);

        Colors.remove(2);
        System.out.println();
        System.out.println(Colors);

        System.out.println(Colors.contains("Pink"));
        Collections.sort(Colors);
        System.out.println(Colors);
        Collections.copy(Colors_copy,Colors);
        System.out.println();
        System.out.println(Colors_copy);

        Collections.shuffle(Colors_copy);
        System.out.println(Colors_copy);

        Collections.reverse(Colors_copy);
        System.out.println(Colors_copy);

        System.out.println();
        List<String> splitList = Colors_copy.subList(0,2);
        System.out.println(splitList);
        Colors.add("Green");

        System.out.println();
        System.out.println(Colors);
        System.out.println(Colors_copy);
        System.out.print("colors array contains all elements of colors_copy array - "+ new HashSet<>(Colors).containsAll(Colors_copy));

        System.out.println();
        System.out.println();
        System.out.println(Colors);
        String temp = Colors.get(2);
        Colors.set(2,Colors.get(3));
        Colors.set(3,temp);
        System.out.println(Colors);

        System.out.println();
        Colors.addAll(Colors_copy);
        System.out.println(Colors);

        System.out.println();
        //Colors.removeAll(Colors);
        System.out.println(Colors);

        Colors.add("Orange");
        System.out.println();
        System.out.print("Is Colors Array list empty? - " + Colors.isEmpty());

        System.out.println();
        System.out.println();
        System.out.println(Colors + " size: " + Colors.size());
        Colors.trimToSize();
        System.out.println(Colors + " size: " + Colors.size());
    }
}
