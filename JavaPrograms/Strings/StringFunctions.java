package Strings;
import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.next();
        System.out.println("Enter you last name: ");
        String lastName = sc.next();
        
        //concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is: " + fullName);

        //string length
        System.out.println(fullName.length());

        //charAt
        for ( int i = 0; i < fullName.length(); i++)
            System.out.print(fullName.charAt(i) + " ");

        //comparison
        //  s1 > s2     : +ve value
        //  s1 == s2    : 0
        //  s1 < s2     : -ve value
        String test1 = "Dhoni";
        String test2 = "Dhoni";
        if(test1.compareTo(test2) == 0)
            System.out.println("\nSame Strings");

        //substring
        String goat = "Mahendra Singh Dhoni";
        String hero = goat.substring(15);
        System.out.println(hero);

        sc.close();
    }
}
