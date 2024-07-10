package Strings;
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " +  name);

        sc.close();
    }
}
