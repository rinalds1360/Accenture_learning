package day4_collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_tasks {
    public static void main(String[] args){
        System.out.println();
        System.out.println("exercise 1:");
        LinkedList<String> animals= new LinkedList<>();
        animals.add("lion");
        animals.add("monkey");
        animals.add("pig");
        animals.add("snake");
        System.out.println(animals);

        System.out.println();
        System.out.println("exercise 2:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("exercise 3:");
        Iterator<String> p = animals.listIterator(1);
        while(p.hasNext()){
            System.out.println(p.next());
        }

        System.out.println();
        System.out.println("exercise 4:");
        p = animals.descendingIterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }

        System.out.println();
        System.out.println("exercise 5:");
        System.out.println("before adding: "+ animals);
        animals.add(1,"horse");
        System.out.println("after adding: "+ animals);

        System.out.println();
        System.out.println("exercise 6:");
        System.out.println("before adding: "+ animals);
        animals.addFirst("elephant");
        animals.addLast("dog");
        System.out.println("after adding: "+ animals);

        System.out.println();
        System.out.println("exercise 7:");
        System.out.println("before adding: "+ animals);
        animals.addFirst("snake");
        System.out.println("after adding: "+ animals);

        System.out.println();
        System.out.println("exercise 11:");
        p = animals.iterator();
        int temp = 1;
        while (p.hasNext()) {
            System.out.println(p.next() + ", position: " + temp);
            temp++;
        }

        System.out.println();
        System.out.println("exercise 14:");
        System.out.println("before adding: "+ animals);
        //animals.clear();
        System.out.println("after adding: "+ animals);

        System.out.println();
        System.out.println("exercise 15:");
        System.out.println("before adding: "+ animals);
        Collections.swap(animals,1,2);
        System.out.println("after adding: "+ animals);

    }
}
