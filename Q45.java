import java.util.Scanner;

public class Q45{
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number you want calculate sum of its digit : ");
       int num =sc.nextInt();
       
       int sum=0;
       int length = (int) Math.log10(num);
       for (int i = 0; i <= length ; i++) {
            int last=num%10;
            num/=10;
            sum+=last;
        
       }

       System.out.println("Sum is :"+sum);
    }
}