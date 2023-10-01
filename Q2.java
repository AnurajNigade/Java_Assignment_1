import java.util.Scanner;

public class Q2 {

    public void reverse(String abc){
        String revr ="";
        char c;
        for(int i=0;i<abc.length();i++){
            c = abc.charAt(i);
            revr =c+revr;
        }
        System.out.println("Reverse string : "+revr);

    }
    public static void main(String a[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string you want reverse : ");
        String str = sc.nextLine();
        Q2 s1 =new Q2();
        System.out.println("Original string :"+str);
        s1.reverse(str);
        
    }
}
