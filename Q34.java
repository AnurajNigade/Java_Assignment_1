import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        
        while (true) {
            System.out.println("Enter correct password : ");
            String pass = sc.nextLine();

            if (pass.equals("password123")) {
                break;
            }
            else{
                continue;
            }

            // break;
        }
    }
}
