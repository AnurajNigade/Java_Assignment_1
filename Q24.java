import java.util.Scanner;

public class Q24 {
    public static int fact(int n)
    {
        if(n==0 || n==1){
            return 1;
        }
        
        return n*(fact(n-1));
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which you want to print pattern : ");
        int p = sc.nextInt();
        sc.close();
    
        for (int i = 0; i < p; i++) {
            for (int j = 0; j <= i; j++) {
                long result=fact(i) / (fact(j) * fact(i - j));
                System.out.print(result+ " ");
            }
            System.out.println();
        }
    }
}
