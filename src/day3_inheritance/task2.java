package day3_inheritance;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args){
        Integer[] array = {76,-14,34,2};
        Integer[] array_copy;
        array_copy = new Integer[4];
        for (int i=0; i<4;i++){
            array_copy[i] = array[i];
            System.out.print(" "); // just for warning message
        }
        System.out.println();
        System.out.println("copying completed. Copied array values: ");
        System.out.println(Arrays.toString(array_copy));
    }
}
