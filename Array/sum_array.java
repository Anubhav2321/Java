package Array;

public class sum_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum of the array is: " + sum);
        System.out.println("Average of the array is: " + avg);
    }
}
