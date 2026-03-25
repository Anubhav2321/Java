package Array;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i< 5; i++){
            System.out.print("Enter number:-");
            arr[i] = sc.nextInt();

        }
        System.out.println("Output:-");
        for (int i= 0; i<5; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
