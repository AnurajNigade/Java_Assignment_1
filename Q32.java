import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character you want to check vowel or not :");
        char ch=sc.next().charAt(0);

        // ch.toLowerCase();
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("Character is consonant");
        }

    }
}
