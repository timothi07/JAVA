package PracticeQuestions;
import java.util.Scanner;

public class AvgOfThree {
    public static float calculateAverage(int x,int y,int z){
        return (x + y + z)/3.0f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        float res = calculateAverage(n1, n2, n3);

        System.out.println("Average of the three numbers is: " + res);

        sc.close();
    }
}
