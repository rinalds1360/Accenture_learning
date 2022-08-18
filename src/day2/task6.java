package day2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();

        if (a==b){
            System.out.println("true");
            System.exit(0);
        }

        if (a<0 && b>0){
            System.out.println("true");
            System.exit(0);
        }

        if (a>100 && b>100){
            System.out.println("true");
            System.exit(0);
        }
        System.out.println("false");
    }
}
