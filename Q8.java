import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 num : ");
        int n1=sc.nextInt();
        System.out.println("Enter 2 num : ");
        int n2=sc.nextInt();
        System.out.println("Enter 3 num : ");
        int n3=sc.nextInt();

        double avg =(double)(n1+n2+n3)/3;
        System.out.println("Average of three number is : "+avg);
    }
}
