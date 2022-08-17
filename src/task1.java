import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value a: ");
        a = sc.nextInt();
        System.out.print("enter value b: ");
        b = sc.nextInt();

        System.out.print("is " + a + " equal to " + b +"? - ");
        if (a == b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("is " + a + " less than " + b +"? - ");
        if (a < b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("is " + a + " less or equal to " + b +"? - ");
        if (a <= b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("is " + a + " greater than " + b +"? - ");
        if (a > b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("is " + a + " greater or equal to " + b +"? - ");
        if (a >= b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }

}
