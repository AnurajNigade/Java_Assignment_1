import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter width of rectangle : ");
        int width =sc.nextInt();
        System.out.println("Enter length of rectangle : ");
        int length =sc.nextInt();

        System.out.println("Area of rectangle is :"+ (length*width));

    }
}
