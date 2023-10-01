import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 number ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter 2 number ");
        int num2 = sc.nextInt(); 
        System.out.println("Enter 3 number ");
        int num3 = sc.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("The num1 is greatest number !!");
            
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("The num2 is greatest number !!");
            
            
        }
        else{
            System.out.println("The num3 is greatest number !!");

        }
        

    }
}
