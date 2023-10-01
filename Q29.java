import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no you want to calculate factorial : ");
        int n=sc.nextInt();

        int ans=1;
        for (int i = 1; i <= n; i++) {
            ans=ans*i;
        }
        System.out.println("Factorial of "+n+" is : "+ans);
    }
}
