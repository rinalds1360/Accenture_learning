import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input whole number: ");
        a = sc.nextInt();
        System.out.print("Is this number odd? - ");
        if (a%2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");

        }
    }
}