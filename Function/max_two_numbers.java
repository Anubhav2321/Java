package Function;

public class max_two_numbers {
    public static int max(int a , int b){
    if(a >b){
        return a;
    } else {
        return b;
    }

    }
    public static void main(String[] args) {
        int num1= 10;
        int num2= 20;
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max(num1, num2));
    }

}
