package day3_inheritance;

public class task1 {
    public static void main(String[] args){
        Integer[][] mul_table = new Integer[10][10];
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++) {
                mul_table[i-1][j-1] = i * j;
            }
        }

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++) {
                System.out.printf("%5d", mul_table[i][j]);
            }
            System.out.println();
        }
    }
}
