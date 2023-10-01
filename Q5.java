import java.util.Scanner;

public class Q5 {

    public void isPrime(int a){
        boolean flag=true;
        if(a==0 || a==1){
            System.out.println("Number is niether prime or nonprime");
        }
        for(int i=2;i<=a/2;i++){
            
                if(a%i==0){

                    System.out.println("Number is non prime");
                    flag=false;
                    break;
                }
            
            }
        if (flag) {
            System.out.println("Number is prime");
        }
    
    }
    public static void main (String f[]){
        Q5 s1 = new Q5();
        System.out.println("Enter no you want to check prime or not : ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        s1.isPrime(num);
    }
}
