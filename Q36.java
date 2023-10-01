import java.util.*;

public class Q36 {

    static int reverse(int num){
        int length = (int) Math.log10(num);
        int sum = 0;
        for (int i = 0; i <= length; i++) {
            int last=num%10;
            num=num/10;
            sum=sum*10+last;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Number you want to reverse : ");
        int num=sc.nextInt();

        System.out.println("Reverse of number is :"+reverse(num));
    }
}
