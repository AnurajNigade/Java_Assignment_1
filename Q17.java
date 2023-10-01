import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str =sc.nextLine();
        String lower = str.toLowerCase();
        // System.out.println(lower);
        // char ch;
        int count=0;
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
                
            }
        }
        System.out.println("NO of vowels is : "+count);
    }
}
