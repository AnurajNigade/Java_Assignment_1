import java.util.Scanner;

public class Q15 {
    public String reverse(String str1){

        // String org = str1;
        char ch;
        String rev="";
        for(int i =0;i<str1.length();i++){
            ch = str1.charAt(i);
            rev = ch+rev;
        }
        System.out.println("Reverse string is : "+rev);

        return rev; 
    }
    public void pal(String str){
        String orignal =str;
        Q15 d2=new Q15();;
        if(orignal.equals(d2.reverse(orignal))){
            // orignal==d2.reverse(orignal)
            System.out.println("Given string is palindrom!!");
        }
        else{
            System.out.println("given string is not a palindrome string.");
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string you want to check for palindrome : ");
        String str=sc.nextLine();
        // System.out.println("Original string is : "+str);
        
        Q15 d1=new Q15();
        d1.pal(str);
        
    }
}

