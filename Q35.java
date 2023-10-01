import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number you want to print table :");
        int num =sc.nextInt();

        System.out.println("Table for number "+num+" is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }

    }
}
