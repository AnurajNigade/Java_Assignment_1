import java.util.Scanner;

public class Q33 {
    public static boolean isPrime(int n) { // To call function directily declare it as static!!!
        if (n <= 1) {
          return false;
        }
      
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
            return false;
          }
        }
      
        return true;
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start of range : ");
        int start=sc.nextInt();
        System.out.println("Enter end of range : ");
        int end=sc.nextInt();

        System.out.println("The prime numbers are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
