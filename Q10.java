import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter 2 number : ");
            int num2 = sc.nextInt();
            System.out.println("Enter 1 to perform addition ");
            System.out.println("Enter 2 to perform substraction ");
            System.out.println("Enter 3 to perform multiplication ");
            System.out.println("Enter 4 to perform division ");
            System.out.println("Enter 5 to exit ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                System.out.println("Addition of number is : "+(num1+num2));
                continue;
                case 2:
                System.out.println("Subtraction of number is : "+(num1-num2));
                continue;
                case 3:
                System.out.println("Multiplication of number is : "+(num1*num2));
                continue;
                case 4:
                System.out.println("Division of number is : "+(num1/num2));
                continue;
                case 5:
                break;
                
                default:
                System.out.println("Enter valid input !!");
                continue;
            }
            break;
        }
    }

}
