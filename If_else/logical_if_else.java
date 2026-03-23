package If_else;

public class logical_if_else {
    public static void main(String[] args) {
        int age = 20;
        boolean idcard = true ;
        if ( age >= 18 && idcard == true){
            System.out.println("you are eligible for vote ...");
        } else {
            System.out.println("you are not eligible for vote ...");    
        }
    }
}
