import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = sc.nextInt();
        System.out.println("Enter num4 : ");
        int num4 = sc.nextInt();
        System.out.println("Enter num5 : ");
        int num5 = sc.nextInt();
        sc.close();

        System.out.println("Sum of five number is : "+(num1+num2+num3+num4+num5));
        double avg =(double)(num1+num2+num3+num4+num5)/5;

        System.out.println("Average of five number is : "+avg);
    }
}
