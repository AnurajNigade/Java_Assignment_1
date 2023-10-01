import java.util.Arrays;
import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of array");
        int size =sc.nextInt();
        
        int ary[]=new int[size];
        for (int i = 0; i < ary.length; i++) {
            System.out.print("Enter "+(i+1)+" element :");
            ary[i]=sc.nextInt();

        }

        Arrays.sort(ary);

        System.out.println("Smallest element of array is :"+ary[0]);
        System.out.println("Smallest element of array is :"+ary[ary.length-1]);

    }
}
