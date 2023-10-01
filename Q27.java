import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 number ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter 2 number ");
        int num2 = sc.nextInt(); 
        System.out.println("Enter 3 number ");
        int num3 = sc.nextInt();
        
        if (num1 > num2 && num2 > num3) {
            System.out.println("All numbers are in decreasing order!!");
            
        }
        else if(num1 < num2 && num2 < num3){
            System.out.println("All numbers are in increasing order !!");
            
            
        }
        else{
            System.out.println("Neither increasing or decreasing order !!");

        }
        

    }
}
