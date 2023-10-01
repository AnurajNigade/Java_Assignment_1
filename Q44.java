import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Decimal Number you want to convert in binary : ");
        int num=sc.nextInt();

        String binary="";
        // int length=(int) Math.log10(num); 
        while(num > 0){
            int last =num%2;
            num/=2;
            binary =last+binary;

        }
        System.out.println("Binary Number is :"+binary);

    }
}
