import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which you want to print pattern : ");
        int p = sc.nextInt();
        sc.close();

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
