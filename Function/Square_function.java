package Function;
import java.util.Scanner;
public class Square_function {
    public static int square(int num){
        return num * num;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The square of " + num + " is " + square(num));
        sc.close();
    }
}
