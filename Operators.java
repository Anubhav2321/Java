import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Entetr the value of a :");
        int a = sc.nextInt();
        System.out.print("Entetr the value of b :");
        int b = sc.nextInt();

        //Arithmetic Operators
        System.out.println("the sum of a and b is :" + (a+b));
        System.out.println("the difference of a and b is :" + (a-b));
        System.out.println("the product of a and b is :" + (a*b));
        System.out.println("the quotient of a and b is :" + (a/b));
        System.out.println("the remainder of a and b is :" + (a%b));
        sc.close();
    }
}
