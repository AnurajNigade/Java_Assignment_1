import java.util.Scanner;

public class Q38 {

    static double balance=0;

    static void addMoney(double amount){
        balance+=amount;
    }
    static void withdrawMoney(double amount){
        balance-=amount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        while (true) {

            System.out.println("This is ATM machine :");
            System.out.println("Enter 1 to check balance ");
            System.out.println("Enter 2 to add money ");
            System.out.println("Enter 3 to withdraw money ");
            System.out.println("Enter 4 to exit ");

            int ch=sc.nextInt();

            switch(ch){
                case 1:
                System.out.println("your balance is :"+balance);
                continue;

                case 2:
                System.out.println("Enter amount you want to add :");
                double amount=sc.nextDouble();
                addMoney(amount);
                continue;
                
                case 3:
                System.out.println("Enter amount you want to withdraw :");
                double amount1=sc.nextDouble();
                withdrawMoney(amount1);
                continue;

                case 4:
                break;

            }
            break;

            
        }

    }
}
