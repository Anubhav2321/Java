package Pattern;

public class StudentConstructor {
    String name;
    int age;

    StudentConstructor(String n, int a){
        name = n;
        age = a;
    }

    public static void main(String[] args) {

        StudentConstructor s1 = new StudentConstructor("Anubhav", 20);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
