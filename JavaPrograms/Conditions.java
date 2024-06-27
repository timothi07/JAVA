import java.util.*;

public class Conditions {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Over");
        }
        else
            System.out.println("Under");
        
        sc.close();
    }
}
