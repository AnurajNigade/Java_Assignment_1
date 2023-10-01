import java.util.Scanner;

class Q1 {
    public int areaOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of rectangle : ");
        int width = sc.nextInt();
        System.out.println("Enter length of rectangle : ");
        int length = sc.nextInt();
        // sc.close();
        return (width * length);
    }

    public double areaTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle : ");
        int height = sc.nextInt();
        System.out.println("Enter base of triangle : ");
        int base = sc.nextInt();
        // sc.close();
        return (0.5 * height * base);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your choice : ");
            System.out.println("Press 1 to calculate  area of rectangle ");
            System.out.println("Press 2 calculate area of triangle  ");
            System.out.println("Press 3 exit from dashboard  ");

            int ch = sc.nextInt();
            Q1 s1 = new Q1();
            // sc.close();
            // s1.areaOfRectangle();
            switch (ch) {
                case 1:
                    System.out.println("Area of rectangle is:" + s1.areaOfRectangle());
                    continue;
                case 2:
                    System.out.println("Area of triangle is:" + s1.areaTriangle());
                    continue;
                case 3:
                    // exit();
                     break;
                    // break;
                default:
                    System.out.println("Wrong choice");
                    continue;

            }
            break;
            
        }while(true);
    }
}