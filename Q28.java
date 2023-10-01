import java.util.Arrays;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        // int arr[] ={5,52,8,7,22,5,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int ary[] =new int[n];
        
        for (int i = 0; i < ary.length; i++) {
            System.out.println("Enter "+(i+1)+"element of array ");
            ary[i]=sc.nextInt();
        }
        System.out.println("Enter value of k upto which you want to print sorted array element : ");
        int k =sc.nextInt();
        sc.close();
        
        Arrays.sort(ary);
        System.out.println("First "+k+"element of sorted array are :");
        for (int i = 0; i < k; i++) {
            System.out.println(ary[i]);
        }


        // for (int i : arr) {
        //     System.out.println(i);
        // }

    }
}
