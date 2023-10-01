import java.util.Scanner;

public class Q4 {
    public static void main(String s[]){
        // char ch ='A';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Charcter you want to convert in ASCCI value");
        char ch = sc.next().charAt(0);
        int a = ch;
        // char ch = (char)a;
        System.out.println(a);

        System.out.println("Enter ASCCI value you want to convert in character");
        int val =sc.nextInt();
        char vh = (char) val;
        System.out.println(vh);
    }
}
