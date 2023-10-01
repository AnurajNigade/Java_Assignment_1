import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter upto which you want to print cube : ");
        int c=sc.nextInt();
        sc.close();

        for (int i = 1; i <= c; i++) {
            System.out.println("The cube of "+i+" is "+(i*i*i));
        }

    }
}
