import java.util.Scanner;

public class Q6 {
    public int fact(int n){
        if(n==1){
            return 1;
        }
        
        return (n*(fact(n-1)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num =sc.nextInt();
        Q6 d1=new Q6();
        System.out.println("Factorial of "+num+" : "+d1.fact(num));
    }
}
