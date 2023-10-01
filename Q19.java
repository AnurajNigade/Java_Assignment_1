import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        // int[] yuvi ={55,56,5};
        System.out.println("Enter size of array: ");
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int sh[] =new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number of array at position"+(i+1)+" : ");
            sh[i]=sc.nextInt();

        }
        sc.close();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(sh[i]%2==0){
                sum=sum+sh[i];
            }
            
        }
        System.out.println("Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(sh[i]);
            
        }
        System.out.println("Sum of all even number of array is : "+sum);
    }
}
