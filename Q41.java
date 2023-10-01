import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows upto which you want to print pattern : ");
        int num=sc.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                
                System.out.print(" * ");
                
            }
            System.out.println();
        }


    }
}
