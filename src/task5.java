import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        boolean a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter boolean value: ");
        a = sc.nextBoolean();
        System.out.print("Opposite of \"" + a + "\" is \"" + !a + "\"");
    }
}
