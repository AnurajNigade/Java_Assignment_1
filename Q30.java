import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year you want to check leap or not :");
        int year = sc.nextInt();

        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println("Given year is leap year");
        }
        else{
            System.out.println("Given year is not leap year ");
        }
    }
}
