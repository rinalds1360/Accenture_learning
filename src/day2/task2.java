package day2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        boolean b1, b2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter b1: ");
        b1 = sc.nextBoolean();
        System.out.print("Enter b2: ");
        b2 = sc.nextBoolean();

        System.out.print("Is b1 and b2 equal? - ");
        if (b1 == b2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
