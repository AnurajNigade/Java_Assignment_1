public class Q37 {


    static boolean even(int n){
        if (n%2==0) {
            return true;
        }
        else{
            return false;
        }

        

    }
    public static void main(String[] args) {
        int sum =0;
        int i=1;
        while (i<=100) {

            if (even(i)) {
                sum +=i;
            }
            i++;
            
        }
        System.out.println("Sum of even number between 1 to 100 is :"+sum);
    }
}
