package If_else;
import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age :- ");
        int age = scanner.nextInt ();
        if(age >= 19 && age <=60) {
            System.out.println("you are adult ...🙂");
        } else if (age <19 && age >0){
            System.out.println("you are not adult ...🙏");
        } else if (age >60){
            System.out.println("you are senior citizen ...👴");
            scanner.close();
        }
        }

    }


