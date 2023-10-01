import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius : ");
        double temp =sc.nextInt();
        
        double fahr = (temp * 9/5) + 32;
        System.out.println("Temperature in fahrenheit is : "+fahr);
         System.out.println("Enter temperature in fahrenheit : ");
        double farh1 =sc.nextInt();
        
        double temp1 = (farh1 - 32) * 5/9;
        System.out.println("Temperature in celsius is : "+temp1);
    }
}
