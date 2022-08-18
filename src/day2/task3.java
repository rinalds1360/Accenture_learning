package day2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input whole number: ");
        a = sc.nextInt();
        System.out.print("Is this number even? - ");
        if (a%2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
