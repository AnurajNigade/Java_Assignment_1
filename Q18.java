import java.util.Scanner;


public class Q18 {
    public double areaOfCircle(int a){
        return (3.14*a*a);
    }
    public double volumeOfSphere(int q){
        return ((4/3)*3.14*q*q*q);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q18 d1=new Q18();
        // System.out.println(d1.volumeOfSphere(r));
        while(true){
            System.out.println("Enter radius value : " );
            int r=sc.nextInt();
            System.out.println("Enter 1 for area of circle");
            System.out.println("Enter 2 for volume of sphere");
            System.out.println("Enter 3 exit");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("Area of circle is : "+d1.areaOfCircle(r));
            // break;
            continue;
            case 2:
            System.out.println("Volume of sphere is : "+d1.volumeOfSphere(r));
            continue;
            case 3:
            break;
            default:
            System.out.println("Enter valid choice");
            continue;


        }
        break;
    }



    }
}
